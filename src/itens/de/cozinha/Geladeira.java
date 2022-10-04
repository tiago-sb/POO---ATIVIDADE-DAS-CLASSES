package itens.de.cozinha;
public class Geladeira {
    int portas;
    String cor;
    String marca;
    boolean ligada;
    void status(){
        System.out.println("Quantas portas a geladeira tem? " + this.portas);
        System.out.println("cor da geladeira: " + this.cor);
        System.out.println("Marca da geladeira: " + this.marca);
        System.out.println("A geladeira esta ligada? " + ligada);
    }
    
    void gelar(){
        if (this.ligada == true){
            System.out.println("A geladeira vai congelar o alimento!");
        } else {
            System.out.println("A geladeira nao vai congelar o alimento!");
        }
        
    }
    void ligar(){
        this.ligada = true;
    }
    void desligar(){
        this.ligada = false;
    }
}