package com.hendisantika.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.persistence.AttributeConverter;
import java.security.Key;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-encrypt-data
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/3/22
 * Time: 15:18
 * To change this template use File | Settings | File Templates.
 */
@Component
public class PIIAttributeConverter implements AttributeConverter<String, String> {

    private static final String AES = "AES";
    private static final String SECRET = "secret-key-12345";
    private static Environment environment;
    private final Key key;

    // As the AttributeConverter is called by the JPA per field, direct autowire does not work
    // We need to use the static field and set
    // Reference: https://stackoverflow.com/a/36856434
    @Autowired
    public void setEnvironment(Environment environment) {
        PIIAttributeConverter.environment = environment;
    }
}
