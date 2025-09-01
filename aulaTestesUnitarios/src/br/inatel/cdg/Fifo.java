package br.inatel.cdg;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Fifo{

    private List<Integer> elementos = new ArrayList<Integer>();
    private int tamanho = 0;

    //nao precisa de testes
    public int size(){
        return tamanho;
    }

    //adiciona um elemento no final da fila
    public void enfileirar(int elementos){
        this.elementos.add(elementos);
        tamanho++;
    }

    //remove um elemento do inicio da fila
    public int removerFila() throws EmptyStackException {
        if (tamanho == 0)
            throw new EmptyStackException();
        int elemento = elementos.get(0);
        this.elementos.remove(0);
        tamanho--;
        return elemento;
    }

    //verifica se a fila ta fazia
    public boolean filaVazia(){
        return (tamanho == 0);
    }

    public int getIndex(int index){
        return elementos.get(index);
    }

    public boolean removerxElementos(int quantidade) {
        if (quantidade > tamanho) {
            return false;
        }

        int i = 0;
        while (i < quantidade) {
            this.elementos.remove(0);
            tamanho--;
            i++;
        }
        return true;
    }

    public boolean removerTudo(){
        if(tamanho == 0)
            return false;

        this.elementos.clear();
        tamanho = 0;
        return true;
    }


    public boolean verElemento(int elemento){

        if(this.elementos.contains(elemento)){
            int idx = this.elementos.indexOf(42);
            System.out.println("O elemento existe!" + ", Index: " + idx);
            return true;
        }
        return false;
    }

}
