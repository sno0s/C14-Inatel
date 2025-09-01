package test.java.br.inatel.cdg.test;
import br.inatel.cdg.Fifo;
import br.inatel.cdg.Pilha;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;



public class FifoTeste {

    @Test
    public void enfileirarTeste(){
        Fifo filaInteiros = new Fifo();

        filaInteiros.enfileirar(2);
        filaInteiros.enfileirar(1);

        //o 2 tem que estar na posição 0

        int first = filaInteiros.getIndex(0);
        assertEquals(2, first);
    }

    @Test
    public void removerFilaTeste(){
        Fifo filaInteiros = new Fifo();

        filaInteiros.enfileirar(2);
        filaInteiros.enfileirar(1);

        //fazendo testes de remoção da fila
        filaInteiros.removerFila();
        int tamanho = filaInteiros.size();

        assertEquals(1, tamanho);
    }

    @Test
    public void pilhaVaziaTeste(){
        Fifo filaInteiros = new Fifo();
        //é para dar erro pq eu to adicionando um elemento
        filaInteiros.enfileirar(2);

        assertEquals(true, filaInteiros.filaVazia());
    }


    //testes novos

    @Test
    public void removerxElementosTeste(){
        Fifo filaInteiros = new Fifo();

        //removendo uma quantidade especifica de elementos
        filaInteiros.enfileirar(1);
        filaInteiros.enfileirar(2);
        filaInteiros.enfileirar(3);
        filaInteiros.enfileirar(4);
        filaInteiros.enfileirar(5);
        filaInteiros.enfileirar(6);

        filaInteiros.removerxElementos(6);

        assertEquals(0, filaInteiros.size());
    }
    
    @Test
    public void removerxElementos2Teste(){
        Fifo filaInteiros = new Fifo();

        //tenho uma quantidade de elementos na lista menor do que a quantidade que eu quero remover
        filaInteiros.enfileirar(1);
        filaInteiros.enfileirar(2);
        filaInteiros.enfileirar(3);
        
        // é para me retornar um exception (ou false, nesse caso)
        assertEquals(false, filaInteiros.removerxElementos(6));
    }

    @Test
    public void verElementoTeste(){
        Fifo filaInteiros = new Fifo();
        //função que verifica se um elemento existe, nesse caso, 6 não existe, então retorna false
        filaInteiros.enfileirar(1);
        filaInteiros.enfileirar(2);
        filaInteiros.enfileirar(3);

        assertEquals(false, filaInteiros.verElemento(6));
    }

    @Test
    public void removerTudoTeste(){
        Fifo filaInteiros = new Fifo();

        filaInteiros.enfileirar(1);
        filaInteiros.enfileirar(2);
        filaInteiros.enfileirar(3);
        filaInteiros.enfileirar(4);

        assertEquals(true, filaInteiros.removerTudo());
    }

    @Test
    public void removerTudoTeste2(){
        Fifo filaInteiros = new Fifo();

        //dessa vez eu n to colocando nada na fila, então é para a função me retornar false
        //a função da erro pq eu to esperando um true, fé

        assertEquals(true, filaInteiros.removerTudo());
    }
}
