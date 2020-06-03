package com.neyana.accounting;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;


@RunWith(SpringRunner.class)
@SpringBootTest
class AccountingApplicationTests {


	@Autowired
	private EntityManager entityManager;

	@Test
	void contextLoads() {
	}

}
