package com.hendisantika;

import com.hendisantika.util.Encryption;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-encrypt-data
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/7/22
 * Time: 10:58
 * To change this template use File | Settings | File Templates.
 */
public class EncryptionDecryptionTest {

    @Test
    @DisplayName("Encrypt text")
    void encrypt() {
        Encryption encryption = new Encryption();
        String input = "naruto";
        System.out.println("input = " + encryption.encrypt(input));
        assertEquals("4LBE327ydizI2iD4qoRCKA==", encryption.encrypt(input));
    }

    @Test
    @DisplayName("Decrypt text")
    void decrypt() {
        Encryption encryption = new Encryption();
        String input = "4LBE327ydizI2iD4qoRCKA==";
        System.out.println("input = " + encryption.decrypt(input));
        assertEquals("naruto", encryption.decrypt(input));
    }
}
