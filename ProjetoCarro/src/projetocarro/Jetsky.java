package projetocarro;

public class Jetsky {
    
    String nomeJ;
    String marcaJ;
    int anoJ;
    int velJ;
    
    void acelerarJ(int props){
        velJ = velJ + props;
        System.out.println("Sua kombi foi para a velocidade: "+velJ+"KM/h");
    }
    
    void freiarJ(int para){
        velJ = velJ - para;
        System.out.println("Sua moto diminuiu a velocidade para: "+velJ+"KM/h");
    }
    
    void buzinarJ(){
        System.out.println("Kombi buzinando");
    }
    
    void drift(String x){
        if(x.equals("executar") && velJ > 50){
            System.out.println("Seu drift falhou e você caiu do jet ski");
        }
        if(x.equals("executar") && velJ < 50){
            System.out.println("Seu drift foi executado com sucesso!");
        }
        if(x.equals("não executar")){
            System.out.println("Drift não executado!");
        }
    }
    
    void pirueta(String y){
        if(y.equals("vamos lá")){
            System.out.println("Piruetas piruetadas!");
        }
        if(y.equals("não")){
            System.out.println("-_-");
        }
    }
}
