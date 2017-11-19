package syd;

public class Animal implements Talking {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void say(){
        System.out.println(name + "Animal Say");
    }
}
