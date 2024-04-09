CREATE DATABASE IF NOT EXISTS bookstore;
USE bookstore;

CREATE TABLE IF NOT EXISTS Book (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    isbn INT NOT NULL,
    genre VARCHAR(100),
    price DECIMAL(10, 2),
    quantity INT
);

CREATE TABLE IF NOT EXISTS Magazine (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    genre VARCHAR(100),
    price DECIMAL(10, 2),
    quantity INT
);

CREATE TABLE IF NOT EXISTS Newspaper (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    genre VARCHAR(100),
    price DECIMAL(10, 2),
    quantity INT
);

CREATE TABLE IF NOT EXISTS User (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    address VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Order (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    total_price DECIMAL(10, 2),
    FOREIGN KEY (customer_id) REFERENCES User(id)
);

INSERT INTO Book (title, author, isbn, genre, price, quantity)
VALUES ('To Kill a Mockingbird', 'Harper Lee', 9780061120084, 'Fiction', 12.99, 100),
       ('1984', 'George Orwell', 9780451524935, 'Science Fiction', 9.99, 75),
       ('The Great Gatsby', 'F. Scott Fitzgerald', 9780743273565, 'Classic', 10.49, 80);

INSERT INTO Magazine (title, genre, price, quantity)
VALUES ('National Geographic', 'Science', 5.99, 50),
       ('Time', 'News', 4.99, 60),
       ('Vogue', 'Fashion', 6.99, 40);

INSERT INTO Newspaper (title, genre, price, quantity)
VALUES ('The New York Times', 'News', 2.99, 100),
       ('The Guardian', 'News', 3.49, 80),
       ('Financial Times', 'Finance', 4.99, 70);

INSERT INTO User (name, email, address)
VALUES ('Jesus Vazquez', 'jesus.vazquez@example.com', '123 Main St, Qc'),
       ('Alison Russell', 'alison.russell@example.com', '456 Oak St, Qc'),
       ('Alice Johnson', 'alice.johnson@example.com', '789 Elm St, Qc');