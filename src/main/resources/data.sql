DROP TABLE IF EXISTS student;
 
CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  course VARCHAR(250) NOT NULL  
);
 
INSERT INTO student (name, course) VALUES ('Abhishek', 'Java 13');
INSERT INTO student (name, course) VALUES  ('Ashutosh', 'Hibernate & JPA');
INSERT INTO student (name, course) VALUES ('Shaswat', 'Spring Boot');