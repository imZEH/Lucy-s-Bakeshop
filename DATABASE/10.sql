DELIMITER $$

DROP PROCEDURE IF EXISTS `lucy`.`str_selectProduct`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE  `lucy`.`str_selectProduct`()
BEGIN
  SELECT p.P_Code,p.P_Name,p.P_PurchasePrice,p.P_SellingPrice,p.P_UnitType from products p;
END $$

DELIMITER ;