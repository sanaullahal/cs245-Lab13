package edu.miu.cs.cs425.lab14unittest.flattenarray.q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//[[1,3], [0], [3,4,5]]
public class ArrayFlattener {
	
	public Integer[] flattenArray(int[][] a_in) {
		if (a_in == null) 
			return null;
        List<Integer> list = new ArrayList<>();
        for (int[] arr : a_in) {
            for (int i : arr) {
                list.add(i);
            }
        }
		return (Integer[]) list.toArray(new Integer[list.size()]);
    }
	
	public int[] flattenArray2(int[][] a_in) {
		if (a_in == null)
			return null;
		return Arrays.stream(a_in)
				.flatMapToInt(arr -> Arrays.stream(arr))
				.toArray();
	}
}
