SELECT * FROM prefeitos;
SELECT * FROM cidades;
-- Inner Join
SELECT * FROM cidades c INNER JOIN prefeitos p ON c.id= p.cidades_id;
-- Left Join
SELECT * FROM cidades c LEFT JOIN prefeitos p ON c.id = p.cidades_id;
-- Right Join
SELECT * FROM cidades c RIGHT JOIN prefeitos p ON c.id = p.cidades_id;
-- Full Join no MySQL
SELECT * FROM cidades c LEFT OUTER JOIN prefeitos p ON c.id = p.cidades_id
UNION
SELECT * FROM cidades c RIGHT JOIN prefeitos p ON c.id = p.cidades_id;