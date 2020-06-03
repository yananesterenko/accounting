package com.neyana.accounting.entity.accounts;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Accounts {
    enum type {
        CASH, BANK_ACCOUNT, BANK_CARD
    }

    @Id
    @GeneratedValue
    Long Id;
    boolean activity;
    String type;
    String currency;
    String name;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "Id=" + Id +
                ", activity=" + activity +
                ", type='" + type + '\'' +
                ", currency='" + currency + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
