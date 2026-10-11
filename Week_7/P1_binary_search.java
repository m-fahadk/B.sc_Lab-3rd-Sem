/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binary_search;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class P1_binary_search 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of values :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.print("Enter the array elements : ");
        for(int i=0; i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
                    
        int lb=0;
        int ub = arr.length;
        int mid=(lb+ub)/2;
        boolean notFound = true;
        
        
        for(int e:arr)
        {
            System.out.print(e+" ");
        }
        System.out.print("\nEnter the value to be searched: ");
        int target = sc.nextInt();
        
        while(lb<=ub)
        {
            if(arr[mid] == target)
            {
                System.out.print("Target found at "+ mid);
                notFound = false;
                break;
            }
            else if(arr[mid] >target)
            {
                ub = mid-1;
            }        
            else if(arr[mid] < target)
            {
                lb =mid+1;
            }
            mid = (lb+ub)/2;
            
        }
        
        if(notFound)
        {
            System.out.print("Target not found");
        }
    }
}
