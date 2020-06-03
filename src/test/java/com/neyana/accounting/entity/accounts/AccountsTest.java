package com.neyana.accounting.entity.accounts;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
class AccountsTest {

    @Autowired
    AccountRepository accountRepository;

    @Before
    public void setUp(){
        accountRepository.deleteAll();
    }


    @Test
    public void shouldPerformCrudOperation(){
        final Accounts account = new Accounts();
        account.setActivity(true);
        account.setCurrency("UA");
        account.setName("acc1");
        account.setType("cash");

        accountRepository.save(account);


        assertThat(accountRepository.findAll()).hasSize(1).first().isEqualTo(account);
        accountRepository.deleteById(account.getId());
        assertThat(accountRepository.count()).isZero();
    }

}