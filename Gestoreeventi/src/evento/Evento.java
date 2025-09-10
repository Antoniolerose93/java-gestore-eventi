package evento;

import java.time.LocalDate;

public class Evento {

private String titolo;

private LocalDate data;

private int postiTotali;

private int postiPrenotati;


public Evento(String titolo, LocalDate data, int postiTotali) {
    if (data.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La data non può essere già passata");
        }
    if (postiTotali <= 0) {
            throw new IllegalArgumentException("Il numero di posti non può essere inferiore o uguale a 0");
        }

    this.titolo = titolo;
    this.data = data;
    this.postiTotali = postiTotali;
    this.postiPrenotati = 0;
}
    
    // GETTER
    public String getTitolo() {
        return titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public int getPostiTotali() {
        return postiTotali;
    }

    public int getPostiPrenotati() {
        return postiPrenotati;
    }

    public int getPostiDisponibili(){
        return postiTotali - postiPrenotati;
    }

    // SETTER
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setData(LocalDate nuovaData) {
        if(nuovaData.isBefore(LocalDate.now())) {
            throw new IllegalStateException("La nuova data non può essere nel passato");
        }
        this.data = nuovaData;
    }

    //Metodo per prenotare

    public void prenota () {
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalStateException("Non è possibile prenotare per un evento già passato");
        } else if (postiPrenotati >= postiTotali) {
            throw new IllegalStateException ("I posti sono esauriti");
        } else {
            postiPrenotati++;
        }
    }

    //Metodo per disdire

    public void disdici () {
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalStateException("Non è possibile disdire per un evento già passato");
        } else if (postiPrenotati <= 0) {
            throw new IllegalStateException ("Non ci sono posti prenotati");
        } else {
            postiPrenotati--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Evento{");
        sb.append("titolo=").append(titolo);
        sb.append(", data=").append(data);
        sb.append(", postiTotali=").append(postiTotali);
        sb.append(", postiPrenotati=").append(postiPrenotati);
        sb.append('}');
        return sb.toString();
    }

    

    


}
