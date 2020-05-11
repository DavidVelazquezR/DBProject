--García Martínez Uriel
--López Palma Carlos Jonathan
--Vázquez Rivera Edwin Misael
--Velázquez Ramírez David



CREATE DATABASE tienda;

USE tienda;

CREATE TABLE producto ( id int(11) NOT NULL UNIQUE AUTO_INCREMENT
,descripcion varchar(35) NOT NULL
,cantidad int(11) NOT NULL UNIQUE DEFAULT '0'
,preciocomp DECIMAL(5,2) NOT NULL
,precioventaun DECIMAL(5,2) NOT NULL
,precioventama DECIMAL(5,2) NOT NULL
,cantmayoreo int(11) NOT NULL
,PRIMARY KEY (id)
,CHECK (preciocomp>0.0 AND precioventaun>0.0 AND precioventama>0.0 AND cantmayoreo>1));


CREATE TABLE venta ( idventa int(11) NOT NULL UNIQUE AUTO_INCREMENT
,fecha date
,total float NOT NULL
,PRIMARY KEY (idventa)
,CHECK (total>0.0)
,UNIQUE(idventa,fecha));


CREATE TABLE productoventa (idventa int(11) NOT NULL
,idproducto int(11) NOT NULL
,cantidad int(11) NOT NULL
,subtotal DECIMAL(6,2) NOT NULL
,FOREIGN KEY (idventa) REFERENCES venta(idventa)
,FOREIGN KEY (idproducto) REFERENCES producto(id)
,UNIQUE (idventa,idproducto)
,CHECK (cantidad>0 AND subtotal>0.0));


INSERT INTO producto VALUES(0,"LA MODERNA CARACOL 2 200gr", 30, 10.6, 12.0, 11.0, 10);
INSERT INTO producto VALUES(0,"JUMEX 600ml", 20, 7.5, 8.5, 8.5, 50);
INSERT INTO producto VALUES(0,"LICONSA 1L", 50, 21.5, 23, 22, 30);
INSERT INTO producto VALUES(0,"PAN BLANCO", 40, 1, 2, 1.5, 15);
INSERT INTO producto VALUES(0,"ARROZ 1kg", 18, 19.55, 22.5, 21.5, 10);


INSERT INTO venta VALUES(0,"2020-05-01",52);
INSERT INTO venta VALUES(0,"2020-05-02",54.5);
INSERT INTO venta VALUES(0,"2020-05-03",10);
INSERT INTO venta VALUES(0,CURDATE(),28.5);
INSERT INTO venta VALUES(0,CURDATE(),37);

INSERT INTO productoventa VALUES(2,5,1,22.5);
INSERT INTO productoventa VALUES(2,4,3,6);
INSERT INTO productoventa VALUES(2,2,1,8.5);
INSERT INTO productoventa VALUES(3,3,2,46);
INSERT INTO productoventa VALUES(3,2,1,8.5);

---/productos vendidos en x venta
SELECT producto.id AS "PRODUCTO"
,producto.descripcion
,productoventa.cantidad 
FROM venta, producto, productoventa 
WHERE venta.idventa=X
AND venta.idventa=productoventa.idventa 
AND producto.id=productoventa.idproducto;

---corte mensual los dias 28
SELECT (SUM(total)) 
FROM venta 
WHERE MONTH(fecha)=MONTH(CURDATE()) AND DAYOFMONTH(CURDATE())="28";

---productos que se ecuentran por debajo de x cantidad
SELECT id AS "PRODUCTO" 
,descripcion 
,cantidad 
FROM producto 
WHERE cantidad<X
ORDER BY cantidad DESC;

---enlistar las ventas hechas en un dia y obtener el corte del dia X
SELECT idventa AS "Venta" 
,total 
FROM venta 
WHERE fecha=CURDATE();

SELECT idventa AS "Venta" 
,total 
FROM venta 
WHERE fecha=CURDATE();

---cantidad de x producto vendidos en un dia
SELECT producto.id AS "Producto" 
,producto.descripcion AS "Descripcion" 
,productoventa.cantidad "Cantidad vendida" 
FROM producto, venta, productoventa 
WHERE venta.fecha=CURDATE() 
AND productoventa.idventa=venta.idventa 
AND producto.id=productoventa.idproducto 
ORDER BY productoventa.cantidad DESC;


SELECT *
FROM producto;

SELECT *
FROM venta;

SELECT *
FROM productoventa;



