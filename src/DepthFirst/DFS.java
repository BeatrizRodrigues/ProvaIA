/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepthFirst;

/**
 *
 * @author beeat
 */
public class DFS {
     Grafo mapa = new Grafo();
        
        mapa.addNode(0);
        mapa.addNode(1);
        mapa.addNode(2);
        mapa.addNode(3);
        mapa.addNode(4);
        mapa.addNode(5);
        mapa.addNode(6);
        mapa.addNode(7);
        mapa.addNode(8);
        mapa.addNode(9);
        mapa.addNode(10);
        mapa.addNode(11);
        mapa.addNode(12);
        mapa.addNode(13);
        mapa.addNode(14);
        mapa.addNode(15);
        mapa.addNode(16);
        mapa.addNode(17);
        mapa.addNode(18);
        mapa.addNode(19);
        mapa.addNode(20);
        mapa.addNode(21);
        mapa.addNode(22);
        mapa.addNode(23);
        mapa.addNode(24);
        mapa.addNode(25);
        mapa.addNode(26);
        mapa.addNode(27);
        mapa.addNode(28);
        mapa.addNode(29);
        mapa.addNode(30);
        mapa.addNode(31);
        mapa.addNode(32);
        mapa.addNode(33);
        mapa.addNode(34);
        mapa.addNode(35);
        mapa.addNode(36);
        mapa.addNode(37);
        mapa.addNode(38);
        mapa.addNode(39);
        mapa.addNode(40);
        mapa.addNode(41);
        mapa.addNode(42);
        mapa.addNode(43);
        mapa.addNode(44);
        mapa.addNode(45);
        mapa.addNode(46);
        mapa.addNode(47);
        mapa.addNode(48);
        mapa.addNode(49);
        mapa.addNode(50);
        mapa.addNode(51);
        mapa.addNode(52);
        mapa.addNode(53);
        mapa.addNode(54);
        mapa.addNode(55);
        mapa.addNode(56);
        mapa.addNode(57);
        mapa.addNode(58);
        mapa.addNode(59);
        mapa.addNode(60);
        mapa.addNode(61);
        mapa.addNode(62);
        mapa.addNode(63);
        mapa.addNode(64);
        mapa.addNode(65);
        mapa.addNode(66);
        mapa.addNode(67);
        mapa.addNode(68);
        mapa.addNode(69);
        mapa.addNode(70);
        mapa.addNode(71);
        mapa.addNode(72);
        mapa.addNode(73);
        mapa.addNode(74);
        mapa.addNode(75);
        mapa.addNode(76);
        mapa.addNode(77);
        mapa.addNode(78);
        mapa.addNode(79);
        mapa.addNode(80);
        mapa.addNode(81);
        mapa.addNode(82);
        mapa.addNode(83);
        mapa.addNode(84);
        mapa.addNode(85);
        mapa.addNode(86);
        mapa.addNode(87);
        mapa.addNode(88);
        mapa.addNode(89);
        mapa.addNode(90);
        mapa.addNode(91);
        mapa.addNode(92);
        mapa.addNode(93);
        mapa.addNode(94);
        mapa.addNode(95);
        mapa.addNode(96);
        mapa.addNode(97);
        mapa.addNode(98);
        mapa.addNode(99);
        mapa.addNode(100);
        mapa.addNode(101);
        mapa.addNode(102);
        
        mapa.addEdge(0,1);
        mapa.addEdge(0,2);
        mapa.addEdge(0,3);
        mapa.addEdge(0,5);
        
        mapa.addEdge(1,0);
        mapa.addEdge(1,2);
        
        mapa.addEdge(2,0);
        mapa.addEdge(2,1);
        mapa.addEdge(2,3);
        
        mapa.addEdge(3,0);
        mapa.addEdge(3,2);
        mapa.addEdge(3,4);
        mapa.addEdge(3,5);
        mapa.addEdge(3,10);
        
        mapa.addEdge(4,3);
        mapa.addEdge(4,5);
        mapa.addEdge(4,10);
        
        mapa.addEdge(5,0);
        mapa.addEdge(5,3);
        mapa.addEdge(5,4);
        mapa.addEdge(5,7);
        
        mapa.addEdge(6,7);
        mapa.addEdge(6,8);
        
        mapa.addEdge(7,5);
        mapa.addEdge(7,6);
        mapa.addEdge(7,8);
        
        mapa.addEdge(8,6);
        mapa.addEdge(8,7);
        mapa.addEdge(8,9);
        mapa.addEdge(8,11);
        
        mapa.addEdge(9,8);
        mapa.addEdge(9,11);
        mapa.addEdge(9,12);
        
        mapa.addEdge(10,3);
        mapa.addEdge(10,4);
        
        mapa.addEdge(11,8);
        mapa.addEdge(11,9);
        mapa.addEdge(11,13);
        
        mapa.addEdge(12,9);
        mapa.addEdge(12,13);
        mapa.addEdge(12,14);
        
        mapa.addEdge(13,11);
        mapa.addEdge(13,12);
        mapa.addEdge(13,14);
        
        mapa.addEdge(14,12);
        mapa.addEdge(14,13);
        mapa.addEdge(14,39);
        
        mapa.addEdge(15,16);
        
        mapa.addEdge(16,15);
        mapa.addEdge(16,17);
        mapa.addEdge(16,18);
        mapa.addEdge(16,20);
        mapa.addEdge(16,21);
        
        mapa.addEdge(17,16);
        mapa.addEdge(17,20);
        
        mapa.addEdge(18,16);
        mapa.addEdge(18,19);
        mapa.addEdge(18,21);
        
        mapa.addEdge(19,18);
        
        mapa.addEdge(20,16);
        mapa.addEdge(20,17);
        mapa.addEdge(20,21);
        mapa.addEdge(20,22);
        mapa.addEdge(20,23);
        mapa.addEdge(20,24);
        
        mapa.addEdge(21,16);
        mapa.addEdge(21,18);
        mapa.addEdge(21,20);
        mapa.addEdge(21,39);
        
        mapa.addEdge(22,20);
        
        mapa.addEdge(23,20);
        
        mapa.addEdge(24,20);
        
        mapa.addEdge(25,26);
        mapa.addEdge(25,27);
        
        mapa.addEdge(26,25);
        mapa.addEdge(26,28);
        
        mapa.addEdge(27,25);
        mapa.addEdge(27,28);
        mapa.addEdge(27,29);
        
        mapa.addEdge(28,26);
        mapa.addEdge(28,27);
        mapa.addEdge(28,29);
        mapa.addEdge(28,30);
        
        mapa.addEdge(29,27);
        mapa.addEdge(29,28);
        mapa.addEdge(29,30);
        
        mapa.addEdge(30,28);
        mapa.addEdge(30,29);
        mapa.addEdge(30,39);
        
        mapa.addEdge(31,32);
        mapa.addEdge(31,33);
        mapa.addEdge(31,34);
        
        mapa.addEdge(32,31);
        mapa.addEdge(32,33);
        mapa.addEdge(32,34);
        
        mapa.addEdge(33,31);
        mapa.addEdge(33,32);
        mapa.addEdge(33,34);
        mapa.addEdge(33,35);
        mapa.addEdge(33,36);
        
        mapa.addEdge(34,31);
        mapa.addEdge(34,32);
        mapa.addEdge(34,33);
        mapa.addEdge(34,35);
        
        mapa.addEdge(35,33);
        mapa.addEdge(35,34);
        mapa.addEdge(35,36);
       
        mapa.addEdge(36,33);
        mapa.addEdge(36,35);
        mapa.addEdge(36,37);
        mapa.addEdge(36,39);
        
        mapa.addEdge(37,36);
        mapa.addEdge(37,38);
        
        mapa.addEdge(38,37);
        
        mapa.addEdge(39,14);
        mapa.addEdge(39,21);
        mapa.addEdge(39,30);
        mapa.addEdge(39,36);
        mapa.addEdge(39,40);
        
        mapa.addEdge(40,39);        
        mapa.addEdge(40,41);        
        mapa.addEdge(40,42);
        
        mapa.addEdge(41,40);
        mapa.addEdge(41,42);
        
        mapa.addEdge(42,40);
        mapa.addEdge(42,41);
        mapa.addEdge(42,43);
        mapa.addEdge(42,44);
        
        mapa.addEdge(43,42);
        mapa.addEdge(43,44);
        mapa.addEdge(43,45);
        mapa.addEdge(43,46);
        
        mapa.addEdge(44,42);
        mapa.addEdge(44,43);
        mapa.addEdge(44,46);
        mapa.addEdge(44,47);
        
        mapa.addEdge(45,43);
        mapa.addEdge(45,48);
        
        mapa.addEdge(46,43);
        mapa.addEdge(46,44);
        mapa.addEdge(46,48);
        
        mapa.addEdge(47,44);
        mapa.addEdge(47,48);
        mapa.addEdge(47,49);
        
        mapa.addEdge(48,45);
        mapa.addEdge(48,46);
        mapa.addEdge(48,47);
        mapa.addEdge(48,49);
        mapa.addEdge(48,52);
        
        mapa.addEdge(49,47);
        mapa.addEdge(49,48);
        mapa.addEdge(49,50);
        mapa.addEdge(49,51);
        
        mapa.addEdge(50,49);
        mapa.addEdge(50,51);
        
        mapa.addEdge(51,49);
        mapa.addEdge(51,50);
        mapa.addEdge(51,52);
        mapa.addEdge(51,54);
        
        mapa.addEdge(52,48);
        mapa.addEdge(52,51);
        mapa.addEdge(52,53);
        mapa.addEdge(52,54);
        
        mapa.addEdge(53,52);
        
        mapa.addEdge(54,51);
        mapa.addEdge(54,52);
        mapa.addEdge(54,55);
        mapa.addEdge(54,56);
        mapa.addEdge(54,57);
        
        mapa.addEdge(55,54);
        mapa.addEdge(55,56);
        
        mapa.addEdge(56,54);
        mapa.addEdge(56,55);
        mapa.addEdge(56,57);
        
        mapa.addEdge(57,54);
        mapa.addEdge(57,56);
        mapa.addEdge(57,58);
        mapa.addEdge(57,59);
        mapa.addEdge(57,61);
        mapa.addEdge(57,63);
        
        mapa.addEdge(58,57);
        
        mapa.addEdge(59,57);
        mapa.addEdge(59,60);
        mapa.addEdge(59,69);
        
        mapa.addEdge(60,59);
        mapa.addEdge(60,66);
        
        mapa.addEdge(61,57);
        mapa.addEdge(61,62);
        
        mapa.addEdge(62,61);
        mapa.addEdge(62,64);
        
        mapa.addEdge(63,57);
        mapa.addEdge(63,70);
        
        mapa.addEdge(64,62);
        mapa.addEdge(64,65);
        
        mapa.addEdge(65,64);
        
        mapa.addEdge(66,60);
        mapa.addEdge(66,67);
        mapa.addEdge(66,71);
        
        mapa.addEdge(67,66);
        mapa.addEdge(67,68);
        mapa.addEdge(67,71);
        
        mapa.addEdge(68,67);
        
        mapa.addEdge(69,59);
        mapa.addEdge(69,71);
        mapa.addEdge(69,72);
        
        mapa.addEdge(70,63);
        
        mapa.addEdge(71,66);
        mapa.addEdge(71,67);
        mapa.addEdge(71,69);
        mapa.addEdge(71,72);
        mapa.addEdge(71,73);
        
        mapa.addEdge(72,69);
        mapa.addEdge(72,71);
        
        mapa.addEdge(73,71);
        mapa.addEdge(73,74);
        mapa.addEdge(73,75);
        
        mapa.addEdge(74,73);
        mapa.addEdge(74,76);
        
        mapa.addEdge(75,73);
        mapa.addEdge(75,76);
        
        mapa.addEdge(76,74);
        mapa.addEdge(76,75);
        mapa.addEdge(76,77);
        mapa.addEdge(76,78);
        
        mapa.addEdge(77,76);
        mapa.addEdge(77,78);
        mapa.addEdge(77,79);
        mapa.addEdge(77,81);
        
        mapa.addEdge(78,76);
        mapa.addEdge(78,77);
        mapa.addEdge(78,80);
        
        mapa.addEdge(79,77);
        mapa.addEdge(79,81);
        mapa.addEdge(79,82);
        
        mapa.addEdge(80,78);
        mapa.addEdge(80,81);
        mapa.addEdge(80,83);
        
        mapa.addEdge(81,77);
        mapa.addEdge(81,79);
        mapa.addEdge(81,80);
        mapa.addEdge(81,82);
        mapa.addEdge(81,83);
        mapa.addEdge(81,84);
        
        mapa.addEdge(82,79);
        mapa.addEdge(82,81);
        mapa.addEdge(82,85);
        mapa.addEdge(82,86);
        
        mapa.addEdge(83,80);
        mapa.addEdge(83,81);
        mapa.addEdge(83,84);
        
        mapa.addEdge(84,81);
        mapa.addEdge(84,83);
        mapa.addEdge(84,85);
        
        mapa.addEdge(85,82);
        mapa.addEdge(85,84);
        mapa.addEdge(85,86);
        mapa.addEdge(85,87);
        mapa.addEdge(85,88);
        mapa.addEdge(85,89);
        
        mapa.addEdge(86,82);
        mapa.addEdge(86,85);
        mapa.addEdge(86,89);
        mapa.addEdge(86,93);
        
        mapa.addEdge(87,85);
        mapa.addEdge(87,88);
        mapa.addEdge(87,92);
        
        mapa.addEdge(88,85);
        mapa.addEdge(88,87);
        mapa.addEdge(88,89);
        mapa.addEdge(88,91);
        mapa.addEdge(88,92);
        
        mapa.addEdge(89,85);
        mapa.addEdge(89,86);
        mapa.addEdge(89,88);
        mapa.addEdge(89,91);
        mapa.addEdge(89,93);
        
        mapa.addEdge(90,89);
        mapa.addEdge(90,91);
        mapa.addEdge(90,93);
        mapa.addEdge(90,94);
        mapa.addEdge(90,95);
        mapa.addEdge(90,97);
        
        mapa.addEdge(91,88);
        mapa.addEdge(91,90);
        mapa.addEdge(91,92);
        mapa.addEdge(91,97);
        
        mapa.addEdge(92,87);
        mapa.addEdge(92,88);
        mapa.addEdge(92,91);
        
        mapa.addEdge(93,86);
        mapa.addEdge(93,89);
        mapa.addEdge(93,90);
        mapa.addEdge(93,94);
        
        mapa.addEdge(94,90);
        mapa.addEdge(94,93);
        mapa.addEdge(94,95);
        mapa.addEdge(94,96);
        
        mapa.addEdge(95,90);
        mapa.addEdge(95,94);
        mapa.addEdge(95,96);
        mapa.addEdge(95,97);
        mapa.addEdge(95,98);
        mapa.addEdge(95,99);
        
        mapa.addEdge(96,94);
        mapa.addEdge(96,95);
        mapa.addEdge(96,98);
        mapa.addEdge(96,100);
        
        mapa.addEdge(97,90);
        mapa.addEdge(97,91);
        mapa.addEdge(97,95);
        mapa.addEdge(97,99);
        
        mapa.addEdge(98,95);
        mapa.addEdge(98,96);
        mapa.addEdge(98,99);
        mapa.addEdge(98,100);
        mapa.addEdge(98,101);
        
        mapa.addEdge(99,95);
        mapa.addEdge(99,97);
        mapa.addEdge(99,98);
        mapa.addEdge(99,100);
        mapa.addEdge(99,101);
        
        mapa.addEdge(100,96);
        mapa.addEdge(100,98);
        mapa.addEdge(100,99);
        mapa.addEdge(100,101);
        
        mapa.addEdge(101,98);
        mapa.addEdge(101,99);
        mapa.addEdge(101,100);
        mapa.addEdge(101,102);
        
        mapa.addEdge(102,101);
        
        long tempo = System.currentTimeMillis();
        mapa.dfs(0);
        System.out.println("Tempo levado: " + (System.currentTimeMillis() - tempo));
    }
}
