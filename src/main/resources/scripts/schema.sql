CREATE SEQUENCE IF NOT EXISTS lessons_seq START 1 INCREMENT 1;
CREATE TABLE IF NOT EXISTS lessons (
     id SERIAL PRIMARY KEY,
     name varchar(50) NOT NULL
     );

