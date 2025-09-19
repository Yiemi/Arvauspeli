import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int counter = 0;
        String nimi;
        String arvoitus = "roope";

        do
        {
            
            System.out.println("Arvaa nimeni: (Kirjoita 'loppu')");
            nimi = in.nextLine().toLowerCase();
            if (!nimi.equals("loppu"))
            {
                counter++;
            }
            

        } while (!nimi.equals(arvoitus) && !nimi.equals("loppu")); 
                if(nimi.equals(arvoitus))
                {
                    System.out.println("Onneksi olkoon arvasit nimen!");
                }
                System.out.println("Arvasit "+ counter +" kertaa.");
            

    }
    
}