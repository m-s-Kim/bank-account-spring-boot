package bankaccount.customer.exception;

public class CustomerNotFoundException extends CustomerException {

  public CustomerNotFoundException(long id, String name) {
    super(id, name);
  }
}
