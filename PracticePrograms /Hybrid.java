package oop;

class Parent {
 void addition() {
	 int x = 10;
     System.out.println("Sum is :" + (x+10));
 }
}


class Child extends Parent {

 @Override
  void addition()  {
	 int x=20;
     System.out.println("Sum is :" + (x+40));
 }
}

class Child2 extends Child {
	
 void age() {
     System.out.println("Child Age: 20");
 }
}


public class Hybrid {
 public static void main(String[] args) {

     Child2 obj = new Child2();


     obj.addition();


     obj.age();
 }
}
