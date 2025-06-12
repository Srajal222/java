import java.io.File;
import java.io.IOException;
// import java.util.*;
class global{
    public static void main(String[] args){
        try{
            File filr = new File("new.txt");
            if(filr.createNewFile()){
                System.out.println("File created" + filr.getName());
                
            }else{
                System.out.println("file already exists");
            }
        }catch(IOException e){
            System.out.println(" an error occured ");
            e.printStackTrace();
        }
    }
}