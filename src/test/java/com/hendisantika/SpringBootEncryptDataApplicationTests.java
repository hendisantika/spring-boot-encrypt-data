package com.hendisantika;

import com.hendisantika.entity.Customer;
import com.hendisantika.repository.CustomerRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class SpringBootEncryptDataApplicationTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootEncryptDataApplicationTests.class);

    private static final String NAME = "John Doe";
    private static final String EMAIL = "john@example.com";

    private static final String MOBILE = "+6281321411602";

    private long id;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CustomerRepository customerRepository;

    @BeforeEach
    public void setUp() {
        Customer customer = Customer.builder()
                .name(NAME)
                .mobile(MOBILE)
                .build();
        id = customerRepository.save(customer).getId();
    }

    @AfterEach
    public void delete() {
        customerRepository.deleteAll();
    }

    @Test
    public void countData() {
        List<Customer> customer = customerRepository.findAll();
        assertEquals(1, customer.size());
    }


}
