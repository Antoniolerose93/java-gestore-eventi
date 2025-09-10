package evento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws Exception {
       
    Scanner scan = new Scanner(System.in);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
    System.out.println ("Inserisci il titolo dell'evento");
    String titolo = scan.nextLine();
    
    System.out.println ("Inserisci la data dell'evento");
    String dataStr = scan.nextLine();
    LocalDate data = LocalDate.parse(dataStr, formatter);

    System.out.println ("Inserisci il numero di posti totali");
    int postiTotali = Integer.parseInt(scan.nextLine());
    
    Evento e1 = new Evento (titolo, data, postiTotali);

    System.out.println("Posti disponibili" + " " + e1.getPostiDisponibili());

    System.out.println("Quanti posti vuoi prenotare?");
    int nPostiprenotati = Integer.parseInt(scan.nextLine());

 if (e1.getPostiDisponibili() < nPostiprenotati) {
    throw new IllegalArgumentException ("Non ci sono abbastanza posti disponibili");
}   else {

} for (int i = 0; i < nPostiprenotati; i++){
    e1.prenota();
}

    
 System.out.println("Prenotazione completata!");
 System.out.println("Posti prenotati:" + " " + e1.getPostiPrenotati());
 System.out.println("Posti disponibili:" + " " + e1.getPostiDisponibili());


}   

}



