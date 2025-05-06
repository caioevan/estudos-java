SELECT e.nome AS 'Nome Empresa', c.nome AS 'Nome Cidade'
FROM empresas e, empresas_unidades eu, cidades c
WHERE e.id = eu.empresa_id
AND c.id = eu.cidade_id
AND sede