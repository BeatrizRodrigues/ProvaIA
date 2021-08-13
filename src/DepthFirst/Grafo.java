/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepthFirst;

import java.util.ArrayList;

/**
 *
 * @author beeat
 */
public class Grafo {
     private final ArrayList<No> vertices;

    public Grafo() {
        vertices = new ArrayList<>();
    }

    public void addNode(int num) {
        vertices.add(new No(num));
    }

    public void addEdge(int src, int dest) {
        vertices.get(src).adj.add(new No(dest));
    }

    public void dfs(int start) {
        boolean[] isVisited = new boolean[vertices.size()];
        dfsSearch(vertices.get(start), isVisited, 0);
    }

    private void dfsSearch(No current, boolean[] isVisited, int profundidade) {
        isVisited[current.num] = true;
        visit(current.num);
        for (No dest : vertices.get(current.num).adj) {
            if (!isVisited[dest.num]){
                dfsSearch(dest, isVisited, profundidade + 1);
            }
        }
    }

    private void visit(int value) {
        System.out.println(" " + value);        
    }
}
