use user;





CREATE TABLE user
(
    user_id     INT            AUTO_INCREMENT PRIMARY KEY,
    email      VARCHAR(25)    UNIQUE, 
    name       VARCHAR(25)    NOT NULL, 
    phone_num  VARCHAR(25)    NOT NULL, 
    birthday   VARCHAR(50)    NOT NULL, 
    gender     VARCHAR(6)     CHECK(gender IN('MALE', 'FEMALE')) NOT NULL 
);


select * from user;

