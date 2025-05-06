ALTER TABLE empresas MODIFY cnpj VARCHAR (14);

INSERT INTO empresas (nome, cnpj)
VALUES 
    ('Bradesco', 78521651000178),
    ('Vale', 25652789000285),
    ('Cielo', 50798145003678);

SELECT * FROM cidades

INSERT INTO empresas_unidades (empresa_id, cidade_id, sede)
VALUES 
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);