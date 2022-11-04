package com.hendisantika.entity;

import com.hendisantika.util.PIIAttributeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-encrypt-data
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/3/22
 * Time: 15:17
 * To change this template use File | Settings | File Templates.
 */

@Data
@Builder
@Entity
@Table(name = "CUSTOMERS")
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = PIIAttributeConverter.class)
    @Column(unique = true)
    private String mobile;

    @Convert(converter = PIIAttributeConverter.class)
    private String name;
}
