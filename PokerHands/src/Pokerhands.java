import java.util.Scanner;
import java.util.Arrays;





public class Pokerhands {

    public static int checkTwoPair (int arr[], int pairStart)
    {
        int pairCount = 1;
        if (arr[pairStart + 2] == arr[pairStart + 3] || arr[pairStart + 3] == arr[pairStart + 4])
        {
            
            pairCount = 2;

            if ((arr[pairStart + 2] == arr[pairStart + 3]) == (arr[pairStart + 3] == arr[pairStart + 4]))
            {
                pairCount = 4;
            }
            
        }
        return pairCount;
    }

    public static int checkSame (int arr[])
    {

        int pairCounter = 0;
        int pairStart = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if(i + 1 < arr.length)
            {
            if(arr[i] == arr[i + 1])
            {
                pairCounter = 1;
                pairStart = i;

                if(arr[i + 1] == arr[i + 2] && (i + 2) < arr.length)
                {
                    pairCounter = 3;
                    if(checkTwoPair(arr, i) == 2)
                    {
                        pairCounter = 4;
                    }
                    if(arr[i + 2] == arr[i + 3] && (i + 3) < arr.length)
                    {
                        pairCounter = 5;
                    }
                }
                break;
            }
        }
        }

        if (pairStart < (arr.length - 2) && pairCounter == 1)
        {
            pairCounter = checkTwoPair(arr, pairStart);
        }

        return pairCounter;
    }

    public static boolean checkStraight (int arr[])
    {
        int start = arr[0];
        boolean check = true;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] == start + 1)
            {
                start = arr[i];
            }
            else
            {
                i = arr.length;
                check = false;
            }
        }
        return check;
    }


    static public void main (String[] args)
    {
        //variables
        Scanner input = new Scanner(System.in);
        int handSize = 5;
        int hand[] = new int[handSize];

        //input and sort
        System.out.print ("Please enter 5 numbers(1-9): ");
        for (int i = 0; i < handSize; i++)
        {
            System.out.print ("Card " + (i + 1) + ": ");
            hand[i] = input.nextInt();
            while(hand[i] > 9)
            {
                System.out.print("Please enter a number between 1 and 9: ");
                hand[i] = input.nextInt();
            }
        } 
        Arrays.sort(hand);

        //checks
        if(checkSame(hand) == 1)
        {
            System.out.print("its a pair!");
        }
        else if (checkSame(hand) == 2)
        {
            System.out.print("its two pairs!");
        }
        else if (checkSame(hand) == 3)
        {
            System.out.print("its three of a kind!");
        }
        else if (checkSame(hand) == 4)
        {
            System.out.print("its full house!");
        }
        else if (checkStraight(hand))
        {
            System.out.print("Its a straight!");
        }
        else if (checkSame(hand) == 5)
        {
            System.out.print("its four of a kind!");
        }
        else
        {
            System.out.print("Its a high card! " + hand[4]);
        }


    }
}
