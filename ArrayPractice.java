import java.util.*;

public class ArrayPractice 
{
    public static void main(String args[])
    {
        // Problem 1: Java Program to print the elements of an array 
        // Problem 2: Java Program to copy all elements of one array into another array
        /*
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println(arr.length);

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter value");
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Value is first array "+ arr[i]);
        }

        int arr1[] = new int[arr.length];

        for(int i=0; i<arr1.length; i++)
        {
            arr1[i] = arr[i];
        }

       System.out.println("Value in Second Array is"+ Arrays.toString(arr1));
         */

        // Problem 3: Java Program to print the elements of an array in reverse order
        /*
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
        */

        //Problem 4: Java Program to print the elements of an array present on even position
        /*
        int arr[] = {1, 2, 3, 4, 5};
        for(int i=0; i<arr.length; i++)
        {
            if(i%2 == 0)
            System.out.print(arr[i]);
        }
         */

        // Problem 5: Java Program to print the elements of an array present on odd position
        /*
        int arr[] = {1, 2, 3, 4, 5};
        for(int i=0; i<arr.length; i++)
        {
            if(i%2 != 0)
            System.out.print(arr[i]);
        }
         */

        // Problem 6: Java Program to print the number of elements present in an array
        /*
        int arr[] = {1, 2, 3, 4, 5};
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            count++;
        }

        System.out.println("Count is "+ count);
         */

         // Problem 7: Java Program to print the sum of all the items of the array
         /*
        int arr[] = {1, 2, 3, 4, 5};
        int Sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            Sum= Sum+arr[i];
        }
        System.out.println("Sum is "+ Sum);
         */

         //Problem 8: Java Program to Print Odd and Even Numbers from an array
         int arr[] = {1, 2, 3, 4, 5};
         for(int i=0; i<arr.length; i++)
         {
            if(arr[i]%2 == 0)
            {
                System.out.println("Even Number is"+ arr[i]);
            }

            else
            {
                System.out.println("Odd Number is"+ arr[i]);
            }
         }
    }    
}
