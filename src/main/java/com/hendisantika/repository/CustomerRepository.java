package com.hendisantika.repository;

import com.hendisantika.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

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
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // Standard find by Query. Here the mobile number will be automatically encrypted and passed to match with encrypted value
    // in the db
    Customer findByMobile(String mobile);

    // Using JQL.
    // JQL automatically applies the attribute converters.
    // NOTE: Native query will not support this functionality and we are required to pass the encrypted value
    // from our side.
    @Query("select C from Customer C where C.mobile=?1")
    Customer findByMobileUsingJQL(String mobile);
}
