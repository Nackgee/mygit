use user;

drop table hotel;

CREATE TABLE hotel (
    hotel_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30) UNIQUE,
    address VARCHAR(30) NOT NULL,
    phone_num VARCHAR(30) NOT NULL,
    hotel_cat VARCHAR(30) CHECK(hotel_cat IN ('POOL', 'BEACH', 'SNOW', 'KAN', 'SIMA')) NOT NULL,
    originalfile1 VARCHAR(300),
    savedfile1 VARCHAR(300),
    originalfile2 VARCHAR(300),
    savedfile2 VARCHAR(300),
    originalfile3 VARCHAR(300),
    savedfile3 VARCHAR(300),
    short_com1 VARCHAR(50),
    short_com2 VARCHAR(50),
    long_com VARCHAR(300)
);


INSERT INTO hotel (name, address, phone_num, hotel_cat, originalfile1, savedfile1, short_com1, short_com2) 
VALUES ('キャナルシティ', '博多区', '092-282-2525', 'POOL', '1', '1', '楽しみどころの多い大型マルチプレックス', '毎日噴水ショーが開かれる全長180mの運河があることで有名
');

INSERT INTO hotel (name, address, phone_num, hotel_cat, originalfile1, savedfile1, short_com1, short_com2) 
VALUES ('福岡タワー', '早良区', '092-823-0234', 'BEACH', '2', '2', '海浜タワーとしては日本一の高さを誇る福岡タワー', 'お誕生日の方は展望料無料！ほかにも色々な特典をご用意');

INSERT INTO hotel (name, address, phone_num, hotel_cat, originalfile1, savedfile1, short_com1, short_com2) 
VALUES ('3', '3', '333-3333-3333', 'SNOW', '3', '3', '111', '111');

INSERT INTO hotel (name, address, phone_num, hotel_cat, originalfile1, savedfile1, short_com1, short_com2) 
VALUES ('4', '4', '444-4444-4444', 'KAN', '4', '4', '111', '111');

INSERT INTO hotel (name, address, phone_num, hotel_cat, originalfile1, savedfile1, short_com1, short_com2) 
VALUES ('5', '5', '555-5555-5555', 'SIMA', '5', '5', '111', '111');

