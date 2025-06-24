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
         /*
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
         */

         //Problem 9: Java Program to find the frequency of each element in the array
         //Problem 10: Java Program to print the duplicate elements of an array
        /*
         int arr[] = {1, 1, 1, 2, 2, 2};
         int fr[] = new int[arr.length];
         int visited = -1;

         for(int i=0; i<arr.length; i++)
         {
            int count = 1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    fr[j] = visited;
                    count++;
                }
            }
            if(fr[i]!=visited)
            {
                fr[i]=count;
            }
         }
        
         System.out.println("The Frequency of elements are:");

         for(int i=0; i<arr.length; i++)
         {
            if(fr[i] != visited)
            {
                System.out.println(arr[i] + "|" + fr[i]);
            }
         }

         System.out.println("The Duplicate elements are:");
         for(int i=0; i<arr.length; i++)
         {
            if(fr[i] != visited)
            {
                System.out.println(arr[i]);
            }
         }
        */

        //Problem 11: Find the Largest Element of the array
        /*
        int arr[] = {1, 2, 3, 4, 5, 6};
        int max=arr[0];

        for(int i=0; i<arr.length; i++)
        {
               if(arr[i] > max)
                {
                    max = arr[i];
                }   
        }

        System.out.println("The largest element is " + max);
         */

        //Probelm 12: Find the Smallest Element of the array
        /*
        int arr[] = {1, 2, 3, 4, 5, 6};
        int min=arr[0];

        for(int i=0; i<arr.length; i++)
        {
               if(arr[i] < min)
                {
                    min = arr[i];
                }   
        }

        System.out.println("The smallest element is " + min);
        */

        //Problem 13: Sorting the array elements in Ascendng Order
        /*
        int arr[]= {5, 8, 3, 2, 8, 9};
        int temp;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted elements in ascending order are");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
         */

        //Problem 14: Sorting the array elements in Descending Order
    
        int arr[]= {5, 8, 3, 2, 8, 9};
        int temp;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted elements in ascending order are");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        

    }    
}
