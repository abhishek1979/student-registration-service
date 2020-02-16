DROP TABLE IF EXISTS student;
 
CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  course VARCHAR(250) NOT NULL  
);
 
INSERT INTO student (name, course) VALUES ('Abhishek', 'Java 11');
INSERT INTO student (name, course) VALUES  ('Mridula', 'Angular 9');