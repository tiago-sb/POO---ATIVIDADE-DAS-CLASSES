package itens.de.cozinha;
public class Panela {
    String tipo;
    String cor;
    int numAlca;
    boolean funciona;
    void status(){
        System.out.println("Qual o tipo de panela? " + this.tipo);
        System.out.println("Cor da panela: " + this.cor);
        System.out.println("Nemeros de alcas: " + this.numAlca);
        System.out.println("Funcinonal? " + this.funciona);
    }
    
    void utilizavel() {
        if (this.funciona == true) {
            System.out.println("A panela eh utilizavel!");
        } else {
            System.out.println("A panela nao eh utilizavel!");
        }
} 
    void naofuncional(){
        this.funciona = false;
    }
    void funcional(){
        this.funciona = true;
        
    }
}
