DELIMITER $$

DROP PROCEDURE IF EXISTS `lucy`.`str_addSalesDetails`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE  `lucy`.`str_addSalesDetails`(in pcode integer,in price double, in qty integer,in total double,in itemleft integer)
BEGIN
   declare scode integer;
   set scode = (Select Max(S_Code) from sales);
   INSERT INTO salesdetails(S_Code,P_Code,SD_Price,SD_Quantity,SD_Total,SD_itemLEFT) VALUES(scode,pcode,price,qty,total,itemleft);
END $$

DELIMITER ;