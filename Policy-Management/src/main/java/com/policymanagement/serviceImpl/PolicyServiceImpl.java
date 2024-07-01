package com.policymanagement.serviceImpl;

import com.policymanagement.dto.RequestAddPolicyDto;
import com.policymanagement.dto.ResponsePolicyDto;
import com.policymanagement.dto.ResponseAddPolicyDto;
import com.policymanagement.entity.Policies;
import com.policymanagement.repository.PoliciesRepository;
import com.policymanagement.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PoliciesRepository policiesRepo;
    Date currentDate = new Date();

    @Override
    public ResponseAddPolicyDto saveNewPolicy(RequestAddPolicyDto addPolicyDto) {
        Policies policies = new Policies();

        policies.setPolicyName(addPolicyDto.getPolicyName());
        policies.setPolicyNumber( addPolicyDto.getPolicyNumber());
        policies.setCreatedAt(currentDate);
        policies.setUpdatedAt(currentDate);
        policies.setMaturityAmount(addPolicyDto.getMaturityAmount());
        policies.setPremiumAmount(addPolicyDto.getPremiumAmount());
        policies.setPaymentMode("Online");
        policies.setPremiumAmount(addPolicyDto.getPremiumAmount());
        policies.setMaturityDate(addPolicyDto.getMaturityDate());
        policies.setStartDate(currentDate);
        policies.setStatus(addPolicyDto.getStatus());

        Policies addedPolicy = policiesRepo.save(policies);

        ResponseAddPolicyDto response = new ResponseAddPolicyDto();
        response.setPolicyName(policies.getPolicyName());
        response.setPolicyNumber(policies.getPolicyNumber());
        response.setMessage("Policy saved successfully");
        return response;
    }

    @Override
    public List<ResponsePolicyDto> getAllPolicies() {

        List<Policies> listOfPolicy = policiesRepo.findAll();

        List<ResponsePolicyDto> responseList = new ArrayList<>();

        for (Policies policy : listOfPolicy) {
            ResponsePolicyDto response = getResponseListOfPolicy(policy);
            responseList.add(response);
        }

//        List<ResponsePolicyDto> responseList = listOfPolicy.stream().map(policy -> {
//            ResponsePolicyDto response = new ResponsePolicyDto();
//            response.setPolicy_number(policy.getPolicy_number());

        return responseList;
    }

    private static ResponsePolicyDto getResponseListOfPolicy(Policies policy) {
        ResponsePolicyDto response = new ResponsePolicyDto();
        response.setPolicyNumber(policy.getPolicyNumber());
        response.setPolicyName(policy.getPolicyName());
        response.setPremiumAmount(policy.getPremiumAmount());
        response.setPaymentMode(policy.getPaymentMode());
        response.setMaturityDate(policy.getMaturityDate());
        response.setMaturityAmount(policy.getMaturityAmount());
        response.setStatus(policy.getStatus());
        response.setCreatedAt(policy.getCreatedAt());
        return response;
    }
}
