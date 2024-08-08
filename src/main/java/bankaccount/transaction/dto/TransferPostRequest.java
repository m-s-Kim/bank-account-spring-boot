package bankaccount.transaction.dto;

import lombok.Getter;
import lombok.ToString;

import java.math.BigInteger;

@Getter
@ToString
public class TransferPostRequest {
    private String requestAccountNumber;
//    private String requestType;
    private BigInteger requestAmount;
//    private String accountToken;
    private String targetAccountNumber;
    private int targetAmount;
}
