package controller;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class Transactions {
    private BigDecimal amount;
    private String transactionRef;
    private String destinationAccount;
    private String destinationAccountName;
    private String destinationBankCode;
    private String destinationNarration;
}
