package bankaccount.account;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import bankaccount.common.entity.BaseEntity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Account extends BaseEntity {

  @Id private String number;

  private String type;

  private boolean isFirst;

  private BigInteger balance;

  private String password;

  private int employeeId;

  private int branchId;

  private long customerId;
}
