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
VALUES ('三井寺　風鈴トンネル', '福岡県田川市', '0947-42-7206', 'KAN', '3', '3', 'ユニークなお地蔵さまと1万個の風鈴が迎dddddddddddddddddddddddえてくれる風鈴寺', '八方ふさがりの人千手観世音菩薩などもあります');

INSERT INTO hotel (name, address, phone_num, hotel_cat, originalfile1, savedfile1, short_com1, short_com2) 
VALUES ('南蔵院', '福岡県糟屋郡', '092-947-7195', 'KAN', '4', '4', '世界最大級のブロンズ製釈迦涅槃像は圧巻！', '今では日本三大新四国霊場のひとつに数えられています');


INSERT INTO hotel (name, address, phone_num, hotel_cat, originalfile1, savedfile1, short_com1, short_com2) 
VALUES ('太原のイチョウ', '福岡県糟屋郡', '0943-32-5555', 'BEACH', '5', '5', '黄金色に染まるシンボルツリー・イチョウの並木', '町制施行30周年を記念して公募、町の木として制定されました');


select * from hotel;
