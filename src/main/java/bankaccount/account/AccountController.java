package bankaccount.account;

import bankaccount.account.dto.AccountGetResponse;
import bankaccount.account.dto.DetailAccount;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Tag(name = "Example", description = "Example API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AccountController {

  private final AccountService accountService;

  @GetMapping("/accounts") // todo : header ->customer_id
  public ResponseEntity<List<AccountGetResponse>> getAccounts(@RequestParam long customerId) {


    return ResponseEntity.ok(accountService.getAccounts(customerId));
  }

  @GetMapping("/account/{accountNumber}/detail")
  public ResponseEntity<DetailAccount> getAccountDetail(@RequestParam long customerId
                                                      , @PathVariable String accountNumber
                                                      , @RequestParam LocalDateTime viewYearMonth) {
    // todo 검증
    return  ResponseEntity.ok(accountService.getAccountDetail(accountNumber, viewYearMonth));   
  }

//  @GetMapping("/accounts22") // todo : header ->customer_id
//  public ResponseEntity<List<AccountGetResponse>> test(@RequestParam long customerId) {
//    return accountService.getAccounts(customerId);
//  }
}
