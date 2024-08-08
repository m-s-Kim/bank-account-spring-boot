package bankaccount.account.dto;

import bankaccount.transaction.Transaction;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigInteger;
import java.util.List;

@Builder
@Getter
@ToString
public class DetailAccount {
    private String accountNumber;
    private String accountType;
    private String accountName;
    private BigInteger accountAmount;
    private List<Transaction> depositAndWithdrawalHistory;
}
