use user;

delete from hotel where hotel_cat = 'POOL';

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
	( '二丈温泉', 
	'福岡県', 
	'092-823-0234', 
	'POOL', 
	'pool (1).jpg', 
	'pool (1).jpg', 
	'pool (2).jpg', 
	'pool (2).jpg', 
	'pool (3).jpg', 
	'pool (3).jpg', 
	'無色・無味・無臭の単', 
	'（ラドン泉）', 
	'病気の治療などに利用できる療');

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
	( '海の中道海浜', 
	'福岡県', 
	'0947-44-0715', 
	'POOL', 
	'pool (4).jpg', 
	'pool (4).jpg', 
	'pool (5).jpg', 
	'pool (5).jpg', 
	'pool (6).jpg', 
	'pool (6).jpg', 
	'実は福岡生まれの大', 
	'お得に手に入れよう', 
	'日本全国で知名度抜群のチ。');


INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,originalfile2, 
	savedfile2,originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( '和布刈公園', 
	'福岡県', 
	'0947-44-0715', 
	'KAN', 
	'pool (4).jpg', 
	'pool (4).jpg', 
	'pool (5).jpg', 
	'pool (5).jpg', 
	'pool (6).jpg', 
	'pool (6).jpg', 
	'関門海峡を一望でき、', 
	'関門海峡を一望でき、', 
	'瀬戸内海国立公園の西端に。');


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
	( '天然温泉', 
	'福岡県', 
	'0947-44-0715', 
	'POOL', 
	'pool (7).jpg', 
	'pool (7).jpg', 
	'pool (8).jpg', 
	'pool (8).jpg', 
	'pool (9).jpg', 
	'pool (9).jpg', 
	'田園風景に青、黄、', 
	'緑の鮮やかな建物が映', 
	'一年中使える温泉プールも大好評だ。');


INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,originalfile2, 
	savedfile2,originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( 'あしや砂', 
	'福岡県', 
	'0947-44-0715', 
	'POOL', 
	'pool (10).jpg', 
	'pool (10).jpg', 
	'pool (11).jpg', 
	'pool (11).jpg', 
	'pool (12).jpg', 
	'pool (12).jpg', 
	'世界トップの砂像彫刻家の傑', 
	'砂像の祭典', 
	'「あしや砂像展」には、その芦屋海岸のきめ細。');


INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,originalfile2, 
	savedfile2,originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( '田川市市', 
	'福岡県', 
	'093-663-7251', 
	'POOL', 
	'pool (13).jpg', 
	'pool (13).jpg', 
	'pool (14).jpg', 
	'pool (14).jpg', 
	'pool (15).jpg', 
	'pool (15).jpg', 
	'巨大基地のようなウォー', 
	'市内最大の屋外プール。', 
	'親子で大満足の時間。');


INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,originalfile2, 
	savedfile2,originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( '海の中道サン', 
	'福岡県', 
	'0947-44-0715', 
	'POOL', 
	'pool (16).jpg', 
	'pool (16).jpg', 
	'pool (17).jpg', 
	'pool (17).jpg', 
	'pool (18).jpg', 
	'pool (18).jpg', 
	'西日本最大級の流水プール', 
	'「ウォータージャングル」が人気。', 
	'水が勢いよく飛び出す「恐しめます。');


INSERT INTO
	hotel
	( name, 
	address, 
	phone_num,hotel_cat, 
	originalfile1, 
	savedfile1,originalfile2, 
	savedfile2,originalfile3, 
	savedfile3, 
	short_com1, 
	short_com2, 
	long_com )
	VALUES
	( '矢部源流公園', 
	'福岡県', 
	'0947-44-0715', 
	'POOL', 
	'pool (21).jpg', 
	'pool (21).jpg', 
	'pool (22).jpg', 
	'pool (22).jpg', 
	'pool (23).jpg', 
	'pool (23).jpg', 
	'ダム上流の自然のプ！', 
	'親子で遊んで1日満喫！', 
	'福岡市中心部から車で約1時間半。清流矢部川の。');




select * from hotel;