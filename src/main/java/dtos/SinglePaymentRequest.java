package dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class SinglePaymentRequest {
    private BigDecimal amount;
    private String transactionRef;
    private String transactionDescription;
    private String channel;
    private String currency;
    private String destinationAccount;
    private String destinationAccountName;
    private String destinationBankCode;
    private String destinationEmail;
    private String sourceAccount;
    private String sourceAccountName;
    private String sourceBankCode;
    private String originalAccountNumber;
    private String originalBankCode;
    private String customReference;
}
