package mm.com.mytel.testapi;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReaderLog {

    private String id;

    private String policyCode;

    private String policyGroupCode;

    private String transactionId;

    private String fromPhone;

    private String fromOperator;

    private String toPhone;

    private String fromAccountId;

    private String fromRoleId;

    private double amount;

    private String partnerCode;

    private String serviceCode;

    private String transTypeId;

    private LocalDateTime transactionDate;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    private String status;

    private String note;

    private String language;

    private double quota;
}
