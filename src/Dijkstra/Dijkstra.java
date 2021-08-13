/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author beeat
 */
public class Dijkstra {
     private final int dist[];
    private final Set<Integer> settled;
    private final PriorityQueue<No> pq;
    private final int V;
    List<List<No>> adj;
 
    public Dijkstra(int V)
    {
        this.V = V;
        dist = new int[V];
        settled = new HashSet<>();
        pq = new PriorityQueue<>(V, new No());
    }
 
    // Function for Dijkstra's Algorithm
    public void dij(List<List<No>> adj, int src)
    {
        this.adj = adj;
 
        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;
 
        pq.add(new No(src, 0));
 
        dist[src] = 0;
        while (settled.size() != V) {
             if(pq.isEmpty())
               return ;
            int u = pq.remove().no;
 
            settled.add(u);
 
            e_Neighbours(u);
        }
    }
 
    private void e_Neighbours(int u)
    {
        int edgeDistance = -1;
        int newDistance = -1;
 
        for (int i = 0; i < adj.get(u).size(); i++) {
            No v = adj.get(u).get(i);
 
            if (!settled.contains(v.no)) {
                edgeDistance = v.custo;
                newDistance = dist[u] + edgeDistance;
 
                if (newDistance < dist[v.no])
                    dist[v.no] = newDistance;
 
                pq.add(new No(v.no, dist[v.no]));
            }
        }
    }
    public static void main(String arg[]){
        int V = 103;
        int source = 0;
 
        List<List<No>> adj = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
            List<No> item = new ArrayList<>();
            adj.add(item);
        }
        
        adj.get(0).add(new No(1, 1));
        adj.get(0).add(new No(2, 1));
        adj.get(0).add(new No(3, 3));
        adj.get(0).add(new No(5, 1));
        
        adj.get(1).add(new No(0, 1));
        adj.get(1).add(new No(2, 1));
        
        adj.get(2).add(new No(0, 1));
        adj.get(2).add(new No(1, 1));
        adj.get(2).add(new No(3, 2));
        
        adj.get(3).add(new No(0, 3));
        adj.get(3).add(new No(2, 2));
        adj.get(3).add(new No(4, 3));
        adj.get(3).add(new No(5, 1));
        adj.get(3).add(new No(10, 5));
        
        adj.get(4).add(new No(3, 3));
        adj.get(4).add(new No(5, 1));
        adj.get(4).add(new No(10, 4));
        
        adj.get(5).add(new No(0, 1));
        adj.get(5).add(new No(3, 1));
        adj.get(5).add(new No(4, 1));
        adj.get(5).add(new No(7, 3));
        
        adj.get(6).add(new No(7, 1));
        adj.get(6).add(new No(8, 1));
        
        adj.get(7).add(new No(5, 3));
        adj.get(7).add(new No(6, 1));
        adj.get(7).add(new No(8, 1));
        
        adj.get(8).add(new No(6, 1));
        adj.get(8).add(new No(7, 1));
        adj.get(8).add(new No(9, 3));
        adj.get(8).add(new No(11, 1));
        
        adj.get(9).add(new No(8, 3));
        adj.get(9).add(new No(11, 1));
        adj.get(9).add(new No(12, 4));
        
        adj.get(10).add(new No(3, 5));
        adj.get(10).add(new No(4, 4));
        
        adj.get(11).add(new No(8, 1));
        adj.get(11).add(new No(9, 1));
        adj.get(11).add(new No(13, 1));
        
        adj.get(12).add(new No(9, 4));
        adj.get(12).add(new No(13, 2));
        adj.get(12).add(new No(14, 4));
        
        adj.get(13).add(new No(11, 1));
        adj.get(13).add(new No(12, 2));
        adj.get(13).add(new No(14, 3));
        
        adj.get(14).add(new No(12, 4));
        adj.get(14).add(new No(13, 3));
        adj.get(14).add(new No(39, 1));
        
        adj.get(15).add(new No(16, 1));
        
        adj.get(16).add(new No(15, 1));
        adj.get(16).add(new No(17, 1));
        adj.get(16).add(new No(18, 2));
        adj.get(16).add(new No(20, 1));
        adj.get(16).add(new No(21, 3));
        
        adj.get(17).add(new No(16, 1));
        adj.get(17).add(new No(20, 1));
        
        adj.get(18).add(new No(16, 2));
        adj.get(18).add(new No(19, 2));
        adj.get(18).add(new No(21, 2));
        
        adj.get(19).add(new No(18, 2));
        
        adj.get(20).add(new No(16, 1));
        adj.get(20).add(new No(17, 1));
        adj.get(20).add(new No(21, 1));
        adj.get(20).add(new No(22, 4));
        adj.get(20).add(new No(23, 3));
        adj.get(20).add(new No(24, 5));
        
        adj.get(21).add(new No(16, 3));
        adj.get(21).add(new No(18, 2));
        adj.get(21).add(new No(20, 1));
        adj.get(21).add(new No(39, 3));
        
        adj.get(22).add(new No(20, 4));
        
        adj.get(23).add(new No(20, 3));
      
        adj.get(24).add(new No(20, 5));
        
        adj.get(25).add(new No(26, 1));
        adj.get(25).add(new No(27, 3));
        
        adj.get(26).add(new No(25, 1));
        adj.get(26).add(new No(28, 2));
        
        adj.get(27).add(new No(25, 3));
        adj.get(27).add(new No(28, 1));
        adj.get(27).add(new No(29, 2));
        
        adj.get(28).add(new No(26, 2));
        adj.get(28).add(new No(27, 1));
        adj.get(28).add(new No(29, 1));
        adj.get(28).add(new No(30, 3));
        
        adj.get(29).add(new No(27, 2));
        adj.get(29).add(new No(28, 1));
        adj.get(29).add(new No(30, 1));
        
        adj.get(30).add(new No(28, 3));
        adj.get(30).add(new No(29, 1));
        adj.get(30).add(new No(39, 1));
        
        adj.get(31).add(new No(32, 3));
        adj.get(31).add(new No(33, 1));
        adj.get(31).add(new No(34, 2));
        
        adj.get(32).add(new No(31, 3));
        adj.get(32).add(new No(33, 3));
        adj.get(32).add(new No(34, 2));
        
        adj.get(33).add(new No(31, 1));
        adj.get(33).add(new No(32, 3));
        adj.get(33).add(new No(34, 2));
        adj.get(33).add(new No(35, 1));
        adj.get(33).add(new No(36, 3));
        
        adj.get(34).add(new No(31, 2));
        adj.get(34).add(new No(32, 2));
        adj.get(34).add(new No(33, 2));
        adj.get(34).add(new No(35, 1));
        
        adj.get(35).add(new No(33, 1));
        adj.get(35).add(new No(34, 1));
        adj.get(35).add(new No(36, 1));
       
        adj.get(36).add(new No(33, 3));
        adj.get(36).add(new No(35, 1));
        adj.get(36).add(new No(37, 2));
        adj.get(36).add(new No(39, 5));
        
        adj.get(37).add(new No(36, 2));
        adj.get(37).add(new No(38, 1));
        
        adj.get(38).add(new No(37, 1));
        
        adj.get(39).add(new No(14, 1));
        adj.get(39).add(new No(21, 3));
        adj.get(39).add(new No(30, 1));
        adj.get(39).add(new No(36, 5));
        adj.get(39).add(new No(40, 1));
        
        adj.get(40).add(new No(39, 1));        
        adj.get(40).add(new No(41, 1));        
        adj.get(40).add(new No(42, 1));
        
        adj.get(41).add(new No(40, 1));
        adj.get(41).add(new No(42, 1));
        
        adj.get(42).add(new No(40, 1));
        adj.get(42).add(new No(41, 1));
        adj.get(42).add(new No(43, 1));
        adj.get(42).add(new No(44, 1));
        
        adj.get(43).add(new No(42, 1));
        adj.get(43).add(new No(44, 1));
        adj.get(43).add(new No(45, 1));
        adj.get(43).add(new No(46, 1));
        
        adj.get(44).add(new No(42, 1));
        adj.get(44).add(new No(43, 1));
        adj.get(44).add(new No(46, 1));
        adj.get(44).add(new No(47, 2));
        
        adj.get(45).add(new No(43, 1));
        adj.get(45).add(new No(48, 2));
        
        adj.get(46).add(new No(43, 1));
        adj.get(46).add(new No(44, 1));
        adj.get(46).add(new No(48, 1));
        
        adj.get(47).add(new No(44, 2));
        adj.get(47).add(new No(48, 2));
        adj.get(47).add(new No(49, 2));
        
        adj.get(48).add(new No(45, 2));
        adj.get(48).add(new No(46, 1));
        adj.get(48).add(new No(47, 2));
        adj.get(48).add(new No(49, 1));
        adj.get(48).add(new No(52, 2));
        
        adj.get(49).add(new No(47, 2));
        adj.get(49).add(new No(48, 1));
        adj.get(49).add(new No(50, 1));
        adj.get(49).add(new No(51, 1));
        
        adj.get(50).add(new No(49, 1));
        adj.get(50).add(new No(51, 1));
        
        adj.get(51).add(new No(49, 1));
        adj.get(51).add(new No(50, 1));
        adj.get(51).add(new No(52, 3));
        adj.get(51).add(new No(54, 1));
        
        adj.get(52).add(new No(48, 2));
        adj.get(52).add(new No(51, 3));
        adj.get(52).add(new No(53, 5));
        adj.get(52).add(new No(54, 2));
        
        adj.get(53).add(new No(52, 5));
        
        adj.get(54).add(new No(51, 1));
        adj.get(54).add(new No(52, 2));
        adj.get(54).add(new No(55, 2));
        adj.get(54).add(new No(56, 2));
        adj.get(54).add(new No(57, 1));
        
        adj.get(55).add(new No(54, 2));
        adj.get(55).add(new No(56, 1));
        
        adj.get(56).add(new No(54, 2));
        adj.get(56).add(new No(55, 1));
        adj.get(56).add(new No(57, 1));
        
        adj.get(57).add(new No(54, 1));
        adj.get(57).add(new No(56, 1));
        adj.get(57).add(new No(58, 1));
        adj.get(57).add(new No(59, 1));
        adj.get(57).add(new No(61, 1));
        adj.get(57).add(new No(63, 3));
        
        adj.get(58).add(new No(57, 1));
        
        adj.get(59).add(new No(57, 1));
        adj.get(59).add(new No(60, 1));
        adj.get(59).add(new No(69, 5));
        
        adj.get(60).add(new No(59, 1));
        adj.get(60).add(new No(66, 3));
        
        adj.get(61).add(new No(57, 1));
        adj.get(61).add(new No(62, 1));
        
        adj.get(62).add(new No(61, 1));
        adj.get(62).add(new No(64, 5));
        
        adj.get(63).add(new No(57, 3));
        adj.get(63).add(new No(70, 5));
        
        adj.get(64).add(new No(62, 5));
        adj.get(64).add(new No(65, 3));
        
        adj.get(65).add(new No(64, 3));
        
        adj.get(66).add(new No(60, 3));
        adj.get(66).add(new No(67, 1));
        adj.get(66).add(new No(71, 1));
        
        adj.get(67).add(new No(66, 1));
        adj.get(67).add(new No(68, 5));
        adj.get(67).add(new No(71, 1));
        
        adj.get(68).add(new No(67, 5));
        
        adj.get(69).add(new No(59, 5));
        adj.get(69).add(new No(71, 1));
        adj.get(69).add(new No(72, 1));
        
        adj.get(70).add(new No(63, 5));
        
        adj.get(71).add(new No(66, 1));
        adj.get(71).add(new No(67, 1));
        adj.get(71).add(new No(69, 1));
        adj.get(71).add(new No(72, 1));
        adj.get(71).add(new No(73, 1));
        
        adj.get(72).add(new No(69, 1));
        adj.get(72).add(new No(71, 1));
        
        adj.get(73).add(new No(71, 1));
        adj.get(73).add(new No(74, 5));
        adj.get(73).add(new No(75, 5));
        
        adj.get(74).add(new No(73, 5));
        adj.get(74).add(new No(76, 5));
        
        adj.get(75).add(new No(73, 5));
        adj.get(75).add(new No(76, 5));
        
        adj.get(76).add(new No(74, 5));
        adj.get(76).add(new No(75, 5));
        adj.get(76).add(new No(77, 1));
        adj.get(76).add(new No(78, 1));
        
        adj.get(77).add(new No(76, 1));
        adj.get(77).add(new No(78, 1));
        adj.get(77).add(new No(79, 2));
        adj.get(77).add(new No(81, 1));
        
        adj.get(78).add(new No(76, 1));
        adj.get(78).add(new No(77, 1));
        adj.get(78).add(new No(80, 1));
        
        adj.get(79).add(new No(77, 2));
        adj.get(79).add(new No(81, 1));
        adj.get(79).add(new No(82, 2));
        
        adj.get(80).add(new No(78, 1));
        adj.get(80).add(new No(81, 1));
        adj.get(80).add(new No(83, 1));
        
        adj.get(81).add(new No(77, 1));
        adj.get(81).add(new No(79, 1));
        adj.get(81).add(new No(80, 1));
        adj.get(81).add(new No(82, 2));
        adj.get(81).add(new No(83, 2));
        adj.get(81).add(new No(84, 1));
        
        adj.get(82).add(new No(79, 2));
        adj.get(82).add(new No(81, 2));
        adj.get(82).add(new No(85, 3));
        adj.get(82).add(new No(86, 2));
        
        adj.get(83).add(new No(80, 1));
        adj.get(83).add(new No(81, 2));
        adj.get(83).add(new No(84, 1));
        
        adj.get(84).add(new No(81, 1));
        adj.get(84).add(new No(83, 1));
        adj.get(84).add(new No(85, 1));
        
        adj.get(85).add(new No(82, 3));
        adj.get(85).add(new No(84, 1));
        adj.get(85).add(new No(86, 1));
        adj.get(85).add(new No(87, 1));
        adj.get(85).add(new No(88, 1));
        adj.get(85).add(new No(89, 1));
        
        adj.get(86).add(new No(82, 2));
        adj.get(86).add(new No(85, 1));
        adj.get(86).add(new No(89, 1));
        adj.get(86).add(new No(93, 1));
        
        adj.get(87).add(new No(85, 1));
        adj.get(87).add(new No(88, 1));
        adj.get(87).add(new No(92, 1));
        
        adj.get(88).add(new No(85, 1));
        adj.get(88).add(new No(87, 1));
        adj.get(88).add(new No(89, 1));
        adj.get(88).add(new No(91, 5));
        adj.get(88).add(new No(92, 1));
        
        adj.get(89).add(new No(85, 1));
        adj.get(89).add(new No(86, 1));
        adj.get(89).add(new No(88, 1));
        adj.get(89).add(new No(91, 1));
        adj.get(89).add(new No(93, 2));
        
        adj.get(90).add(new No(89, 1));
        adj.get(90).add(new No(91, 5));
        adj.get(90).add(new No(93, 1));
        adj.get(90).add(new No(94, 1));
        adj.get(90).add(new No(95, 2));
        adj.get(90).add(new No(97, 3));
        
        adj.get(91).add(new No(88, 5));
        adj.get(91).add(new No(90, 5));
        adj.get(91).add(new No(92, 5));
        adj.get(91).add(new No(97, 5));
        
        adj.get(92).add(new No(87, 1));
        adj.get(92).add(new No(88, 1));
        adj.get(92).add(new No(91, 5));
        
        adj.get(93).add(new No(86, 1));
        adj.get(93).add(new No(89, 2));
        adj.get(93).add(new No(90, 1));
        adj.get(93).add(new No(94, 1));
        
        adj.get(94).add(new No(90, 1));
        adj.get(94).add(new No(93, 1));
        adj.get(94).add(new No(95, 1));
        adj.get(94).add(new No(96, 2));
        
        adj.get(95).add(new No(90, 2));
        adj.get(95).add(new No(94, 1));
        adj.get(95).add(new No(96, 2));
        adj.get(95).add(new No(97, 3));
        adj.get(95).add(new No(98, 1));
        adj.get(95).add(new No(99, 3));
        
        adj.get(96).add(new No(94, 2));
        adj.get(96).add(new No(95, 2));
        adj.get(96).add(new No(98, 1));
        adj.get(96).add(new No(100, 5));
        
        adj.get(97).add(new No(90, 3));
        adj.get(97).add(new No(91, 5));
        adj.get(97).add(new No(95, 3));
        adj.get(97).add(new No(99, 3));
        
        adj.get(98).add(new No(95, 1));
        adj.get(98).add(new No(96, 1));
        adj.get(98).add(new No(99, 2));
        adj.get(98).add(new No(100, 5));
        adj.get(98).add(new No(101, 5));
        
        adj.get(99).add(new No(95, 3));
        adj.get(99).add(new No(97, 3));
        adj.get(99).add(new No(98, 2));
        adj.get(99).add(new No(100, 5));
        adj.get(99).add(new No(101, 5));
        
        adj.get(100).add(new No(96, 5));
        adj.get(100).add(new No(98, 5));
        adj.get(100).add(new No(99, 5));
        adj.get(100).add(new No(101, 5));
        
        adj.get(101).add(new No(98, 5));
        adj.get(101).add(new No(99, 5));
        adj.get(101).add(new No(100, 5));
        adj.get(101).add(new No(102, 5));
        
        adj.get(102).add(new No(101, 5));
        

        Dijkstra dpq = new Dijkstra(V);
        long tempo = System.currentTimeMillis();
        dpq.dij(adj, source);
        System.out.println("Tempo levado: " + (System.currentTimeMillis() - tempo));
 
        System.out.println("O caminho mais curto de:");
        for (int i = 0; i < dpq.dist.length; i++){
            System.out.println(source + " para " + i + " foi " + dpq.dist[i]);
        }
    }
}
