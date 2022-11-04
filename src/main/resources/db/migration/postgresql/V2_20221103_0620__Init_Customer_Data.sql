INSERT INTO CUSTOMERS (mobile, name)
VALUES (encrypt('081321411501', 'salty', 'aes'), encrypt('naruto', 'salty', 'aes')),
       (encrypt('081321411502', 'salty', 'aes'), encrypt('sasuke', 'salty', 'aes')),
       (encrypt('081321411503', 'salty', 'aes'), encrypt('sakura', 'salty', 'aes')),
       (encrypt('081321411504', 'salty', 'aes'), encrypt('kakashi', 'salty', 'aes')),
       (encrypt('081321411505', 'salty', 'aes'), encrypt('hiruzen', 'salty', 'aes'));
