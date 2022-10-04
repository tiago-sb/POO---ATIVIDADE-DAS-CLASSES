package itens.de.cozinha;
public class Liquidificador {
    String marca;
    String cor;
    int voltagem;
    boolean ligado;
    void status(){
        System.out.println("Marca do liquidificador: " + this.marca);
        System.out.println("Cor do liquidificador: " + this.cor);
        System.out.println("Qual a sua voltagem?" + this.voltagem);
        System.out.println("Esta ligado? " + this.ligado);
    }
    
    void triturar(){
        if (this.ligado == true) {
            System.out.println("o liquidificador vai funcionar normalmente!");
        } else {
            System.out.println("o liquidificar nao ira funcionar normalmente!");
        }
    }
    void ligar(){
        this.ligado = true; 
    }
    void desligar(){
        this.ligado = false;
    }
}
