package dtos;

import controller.Transactions;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;


@Getter
@Setter
public class BulkPaymentRequest {
    private String batchRef;
    private BigDecimal totalAmount;
    private String sourceAccount;
    private String sourceAccountName;
    private String sourceBankCode;
    private String currency;
    private String sourceNarration;
    private String originalAccountNumber;
    private String originalBankCode;
    private String customReference;
    private HashSet<Transactions> transactions = new HashSet<>();
}
