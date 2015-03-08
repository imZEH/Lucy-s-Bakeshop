DELIMITER $$

DROP PROCEDURE IF EXISTS `lucy`.`str_showProduct`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE  `lucy`.`str_showProduct`()
BEGIN
   SELECT * from  products p;
END $$

DELIMITER ;