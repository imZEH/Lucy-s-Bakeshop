DELIMITER $$

DROP PROCEDURE IF EXISTS `lucy`.`str_addUser`$$
CREATE DEFINER=`root`@`%` PROCEDURE  `lucy`.`str_addUser`(IN FName VarChar(45),
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

    if Exists(Select 'True' from accounts Where A_UserName = username)then
      Select 'Username Already Exist';
    else
      Select ('Successfully Saved');
      Insert into accounts(A_FirstName,A_LastName,A_MiddleName,A_Gender,A_Address,A_ContactNumber,A_UserName,A_Password,A_Type,A_Status,A_Pic,A_path)
      Values (FName,LName,MName,Gender,Address,Number,username,Pass,Atype,'Active',Pic,Path);
    end if;

END $$

DELIMITER ;