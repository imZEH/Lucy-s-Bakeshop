DELIMITER $$

DROP PROCEDURE IF EXISTS `lucy`.`str_reportM`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE  `lucy`.`str_reportM`()
BEGIN
  select p.P_Code,p.P_Name,SUM(sd.SD_Quantity),SUM(sd.SD_Quantity)*sd.SD_Price,SUM(Profit),MONTHNAME(s.S_Date) as months from salesdetails sd join products p on sd.P_Code = p.P_Code join sales s on s.S_Code = sd.S_Code Group by p.P_Code Order by months;
END $$

DELIMITER ;