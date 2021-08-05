import java.util.Scanner;

public class practice {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.print ("Please right a string of numbers: ");
        for (int i = 0; i < 10; i++)
        {
            arr[i] = input.nextInt();
            
        }

        /*
        for (int i = 0; i < 10; i++)
        {
            if (arr[i] < 0)
            {
                arr[i] *= -1;
            }
        }
        */
    
        for (int i = 0; i < 10; i++)
        {
            if (arr[i] < 0)
            {
                arr[i] *= -1;
            }
        }



    }
}
