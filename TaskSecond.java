// 2. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
// а остальные - равны ему.

package HomeworkJava;

import java.util.Arrays;
public class TaskSecond {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        swap(nums, val); 
        System.out.println(Arrays.toString(nums)); 
        for (int x : nums) {
            System.out.print(x + " "); 
        }
    }

    static void swap(int[] array, int val) {
        int size = array.length; 
        int shift = 1; 
        for (int i = 0; i < size - shift; i++) { 
            while (array[size - shift] == val) { 
                shift++;
            }

            if (array[i] == val) { 
                int tmp = array[i];
                array[i] = array[size - shift];
                array[size - shift] = tmp;
                shift++;
            }
        }

    }
} 

