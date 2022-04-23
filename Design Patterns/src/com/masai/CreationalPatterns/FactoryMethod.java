package com.masai.CreationalPatterns;

public class FactoryMethod {
   /* A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class
    for creating an object but let the subclasses decide which class to instantiate.
    In other words, subclasses are responsible to create the instance of the class.   */

    /*Advantage of Factory Design Pattern

    * Factory Method Pattern allows the sub-classes to choose the type of objects to create.
    * It promotes the loose-coupling by eliminating the need to bind application-specific classes
    into the code. That means the code interacts solely with the resultant interface or abstract class,
    so that it will work with any classes that implement that interface or that extends that abstract class.

    Usage of Factory Design Pattern

    * When a class doesn't know what sub-classes will be required to create
    * When a class wants that its sub-classes specify the objects to be created.
    * When the parent classes choose the creation of objects to its sub-classes.*/

}
abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculate(int units) {
        System.out.println(rate * units);
    }
}
class DomesticPlan extends Plan{
    @Override
    void getRate() {
        rate = 3.50;
    }
}
class CommercialPlan extends Plan{
    @Override
    void getRate() {
        rate = 7.50;
    }
}
class GetPlanFactory{
    public static Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        return null;
    }
}
class GenerateBill {
    public static void main(String[] args) {
        Plan plan = GetPlanFactory.getPlan("domesticplan");

        plan.getRate();
        plan.calculate(5);
    }
}