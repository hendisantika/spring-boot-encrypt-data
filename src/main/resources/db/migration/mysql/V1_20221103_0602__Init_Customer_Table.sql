CREATE TABLE CUSTOMERS
(
    id     bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    mobile varchar(255) UNIQUE,
    name   varchar(255)
) ENGINE = InnoDB;