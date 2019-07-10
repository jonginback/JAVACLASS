package org.dimgo.Inherentance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal(" 종인");
        System.out.println(a);
        a.bark();
        a.eat();
        a.sleep();

        Dog d = new Dog("종인강아지 ");
        System.out.println(d);
        d.bark();
        d.wag();

        Cat c = new Cat("종인야옹이");
        c.bark();

        Tiger b = new Tiger("종인호랑");
        b.bark();
        b.hunt();

        Animal dog = new Dog("멍멍이");
        dog.eat();
        dog.sleep();
        //dog.wag();
        Dog dog2 = (Dog)dog;
        dog2.wag();

        Animal cat = new Cat("야옹이");
        ((Cat) cat).scratch();


        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Cat);
        System.out.println(cat instanceof Dog);


    }
    private static void doAction(Animal a){
        if(a instanceof Cat) {
            Cat c = (Cat) a;
            c.scratch();
        }
        else if(a instanceof Dog){
            ((Dog)a).wag();

        }
    }


}
