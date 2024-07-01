package com.policymanagement.repository;

import com.policymanagement.entity.PolicyMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyMaintenanceRepository extends JpaRepository<PolicyMaintenance, Long> {
}
