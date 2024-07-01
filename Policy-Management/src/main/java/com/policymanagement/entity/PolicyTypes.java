package com.policymanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long policyTypeId;
    String typeName;
    String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "policyTypes")
    List<Policies> listOfPolicies;

}
