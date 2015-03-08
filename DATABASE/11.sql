DELIMITER $$

DROP PROCEDURE IF EXISTS `lucy`.`str_showPitem`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE  `lucy`.`str_showPitem`(in proid integer,in dateNOW date)
BEGIN
  declare leftITEM integer;
  declare dateChck date;
  declare SDCode integer;
  declare NOitem integer;

  set NOitem = (Select P_NoItem from products where P_Code = proid);
  if exists(Select SD_itemLEFT from salesdetails sd join products p on sd.P_Code=p.P_Code where p.P_Code = proid ) then
    set SDCode =(Select max(sd.SD_Code) from salesdetails sd join products p on sd.P_Code=p.P_Code where p.P_Code = proid);
    set leftITEM = (Select SD_itemLEFT from salesdetails sd where SD_Code = SDCode);

    set dateChck = (Select s.S_Date from salesdetails sd join sales s on sd.S_Code= s.S_Code where sd.SD_Code = SDCode);
    if(dateChck != dateNOW)then
       set NOitem = NOitem + leftITEM;
    else
        set NOitem = leftITEM;
    end if;

  end if;
  select NOitem;
END $$

DELIMITER ;