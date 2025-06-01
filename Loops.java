public class Loops 
{
    public static void main(String[] args) 
    {


        // PROGRAM 1: FInd if the given number is odd or even number
        /* 
        int num = 11;
        if(num%2 == 0)
        {
            System.out.println("Entered Number "+ num + " is an Even Number");
        }
        else
        {
            System.out.println("Entered Number "+ num + " is an Odd Number");
        }
        */

        // PROGRAM 2: Print all Ntural Numbers from 1 to n
        /*
        int n = 10;
        int i = 1;

        while(n >= i)
        {
            System.out.println(i);
            i++;
        }
         */

        // PROGRAM 3: Print all Ntural Numbers from 1 to n in reverse
        /*
        int n = 10;
        int i = n;

        while(i != 0)
        {
            System.out.println(i);
            i--;
        }
        */

        //PROGRAM 4: Print all even numbers from 1 to 10
        /* 
        int n=1;
        while(n<=10)
        {
            if (n%2 == 0)
            {
                System.out.println(n);
                n++;
            }
            else
            {
                n++;
            }
         */

        //PROGRAM 5: Print all odd numbers from 1 to 10
        /*
        int n=1;
        while(n<=10)
        {
            if (n%2 != 0)
            {
                System.out.println(n);
                n++;
            }
            else
            {
                n++;
            }
         */
        //PROGRAM 6: Print sum of all natural numbrs from 1 to 10
        /* 
        int num = 10, i = 1, sum = 0;

        while(i<=num)
        {
            sum = sum + i;
            i++;
        } 

        System.out.println(sum);
         */

         //PROGRAM 7: Print sum of all even natural numbrs from 1 to 10
        /* 
         int num = 10, i = 1, sum = 0;

         while(i<=num)
         {
            if(i%2 == 0)
            {
             sum = sum + i;
             i++;
            }
            else
            i++;
         } 
 
         System.out.println(sum);
         */

         //PROGRAM 8: Print sum of all odd natural numbrs from 1 to 10
        /* 
         int num = 10, i = 1, sum = 0;

         while(i<=num)
         {
            if(i%2 != 0)
            {
             sum = sum + i;
             i++;
            }
            else
            i++;
         } 
 
         System.out.println(sum);
         */

         //PROGRAM 9: Check whtehr if the given number is Positive or Negative
        /*
         int num = 0;

         if(num > 0)
         {
            System.out.println("Positive Number");
         }

         else if(num < 0)
         {
            System.out.println("Negative Number");
         } 
        
         else
         {
            System.out.println("Number is Zero");
         }
         */

         //PROGRAM 10: Print 3 Table from 1 to 10
        /*
         int num = 3, value;
         for(int i=1; i<=10; i++)
         {
            value = num * i;
            System.out.println(num + " * " + i + " = " + value);
         }
         */

          //PROGRAM 11: Print 3 Table from 1 to 10 in reverse
        /*
         int num = 3, value;
         for(int i=10; i>=01; i--)
         {
            value = num * i;
            System.out.println(num + " * " + i + " = " + value);
         }
         */
         
         //PROGRAM 12: Print factorial of given number
        /*
         int num=5, value=1;
         for(int i=num; i>0; i--)
         {
            value = value * i;
         }
         System.out.println(value);
        */

        //PROGRAM 13: Sum of digits
        /*
        int num=500, quotient=num, sum=0, rem;
        while(quotient>0)
        {
            rem = quotient % 10;
            sum = sum + rem;
            quotient = quotient / 10;
        }
        
        System.out.println(sum);
         */

        //PROGRAM 14: Greatest of 3 numbers
        /*
        int a=20, b= 31, c=12;
        
        if(a>b && a>c)
        System.out.println(a);

        else if (b>a && b>c)
        System.out.println(b);

        else
        System.out.println(c);
        */

        //Program 15: Return weekday from Number
        /*
        int value = 14;
        switch(value)
        {
            case 1: 
            System.out.println("Monday");
            break;

            case 2: 
            System.out.println("Tuesday");
            break;
            
            case 3: 
            System.out.println("Wednesday");
            break;

            case 4: 
            System.out.println("Thursday");
            break;

            case 5: 
            System.out.println("Friday");
            break;

            case 6: 
            System.out.println("Saturday");
            break;

            case 7: 
            System.out.println("Sunday");
            break;

            default: System.out.println("Invalid Number");
             */

        //Program 16: Return Number of daya in a month
        
        String value = "April";
        switch(value)
        {
            case "January": 
            System.out.println("31");
            break;

            case "February": 
            System.out.println("28");
            break;
            
            case "March": 
            System.out.println("30");
            break;

            default: System.out.println("Invalid Month");
             
        } 

    }
}
