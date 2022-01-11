CREATE TABLE IF NOT EXISTS Employee(
    id BIGINT AUTO_INCREMENT PRIMARY KEY ,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    academicDegree VARCHAR(255),
    pwz VARCHAR(255),
    salary DOUBLE
);

CREATE TABLE IF NOT EXISTS User(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    phoneNumber VARCHAR(30),
    email VARCHAR(255),
    street VARCHAR(255),
    city VARCHAR(255),
    postalCode VARCHAR(255),
    country VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Animal(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    spiece VARCHAR(255),
    name VARCHAR(255),
    gender VARCHAR(20),
    color VARCHAR(255),
    coatTypeMarking VARCHAR(255),
    distinguishingMarks VARCHAR(255),
    demographicRegistrationNumber VARCHAR(255),
    tatooNumber VARCHAR(255),
    hourPrice DOUBLE,
    dayPrice DOUBLE,
    ownerId VARCHAR(255),
    dateOfDischarge DATETIME
);

