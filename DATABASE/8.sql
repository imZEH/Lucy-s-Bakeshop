DELIMITER $$

DROP PROCEDURE IF EXISTS `lucy`.`str_reportY`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE  `lucy`.`str_reportY`()
BEGIN
   select p.P_Code,p.P_Name,SUM(sd.SD_Quantity),SUM(sd.SD_Quantity)*sd.SD_Price,SUM(Profit),YEAR(s.S_Date)as years from salesdetails sd join products p on sd.P_Code = p.P_Code join sales s on s.S_Code = sd.S_Code Group by p.P_Code Order by years;
END $$

DELIMITER ;