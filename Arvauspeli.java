import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        
        String nimi;

        do
        {
            
            System.out.println("Arvaa nimeni");
            nimi = in.nextLine();
            

        } while (!nimi.equals("Juuso")); 
            System.out.println("Onneksi olkoon arvasit nimen!");
                
                
            

    }
    
}