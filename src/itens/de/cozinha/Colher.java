package itens.de.cozinha;
public class Colher {
    String cor;
    String material;
    String matAlca;
    boolean funciona;
    void status(){
        System.out.println("Cor da colher: " + cor);
        System.out.println("Material da colher:" + material);
        System.out.println("Material da alca da colher: " + matAlca);
        System.out.println("Funcina? " + funciona);
    }
    
    void utilizavel(){
        if (this.funciona == true){
            System.out.println("A colher pode ser utilizada!");
        } else {
            System.out.println("A colher nao pode ser utilizada!");
        }
}
    void naofuncional(){
        this.funciona = false;
    }
    void funcional(){
        this.funciona = true;
    }
}

