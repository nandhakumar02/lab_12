/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_12;

import java.util.Scanner;

/**
 *
 * @author Paarkavi Saravanan
 */
public class sorting_descending {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        char s;   
        do
        {
            
            System.out.println("Enter the number of your choice from 1 to 5");
            int a=obj.nextInt();
            switch(a)
            {
                case 1:
                {
                    System.out.println("====Integer Sorting(Descending)====");
                    System.out.println("Enter the size of the list:");
                    int n=obj.nextInt();
                    Integer num[]=new Integer[n];
                    System.out.println("Enter the elements:");
                    for(int i=0;i<n;i++)
                    {
                    num[i]=obj.nextInt();
                    }
                    System.out.println("Entered Elements are:");
                    for(int i=0;i<n;i++)
                    {
                    System.out.println(num[i]);
                    }
                    descend_sort<Integer> obj1=new descend_sort<>();
                    obj1.sorting(num);
                    break;
                }
                case 2:
                {
                       System.out.println("====Double Sorting(Descending)====");
                    System.out.println("Enter the size of the list:");
                    int n=obj.nextInt();
                    Double num[]=new Double[n];
                    System.out.println("Enter the elements:");
                    for(int i=0;i<n;i++)
                    {
                    num[i]=obj.nextDouble();
                    }
                    System.out.println("Entered Elements are:");
                    for(int i=0;i<n;i++)
                    {
                    System.out.println(num[i]);
                    }
                    
                    descend_sort<Double> obj2 = new descend_sort<>();
                    obj2.sorting(num);
                    break;
                }
                case 3:
                {
                   System.out.println("====Float Sorting(Descending)====");
                   System.out.println("Enter the size of the list:");
                    int n=obj.nextInt();
                    Float num[]=new Float[n];
                    System.out.println("Enter the elements:");
                    for(int i=0;i<n;i++)
                    {
                    num[i]=obj.nextFloat();
                    }
                    System.out.println("Entered Elements are:");
                    for(int i=0;i<n;i++)
                    {
                    System.out.println(num[i]);
                    }
                    descend_sort<Float> obj3 = new descend_sort<>();
                    obj3.sorting(num);
                    
                    break;
                }
                case 4:
                {
                  System.out.println("====Byte Sorting(Descending)====");
                  System.out.println("Enter the size of the list:");
                    int n=obj.nextInt();
                    Byte num[]=new Byte[n];
                    System.out.println("Enter the elements:");
                    for(int i=0;i<n;i++)
                    {
                    num[i]=obj.nextByte();
                    }
                    System.out.println("Entered Elements are:");
                    for(int i=0;i<n;i++)
                    {
                    System.out.println(num[i]);
                    }
                    descend_sort<Byte> obj4 = new descend_sort<>();
                    obj4.sorting(num);
                    
                    break;
                }
                case 5:
                {
                       System.out.println("====Short Sorting(Descending)====");
                    System.out.println("Enter the size of the list:");
                    int n=obj.nextInt();
                    Short num[]=new Short[n];
                    System.out.println("Enter the elements:");
                    for(int i=0;i<n;i++)
                    {
                    num[i]=obj.nextShort();
                    }
                    System.out.println("Entered Elements are:");
                    for(int i=0;i<n;i++)
                    {
                    System.out.println(num[i]);
                    }
                    descend_sort<Float> obj5= new descend_sort<>();
                    obj5.sorting(num);
                    
                }
                default:
                {
                    System.out.println("Your input is INVALID!!!:(((...Enter the valid input!");
                }
               
    
            }
            System.out.println("=====================");
            System.out.println("Enter 'y' to continue ");
            s=obj.next().charAt(0);
            System.out.println("=====================");
            if(s=='Y'||s=='y')
            {
                 System.out.println("WOW!!!You got other chance to sort..:))");
            }
            else
            {
                 System.out.println("Ohh Noooo!!Better Luck Next Time!!!..:((");
            }
        }while(s=='y'||s=='Y');
    }
}
class descend_sort<T>
{
   int swap;
   T c;
   public <T extends Number>void sorting(T[] value)
   {
       for(int i=0;i<value.length;i++)
       {
           for(int j=i;j<value.length;j++)
           {
              if(value[i].intValue()>value[j].intValue())
               {
                   T c= value[i];
                   value[i]=value[j];
                   value[j]=(T) c;
               }
           }
       
       }
       System.out.println("==DESCENDING ORDER==");
       for(int i=value.length-1;i>=0;i--)
       {
           System.out.println(value[i]);
       }
       }
   }
