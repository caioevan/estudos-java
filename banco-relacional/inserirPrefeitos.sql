SELECT * FROM cidades

INSERT INTO prefeitos (nome, cidades_id)
VALUES 
    ('Rodrigo Neves', 2),
    ('Raquel Lyra', 3),
    ('zenaldo Coutiho', null);

UPDATE prefeitos
SET nome = 'Zenaldo Coutinho'
WHERE id = 3

SELECT * FROM prefeitos

INSERT INTO prefeitos (nome, cidades_id)
VALUES 
    ('Rafael Greca', null);

SELECT * FROM prefeitos