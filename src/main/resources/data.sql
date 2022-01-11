 INSERT INTO
     User(firstName, lastName, phoneNumber, email, street, city, postalCode, country)
 VALUES
     ('Jan', 'Kowalski', '798456123', 'jankowalski@example.com', 'Palacowa 9', 'Warszawa', '00-121', 'Poland'),
     ('Karolina', 'Nowak', '9435678621', 'karolinanowak@example.com', 'Gruszkowa 56', 'Warszawa', '00-121', 'Poland'),
     ('Wacław', 'Beczka', '123456123', 'waclawbeczka@example.com', 'Dębowa 3', 'Warszawa', '00-121', 'Poland'),
     ('Stanisław', 'Kołek', '621456443', 'stanislawkolek@example.com', 'Aleja Jana Pawła II 66', 'Warszawa', '00-121', 'Poland'),
     ('Marlena', 'Mruczek', '798456339', 'MeniMruczek@example.com', 'Krucza 225', 'Warszawa', '00-121', 'Poland');

 INSERT INTO Animal
 (coatTypeMarking, color, dateOfDischarge, dayPrice, demographicRegistrationNumber, distinguishingMarks, gender, hourPrice, name, ownerId, spiece, tatooNumber)
 VALUES
     (null, 'ginger', null, 800, '456789', null, 'male', 80, 'Puszek', 1, 'cat', '0000965675675'),
     (null, 'black&white', null, 1200, '978774', null, 'male', 120, 'Reksio', 2, 'dog', '00009651123123'),
     (null, 'grey', null, 700, '456778', null, 'male', 70, 'Azor', 3, 'dog', '00009656123123');


INSERT INTO
    Employee(firstName, lastName, academicDegree, pwz, salary)
VALUES
    ('Karol', 'Abacki', 'doktor wiktor weterynarz', '12345', 12333),
    ('Patryk', 'Stokrocki', 'stażysta niskiego stopnia', null, 2444);