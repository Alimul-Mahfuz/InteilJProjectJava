package inheritance_java;

public class ChildA extends Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ChildA(int id){
        this.age = id;
        System.out.println("This is Student's child class");
    }
}
