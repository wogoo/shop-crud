create table products
(
    id serial PRIMARY KEY,
    product_name varchar(250) not null,
    product_desc varchar(250) not null,
    customer_id integer not null,
    created_at TIMESTAMP NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);