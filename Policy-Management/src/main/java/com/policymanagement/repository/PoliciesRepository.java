package com.policymanagement.repository;

import com.policymanagement.entity.Policies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliciesRepository extends JpaRepository<Policies, Long> {
}
