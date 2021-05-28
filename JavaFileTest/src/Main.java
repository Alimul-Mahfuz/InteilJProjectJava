import java.io.File;
public class Main {
    public static void main(String[] args) {
        //file = an abstract representation of file and directory pathnames
        File file = new File("hola.txt");
        //Test if the file exist
        if(file.exists()){
            System.out.println("that file exist");
            //getting path
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            //ile.delete(); to delete the file 
        }
        else {
            System.out.println("file not exist");
        }
    }
}
