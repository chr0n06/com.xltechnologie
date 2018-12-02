/*
 * @Author: Maxime Laniel
 * @Date: 2018-11-13=4 14:22:48 
 */
DROP DATABASE XLTECH_DB;

CREATE DATABASE XLTECH_DB;

USE XLTECH_DB;

CREATE TABLE member (
	id BIGINT IDENTITY,
	first_name varchar(20) NOT NULL,
	last_name varchar(20) NOT NULL,
	email varchar(50) NOT NULL,
	pwd varchar(200) NOT NULL,
	
    PRIMARY KEY (id),
);

CREATE TABLE location (
    id BIGINT IDENTITY,
    city varchar(30) NOT NULL,

    PRIMARY KEY (id)
);

CREATE TABLE category (
    id BIGINT IDENTITY,
    name varchar(20) NOT NULL,

    PRIMARY KEY (id)
);

CREATE TABLE store (
    id BIGINT IDENTITY,
    name varchar(50) NOT NULL,
    phone varchar(12),
    
    PRIMARY KEY (id)
);

CREATE TABLE project (
    id BIGINT IDENTITY,
    name varchar(30) NOT NULL,

    PRIMARY KEY (id)
);

CREATE TABLE account (
    id BIGINT IDENTITY,
    number varchar(20) NOT NULL,

    PRIMARY KEY (id)
);

CREATE TABLE interest_rate (
    id BIGINT IDENTITY,
    rate float NOT NULL,

    PRIMARY KEY (id)
);

CREATE TABLE card (
    id BIGINT IDENTITY,
    type varchar(20) NOT NULL,
    number varchar(20) NOT NULL,
    account_id BIGINT NOT NULL,
    member_id BIGINT NOT NULL,
    interest_rate_id BIGINT NOT NULL,
    expiration varchar(5) NOT NULL,
    
    PRIMARY KEY (id),
    FOREIGN KEY (account_id) REFERENCES account (id),
    FOREIGN KEY (member_id) REFERENCES member (id),
    FOREIGN KEY (interest_rate_id) REFERENCES interest_rate (id)
);


CREATE TABLE invoice (
    id BIGINT IDENTITY,
    date Date NOT NULL,
    store_id BIGINT NOT NULL,
    location_id BIGINT NOT NULL,
    detail VARCHAR(200) NULL,
    category_id BIGINT NOT NULL,
    project_id BIGINT NOT NULL,
    total MONEY NOT NULL,
    card_id BIGINT NOT NULL,
    copy bit NOT NULL,
    paid bit NOT NULL,
    
    PRIMARY KEY (id),
    FOREIGN KEY (store_id) REFERENCES store (id),
    FOREIGN KEY (location_id) REFERENCES location (id),
    FOREIGN KEY (card_id) REFERENCES card (id),
    FOREIGN KEY (category_id) REFERENCES category (id),
    FOREIGN KEY (project_id) REFERENCES project (id)
    
);

CREATE TABLE store_location (
    store_id BIGINT NOT NULL,
    location_id BIGINT NOT NULL ,

    PRIMARY KEY (store_id, location_id),
    FOREIGN KEY (store_id) REFERENCES store (id),
    FOREIGN KEY (location_id) REFERENCES location (id)
);

CREATE TABLE store_category (
    store_id BIGINT NOT NULL,
    category_id BIGINT NOT NULL ,

    PRIMARY KEY (store_id, category_id),
    FOREIGN KEY (store_id) REFERENCES store (id),
    FOREIGN KEY (category_id) REFERENCES category (id)
);

CREATE TABLE member_account (
    member_id BIGINT NOT NULL,
    account_id BIGINT NOT NULL ,

    PRIMARY KEY (member_id, account_id),
    FOREIGN KEY (member_id) REFERENCES member (id),
    FOREIGN KEY (account_id) REFERENCES account (id)
);