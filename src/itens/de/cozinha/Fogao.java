package itens.de.cozinha;
public class Fogao {
    int bocas;
    String cor;
    boolean aceso;
    void status(){
        System.out.println("Numeros de bocas do fogao: " + this.bocas);
        System.out.println("Qual a cor do fogao? " + this.cor);
        System.out.println("O fogao esta aceso? " + this.aceso);
    }
    
    void esquentar(){
        if (this.aceso == true) {
            System.out.println("O fogao vai esquentar o alimento!");
        } else {
            System.out.println("O fogao nao vai esquentar o alimento!");
        }
    }
    void aceso(){
        this.aceso = true;
    }
    void desligado(){
        this.aceso = false;
    }
}
