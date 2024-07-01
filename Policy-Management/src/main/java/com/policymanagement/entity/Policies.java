package com.policymanagement.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long policy_id;

    String policy_number;
    String policy_name;
    int premium_amount;
    String payment_mode;
    Date start_date;
    Date maturity_date;
    int maturity_amount;
    String Status;
    Long agent_id;
    Long policy_type_id;
    Date created_at;
    Date updated_at;

}
