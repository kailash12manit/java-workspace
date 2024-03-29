package nested_classes;
/*Java static nested class example with instance method
A static class i.e. created inside a class is called static nested class in java.
 It cannot access non-static data members and methods. It can be accessed by outer class name.
 It can access static data members of outer class including private.
Static nested class cannot access non-static (instance) data member or method.
*/

class TestOuter1{  
  static int data=30;  
  static class Inner{  
   void msg(){System.out.println("data is "+data);}  
  }  
  public static void main(String args[]){  
  TestOuter1.Inner obj=new TestOuter1.Inner();  
  obj.msg();  
  }  
}  