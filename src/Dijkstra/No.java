/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

import java.util.Comparator;

/**
 *
 * @author beeat
 */
public class No implements Comparator<No> {
    public int no;
    public int custo;
 
    public No(){}
 
    public No(int no,  int custo){
        this.no = no;
        this.custo = custo;
    }
 
    @Override
    public int compare(No no1, No no2){
        if (no1.custo< no2.custo){
            return -1;
        }
        if (no1.custo > no2.custo){
            return 1;
        }
        return 0;
    }
}
