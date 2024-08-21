package bankaccount.transaction;

import bankaccount.account.Account;
import bankaccount.account.AccountRepository;
import bankaccount.transaction.dto.TransferPostRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;
    /**
     *  계좌 이체의 트랜잭션 관리
     */
    public void transfer(TransferPostRequest request){

        // 출금
        Account withdrawAccount = accountRepository.findAccountByNumber(request.getRequestAccountNumber())
                .orElseThrow();
        BigInteger amount = withdrawAccount.getBalance();

        Transaction withdraw = Transaction.builder()
                .balance(request.getRequestAmount())
                .type("출금")
                .balanceAfterTransaction(amount.subtract(request.getRequestAmount()))
                .accountNumber(request.getTargetAccountNumber())
                .build();

        transactionRepository.save(withdraw);

        // 입금
        Account depositAccount = accountRepository.findAccountByNumber(request.getRequestAccountNumber())
                .orElseThrow();
        amount = depositAccount.getBalance();

        Transaction deposit = Transaction.builder()
                .balance(request.getRequestAmount())
                .type("입금")
                .balanceAfterTransaction(amount.add(request.getRequestAmount()))
                .accountNumber(request.getTargetAccountNumber())
                .build();

        transactionRepository.save(withdraw);

    }

}
