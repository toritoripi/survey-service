create table surveys (
id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(256) NOT NULL,
age BIGINT NOT NULL,
sex INT NOT NULL,
score INT NOT NULL,
message VARCHAR(256) NOT NULL
);