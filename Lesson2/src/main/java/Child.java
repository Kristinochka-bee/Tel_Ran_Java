public class Child extends Parent{

    @Override
    public void show(){
        //super.show(); -- calling Parent show method
        System.out.println("Childs show");
        setAge(10);
        System.out.println(getAge());
    }
    public Child(int age){
        super(age);
    }
public Child(){
        super(0);
}



}
