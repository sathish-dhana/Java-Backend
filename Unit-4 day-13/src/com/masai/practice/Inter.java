package com.masai.practice;

@FunctionalInterface
public interface Inter {

    void sayHello(Student student);

}

class CatCheck{

    public static void main(String[] args) {
        Inter inte = (student) -> System.out.println("hai iam " + student.getName());
        inte.sayHello(new Student(1, "dhana2", 12));
    }
}

