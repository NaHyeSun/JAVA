SELECT * FROM menudb.tbl_menu;
select menu_name from tbl_menu;
select 
	menu_code,
    menu_name,
    menu_price
from
		tbl_menu;
select*from menudb.tbl_menu;
select
*
from
		tbl_menu;
 select 6 + 3;
 select 6 * 3;
 select 6 % 3;
 
 select Now();
 select CONCAT('홍.', '', '길동');
 
 select concat('홍.', '', '길동') AS name;
 select concat('홍.', '', '길동') AS 'Full name';
 
 select 
	menu_code,
    menu_name,
    menu_price
From
	tbl_menu
ORDER BY
-- menu_price ASC;           -- ASC는 오름차순
   menu_price;
SELECT
	menu_code,
    menu_name,
    menu_price
FROM
	tbl_menu
ORDER BY
	menu_price DESC;        -- DESC는 내림차순

SELECT
	menu_code,
    menu_name,
    menu_price
FROM
	tbl_menu
ORDER BY
	menu_price DESC,
    menu_name ASC;
    
SELECT
	menu_code,
    menu_price,
    menu_code  * menu_price
FROM
	tbl_menu
order by
	menu_code * menu_price DESC;
    
SELECT FIELD('A','A','B','C');
SELECT FIELD('B','A','B','C');

SELECT
	field(orderable_status, 'N', 'Y')
from
	tbl_menu;
    
SELECT 
	menu_name,
    orderable_status,
    field(orderable_status, 'N', 'Y')
FROM
	tbl_menu
ORDER BY field(orderable_status, 'N', 'Y');

SELECT
	category_code,
    category_name,
    ref_category_code
from
	tbl_category
order by
	-- ref_category_code; -- 오름차순 시 NULL 값이 가장 위에 나타난다. (DEFAULT)
	ref_category_code IS NULL ASC;  -- IS NULL : NULL 값이 가장 아래로 간다. 
    
SELECT
	category_code,
    category_name,
    ref_category_code
FROM
	tbl_category
ORDER BY
 -- ref_category_code DESC;      -- NULL 값이 아래에 있음(DEFUALT)
    ref_category_code IS NULL DESC,   -- NULL 값이 가장 위로 온다. 
    ref_category_code DESC;
    
SELECT
	menu_name,
    menu_price,
    orderable_status
FROM
	tbl_menu
WHERE
	orderable_status = 'Y';
    
SELECT
	menu_name,
    menu_price,
    orderable_status
FROM
	tbl_menu
WHERE
	menu_price = 13000;
    
SELECT
	menu_code,
    menu_name,
    orderable_status
FROM
	tbl_menu
WHERE
	-- orderable_status <> 'Y';
    orderable_status != 'Y';
    
SELECT
	menu_code,
    menu_name,
    menu_price
FROM
	tbl_menu
WHERE
	menu_price <= 20000;
    
SELECT 1 AND 1;
SELECT 1 AND 0, 0 AND 1, 0 AND 0, 0 AND NULL;
SELECT 1 AND NULL, NULL AND NULL;

SELECT 
	menu_name,
    menu_price,
    category_code,
    orderable_status
FROM
	tbl_menu	
WHERE
	orderable_status = 'Y' AND
    category_code = 10;
    
SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM
	tbl_menu
WHERE
	menu_price > 5000 AND
    category_code = 10;
    
SELECT 1 OR 1, 1 OR 0, 0 OR 1;
SELECT 0 OR 0;
SELECT 1 OR NULL, 0 OR NULL, NULL OR NULL;

SELECT
	menu_name,
    menu_price,
    category_code,
    orderable_status
FROM
	tbl_menu
WHERE
	orderable_status = 'Y' or
    category_code = 10
ORDER BY
	category_code;
    
SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM
	tbl_menu
WHERE
	menu_price > 5000 or
    category_code = 10;
    
SELECT 1 OR 0 AND 0;
SELECT ( 1 OR 0 ) AND 0;

SELECT 	
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM
	tbl_menu
WHERE
	category_code = 4 or
    menu_price = 9000 AND
    menu_code > 10;
   --  category_code = 4 OR (menu_price = 9000 AND menu_code >10);
   
SELECT
	menu_name,
    menu_price,
    category_code
FROM
	tbl_menu
WHERE
	menu_price >= 10000 AND
    menu_price <= 25000
ORDER BY
	menu_price;
    
SELECT
	menu_name,
    menu_price,
    category_code
FROM
	tbl_menu
WHERE
	menu_price BETWEEN 10000 AND 25000
ORDER BY
	menu_price;
    
SELECT
	menu_name,
    menu_price,
    category_code
FROM
	tbl_menu
WHERE
	menu_price NOT BETWEEN 10000 AND 25000
ORDER BY
	menu_price;
    
SELECT
	menu_name,
    menu_price
FROM
	tbl_menu
WHERE
	menu_name LIKE '%마늘%'         -- '%' : 0개 이상의 임의의 문자  /  '_' : 하나의 임의의 문자 
ORDER BY
	menu_name;
    
SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM
	tbl_menu
WHERE
	menu_price >5000 AND 
    category_code = 10 AND
    menu_name LIKE '%갈치%';
    
SELECT
	menu_name,
    menu_price
FROM
	tbl_menu
WHERE
	menu_name NOT LIKE '%마늘%'
ORDER BY
	menu_name;
    
SELECT
	menu_name,
    category_code
FROM
	tbl_menu
WHERE
	category_code = 4 OR
    category_code = 5 OR
    category_code = 6
ORDER BY
	category_code;
    
SELECT
	menu_name,
    category_code
FROM
	tbl_menu
WHERE
	category_code IN(4, 5, 6)
ORDER BY
	category_code;
    
SELECT
	menu_name,
    category_code
FROM
	tbl_menu
WHERE
	category_code NOT IN (4,5,6) -- 부정표현
ORDER BY
	category_code;
    
SELECT
	category_code,
    category_name,
    ref_category_code
FROM
	tbl_category
WHERE
	-- ref_category_code IS NULL;
    ref_category_code IS NOT NULL;
    

    
    
    
    
	
    
    