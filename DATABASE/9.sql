DELIMITER $$

DROP PROCEDURE IF EXISTS `lucy`.`str_selectAccount`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE  `lucy`.`str_selectAccount`(in uname varchar(50),in pass varchar(50))
BEGIN
    SELECT A_Id,A_FirstName,A_MiddleName,A_LastName,A_Type,A_Pic FROM accounts a WHERE a.A_UserName = uname AND a.A_Password = pass;
END $$

DELIMITER ;