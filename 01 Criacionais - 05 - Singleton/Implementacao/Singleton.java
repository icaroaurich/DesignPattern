package Implementacao;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Singleton {
    public String senha;
    public Singleton singleton;

    public void verificar(){
        try {
            //File myObj = new File("D:\\icaro_local\\faculdade\\05 - SEMESTRE\\PP\\RevisaoProvaFinal\\01 Criacionais - 05 - Singleton\\Implementacao\\senha.txt");
            File myObj = new File("senha.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                senha = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Singleton getSingleton(){
        
        if (singleton == null){
            singleton = new Singleton();
            singleton.verificar();
            return singleton;
        }
        else{return singleton;}
    }

    public void getSenha(){
        System.out.println(senha);
    }
    
}
