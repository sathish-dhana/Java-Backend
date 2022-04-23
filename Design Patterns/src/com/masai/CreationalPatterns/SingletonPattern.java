package com.masai.CreationalPatterns;

public class SingletonPattern {
    /*Singleton Pattern says
    "define a class that has only one instance and provides a global point of access to it". */

   /*  There are two forms of singleton design pattern

    Early Instantiation: creation of instance at load time.
    Lazy Instantiation: creation of instance when required.  */


    /*Static member: It gets memory only once because of static keyword,
    it contains the instance of the Singleton class.

    Private constructor: It will prevent to instantiate the Singleton class from outside the class.

    Static factory method: This provides the global point of access to the Singleton object
    and returns the instance to the caller.*/

   /* usage
    Saves memory because object is not created at each request. Only single instance is reused again & again.
    Singleton pattern is mostly used in multi-threaded and database applications.*/

}
class A{
    private static A obj=new A(); //Early, instance will be created at load time
    private A(){}

    public static A getA(){
        return obj;
    }

    public void doSomething(){
        //write your code
    }
}
class B {
    private static B obj;

    private B(){}

    public synchronized static B getB(){
        if (obj == null) {
            obj = new B(); //instance will be created at request time
            return obj;
        }
        return obj;
    }
}