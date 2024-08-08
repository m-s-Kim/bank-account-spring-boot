package bankaccount.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import bankaccount.customer.Customer;

public interface EmployeeRepository extends JpaRepository<Customer, Long> {}
