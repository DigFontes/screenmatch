package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classifier;

public class Film extends Title implements Classifier {
    private String diretor;

    public Film(String name, int anoDeLacamento) {
        super(name, anoDeLacamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassifier(){
        return (int) pegaMedia()/2;
    }

    @Override
    public String toString() {
        return "Film: " + this.getNome() + " (" + this.getAnoDeLacamento() + ")";
    }
}
