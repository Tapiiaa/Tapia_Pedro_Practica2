public class Sentimiento {


    // Sentimientos:
    //Alegria (1)
    //Tristeza(2)

    //Umbrales
    //Positivo: >0.3
    //Negativo : <
    //Neutral : =5;
    public String analizarSentimiento(String texto){
        double sentimiento =0.0;
        if(texto.contains("Feliz")){
            sentimiento=0.8;
        }
        else if(texto.contains("Triste")){
            sentimiento=0.2;
        }
        else{
            sentimiento=0.5;
        }
        double umbralPositivo =0.6;
        double umbralNegativo =0.4;
        if (sentimiento > umbralPositivo) {
            return "positivo";
        }
        else if(sentimiento < umbralNegativo){
            return "negativo";
        }
        else{
            return "neutral";
        }

    }


}
