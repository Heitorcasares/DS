package projetocarro;
import java.util.Scanner;

public class ProjetoCarro {

    public static void main(String[] args) {
        // TODO code application logic here
        // instanciando a classe carro;
        Scanner entrada = new Scanner(System.in);
        
        
        
        
        Carro c1 = new Carro();
        c1.nome = "UNO";
        c1.marca = "FIAT";
        c1.ano = 2015;
        c1.vel = 120;
        
        
        
        Moto m1 = new Moto();
        m1.nomeM = "Panigale";
        m1.marcaM = "Ducati";
        m1.anoM = 2019;
        m1.velM = 70;
        
        Kombi k1 = new Kombi();
        
        k1.nomeK = "Kombi";
        k1.marcaK = "Volkswagen";
        k1.anoK = 1957;
        k1.velK = 90;
        
        Jetsky j1 = new Jetsky();
        
        j1.marcaJ = "Sea-Doo";
        j1.nomeJ = "Spark Trixx";
        j1.anoJ = 2025;
        j1.velJ = 100;
        
        Triciclo t1 = new Triciclo();
        t1.marcaT = "Yamaha";
        t1.nomeT = "Niken GT";
        j1.anoJ = 2019;
        j1.velJ = 200;
        
        System.out.println("Qual veículo você quer ver? ");
        String r = entrada.nextLine();
        
        switch (r){
            case "carro":
                System.out.println("Carro: ");
                System.out.println("modelo: "+c1.nome);
                System.out.println("marca: "+c1.marca);
                System.out.println("ano: "+c1.ano);
                System.out.println("velocidade: "+c1.vel+"Km/h");
                break;
            case "moto":
                System.out.println("modelo: "+m1.nomeM);
                System.out.println("marca: "+m1.marcaM);
                System.out.println("ano: "+m1.anoM);
                System.out.println("velocidade: "+m1.velM+"Km/h");
                break;
            case "kombi":
                System.out.println("modelo: "+k1.nomeK);
                System.out.println("marca: "+k1.marcaK);
                System.out.println("ano: "+k1.anoK);
                System.out.println("velocidade: "+k1.velK+"Km/h");
                break;
            case "jet ski":
                System.out.println("modelo: "+j1.nomeJ);
                System.out.println("marca: "+j1.marcaJ);
                System.out.println("ano: "+j1.anoJ);
                System.out.println("velocidade: "+j1.velJ+"Km/h");
                break;
            case "triciclo":
                System.out.println("modelo: "+t1.nomeT);
                System.out.println("marca: "+t1.marcaT);
                System.out.println("ano: "+t1.anoT);
                System.out.println("velocidade: "+t1.velT+"Km/h");
                break;
        }   
    }
    
       
    
}
