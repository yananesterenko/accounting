package com.neyana.accounting.entity.expenseitems;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExpenseItems {
    @Id
    @GeneratedValue
    Long id;
}
