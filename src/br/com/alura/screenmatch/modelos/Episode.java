package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classifier;

public class Episode implements Classifier {

    private int numero;
    private String nome;
    private Serie serie;
    private int totalViews;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassifier() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
