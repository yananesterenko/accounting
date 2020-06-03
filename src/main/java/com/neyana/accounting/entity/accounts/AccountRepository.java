package com.neyana.accounting.entity.accounts;

import com.neyana.accounting.entity.accounts.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface AccountRepository extends CrudRepository<Accounts, Long> {
}
