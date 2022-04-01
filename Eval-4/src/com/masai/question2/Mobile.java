package com.masai.question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Mobile {
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model) {
        String message = "Mobile Not added";

        if (mobiles.containsKey(company)) {
            mobiles.get(company).add(model);
            message = "Mobile added successfully";
        } else {
            ArrayList<String> type = new ArrayList<String>();
            type.add(model);
            mobiles.put(company, type);
            message = "Mobile added successfully";
        }
        return message;
    }

    public ArrayList<String> getModels(String company){
        ArrayList<String> listModels = new ArrayList<>();

        if (mobiles.containsKey(company)) {
            mobiles.get(company).forEach(x -> listModels.add(x));
        } else {
            return null;
        }

        return listModels;
    }

    public static void main(String[] args) {

        Mobile mob = new Mobile();
        System.out.println(mob.addMobile("apple", "Iphone13"));
        System.out.println(mob.addMobile("samsung", "ACE"));
        System.out.println(mob.addMobile("apple", "Iphone12"));
        System.out.println(mob.addMobile("apple", "Iphone11"));
//        System.out.println(mob.mobiles);

        ArrayList<String> listModels = mob.getModels("apple");
        System.out.println("******the models for your company********");
        if (listModels == null)
            System.out.println("No such company exist");
        else
            listModels.forEach(x -> System.out.print(x + " "));
    }
}
