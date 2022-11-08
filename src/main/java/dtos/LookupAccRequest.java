package dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LookupAccRequest {
    private String sourceAccount;
    private String sourceBankCode;
}
