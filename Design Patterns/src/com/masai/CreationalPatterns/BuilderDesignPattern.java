package com.masai.CreationalPatterns;

import java.util.ArrayList;
import java.util.List;

public class BuilderDesignPattern {
    /* Builder Pattern says that
        "construct a complex object from simple objects using step-by-step approach"

    It is mostly used when object can't be created in single step like
    in the de-serialization of a complex object. */
}
interface Packing{
    public String pack();
    public int price();
}

abstract class Cd implements Packing {
    public abstract String pack();
}
abstract class Company extends Cd{
    public abstract int price();
}
class Sony extends Company{
    @Override
    public int price(){
        return 20;
    }

    @Override
    public String pack(){
        return "Sony CD";
    }
}
class Samsung extends Company {
    @Override
    public int price(){
        return 15;
    }
    @Override
    public String pack(){
        return "Samsung CD";
    }
}
class CDType {
    private List<Packing> items=new ArrayList<Packing>();
    public void addItem(Packing packs) {
        items.add(packs);
    }
    public void getCost(){
        for (Packing packs : items) {
            packs.price();
        }
    }
    public void showItems(){
        for (Packing packing : items){
            System.out.print("CD name : "+packing.pack());
            System.out.println(", Price : "+packing.price());
        }
    }
}
class CDBuilder {
    public CDType buildSonyCD(){
        CDType cds=new CDType();
        cds.addItem(new Sony());
        return cds;
    }
    public CDType buildSamsungCD(){
        CDType cds=new CDType();
        cds.addItem(new Samsung());
        return cds;
    }
}
class BuilderDemo{
    public static void main(String args[]){
        CDBuilder cdBuilder=new CDBuilder();
        CDType cdType1 = cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2 = cdBuilder.buildSamsungCD();
        cdType2.showItems();
    }
}