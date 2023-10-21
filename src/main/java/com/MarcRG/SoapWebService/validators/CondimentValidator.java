package com.MarcRG.SoapWebService.validators;


import com.MarcRG.SoapWebService.model.Condiment;

import java.util.ArrayList;
import java.util.List;

public class CondimentValidator {

    public static List<String> validate(Condiment condiment){
        List<String> errors= new ArrayList<>();
        if(condiment==null){
            errors.add("vous passer un obejet vide en parametre");
            errors.add("vous devez obligatoirement donné une valeur pour que l'enregistrement marche sinon sans ça vous ne pouvez pas faire l'opération");
            errors.add("le nom aussi est obligatoire hein on peut pas creer un objet sans lui donné de nom non plus c'est bizzare chef!");
            errors.add("on besoin de connaitre la quantité qui est ajouté aussi");
        }
        if(condiment.getId()==null){
            errors.add("vous devez obligatoirement donné une valeur pour que l'enregistrement marche sinon sans ça vous ne pouvez pas faire l'opération");
        }
        if(condiment.getNomCondiment()==null){
            errors.add("le nom aussi est obligatoire hein on peut pas creer un objet sans lui donné de nom non plus c'est bizzare chef!");
        }
        if(condiment.getQuantite()==null){
            errors.add("on besoin de connaitre la quantité qui est ajouté aussi");
        }
        return errors;
    }
}
