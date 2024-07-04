package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{

    private String nome;
    private int anoDeLacamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Title(String nome, int anoDeLacamento) {
        this.nome = nome;
        this.anoDeLacamento = anoDeLacamento;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.nome = myTitleOmdb.title();
        this.anoDeLacamento = Integer.valueOf(myTitleOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLacamento() {
        return this.anoDeLacamento;
    }

    public void setAnoDeLacamento(int anoDeLacamento) {
        this.anoDeLacamento = anoDeLacamento;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return this.totalDeAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLacamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getNome().compareTo(anotherTitle.getNome());
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLacamento + "," +
                " duração=" + duracaoEmMinutos;
    }
}
