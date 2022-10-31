/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hardik sodhani
 */
public class id {
    private static int counter = 10000;
    //private int coachId;

     int coachId = counter++;
     String staffIDInString=new Integer(coachId).toString();
      
    
}
