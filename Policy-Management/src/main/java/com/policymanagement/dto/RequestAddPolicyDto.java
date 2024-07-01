package com.policymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestAddPolicyDto {

    String policyNumber;
    String policyName;
    int premiumAmount;
    String paymentMode;
    String maturityDate;
    int maturityAmount;
    String status;
    Long policyTypeId;

}
