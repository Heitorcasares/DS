package projetocarro;

public class Triciclo {
    String nomeT;
    String marcaT;
    int anoT;
    int velT;
    
    void acelerarT(int props){
        velT = velT + props;
        System.out.println("Sua kombi foi para a velocidade: "+velT+"KM/h");
    }
    
    void freiarT(int para){
        velT = velT - para;
        System.out.println("Sua moto diminuiu a velocidade para: "+velT+"KM/h");
    }
    
    void buzinarT(){
        System.out.println("Kombi buzinando");
    }
    
    void kiko(String x){
        if(x.equals("tesouro")){
            System.out.println("Kiko estava no triciclo e disse: Mamãe Querida!");
        }
        if(x.equals("?")){
            System.out.println("Seu monstro não conhece Chaves?!");
        }
    }
    
    void pular(String y){
        if(y.equals("pule")){
            System.out.println("Pulou!");
        }
        if(y.equals("não pule")){
            System.out.println("Continuou andando!");
        }
    }
    
    void tricicloExplodiu(String z){
        System.out.println("Você morreu!");
    }
}