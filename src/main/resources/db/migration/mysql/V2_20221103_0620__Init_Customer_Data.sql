INSERT INTO CUSTOMERS (mobile, name)
VALUES (CAST(TO_BASE64(AES_ENCRYPT('081321411501', 'secret-key-12345')) AS char),
        CAST(TO_BASE64(AES_ENCRYPT('naruto', 'secret-key-12345')) AS char)),
       (CAST(TO_BASE64(AES_ENCRYPT('081321411502', 'secret-key-12345')) AS char),
        CAST(TO_BASE64(AES_ENCRYPT('sasuke', 'secret-key-12345')) AS char)),
       (CAST(TO_BASE64(AES_ENCRYPT('081321411503', 'secret-key-12345')) AS char),
        CAST(TO_BASE64(AES_ENCRYPT('sakura', 'secret-key-12345')) AS char)),
       (CAST(TO_BASE64(AES_ENCRYPT('081321411504', 'secret-key-12345')) AS char),
        CAST(TO_BASE64(AES_ENCRYPT('kakashi', 'secret-key-12345')) AS char)),
       (CAST(TO_BASE64(AES_ENCRYPT('081321411505', 'secret-key-12345')) AS char),
        CAST(TO_BASE64(AES_ENCRYPT('hiruzen', 'secret-key-12345')) AS char));