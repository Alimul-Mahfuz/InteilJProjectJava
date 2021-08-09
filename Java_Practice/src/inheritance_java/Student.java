package inheritance_java;

public class Student {
    private int id;
    private String name;
    private  double cgpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Student(){
        System.out.println("This is student class constractor");
    }

    public Student(int id, String name, double cg){
        this.id= id;
        this.name = name;
        this.cgpa = cg;
        System.out.println("This is student class constractor");
        System.out.println("Id is "+this.id);
        System.out.println("Name is "+getName());
        System.out.println("Cgpa is "+getCgpa());
    }
}
