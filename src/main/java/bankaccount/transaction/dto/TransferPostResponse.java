package bankaccount.transaction.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TransferPostResponse {
    // todo enum
    private String resultCode;
    private String resultMessage;
}
