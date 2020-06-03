package com.neyana.accounting.entity.incomeitems;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class IncomeItems {
    @Id
    @GeneratedValue
    Long id;
}
