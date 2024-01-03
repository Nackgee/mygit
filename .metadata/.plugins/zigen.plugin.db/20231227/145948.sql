use user;
drop table hotel;

CREATE TABLE hotel (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    address VARCHAR(50),
    phone_num VARCHAR(50),
    hotel_cat VARCHAR(50) check(hotel_cat in('POOL', 'BEACH', 'SNOW', 'KAN', 'SIMA')) not null,
    originalfile1 VARCHAR(50),
    savedfile1 VARCHAR(50),
    originalfile2 VARCHAR(50),
    savedfile2 VARCHAR(50),
    originalfile3 VARCHAR(50),
    savedfile3 VARCHAR(50),
    short_com1 VARCHAR(50),
    short_com2 VARCHAR(50),
    long_com VARCHAR(50)
);
INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,
	originalfile2, 
	savedfile2,
	originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( 'キロロスノーワールド', 
	'福岡県', 
	'092-823-0234', 
	'SNOW', 
	'snow (1).jpg', 
	'snow (1).jpg', 
	'snow (2).jpg', 
	'snow (2).jpg', 
	'snow (3).jpg', 
	'snow (3).jpg', 
	'世界屈指のパウダースノーを滑る！', 
	'各種アクティビティで上質な雪を満喫', 
	'敷地内にはゲレンデ直結のマウンテンホテルと、温泉・プール・エステを備えたホテルピアノがある。');

INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,
	originalfile2, 
	savedfile2,
	originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( 'サッポロテイネ', 
	'福岡県', 
	'092-823-0234', 
	'SNOW', 
	'snow (4).jpg', 
	'snow (4).jpg', 
	'snow (5).jpg', 
	'snow (5).jpg', 
	'snow (6).jpg', 
	'snow (6).jpg', 
	'札幌オリンピックの競技会場を滑降、', 
	'気分とレベルに合わせて手稲山を制覇', 
	'北海道で最長の6キロメートルの初級コースは、山頂から両ゾーンを貫いて一気に滑り降りるのが爽快です。');

INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,
	originalfile2, 
	savedfile2,
	originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( 'スノークルーズ', 
	'福岡県', 
	'092-823-0234', 
	'SNOW', 
	'snow (7).jpg', 
	'snow (7).jpg', 
	'snow (8).jpg', 
	'snow (8).jpg', 
	'snow (9).jpg', 
	'snow (9).jpg', 
	'北海道で最初にオープンするスキー場。', 
	'石狩湾を望む景観の良さも魅力', 
	'石狩湾を眺めながら滑降できるゲレンデは全9コースで、スノーボードやスノースクートの滑降も可能だ。');

INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,
	originalfile2, 
	savedfile2,
	originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( 'ばんけいの森', 
	'福岡県', 
	'092-823-0234', 
	'SNOW', 
	'snow (10).jpg', 
	'snow (10).jpg', 
	'snow (11).jpg', 
	'snow (11).jpg', 
	'snow (12).jpg', 
	'snow (12).jpg', 
	'仕事帰りに気軽に寄れる好アクセス。', 
	'レンタル一式＆リフト券付き「手ぶらパック」も', 
	'リフト券が付いた「手ぶらパック」など、初心者に嬉しいプランも用意されています。');

INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,
	originalfile2, 
	savedfile2,
	originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( 'フッズスノーエリア', 
	'福岡県', 
	'092-823-0234', 
	'SNOW', 
	'snow (13).jpg', 
	'snow (13).jpg', 
	'snow (14).jpg', 
	'snow (14).jpg', 
	'snow (15).jpg', 
	'snow (15).jpg', 
	'日本で2つしか無いリュージュ競技場。', 
	'体感スピード時速90キロの世界を体験', 
	'約33万平米の広大な敷地を持つ「藤野野外スポーツ交流施設 フッズ」。');

INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,
	originalfile2, 
	savedfile2,
	originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( '札幌国際', 
	'福岡県', 
	'092-823-0234', 
	'SNOW', 
	'snow (16).jpg', 
	'snow (16).jpg', 
	'snow (17).jpg', 
	'snow (17).jpg', 
	'snow (18).jpg', 
	'snow (18).jpg', 
	'初心者から上級者まで楽しめる。', 
	'定山渓温泉にほど近い総合スキー場', 
	'車で札幌市内から約1時間、北海道でも屈指のパウダースノーと広大なゲレンデが自慢のスキー場。');

INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,
	originalfile2, 
	savedfile2,
	originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( 'さっぽろ雪まつりと', 
	'福岡県', 
	'092-823-0234', 
	'SNOW', 
	'snow (19).jpg', 
	'snow (19).jpg', 
	'snow (20).jpg', 
	'snow (20).jpg', 
	'snow (21).jpg', 
	'snow (21).jpg', 
	'つどーむ会場と、', 
	'札幌市内もめぐって旅を充実させよう', 
	'役立つ雪まつり情報とともに、観光スポットやグルメなどを紹介します。');

INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,
	originalfile2, 
	savedfile2,
	originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( '定山渓で冬', 
	'福岡県', 
	'092-823-0234', 
	'SNOW', 
	'snow (22).jpg', 
	'snow (22).jpg', 
	'snow (23).jpg', 
	'snow (23).jpg', 
	'snow (24).jpg', 
	'snow (24).jpg', 
	'札幌市中心部から車やバスで約1時間、', 
	'気軽に雪あそびができる', 
	'子ども連れはもちろん、大人も満喫できる定山渓の雪あそびを紹介します。');

select * from hotel;


