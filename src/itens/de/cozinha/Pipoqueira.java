package itens.de.cozinha;
public class Pipoqueira {
    String marca;
    int voltagem;
    String cor;
    boolean funciona;
    void status(){
            System.out.println("Marca: " + this.marca);
            System.out.println("Qual voltagem: " + this.voltagem);
            System.out.println("Qual cor: " + this.cor);
            System.out.println("Funcinona? " + funciona);
    }
    
    void pipocando(){
        if (this.funciona == true){
            System.out.println("A pipoqueira vai produzir pipoca!");
        } else {
            System.out.println("A pipoqueira nao vai produzir pipoca!");
        }
    }
    void desligar (){
        this.funciona = false;
    }
    void ligar(){
        this.funciona = true;
    }
}
