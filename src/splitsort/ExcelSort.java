/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitsort;

/**
 *
 * @author Nathan
 */
public class ExcelSort implements Comparable  {
    private double val;
    private double index;
    
    public ExcelSort(double a, double b){ //a = index of value, b = value
        index = a;
        val = b;
    }
     
    public double getVal(){
        return val;
    }
    
    public double getRow(){
        return index;
    }
    
    @Override
    public int compareTo(Object a){
        ExcelSort b = ExcelSort.class.cast(a);
        
        if(b.getVal() >= val){
            return -1;
        }
        else {
            return 1;
        }
    }
    public double print(){
        return index;
    }
    
    }

