/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitsort;

import java.util.ArrayList;

/**
 *
 * @author Nathan
 */
public class Holdsort <T extends Comparable> {
    
    private int k; //size of list
    private ArrayList<T> store; //original list
    private int c; //increments through list
    private ArrayList<T> bubble = new ArrayList<T>(); //subarraylist sorted
    private T temp; //held variable
    private int check; //check value
    private int aa; //counts # of array accesses
    
    public Holdsort(ArrayList<T> b){
        k = b.size();
        store = b;
        c = 0;
        
        check = 0;
        aa = 0;
    }
    
    public ArrayList<T> Sort(){
        
        
        
        for(c = 0; c < k; c++){ //goes through array until all integers are sorted
            
        temp = store.get(c);
        check = 0;
        if(c == 0){
            bubble.add(store.get(c)); 
            ++aa;
        }
        else{
            for(int i = 0; i < c; i++){
                
                if(temp.compareTo(bubble.get(i)) <= 0){
                    bubble.add(i, temp);
                    ++aa;
                    break;
                    
                }
                else if(temp.compareTo(bubble.get(c-1)) > 0){
                    ++check;
                    ++aa;
                }
                
            }
            if(check != 0){
                bubble.add(temp);
            }
            
        }
        
        
        
        
        
        }
        
        return bubble; 
    }  
    
    public int ArrayAccess(){
        return aa;
    }
}
