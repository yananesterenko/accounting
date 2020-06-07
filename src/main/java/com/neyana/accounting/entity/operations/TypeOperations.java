package com.neyana.accounting.entity.operations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TypeOperations {
    @Id
    @GeneratedValue
    Long Id;
    String name;
}
