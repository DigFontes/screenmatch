package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelos.Title;

public class TimeCalculator {

    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void isIn(Title title) {
        System.out.println("Adicionando duração em minutos de " + title.getNome());
        this.totalTime += title.getDuracaoEmMinutos();
    }

}

