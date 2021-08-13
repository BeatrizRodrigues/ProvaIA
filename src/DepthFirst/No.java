/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepthFirst;

import java.util.ArrayList;
import org.w3c.dom.Node;

/**
 *
 * @author beeat
 */
public class No {
    int num;
    ArrayList<No> adj = new ArrayList<>();
    
    public No(int num){
        this.num = num;
    }
}
