package HUONGDOITUONG;

import HUONGDOITUONG.mypack.Person;

public class HelloWorld {
    public static void main(String[] args) {

        Person a = new Person("Chau" , 20 , 21f);

        a.eat("Rice");
        int age = a.getAge();
        String name = a.getName();

        System.out.println( name + " His age: " + age);
    }
}