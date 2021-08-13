/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLFS;

/**
 *
 * @author beeat
 */
public abstract class AbsSearch {
   No startNode;
   No goalNode;

   public AbsSearch(No startNode, No goalNode){
       this.startNode = startNode;
       this.goalNode = goalNode;
   }

   public abstract boolean execute();
}
