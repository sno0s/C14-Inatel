package test.java.br.inatel.cdg.test;

import br.inatel.cdg.Pilha;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class PilhaTeste {

    @Test
    public void testePilhaVazia(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        boolean vazia = pilhaInteiros.pilhaVazia();
        assertTrue(vazia);
    }

    @Test
    public void testePilhaPush(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(1);
        int tamanho = pilhaInteiros.size();
        assertEquals(1, tamanho);
    }

    @Test
    public void testePilhaPop(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(12);
        //pilhaInteiros.push(12); // se eu inserir esse da errado, entao ta funcionando
        pilhaInteiros.pop();
        int tamanho = pilhaInteiros.size();
        assertEquals(0, tamanho);
    }


}
