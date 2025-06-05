package projetocarro;

public class Kombi {
    String nomeK;
    String marcaK;
    int velK;
    int anoK;
    
    void sobeTodoMundo(){
        System.out.println("Todo mundo subiu");
    }
    
    void AKombiCombinaComTudo(String res){
        if(res.equals("sim")){
            System.out.println("Você é fera!");
        }
        if(res.equals("não")){
            System.out.println("Você é um monstro -_-");
        }
    }
    
    void acelerarK(int props){
        velK = velK + props;
        System.out.println("Sua kombi foi para a velocidade: "+velK+"KM/h");
    }
    
    void freiarK(int para){
        velK = velK - para;
        System.out.println("Sua moto diminuiu a velocidade para: "+velK+"KM/h");
    }
    
    void buzinarK(){
        System.out.println("Kombi buzinando");
    }
    
    void AlexaAutomatica(String r){
        if(r.equals("ativar")){
            System.out.println("Alexa: Modo automático ligado!");
        }
        if(r.equals("deixar desativado")){
            System.out.println("Alexa: Carro andando normalmente!");
        }
        if(r.equals("não gosto de alexa")){
            System.out.println("Então vaza daqui!");
        }
    }

}