import java.io.*;
public class Main {
    public static void main(String[] args) {
        try{
            FileWriter frt = new FileWriter("poem.txt");
            frt.write("Roese are red \n");
            frt.write("Violate are blue \n");
            //append content at the end of the existing file
            frt.append("\n(poem by me)");
            frt.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
