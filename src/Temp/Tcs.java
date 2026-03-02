package Temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Tcs {

    public static void  main(String args[]) throws IOException {
        // 1,2,3,4,5

//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      String input = br.readLine();

        String input = new Scanner(System.in).nextLine();

        //spliting
        String parts[] = input.split(",");

        int arr1[] = new int[parts.length];
        int i =0;
        for(String part : parts)
        {
            arr1[i] = Integer.parseInt(part);
            i++;
        }

        //print array
        for(int num : arr1)
        {
            System.out.print(num+ " ");
        }
        System.out.println();


    }
}
