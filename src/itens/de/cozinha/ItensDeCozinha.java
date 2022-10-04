
package itens.de.cozinha;

public class ItensDeCozinha {

    public static void main(String[] args) {
        Liquidificador l1 = new Liquidificador();
        l1.marca = "arno";
        l1.cor = "preto";
        l1.voltagem = 220;
        l1.ligado = true;
        l1.status();
        l1.triturar();
 
        Fogao f1 = new Fogao();
        f1.bocas = 4;
        f1.cor = "branco";
        f1.aceso = true;
        f1.status();
        f1.esquentar();
        
        Geladeira g1 = new Geladeira();
        g1.portas = 2;
        g1.cor = "Cinza";
        g1.marca = "Samsung";
        g1.ligada = true;
        g1.status();
        g1.gelar();
        
        Microondas m1 = new Microondas();
        m1.cor = "Preto";
        m1.marca = "Philco";
        m1.minEsquentar = 30;
        m1.esquentar = true;
        m1.status();
        m1.esquentar();
        
        Panela p1 = new Panela();
        p1.tipo = "frigideira";
        p1.cor = "Preta";
        p1.numAlca = 2;
        p1.status();
        p1.utilizavel();
        
        Pipoqueira pi1 = new Pipoqueira();
        pi1.marca = "cadence";
        pi1.voltagem = 227;
        pi1.cor = "vermelho";
        pi1.status();
        pi1.pipocando();
        
        Colher c1 = new Colher();
        c1.cor = "cinza";
        c1.material = "metal";
        c1.matAlca = "Plastico";
        c1.status();
        c1.utilizavel();
    
    }
          
}
