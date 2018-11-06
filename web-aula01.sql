-- Database: "web-aula01"

-- DROP DATABASE "web-aula01";

CREATE DATABASE "web-aula01"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;

SELECT * FROM CLIENTES;

-- DELETE FROM CLIENTES WHERE id = 9;
