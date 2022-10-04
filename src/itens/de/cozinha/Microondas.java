package itens.de.cozinha;
public class Microondas {
    String cor;
    String marca;
    int minEsquentar;
    boolean esquentar;
    void status(){
        System.out.println("Cor do microondas: " + this.cor);
        System.out.println("Marca do microondas: " + this.marca);
        System.out.println("Tempo minimo para esquentar a comida (segundos): " + this.minEsquentar);
        System.out.println("Microondas ligado? " + this.esquentar);
    }
    
    void esquentar(){
        if (esquentar == true){
            System.out.println("O microondas vai esquentar a comida!");
        } else {
            System.out.println("O microondas nao vai esquentar a comida!");
        }
    }
    void ligar(){
        this.esquentar = true;
    }
    void desligar(){
        this.esquentar = false;
    }
}
