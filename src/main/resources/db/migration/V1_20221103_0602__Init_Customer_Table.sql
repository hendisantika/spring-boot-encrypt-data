CREATE TABLE CUSTOMERS
(
    id     bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    mobile varchar(25) UNIQUE,
    name   varchar(255)
) engine=InnoDB;