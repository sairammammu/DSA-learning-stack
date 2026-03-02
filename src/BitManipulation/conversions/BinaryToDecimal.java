package BitManipulation.conversions;

import java.util.Scanner;

public class BinaryToDecimal {

    private static void binary2Decimal(String binary) {

        int len = binary.length();
        long powerOftwo = 1;
        long decimal = 0;
        for(int i=len-1;i>=0;i--)
        {
            char ch = binary.charAt(i);

            if(ch=='1')
            {
                decimal+=powerOftwo;
            }
            powerOftwo = powerOftwo*2;
        }

        System.out.println(decimal);

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String binary = "1011";
        binary2Decimal(binary);



    }


}
