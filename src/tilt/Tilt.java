/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tilt;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class Tilt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double tilt=0;
        for (int i=0;i<n;i++) {
            tilt=(sc.nextDouble()+tilt)%360.0;
        }
        System.out.printf("%.5f\r\n",tilt);
        
    }
    
}
