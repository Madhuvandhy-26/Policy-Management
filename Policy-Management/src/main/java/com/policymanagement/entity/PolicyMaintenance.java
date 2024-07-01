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
    Long maintenanceId;

    Long policyId;
    String action;
    String details;
    Long performedBy; // agent id FK
    String performedAt;

}
