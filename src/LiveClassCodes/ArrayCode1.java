package LiveClassCodes;

import java.util.Scanner;
public class ArrayCode1 {
    public static void main(String[] args) {
        System.out.println("-----------Static Approach-------------");
        //single-dimensional array using static approach
        int a[]= {10,20,30,40,50};
        for(int i=0;i<5;i++) {
            System.out.println("Elements of array a: "+a[i]);
        }
        System.out.println("-----------Dynamic Approach-------------");
        //single-dimensional array using dynamic approach
        System.out.println("ENter the array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a1[] = new int[size];
        
        for(int i=0;i<a1.length;i++) {
            System.out.println("Enter the element no:"+(i+1));
            a1[i]=sc.nextInt();
        }
        //Displaying the array elements 
        for(int i=0;i<a1.length;i++) {
            System.out.println("the element no:"+(i+1)+" is: "+a1[i]);
        }
      
        System.out.println("-----------Mutlti-Dimentional Static Approach-------------");
        int[][] b = {
                {2, 4, 6, 8}, 
                {3, 6, 9}, 
                };
          
          System.out.println("\nLength of row 1: " + b[0].length);
          System.out.println("\nLength of row 2: " + b[1].length);
          
          int [][] a2 = new int[2][2];
          for(int i=0;i<2;i++) {
              for(int j=0;j<2;j++) {
                  System.out.println("Enter the element no:"+(j+1));
                  a2[i][j]=sc.nextInt();
              }
          }
          
          for(int i=0;i<2;i++) {
              for(int j=0;j<2;j++) {
                  System.out.println("the element no:"+(j+1)+" is: "+a2[i][j]);
              }
          }
          sc.close();
    }
}