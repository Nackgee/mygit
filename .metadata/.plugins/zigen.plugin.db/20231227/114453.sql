use user;


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
   ( '二丈温泉 きららの湯', 
   '福岡県', 
   '092-823-0234', 
   'POOL', 
   'pool(1).jpg', 
   'pool(1).jpg', 
   'pool(2).jpg', 
   'pool(2).jpg', 
   'pool(3).jpg', 
   'pool(3).jpg', 
   '無色・無味・無臭の単純放射能冷鉱泉', 
   '（ラドン泉）', 
   '病気の治療などに利用できる療養泉基準以上のラドンが含まれている。');



select * from hotel;