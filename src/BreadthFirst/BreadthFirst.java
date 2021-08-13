/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BreadthFirst;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author beeat
 */
public class BreadthFirst {
     public static <T> Optional<No<T>> procura(T valor, No<T> inicio){
        Queue<No<T>> fila = new ArrayDeque<>();
        fila.add(inicio);
        
        No<T> atual;
        Set<No<T>> jaVisitou = new HashSet<>();
        
        while(!fila.isEmpty()){
            atual = fila.remove();
            System.out.println("Valor visitado: " + atual.getValor());
            if(atual.getValor().equals(valor)){
                System.out.println("Valor encontrado.");
                return Optional.of(atual);
            }
            else{
                jaVisitou.add(atual);
                fila.addAll(atual.getVizinhos());
                fila.removeAll(jaVisitou);
            }
        }
        System.out.println("Valor não encontrado.");
        return Optional.empty();
    }
    
    public static void main(String[] args) {
        No no0 = new No(0);
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);
        No no6 = new No(6);
        No no7 = new No(7);
        No no8 = new No(8);
        No no9 = new No(9);
        No no10 = new No(10);
        No no11 = new No(11);
        No no12 = new No(12);
        No no13 = new No(13);
        No no14 = new No(14);
        No no15 = new No(15);
        No no16 = new No(16);
        No no17 = new No(17);
        No no18 = new No(18);
        No no19 = new No(19);
        No no20 = new No(20);
        No no21 = new No(21);
        No no22 = new No(22);
        No no23 = new No(23);
        No no24 = new No(24);
        No no25 = new No(25);
        No no26 = new No(26);
        No no27 = new No(27);
        No no28 = new No(28);
        No no29 = new No(29);
        No no30 = new No(30);
        No no31 = new No(31);
        No no32 = new No(32);
        No no33 = new No(33);
        No no34 = new No(34);
        No no35 = new No(35);
        No no36 = new No(36);
        No no37 = new No(37);
        No no38 = new No(38);
        No no39 = new No(39);
        No no40 = new No(40);
        No no41 = new No(41);
        No no42 = new No(42);
        No no43 = new No(43);
        No no44 = new No(44);
        No no45 = new No(45);
        No no46 = new No(46);
        No no47 = new No(47);
        No no48 = new No(48);
        No no49 = new No(49);
        No no50 = new No(50);
        No no51 = new No(51);
        No no52 = new No(52);
        No no53 = new No(53);
        No no54 = new No(54);
        No no55 = new No(55);
        No no56 = new No(56);
        No no57 = new No(57);
        No no58 = new No(58);
        No no59 = new No(59);
        No no60 = new No(60);
        No no61 = new No(61);
        No no62 = new No(62);
        No no63 = new No(63);
        No no64 = new No(64);
        No no65 = new No(65);
        No no66 = new No(66);
        No no67 = new No(67);
        No no68 = new No(68);
        No no69 = new No(69);
        No no70 = new No(70);
        No no71 = new No(71);
        No no72 = new No(72);
        No no73 = new No(73);
        No no74 = new No(74);
        No no75 = new No(75);
        No no76 = new No(76);
        No no77 = new No(77);
        No no78 = new No(78);
        No no79 = new No(79);
        No no80 = new No(80);
        No no81 = new No(81);
        No no82 = new No(82);
        No no83 = new No(83);
        No no84 = new No(84);
        No no85 = new No(85);
        No no86 = new No(86);
        No no87 = new No(87);
        No no88 = new No(88);
        No no89 = new No(89);
        No no90 = new No(90);
        No no91 = new No(91);
        No no92 = new No(92);
        No no93 = new No(93);
        No no94 = new No(94);
        No no95 = new No(95);
        No no96 = new No(96);
        No no97 = new No(97);
        No no98 = new No(98);
        No no99 = new No(99);
        No no100 = new No(100);
        No no101 = new No(101);
        No no102 = new No(102);
        
        no0.conectar(no1);
        no0.conectar(no2);
        no0.conectar(no3);
        no0.conectar(no5);
        
        no1.conectar(no0);
        no1.conectar(no2);
        
        no2.conectar(no0);
        no2.conectar(no1);
        no2.conectar(no3);
        
        no3.conectar(no0);
        no3.conectar(no2);
        no3.conectar(no4);
        no3.conectar(no5);
        no3.conectar(no10);
        
        no4.conectar(no3);
        no4.conectar(no5);
        no4.conectar(no10);
        
        no5.conectar(no0);
        no5.conectar(no3);
        no5.conectar(no4);
        no5.conectar(no7);
        
        no6.conectar(no7);
        no6.conectar(no8);
        
        no7.conectar(no5);
        no7.conectar(no6);
        no7.conectar(no8);
        
        no8.conectar(no6);
        no8.conectar(no7);
        no8.conectar(no9);
        no8.conectar(no11);
        
        no9.conectar(no8);
        no9.conectar(no11);
        no9.conectar(no12);
        
        no10.conectar(no3);
        no10.conectar(no4);
        
        no11.conectar(no8);
        no11.conectar(no9);
        no11.conectar(no13);
        
        no12.conectar(no9);
        no12.conectar(no13);
        no12.conectar(no14);
        
        no13.conectar(no11);
        no13.conectar(no12);
        no13.conectar(no14);
        
        no14.conectar(no12);
        no14.conectar(no13);
        no14.conectar(no39);
        
        no15.conectar(no16);
        
        no16.conectar(no15);
        no16.conectar(no17);
        no16.conectar(no18);
        no16.conectar(no20);
        no16.conectar(no21);
        
        no17.conectar(no16);
        no17.conectar(no20);
        
        no18.conectar(no16);
        no18.conectar(no19);
        no18.conectar(no21);
        
        no19.conectar(no18);
        
        no20.conectar(no16);
        no20.conectar(no17);
        no20.conectar(no21);
        no20.conectar(no22);
        no20.conectar(no23);
        no20.conectar(no24);
        
        no21.conectar(no16);
        no21.conectar(no18);
        no21.conectar(no20);
        no21.conectar(no39);
        
        no22.conectar(no20);
        
        no23.conectar(no20);
        
        no24.conectar(no20);
        
        no25.conectar(no26);
        no25.conectar(no27);
        
        no26.conectar(no25);
        no26.conectar(no28);
        
        no27.conectar(no25);
        no27.conectar(no28);
        no27.conectar(no29);
        
        no28.conectar(no26);
        no28.conectar(no27);
        no28.conectar(no29);
        no28.conectar(no30);
        
        no29.conectar(no27);
        no29.conectar(no28);
        no29.conectar(no30);
        
        no30.conectar(no28);
        no30.conectar(no29);
        no30.conectar(no39);
        
        no31.conectar(no32);
        no31.conectar(no33);
        no31.conectar(no34);
        
        no32.conectar(no31);
        no32.conectar(no33);
        no32.conectar(no34);
        
        no33.conectar(no31);
        no33.conectar(no32);
        no33.conectar(no34);
        no33.conectar(no35);
        no33.conectar(no36);
        
        no34.conectar(no31);
        no34.conectar(no32);
        no34.conectar(no33);
        no34.conectar(no35);
        
        no35.conectar(no33);
        no35.conectar(no34);
        no35.conectar(no36);
       
        no36.conectar(no33);
        no36.conectar(no35);
        no36.conectar(no37);
        no36.conectar(no39);
        
        no37.conectar(no36);
        no37.conectar(no38);
        
        no38.conectar(no37);
        
        no39.conectar(no14);
        no39.conectar(no21);
        no39.conectar(no30);
        no39.conectar(no36);
        no39.conectar(no40);
        
        no40.conectar(no39);        
        no40.conectar(no41);        
        no40.conectar(no42);
        
        no41.conectar(no40);
        no41.conectar(no42);
        
        no42.conectar(no40);
        no42.conectar(no41);
        no42.conectar(no43);
        no42.conectar(no44);
        
        no43.conectar(no42);
        no43.conectar(no44);
        no43.conectar(no45);
        no43.conectar(no46);
        
        no44.conectar(no42);
        no44.conectar(no43);
        no44.conectar(no46);
        no44.conectar(no47);
        
        no45.conectar(no43);
        no45.conectar(no48);
        
        no46.conectar(no43);
        no46.conectar(no44);
        no46.conectar(no48);
        
        no47.conectar(no44);
        no47.conectar(no48);
        no47.conectar(no49);
        
        no48.conectar(no45);
        no48.conectar(no46);
        no48.conectar(no47);
        no48.conectar(no49);
        no48.conectar(no52);
        
        no49.conectar(no47);
        no49.conectar(no48);
        no49.conectar(no50);
        no49.conectar(no51);
        
        no50.conectar(no49);
        no50.conectar(no51);
        
        no51.conectar(no49);
        no51.conectar(no50);
        no51.conectar(no52);
        no51.conectar(no54);
        
        no52.conectar(no48);
        no52.conectar(no51);
        no52.conectar(no53);
        no52.conectar(no54);
        
        no53.conectar(no52);
        
        no54.conectar(no51);
        no54.conectar(no52);
        no54.conectar(no55);
        no54.conectar(no56);
        no54.conectar(no57);
        
        no55.conectar(no54);
        no55.conectar(no56);
        
        no56.conectar(no54);
        no56.conectar(no55);
        no56.conectar(no57);
        
        no57.conectar(no54);
        no57.conectar(no56);
        no57.conectar(no58);
        no57.conectar(no59);
        no57.conectar(no61);
        no57.conectar(no63);
        
        no58.conectar(no57);
        
        no59.conectar(no57);
        no59.conectar(no60);
        no59.conectar(no69);
        
        no60.conectar(no59);
        no60.conectar(no66);
        
        no61.conectar(no57);
        no61.conectar(no62);
        
        no62.conectar(no61);
        no62.conectar(no64);
        
        no63.conectar(no57);
        no63.conectar(no70);
        
        no64.conectar(no62);
        no64.conectar(no65);
        
        no65.conectar(no64);
        
        no66.conectar(no60);
        no66.conectar(no67);
        no66.conectar(no71);
        
        no67.conectar(no66);
        no67.conectar(no68);
        no67.conectar(no71);
        
        no68.conectar(no67);
        
        no69.conectar(no59);
        no69.conectar(no71);
        no69.conectar(no72);
        
        no70.conectar(no63);
        
        no71.conectar(no66);
        no71.conectar(no67);
        no71.conectar(no69);
        no71.conectar(no72);
        no71.conectar(no73);
        
        no72.conectar(no69);
        no72.conectar(no71);
        
        no73.conectar(no71);
        no73.conectar(no74);
        no73.conectar(no75);
        
        no74.conectar(no73);
        no74.conectar(no76);
        
        no75.conectar(no73);
        no75.conectar(no76);
        
        no76.conectar(no74);
        no76.conectar(no75);
        no76.conectar(no77);
        no76.conectar(no78);
        
        no77.conectar(no76);
        no77.conectar(no78);
        no77.conectar(no79);
        no77.conectar(no81);
        
        no78.conectar(no76);
        no78.conectar(no77);
        no78.conectar(no80);
        
        no79.conectar(no77);
        no79.conectar(no81);
        no79.conectar(no82);
        
        no80.conectar(no78);
        no80.conectar(no81);
        no80.conectar(no83);
        
        no81.conectar(no77);
        no81.conectar(no79);
        no81.conectar(no80);
        no81.conectar(no82);
        no81.conectar(no83);
        no81.conectar(no84);
        
        no82.conectar(no79);
        no82.conectar(no81);
        no82.conectar(no85);
        no82.conectar(no86);
        
        no83.conectar(no80);
        no83.conectar(no81);
        no83.conectar(no84);
        
        no84.conectar(no81);
        no84.conectar(no83);
        no84.conectar(no85);
        
        no85.conectar(no82);
        no85.conectar(no84);
        no85.conectar(no86);
        no85.conectar(no87);
        no85.conectar(no88);
        no85.conectar(no89);
        
        no86.conectar(no82);
        no86.conectar(no85);
        no86.conectar(no89);
        no86.conectar(no93);
        
        no87.conectar(no85);
        no87.conectar(no88);
        no87.conectar(no92);
        
        no88.conectar(no85);
        no88.conectar(no87);
        no88.conectar(no89);
        no88.conectar(no91);
        no88.conectar(no92);
        
        no89.conectar(no85);
        no89.conectar(no86);
        no89.conectar(no88);
        no89.conectar(no91);
        no89.conectar(no93);
        
        no90.conectar(no89);
        no90.conectar(no91);
        no90.conectar(no93);
        no90.conectar(no94);
        no90.conectar(no95);
        no90.conectar(no97);
        
        no91.conectar(no88);
        no91.conectar(no90);
        no91.conectar(no92);
        no91.conectar(no97);
        
        no92.conectar(no87);
        no92.conectar(no88);
        no92.conectar(no91);
        
        no93.conectar(no86);
        no93.conectar(no89);
        no93.conectar(no90);
        no93.conectar(no94);
        
        no94.conectar(no90);
        no94.conectar(no93);
        no94.conectar(no95);
        no94.conectar(no96);
        
        no95.conectar(no90);
        no95.conectar(no94);
        no95.conectar(no96);
        no95.conectar(no97);
        no95.conectar(no98);
        no95.conectar(no99);
        
        no96.conectar(no94);
        no96.conectar(no95);
        no96.conectar(no98);
        no96.conectar(no100);
        
        no97.conectar(no90);
        no97.conectar(no91);
        no97.conectar(no95);
        no97.conectar(no99);
        
        no98.conectar(no95);
        no98.conectar(no96);
        no98.conectar(no99);
        no98.conectar(no100);
        no98.conectar(no101);
        
        no99.conectar(no95);
        no99.conectar(no97);
        no99.conectar(no98);
        no99.conectar(no100);
        no99.conectar(no101);
        
        no100.conectar(no96);
        no100.conectar(no98);
        no100.conectar(no99);
        no100.conectar(no101);
        
        no101.conectar(no98);
        no101.conectar(no99);
        no101.conectar(no100);
        no101.conectar(no102);
        
        no102.conectar(no101);
        
        long tempo = System.currentTimeMillis();
        procura(102, no0);
        System.out.println("Tempo: " + (System.currentTimeMillis() - tempo));
    }
}
