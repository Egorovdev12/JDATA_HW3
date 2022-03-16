CREATE TABLE CUSTOMERS (
                           id SERIAL PRIMARY KEY,
                           name varchar(100),
                           surname varchar(100),
                           age integer,
                           phone_number varchar(11)
);

--Заполним таблицу
INSERT INTO customers (name, surname, age, phone_number) VALUES ('Sergey', 'Ivanov', 72, '79226453254');
INSERT INTO customers (name, surname, age, phone_number) VALUES ('Ivan', 'Borisov', 21, '79126748899');
INSERT INTO customers (name, surname, age, phone_number) VALUES ('Elena', 'Dolgovceva', 33, '79549876543');
INSERT INTO customers (name, surname, age, phone_number) VALUES ('Alexey', 'Buryatov', 26, '78764568164');

CREATE TABLE ORDERS (
                        id SERIAL PRIMARY KEY,
                        date varchar(64),
                        customer_id integer REFERENCES customers(id),
                        product_name varchar(100),
                        amount integer
);

INSERT INTO orders (date, customer_id, product_name, amount) VALUES ('12.01.2022', 1, 'Cheemsburger', 3);
INSERT INTO orders (date, customer_id, product_name, amount) VALUES ('23.02.2022', 2, 'IKEA Shark', 1);
INSERT INTO orders (date, customer_id, product_name, amount) VALUES ('11.03.2022', 3, 'Leather gloves', 1);
INSERT INTO orders (date, customer_id, product_name, amount) VALUES ('8.03.2022', 4, 'Verevka', 1);
INSERT INTO orders (date, customer_id, product_name, amount) VALUES ('9.03.2022', 4, 'milo', 1);