package com.bl.programs;

import java.util.Arrays;
    public class UC3 {
    public static void main(String[] args)
    {
        int arr[] = { 10, 20, 15, 63, 35 };
        Arrays.sort(arr);

        int key = 63;
        int res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");
    }
}
