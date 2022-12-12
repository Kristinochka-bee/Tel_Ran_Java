 public class Parent {
     private int age;
    void show(){
        System.out.println("Parents show ");
    }
     final public void setAge(int age){
         this.age=age;
     }
     final public int getAge(){
         return age;
     }

     public Parent() {
     }

     public Parent(int age) {
         this.age = age;
     }
 }
