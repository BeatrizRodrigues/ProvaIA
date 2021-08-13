/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BreadthFirst;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author beeat
 */
public class No<T> {
     private T valor;
    private Set<No<T>> vizinhos;
    
    public No(T valor){
        this.valor = valor;
        this.vizinhos = new HashSet<>();
    }
    
    public T getValor(){
        return valor;
    }
    
    public Set<No<T>> getVizinhos(){
        return Collections.unmodifiableSet(vizinhos);
    }
    
    public void conectar(No<T> no){
        if(this == no){
            throw new IllegalArgumentException ("Erro ao conectar!");
        }
        this.vizinhos.add(no);
    }
}
