DROP TABLE IF EXISTS address;
DROP TABLE IF EXISTS contact;
DROP TABLE IF EXISTS employment;
DROP TABLE IF EXISTS person;
CREATE TABLE IF NOT EXISTS address (
                                      id INT,
                                      city VARCHAR(255),
                                      street VARCHAR(255),
                                      building INT,
                                      flat INT,
                                      CONSTRAINT address_id PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS employment (
                                      id INT,
                                      company VARCHAR(255),
                                      title VARCHAR(255),
                                      CONSTRAINT empl_id PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS contact (
                                          id INT,
                                          phone VARCHAR(255),
                                          email VARCHAR(255),
                                          CONSTRAINT contact_id PRIMARY KEY (id)

);
CREATE TABLE IF NOT EXISTS person (
                                      id INT ,
                                      name VARCHAR(255),
                                      surname VARCHAR(255),
                                      gender VARCHAR(255),
                                      age INT,
                                      address_id INT,
                                      empl_id INT,
                                      contact_id INT,
                                      CONSTRAINT person_id PRIMARY KEY (id),
                                      CONSTRAINT address_fk FOREIGN KEY (address_id) REFERENCES address (ID),
                                      CONSTRAINT empl_fk FOREIGN KEY (empl_id) REFERENCES employment (ID),
                                      CONSTRAINT contact_fk FOREIGN KEY (contact_id) REFERENCES contact (ID)
                                      
);
INSERT INTO ADDRESS(id, city, street, building, flat) VALUES (0, 'munich', 'kirchenstrasse', 11, 33 );
INSERT INTO ADDRESS(id, city, street, building, flat) VALUES (1, 'belgrade', 'dunavska', 22, 44 );
INSERT INTO ADDRESS(id, city, street, building, flat) VALUES (2, 'prague', 'holeckova', 26, 503 );
INSERT INTO ADDRESS(id, city, street, building, flat) VALUES (3, 'london', 'high', 5, 2 );
INSERT INTO EMPLOYMENT(id, company, title) VALUES ( 0,'jetbrains', 'developer');
INSERT INTO EMPLOYMENT(id, company, title) VALUES ( 1,'jetbrains', 'support' );
INSERT INTO EMPLOYMENT(id, company, title) VALUES ( 2,'jetbrains', 'qa' );
INSERT INTO EMPLOYMENT(id, company, title) VALUES ( 3,'jetbrains', 'manager' );
INSERT INTO CONTACT(id, phone, email) VALUES ( 0,'1234567','vp@jetbrains.com' );
INSERT INTO CONTACT(id, phone, email) VALUES (1, '7654321','lp@jetbrains.com' );
INSERT INTO CONTACT(id, phone, email) VALUES (2, '8988999','ii@jetbrains.com' );
INSERT INTO CONTACT(id, phone, email) VALUES (3, '1111111','vip@jetbrains.com' );
INSERT INTO PERSON(id,name, surname, gender, age, address_id, empl_id, contact_id) VALUES (0, 'vasya','petrov','male',25,0,0,0 );
INSERT INTO PERSON(id, name, surname, gender, age, address_id, empl_id, contact_id) VALUES (1, 'lena','popova','female',30,1,1,1 );
INSERT INTO PERSON(id, name, surname, gender, age, address_id, empl_id, contact_id) VALUES (2, 'ira','ivanova','female',40,2,2,2 );
INSERT INTO PERSON(id, name, surname, gender, age, address_id, empl_id, contact_id) VALUES (3, 'john','smith','male',35,3,3,3 );