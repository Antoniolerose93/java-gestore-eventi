package evento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestConcerto {

public static void main(String[] args) {
    
    Concerto concerto = new Concerto("Festivalbar", LocalDate.of(2026, 7,4), 15000, LocalTime.of(21,0), new BigDecimal("50.00"));

     System.out.println(concerto);

}
   

}
