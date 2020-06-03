package com.neyana.accounting.entity.currencies;

import com.neyana.accounting.entity.accounts.Accounts;
import org.springframework.data.repository.CrudRepository;

public interface CurrenciesRepository extends CrudRepository<Currencies, Long> {
}
