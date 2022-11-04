package com.hendisantika;

import com.hendisantika.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class SpringBootEncryptDataApplicationTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootEncryptDataApplicationTests.class);

    private static final String NAME = "John Doe";
    private static final String EMAIL = "john@example.com";

    private long id;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void contextLoads() {
    }

}
