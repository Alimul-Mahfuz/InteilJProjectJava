import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> arrlist = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("How many items to store:");
        int iteam = scn.nextInt();
        scn.nextLine();
        /*int i=0;
        while(i<iteam){
            System.out.println("Enter user Name:");
            String name = scn.nextLine();
            arrlist.add(name);
            i++;
        }
        System.out.println(arrlist.get(3));*/
        ArrayList<Student> sdt = new ArrayList<>();
        sdt.add(new Student("Tushar","19-39831-1"));
        Student ips = sdt.get(0);
        System.out.println(ips.getName());





    }


}
