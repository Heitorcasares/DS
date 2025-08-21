package carro2;

public class Carro {
    private String nomeModelo;
    protected double precoAno1;
    protected double precoAno2;
    protected double precoAno3;
    
   
    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3; 
        
    }

    public double calcularMenorPreco() {
        double menor = Math.min(precoAno1, Math.min(precoAno2, precoAno3));
        return menor;
    }

        
    

    public double calcularMaiorPreco() {
        double maior = Math.max(precoAno1, Math.max(precoAno2, precoAno3));
        return maior;
    }
    

    public void exibeInformacaoCarro() {
        System.out.println("Nome do carro: " + nomeModelo);
    }
    
    
}
