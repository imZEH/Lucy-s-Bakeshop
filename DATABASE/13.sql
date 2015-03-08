DELIMITER $$

DROP PROCEDURE IF EXISTS `lucy`.`str_updateUser`$$
CREATE DEFINER=`root`@`%` PROCEDURE  `lucy`.`str_updateUser`(IN ID Integer,
                                       IN FName VarChar(45),
                                       IN LName VarChar(45),
                                       IN MName Varchar(45),
                                       IN Gender VarChar(25),
                                       IN Address VarChar(45),
                                       IN Number VarChar(25),
                                       IN username VarChar(25),
                                       IN Pass VarChar(25),
                                       IN Atype VarChar(25),
                                       IN Pic LongBlob,
                                       IN Path Varchar(500))
BEGIN


      Select ('Successfully Updated');
      UPDATE accounts Set A_FirstName = FName,A_LastName = LName,A_MiddleName = MName
             ,A_Gender = Gender,A_Address = Address,A_ContactNumber = Number,A_UserName = username,
                    A_Password = Pass,A_Type = Atype,A_Status = 'Active',A_Pic = Pic,A_path = Path Where A_id = ID;



END $$

DELIMITER ;