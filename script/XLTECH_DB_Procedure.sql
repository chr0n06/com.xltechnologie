/**Author: Maxime Laniel
Date: 14 nov 2018
*/
/*inserCategory*/
CREATE PROCEDURE insertCategory @name nvarchar(50)
AS
INSERT INTO Category (Name) VALUES (@name);

/*inserAccount*/
CREATE PROCEDURE insertAccount @cardNumber nvarchar(50)
AS
INSERT INTO Account (CardNumber) VALUES (@cardNumber);

/*insertLocation*/
CREATE PROCEDURE insertLocation @city nvarchar(50)
AS
INSERT INTO Location (City) VALUES (@city);

/*insertMember*/
CREATE PROCEDURE insertMember @firstName nvarchar(50),
@lastName nvarchar(50),
@email nvarchar(50),
@password nvarchar(50)
AS
INSERT INTO Member (FirstName,LastName, Email, Password) 
VALUES (@firstName, @lastName, @email, @password);

/*insertMemberAccount*/
CREATE PROCEDURE insertMemberAccount @memberID Integer,
@AccountID Integer
AS
INSERT INTO MemberAccount (MemberID, AccountID) 
VALUES (@memberID, @AccountID);

/*insertProject*/
CREATE PROCEDURE insertProject @name nvarchar(50)
AS
INSERT INTO Project (Name) VALUES (@name);


/*totalYearSpendingByStoreID*/
CREATE PROCEDURE totalYearSpendingByStoreID
AS
 SELECT SUM(Total) FROM Spending
WHERE StoreID = 1 AND
      Date > '2018-01-01';
      
/*totalSpendingByStoreID*/
CREATE PROCEDURE totalSpendingByStoreID
AS
SELECT SUM(Total) FROM Spending
WHERE StoreID = 1;
      
      
/*sortStoreLocationByStoreID*/
/*Version2*/
CREATE PROCEDURE sortStoreLocationByStoreID @storeId Integer
AS
SELECT l.city FROM store_location sl
INNER JOIN store s ON sl.store_id = s.id 
INNER Join location l ON sl.location_id = l.id
WHERE sl.store_id = @storeId;


/*Queries*/
/*sort card_holder + card_number by member id*/
SELECT CONCAT(m.first_name, m.last_name) AS "card_holder", a.card_number FROM member_account ma
INNER JOIN member m ON ma.member_id = m.id
INNER JOIN account a ON ma.account_id = a.id
WHERE m.id = 1; 



/*Must be Implemented*/

/*SELECT QUERIES*/

/*SelectAllInvoices*/
SELECT i.id,date, s.name AS "store", l.city , detail, c.name AS "category",p.name  AS "project",total, car.number,copy,paid FROM invoice i
INNER JOIN store s ON i.store_id = s.id
INNER JOIN location l ON i.location_id = l.id
INNER JOIN category c ON i.category_id = c.id
INNER JOIN project p ON i.project_id = p.id
INNER JOIN card car ON i.card_id = car.id
ORDER BY date;

/*SelectAllInvoices More reprensentative*/
SELECT * FROM invoice i
INNER JOIN card c ON i.card_id = c.id
INNER JOIN account a ON c.account_id = a.id
WHERE a.id = 2



/*TotalExpenseForAllStore*/
SELECT s.name AS "store", sum(i.total) AS "total" FROM invoice i
INNER JOIN store s ON i.store_id = s.id
GROUP BY s.name
ORDER BY total DESC

/*TotalExpenseForAllLocation*/
SELECT l.city AS "city", sum(i.total) AS "total" FROM invoice i
INNER JOIN location l ON i.location_id = l.id
GROUP BY l.city
ORDER BY total DESC

/*TotalExpênseForAllCategory*/
SELECT c.name AS "category", sum(i.total) AS "total" FROM invoice i
INNER JOIN category c ON i.category_id = c.id
GROUP BY c.name
ORDER BY total DESC


/*TotalExpenseForAllProject*/
SELECT p.name AS "project", sum(i.total) AS "total" FROM invoice i
INNER JOIN project p ON i.project_id = p.id
GROUP BY p.name
ORDER BY total DESC


/*INSERT QUERIES*/

/*InsertInvoice*/
/*Has to be tested*/
CREATE PROCEDURE insertInvoice
@date date,
@store_id BIGINT,
@location_id BIGINT,
@detail nvarchar(100),
@category_id BIGINT,
@project_id BIGINT,
@total money,
@card_id BIGINT,
@copy bit,
@paid bit,
AS
INSERT INTO invoice (date, store_id, location_id, detail, category_id, total, project_id, card_id, copy, paid)
VALUES (@date, @store_id, @location_id, @detail, @category_id, @project_id, @total,@card_id, @copy, @paid);

/*VIEWS*/

/*invoice_1*/
CREATE VIEW invoice_1 AS
SELECT i.id,date, s.name AS "store", l.city , detail, c.name AS "category",p.name  AS "project",total, car.number,copy,paid FROM invoice i
INNER JOIN store s ON i.store_id = s.id
INNER JOIN location l ON i.location_id = l.id
INNER JOIN category c ON i.category_id = c.id
INNER JOIN project p ON i.project_id = p.id
INNER JOIN card car ON i.card_id = car.id

/*UPDATE QUERIES*/

/*DELETE QUERIES*/
