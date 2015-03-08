DELIMITER $$

DROP PROCEDURE IF EXISTS `lucy`.`str_addProduct`$$
CREATE DEFINER=`root`@`%` PROCEDURE  `lucy`.`str_addProduct`(IN Pname VarChar(25),
                                          IN PPrice Double,
                                          IN SPrice Double,
                                          IN UType VarChar(25),
                                          IN PDesc Varchar(50),
                                          IN NoITem Int)
BEGIN


       if Exists(Select 'True' from products Where P_Name = Pname)then
      Select 'Product Name Already Exist';
    else
       Select ('Successfully Saved');
       INSERT INTO products(P_Name,P_PurchasePrice,P_SellingPRice,P_UnitType,P_Description,P_NoItem)
       Values (Pname,PPrice,SPrice,UType,PDesc,NoITem);
    end if;


END $$

DELIMITER ;