package com.MarcRG.SoapWebService.validators;

import com.MarcRG.SoapWebService.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public static List<String> validate(Client client){
        List<String> errors= new ArrayList<>();
        if(client==null){
            errors.add("vous passer un obejet vide en parametre");
            errors.add("vous devez obligatoirement donné une valeur pour que l'enregistrement marche sinon sans ça vous ne pouvez pas faire l'opération");
            errors.add("le nom aussi est obligatoire hein on peut pas creer un objet sans lui donné de nom non plus c'est bizzare chef!");
        }
        if(client.getId()==null){
            errors.add("vous devez obligatoirement donné une valeur pour que l'enregistrement marche sinon sans ça vous ne pouvez pas faire l'opération");
        }
        if(client.getNom()==null){
            errors.add("le nom aussi est obligatoire hein on peut pas creer un objet sans lui donné de nom non plus c'est bizzare chef!");
        }

        return errors;
    }
}
