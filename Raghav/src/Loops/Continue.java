package Loops;

import java.util.Scanner;

public class Continue
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0) continue;
            System.out.print(i + " ");
        }
    }
}