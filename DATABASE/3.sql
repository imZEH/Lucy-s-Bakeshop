DELIMITER $$

DROP PROCEDURE IF EXISTS `lucy`.`str_addSales`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE  `lucy`.`str_addSales`(in aid integer, in sdate varchar(50),in profit double, in cash_R double,in t_s varchar(50),in t_e varchar(50),in noItem double)
BEGIN
  INSERT INTO sales(A_Id,S_Date,Profit,Cash_Received,Transaction_Start,Transaction_End,Number_Of_Items) VALUES(aid,sdate,profit,cash_R,t_s,t_e,noItem);
END $$

DELIMITER ;