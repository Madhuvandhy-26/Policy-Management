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
public class PolicyMaintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long maintenance_id;

    Long policy_id;
    String action;
    String details;
    Long performed_by; // agent id FK
    String performed_at;

}
