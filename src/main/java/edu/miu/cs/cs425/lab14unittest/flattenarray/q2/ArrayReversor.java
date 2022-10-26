package edu.miu.cs.cs425.lab14unittest.flattenarray.q2;

import edu.miu.cs.cs425.lab14unittest.flattenarray.q2.service.ArrayFlattenerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor() {
    }


    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] a_in) {
        if (a_in == null)
            return null;

        List<Integer> list = new ArrayList<>();
        for (int[] arr : a_in) {
            for (int i : arr) {
                list.add(i);
            }
        }
        int[] a_flat = list.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < a_flat.length / 2; i++) {
            Integer temp = a_flat[i];
            a_flat[i] = a_flat[a_flat.length - 1 - i];
            a_flat[a_flat.length - 1 - i] = temp;
        }



        System.out.println(a_flat.toString());
        return a_flat;
    }

//    public static void main(String[] args) {
//        int[][] a_in = new int[][]{{1,3}, {0}, {4,5,9}};
//        int[] a_out = new ArrayReversor().reverseArray(a_in);
//        System.out.println(Arrays.toString(a_out));
//    }


}
