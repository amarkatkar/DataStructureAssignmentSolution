package com.glearning;

import java.util.Scanner;

public class FloorAssembly {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of floors in the building: ");
        int no = sc.nextInt();

        int arr[] = new int[no+1];

        for (int i = 1; i <= no; i++) {
            System.out.println("enter the floor size given on day : " + i );
            int n = sc.nextInt();
            arr[n] = i;
        }
        int j = no;
        boolean flag;

        System.out.println("The order of construction is as follows");
        for (int i = 1; i <= no; i++) {
            flag = false;
            System.out.println("Day " + i);
            while (j >= 1 && arr[j] <= i) {
                flag = true;
                System.out.print(j + " ");
                j--;
            }
            if (flag == true) {
                System.out.println();
            }
        }
        sc.close();
    }
}
