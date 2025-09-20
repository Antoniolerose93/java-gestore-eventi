package evento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento{

private LocalTime ora;
private BigDecimal prezzo;

public Concerto (String titolo, LocalDate data, int postiTotali, LocalTime ora, BigDecimal prezzo){
    super(titolo, data, postiTotali);
    this.ora = ora;
    this.prezzo = prezzo;
}

public LocalTime getOra() {
    return ora;
}

public void setOra(LocalTime ora) {
    this.ora = ora;
}

public BigDecimal getPrezzo() {
    return prezzo;
}

public void setPrezzo(BigDecimal prezzo) {
    this.prezzo = prezzo;
}

@Override
public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    return "Concerto{" +
    "titolo="+  " " + getTitolo() +
    ", data=" + " " + getData().format(formatter) +
    ", postiTotali =" + " " + getPostiTotali()+
    ", postiPrenotati =" + " " + getPostiPrenotati()+
    ", ora=" + " " + ora +
    ", prezzo=" + " " + prezzo + " "+"euro" +
    "}";

}






}
