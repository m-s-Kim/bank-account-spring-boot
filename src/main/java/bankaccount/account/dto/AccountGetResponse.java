package bankaccount.account.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigInteger;

@Builder
@Getter
@ToString
public class AccountGetResponse {

    private String number;
    private BigInteger balance;
    private String password;
    private int employeeId;
    private int branchId;
    private long customerId;
}
