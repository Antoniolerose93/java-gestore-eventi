package evento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestConcerto {

public static void main(String[] args) {
    
    Concerto c = new Concerto("Festival abc", LocalDate.of(2025,10,5), 10000, LocalTime.of(22,00), new BigDecimal("50.10"));

    System.out.println("Titolo:" + " " + c.getTitolo());
    System.out.println("Data:" + " " + c.getData());
    System.out.println("Posti totali:" + " " + c.getPostiTotali());
    System.out.println("Posti prenotati:" + " " + c.getPostiPrenotati());
    System.out.println("Ora:" + " " + c.getOra());
    System.out.println("Prezzo:" + " " + c.getPrezzo() + " " + "euro");


    c.setTitolo("Festival abc");
    c.setData(LocalDate.of(2025,10,12));
    c.setPrezzo(new BigDecimal("50.10"));
    c.setOra(LocalTime.of(22,00));

    c.prenota();
    c.prenota();
    System.out.println("Posti prenotati dopo 2 prenotazioni:" + " " +  c.getPostiPrenotati());
    c.disdici();
    System.out.println("Posti prenotati dopo una disdetta:" + " " +  c.getPostiPrenotati());

    System.out.println("Concerto completo");
    System.out.println(c);
}

}
