package com.policymanagement.controller;

import com.policymanagement.dto.RequestAddPolicyDto;
import com.policymanagement.dto.ResponsePolicyDto;
import com.policymanagement.dto.ResponseAddPolicyDto;
import com.policymanagement.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policies")
public class PoliciesController {
    @Autowired
    private PolicyService policyService;

    @PostMapping
    public ResponseEntity<ResponseAddPolicyDto> addNewPolicy (@RequestBody RequestAddPolicyDto addPolicyDto){
        ResponseAddPolicyDto responseAddPolicyDto = policyService.saveNewPolicy(addPolicyDto);
        return new ResponseEntity<>(responseAddPolicyDto,HttpStatus.CREATED);
//      {          "policyNumber":"py0074",
//                "policyName":"policy 4",
//                "premiumAmount":1000,
//                "paymentMode":"Online",
//                "maturityDate":"3years",
//                "maturityAmount":30000,
//                "createdAt":"2024-07-01T07:30:02.186+00:00",
//                "status":"active"}
    }

    @GetMapping
    public ResponseEntity<List<ResponsePolicyDto>> getAllPolicies(){
        List<ResponsePolicyDto> allPolicies = policyService.getAllPolicies();
        return ResponseEntity.ok(allPolicies);
    }


}
