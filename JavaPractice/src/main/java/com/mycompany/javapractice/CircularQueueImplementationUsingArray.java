/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class CircularQueueImplementationUsingArray {
    int f=-1;
    int r=-1;
    int n;
    int[] arr;
    public void enqueue()
    {
        
    }
    
    public void dequeue()
    {
        
    }
    
    public void display()
    {
        if(r==-1 && f==-1)
        {
            System.out.println("Queue Underflow");
            return;
        }
        for(int i=f;i<=r;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
    public static void main(String args[])
    {
        CircularQueueImplementationUsingArray q = new CircularQueueImplementationUsingArray();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of the array :- ");
        q.n=sc.nextInt();
        q.arr=new int[q.n];
        
        while(true)
        {
            System.out.println("Select options to perform the below operations");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    q.enqueue();
                    break;
                    
                case 2:
                    q.dequeue();
                    break;
                    
                case 3:
                    q.display();
                    break;
                    
                case 4:
                    System.exit(0);
                    
                default:
                    System.out.println("Not a valid choice");
            }
        }
    }
}
