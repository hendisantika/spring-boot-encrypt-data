package com.hendisantika.service;

import com.hendisantika.entity.Customer;
import com.hendisantika.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-encrypt-data
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/3/22
 * Time: 15:25
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findByMobile(String mobile) {
        return customerRepository.findByMobile(mobile);
    }

    public Customer findByMobileJQL(String mobile) {
        return customerRepository.findByMobileUsingJQL(mobile);
    }
}
