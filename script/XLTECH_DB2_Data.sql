/*
 * @Author: Maxime Laniel
 * @Date: 2018-11-14 14:22:48 
 */
USE XLTECH_DB2;

/*member*/
insert into member (first_name, last_name, email, pwd) values ('Maxime', 'Laniel', 'maxime.laniel@outlook.com', 'Prieure4126');
insert into member (first_name, last_name, email, pwd) values ('Guy', 'Laniel', 'glaniel@cgocable.ca', 'Vn2018');
insert into member (first_name, last_name, email, pwd) values ('Cynthia', 'Pronovost', 'cynthiapronovost@gmail.com', 'Smashers56');

/*account*/
insert into account (number) values ('5598 **** **** 0005');
insert into account (number) values ('5598 **** **** 2003');
insert into account (number) values ('0000 **** **** 0000');

/*interest_rate*/
insert into interest_rate (rate) values (19.90);
insert into interest_rate (rate) values (5.37);

/*card*//*VERIFY ORDER*/
insert into card (type, number, account_id, member_id, interest_rate_id, expiration) values ('MasterCard','5598 **** **** 0021', 1, 1, 1, '11/21');
insert into card (type, number, account_id, member_id, interest_rate_id, expiration) values ('MasterCard','5598 **** **** 2011', 1, 3, 1, '12/21');
insert into card (type, number, account_id, member_id, interest_rate_id, expiration) values ('MasterCard','**** **** **** 9977', 3, 2, 2, '08/19');
insert into card (type, number, account_id, member_id, interest_rate_id, expiration) values ('MasterCard','5598 **** **** 0013', 1, 3, 1, '11/21');


/*store*/
insert into store (name) VALUES ('Rénot Dépôt');
insert into store (name) VALUES ('Patrick Morin');
insert into store (name) VALUES ('SuperC');
insert into store (name) VALUES ('Canac');
insert into store (name) VALUES ('Newegg');
insert into store (name) VALUES ('Canadian Tire');
insert into store (name) VALUES ('Fourniture de bureau Denis');
insert into store (name) VALUES ('Bureau en Gros');
insert into store (name) VALUES ('Shopper +');
insert into store (name) VALUES ('Rona');
insert into store (name) VALUES ('WallMart');
insert into store (name) VALUES ('IGA');
insert into store (name) VALUES ('Métro');
insert into store (name) VALUES ('Ultramar');
insert into store (name) VALUES ('Best Buy');
insert into store (name) VALUES ('Couche Tard');
insert into store (name) VALUES ('IKEA');
insert into store (name) VALUES ('SAQ');
insert into store (name) VALUES ('Annies');
insert into store (name) VALUES ('Stationnement MTL');
insert into store (name) VALUES ('Dollorama');
insert into store (name) VALUES ('Uniprix');
insert into store (name) VALUES ('Subway');
insert into store (name) VALUES ('Nedco');
insert into store (name) VALUES ('BMR');
insert into store (name) VALUES ('STM');
insert into store (name) VALUES ('Petro Canada');
insert into store (name) VALUES ('Guillevin International');
insert into store (name) VALUES ('McDonalds');
insert into store (name) VALUES ('Rotisserie Fusée');
insert into store (name) VALUES ('Tim Hortons');
insert into store (name) VALUES ('Scierie Sawmill inc.');
insert into store (name) VALUES ('Esso');
insert into store (name) VALUES ('Les marmittons en herbe');
insert into store (name) VALUES ('Tradition');
insert into store (name) VALUES ('Thyme');
insert into store (name) VALUES ('Caseys');
insert into store (name) VALUES ('Tiki Ming');
insert into store (name) VALUES ('Bulk Barn');
insert into store (name) VALUES ('Bravo Pizza');
insert into store (name) VALUES ('Pizzeria no.900');
insert into store (name) VALUES ('Scores Rotisserie BBQ');
insert into store (name) VALUES ('Davids Tea');
insert into store (name) VALUES ('Cineplex Odeon');


/*location*/
insert into location (city) VALUES ('Beauharnois');
insert into location (city) VALUES ('Lachine');
insert into location (city) VALUES ('Laval');
insert into location (city) VALUES ('Les Cèdres');
insert into location (city) VALUES ('Montréal');
insert into location (city) VALUES ('N/D');
insert into location (city) VALUES ('Pincourt');
insert into location (city) VALUES ('Saint-Lazare');
insert into location (city) VALUES ('Saint-Zotique');
insert into location (city) VALUES ('Valleyfield');
insert into location (city) VALUES ('Vaudreuil');
insert into location (city) VALUES ('Dorval');
insert into location (city) VALUES ('Dorion');
insert into location (city) VALUES ('Brossard');
insert into location (city) VALUES ('St-Clet');

/*categery*/
insert into category (name) VALUES ('Alimentation');
insert into category (name) VALUES ('Ameublement ');
insert into category (name) VALUES ('Article pour bébé');
insert into category (name) VALUES ('Assurances');
insert into category (name) VALUES ('Cadeaux');
insert into category (name) VALUES ('Dons');
insert into category (name) VALUES ('Électronique');
insert into category (name) VALUES ('Essence');
insert into category (name) VALUES ('Jardinage');
insert into category (name) VALUES ('Loisirs');
insert into category (name) VALUES ('Maison');
insert into category (name) VALUES ('Outils');
insert into category (name) VALUES ('Rénovation');
insert into category (name) VALUES ('Restaurant');
insert into category (name) VALUES ('Soins Personnels');
insert into category (name) VALUES ('Taxes');
insert into category (name) VALUES ('Vêtements');
insert into category (name) VALUES ('Animaux');
insert into category (name) VALUES ('Stationnement');
insert into category (name) VALUES ('Transport en commun');
insert into category (name) VALUES ('Bureautique');
insert into category (name) VALUES ('Décoration');

/*project*/
insert into project (name) VALUES ('Douche (1e Étage)');
insert into project (name) VALUES ('Emménagement Maison');
insert into project (name) VALUES ('N/D');
insert into project (name) VALUES ('Salon de coiffure');
insert into project (name) VALUES ('Bureau Ordinateur');

/*store_location*/
insert into store_location (store_id, location_id) VALUES (1,5);
insert into store_location (store_id, location_id) VALUES (1,10);
insert into store_location (store_id, location_id) VALUES (1,11);
insert into store_location (store_id, location_id) VALUES (1,12);
insert into store_location (store_id, location_id) VALUES (2,5);
insert into store_location (store_id, location_id) VALUES (2,10);
insert into store_location (store_id, location_id) VALUES (2,11);
insert into store_location (store_id, location_id) VALUES (2,12);
insert into store_location (store_id, location_id) VALUES (3,5);
insert into store_location (store_id, location_id) VALUES (3,10);
insert into store_location (store_id, location_id) VALUES (3,11);
insert into store_location (store_id, location_id) VALUES (3,12);
insert into store_location (store_id, location_id) VALUES (4,1);
insert into store_location (store_id, location_id) VALUES (4,10);

/*store_category*/
insert into store_category (store_id, category_id) VALUES (1,2);
insert into store_category (store_id, category_id) VALUES (1,5);
insert into store_category (store_id, category_id) VALUES (1,9);
insert into store_category (store_id, category_id) VALUES (1,10);
insert into store_category (store_id, category_id) VALUES (1,11);
insert into store_category (store_id, category_id) VALUES (1,12);
insert into store_category (store_id, category_id) VALUES (1,13);
insert into store_category (store_id, category_id) VALUES (1,22);
insert into store_category (store_id, category_id) VALUES (2,2);
insert into store_category (store_id, category_id) VALUES (2,5);
insert into store_category (store_id, category_id) VALUES (2,9);
insert into store_category (store_id, category_id) VALUES (2,10);
insert into store_category (store_id, category_id) VALUES (2,11);
insert into store_category (store_id, category_id) VALUES (2,12);
insert into store_category (store_id, category_id) VALUES (2,13);
insert into store_category (store_id, category_id) VALUES (2,22);
insert into store_category (store_id, category_id) VALUES (3,1);
insert into store_category (store_id, category_id) VALUES (3,15);

/*member_account*/
insert into member_account (member_id, account_id) VALUES (1,1);
insert into member_account (member_id, account_id) VALUES (1,2);
insert into member_account (member_id, account_id) VALUES (2,3);
insert into member_account (member_id, account_id) VALUES (3,1);

/*invoice*/
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-08-30', 25, 6, 'N/D', 13, 12.88, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-08-30', 10, 6, 'N/D', 13, 11.22, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-01', 13, 6, 'N/D', 1, 70.38, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-04', 4, 1, 'N/D', 13, 88.76, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-04', 12, 6, 'N/D', 1, 12.66, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-04', 2, 6, 'N/D', 13, 50.91, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-04', 2, 6, 'N/D', 13, 47.21, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-06', 12, 6, 'N/D', 1, 15.26, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-06', 3, 6, 'N/D', 1, 158.52, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-06', 11, 6, 'N/D', 15, 67.76, 3, 1, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-07', 12, 6, 'N/D', 1, 10.91, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-08', 1, 6, 'N/D', 13, 225.59, 4, 1, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-08', 1, 6, 'N/D', 13, 518.75, 4, 1, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-11', 3, 6, 'N/D', 1, 76.66, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-13', 1, 6, 'N/D', 13, 62.15, 4, 1, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-13', 3, 6, 'N/D', 1, 23.56, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-14', 4, 1, 'N/D', 13, 111.59, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-14', 4, 1, 'N/D', 13, -105.15, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-14', 1, 6, 'N/D', 13, 23.44, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-17', 2, 11, 'N/D', 13, 56, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-17', 2, 11, 'N/D', 13, 33.27, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-18', 3, 6, 'N/D', 1, 75.33, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-19', 5, 6, 'Laptop à Marie Picard', 7, 473.43, 3, 2, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-20', 14, 10, 'N/D', 8, 30, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-22', 1, 11, 'Fan/calorifère/fils électrique', 13, 553.66, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-23', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-23', 27, 12, 'N/D', 8, 59.04, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-24', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-24', 2, 10, 'Crampon Câble électrique / serre fils', 11, 28.58, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-24', 29, 5, 'N/D', 14, 4.81, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-25', 28, 10, 'Breaker Cutler Hammer', 11, 62.25, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-25', 24, 10, 'Connecteur à câble électrique', 11, 8, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-25', 29, 10, 'N/D', 14, 5.51, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-25', 3, 10, 'N/D', 1, 111.12, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-28', 29, 10, 'N/D', 14, 5.51, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-29', 30, 5, 'N/D', 14, 12.59, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-29', 20, 5, 'N/D', 19, 10, 3, 4, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-30', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-09-30', 31, 5, 'N/D', 14, 7.46, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-01', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-01', 14, 10, 'N/D', 8, 50, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-02', 28, 10, 'Achat de disjoncteurs pour le panneau électrique', 13, 49.29, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-03', 2, 10, 'N/D', 13, 36.91, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-04', 8, 10, 'Timbre et enveloppes', 21, 21.69, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-04', 3, 10, 'N/D', 1, 147.03, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-04', 29, 10, 'N/D', 14, 15.49, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-04', 14, 15, 'N/D', 8, 30, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-05', 32, 8, 'Retour du pot dhuile à bois', 2, -28.69, 5, 2, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-05', 25, 10, 'N/D', 13, 12.94, 4, 3, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-06', 20, 5, 'N/D', 19, 10, 3, 4, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-06', 38, 5, 'N/D', 14, 11.6, 3, 4, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-07', 29, 5, 'N/D', 14, 5.73, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-07', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-08', 33, 8, 'N/D', 8, 55.05, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-08', 20, 5, 'N/D', 19, 10, 3, 4, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-09', 3, 10, 'N/D', 1, 32.79, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-10', 34, 11, 'N/D', 1, 63, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-12', 36, 14, 'Veste maternité', 17, 64.33, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-12', 37, 14, 'N/D', 14, 113.16, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-14', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-15', 3, 10, 'N/D', 1, 162.55, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-15', 11, 10, 'N/D', 15, 39.76, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-15', 39, 10, 'N/D', 1, 12.12, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-16', 14, 10, 'N/D', 8, 40, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-16', 29, 10, 'N/D', 14, 5.51, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-16', 3, 10, 'N/D', 1, 11.74, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-17', 10, 4, 'Gyproc + Coude aspirateur', 11, 85.31, 4, 1, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-17', 10, 4, 'Gyproc: Rajustement 4x10 remplacé par 4x12', 11, 5.04, 4, 1, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-18', 34, 11, 'N/D', 1, 39.53, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-20', 23, 5, 'N/D', 14, 10.68, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-20', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-21', 29, 5, 'N/D', 14, 5.73, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-21', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-22', 40, 8, 'N/D', 14, 79.34, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-23', 3, 10, 'N/D', 1, 71.14, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-23', 29, 10, 'N/D', 14, 5.51, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-24', 26, 5, 'N/D', 20, 6, 3, 4, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-24', 41, 5, 'N/D', 14, 27.76, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-24', 42, 11, 'N/D', 14, 104.33, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-25', 11, 10, 'Colliers + Bonbons à chat + Planche à découper', 18, 33.07, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-25', 29, 10, 'N/D', 14, 9.87, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-27', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-28', 33, 8, 'N/D', 8, 53, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-28', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-29', 2, 7, 'Outils (ponceuse) + Plâtre à joint', 11, 100.66, 4, 1, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-30', 3, 10, 'N/D', 1, 120.79, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-10-30', 29, 10, 'N/D', 14, 5.51, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-03', 20, 5, 'N/D', 19, 10, 3, 4, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-04', 38, 5, 'N/D', 14, 11.6, 3, 4, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-04', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-06', 3, 10, 'N/D', 1, 161.62, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-06', 29, 10, 'N/D', 14, 5.51, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-08', 29, 10, 'N/D', 14, 16.4, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-08', 3, 10, 'N/D', 1, 36.66, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-09', 44, 13, 'N/D', 10, 22.5, 3, 2, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-10', 33, 8, 'N/D', 8, 40, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-10', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-11', 38, 5, 'N/D', 14, 12.86, 3, 4, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-11', 20, 5, 'N/D', 19, 10, 3, 2, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-12', 3, 11, 'N/D', 1, 5, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-12', 13, 10, 'N/D', 1, 28.96, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-12', 21, 11, 'N/D', 22, 52.14, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-13', 3, 10, 'N/D', 1, 85.36, 3, 1, 0, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-13', 6, 10, 'N/D', 22, 34.48, 3, 1, 1, 1);
insert into invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid) VALUES ('2018-11-13', 29, 10, 'N/D', 14, 5.51, 3, 2, 0, 1);


