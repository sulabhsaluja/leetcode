SELECT 
    id,
    IF(p_id IS NULL, 'Root',
        IF(id NOT IN (SELECT p_id FROM Tree WHERE p_id IS NOT NULL), 'Leaf', 'Inner')
    ) AS type
FROM Tree;