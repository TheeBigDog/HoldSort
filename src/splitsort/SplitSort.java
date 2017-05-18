/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitsort;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class SplitSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner (System.in);
        /*
        
        System.out.println("Enter the size of the list to be sorted, then the list of numbers to be sorted.");
        int k = 0;
        ArrayList<Integer> sort = new ArrayList<Integer>();
        //int k = scan.nextInt(); //reads size
        
        
        
        
        
        k = scan.nextInt();
        
        for(int i = 0; i < k; ++i){
            sort.add(scan.nextInt());
            
        }
        */ //this code sorts integers
        
        System.out.println("Enter the number of indexes to be sorted, then the list of index-value pairs as seperate values");
        ArrayList<ExcelSort> sort = new ArrayList<ExcelSort>();                //this whole gross this is for sorting excel values
        int k = scan.nextInt();
        for(int i = 0; i < k; ++i){
            ExcelSort e = new ExcelSort(scan.nextDouble(), scan.nextDouble());
            sort.add(e);
            
        }
        
        Holdsort A = new Holdsort(sort); //new object to use holdsort methods
        
        
        //ArrayList<Integer> Result = A.Sort(); //for integers
        
        ArrayList<ExcelSort> Result = A.Sort(); //excel
        
        for(int p = 0; p < k; p++){

            //System.out.println(Result.get(p)); //integers 
            System.out.println(Result.get(p).print()); //excel 
        }
        System.out.println("");
        System.out.println("Array Accesses: " + A.ArrayAccess());
        
    }
    
}
