package com.hendisantika.controller;

import com.hendisantika.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-encrypt-data
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/3/22
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
}
