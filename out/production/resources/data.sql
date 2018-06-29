/*features*/
insert into features (features_id, features_name) values (1,'Модель');
insert into features (features_id, features_name) values (2,'Качество от 1 до 10');
insert into features (features_id, features_name) values (3,'Цвет');
insert into features (features_id, features_name) values (4,'Материал');
insert into features (features_id, features_name) values (5,'Сезон');
insert into features (features_id, features_name) values (6,'Фасон');

/*client*/
insert into client (client_id, client_card, client_disc) values (1,'FGHJ',5);
insert into client (client_id, client_card, client_disc) values (2,'RTYU',15);
insert into client (client_id, client_card, client_disc) values (3,'BNMP',10);
insert into client (client_id, client_card, client_disc) values (4,'ASDF',20);
insert into client (client_id, client_card, client_disc) values (5,'VBHJ',25);
insert into client (client_id, client_card, client_disc) values (6,'NJIU',30);

/*customerorders*/
insert into orders (orders_id, order_date, client_id, order_price) values (1,'2018-05-14 10:30:00',1,6000);
insert into orders (orders_id, order_date, client_id, order_price) values (2,'2018-04-20 15:00:00',2,7000);
insert into orders (orders_id, order_date, client_id, order_price) values (3,'2018-03-03 07:50:20',2,2600);
insert into orders (orders_id, order_date, client_id, order_price) values (4,'2018-04-26 11:30:45',3,8000);
insert into orders (orders_id, order_date, client_id, order_price) values (5,'2018-06-11 19:10:30',4,9000);
insert into orders (orders_id, order_date, client_id, order_price) values (6,'2018-05-06 21:20:40',5,5000);

/*goods*/
insert into goods (goods_id, goods_name, goods_price, goods_desc) values (1,'Блузка "OGGI"',2000,'Летняя шелковая блузка');
insert into goods (goods_id, goods_name, goods_price, goods_desc) values (2,'Сумка "D&G"',3500,'Сумка из тесненой кожи');
insert into goods (goods_id, goods_name, goods_price, goods_desc) values (3,'Очки "Ray Ban"',2600,'Солнцезащитные очки');
insert into goods (goods_id, goods_name, goods_price, goods_desc) values (4,'Платье "ZARA"',4000,'Лёгкое шифоновое платье');
insert into goods (goods_id, goods_name, goods_price, goods_desc) values (5,'Джинсы "Ostin"',4500,'Модные рваные джинсы ');
insert into goods (goods_id, goods_name, goods_price, goods_desc) values (6,'Футболка "Gucci"',2500,'Яркая футболка с принтом');

/*ordersgoods*/
insert into ordersgoods (ordersgoods_id, orders_id, goods_id, goods_quant) values (1,1,1,3);
insert into ordersgoods (ordersgoods_id, orders_id, goods_id, goods_quant) values (2,2,2,2);
insert into ordersgoods (ordersgoods_id, orders_id, goods_id, goods_quant) values (3,3,3,1);
insert into ordersgoods (ordersgoods_id, orders_id, goods_id, goods_quant) values (4,4,4,2);
insert into ordersgoods (ordersgoods_id, orders_id, goods_id, goods_quant) values (5,5,5,2);
insert into ordersgoods (ordersgoods_id, orders_id, goods_id, goods_quant) values (6,6,6,2);

/*goodsfeatures*/
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (1,1,1,'Классическая');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (2,1,2,'9');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (3,1,3,'Белая');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (4,1,4,'Шелк');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (5,1,5,'Лето');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (6,1,6,'Приталенная');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (7,2,1,'Клатч');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (8,2,2,'10');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (9,2,3,'Красная');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (10,2,4,'Глянец');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (11,2,5,'Лето');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (12,2,6,'Мини');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (13,3,1,'Капельки');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (14,3,2,'8');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (15,3,3,'Синии');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (16,3,4,'Пластик');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (17,3,5,'Лето');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (18,3,6,'По форме');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (19,4,1,'Вечернее');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (20,4,2,'10');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (21,4,3,'Черное');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (22,4,4,'Шифон');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (23,4,5,'Весна-лето');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (24,4,6,'Пышное');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (25,5,1,'Повседневные');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (26,5,2,'8');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (27,5,3,'Синии');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (28,5,4,'Хлопок');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (29,5,5,'Весна-лето');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (30,5,6,'Бойфренды');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (31,6,1,'Повседневная');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (32,6,2,'10');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (33,6,3,'Желтая');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (34,6,4,'Полиэстер');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (35,6,5,'Лето');
insert into goodsfeatures (goodsfeat_id,goods_id,features_id,feat_value) values (36,6,6,'Широкая');