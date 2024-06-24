package br.com.alura.screenmatch.calculo;

public class RecomendationFilter {

    private String recomendation;

    public void filter(Classifier classifier) {
        if (classifier.getClassifier() >= 4) {
            System.out.println("Está entre os perferidos do momento!");
        } else if (classifier.getClassifier() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
        System.out.println("Coloque na sua lista para assistir depois!");
        }
    }

}
