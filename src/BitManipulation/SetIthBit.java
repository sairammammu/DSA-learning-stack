package BitManipulation;

/*
Set the i-th Bit of a Number
Description

You are given an integer N and an integer i.
Your task is to set the i-th bit (0-based indexing) of the number N.
If the i-th bit is already set, the number should remain unchanged.

Input
Integer N
Integer i (0 ≤ i ≤ 31)
Output
The new integer obtained after setting the i-th bit of N

algo:
Convert the given number N into its binary representation.
Start counting bits from the rightmost bit as index 0.
Move to the i-th position in the binary representation.
Check the value of the bit at position i:
If it is 0, change it to 1.
If it is already 1, leave it unchanged.
Convert the modified binary number back into a decimal number.
Output the resulting number.

 */

import java.util.Scanner;

public class SetIthBit {

    private static void setIthBit(int num,int i)
    {
            int result = (num|(1<<i));
            System.out.println(result);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i= sc.nextInt();
        setIthBit(num,i);
    }
}

