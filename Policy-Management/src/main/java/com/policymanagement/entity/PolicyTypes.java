package com.policymanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long policy_type_id;
    String type_name;
    String description;

}
