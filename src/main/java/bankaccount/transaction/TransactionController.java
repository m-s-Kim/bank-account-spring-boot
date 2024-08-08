package bankaccount.transaction;

import bankaccount.transaction.dto.TransferPostRequest;
import bankaccount.transaction.dto.TransferPostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping("transerfer")
    public ResponseEntity<TransferPostResponse> transfer(@RequestBody TransferPostRequest request){
        transactionService.transfer(request);
        return ResponseEntity.ok(TransferPostResponse.builder()
                .resultCode("1")
                .resultMessage("정상 처리 ")
                .build());

    }

}
