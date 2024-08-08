package bankaccount.customer.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import bankaccount.common.exception.BaseException;

@Getter
@RequiredArgsConstructor
public class CustomerException extends BaseException {
  private final long id;
  private final String name;
}
