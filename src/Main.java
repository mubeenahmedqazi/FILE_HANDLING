import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
        FileWriter myobj =new FileWriter("data.txt");
        BufferedWriter br=new BufferedWriter(myobj);
        br.write("My name is Mubeen\n");

        br.write("Comsats\n");

        br.write("Lahore\n");

        br.close();
        myobj.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        try{
            FileReader fr=new FileReader("data.txt");
            BufferedReader br=new BufferedReader(fr);
            String data= br.readLine();
            while (data != null){
                System.out.println(data);
            }


        }catch(IOException e){
            System.out.println(e);
        }
    }
}