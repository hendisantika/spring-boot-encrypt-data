package com.hendisantika.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.persistence.AttributeConverter;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

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

    public PIIAttributeConverter() {
        // IMPORTANT NOTE: Preferably get the secret from the configuration
        // environment.getProperty() etc that loads from Vault or some Secret storage
        key = new SecretKeySpec(SECRET.getBytes(), AES);
    }

    @Override
    public String convertToDatabaseColumn(String attribute) {
        try {
            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return Base64.getEncoder().encodeToString(cipher.doFinal(attribute.getBytes()));
        } catch (InvalidKeyException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException |
                 NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
            // You can decide to return an empty or null value on error to be stored if don't want to throw exception
        }
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        try {
            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(Cipher.DECRYPT_MODE, key);
            return new String(cipher.doFinal(Base64.getDecoder().decode(dbData)));
        } catch (InvalidKeyException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException |
                 NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
            // You can decide to return an empty or null value on error to be returned if don't want to throw exception
        }
    }
}
