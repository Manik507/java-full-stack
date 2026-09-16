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
    Scanner sc=new Scanner(System.in);
    int f=-1;
    int r=-1;
    int n;
    int[] arr;
    public void enqueue()
    {
        if((r+1)%n==f)
        {
            System.out.println("Queue Overflow");
            return;
        }
        int x;
        System.out.println("Enter Element to Enqueue :- ");
        x=sc.nextInt();
        if(f==-1 && r==-1)
        {
            f=0;
            r=0;
            arr[r]=x;
        }
        else
        {
            r=(r+1)%n;
            arr[r]=x;
        }
    }
    
    public void dequeue()
    {
        if(f==-1)
        {
            System.out.println("Queue Underflow");
            return;
        }
        if(f==r)
        {
            System.out.println(arr[f]+ "Dequeued");
            f=-1;
            r=-1;
        }
        else
        {
            System.out.println(arr[f]+" Dequeued");
            f=(f+1)%n;
        }
    }
    
    public void display()
    {
        if(r==-1 && f==-1)
        {
            System.out.println("Queue Underflow");
            return;
        }
        int i=f;
        while(true)
        {
            System.out.print(arr[i]+" ");
            if(i==r)
                break;
           
            i=(i+1)%n;
        }
    }
    
    public static void main(String args[])
    {
        CircularQueueImplementationUsingArray q = new CircularQueueImplementationUsingArray();

        
        System.out.println("Enter the size of the array :- ");
        q.n=q.sc.nextInt();
        if (q.n <= 0) {
            System.out.println("Array size must be greater than 0");
            return;
        }

        q.arr=new int[q.n];
        
        while(true)
        {
            System.out.println("Select options to perform the below operations");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            
            int ch=q.sc.nextInt();
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
