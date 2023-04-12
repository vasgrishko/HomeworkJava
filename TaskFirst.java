package HomeworkJava;

public class TaskFirst {
    public static void main(String[] args) {
       
        int array[] = new int[]{10, 11, 88, 2, 12, 120};
        int max = getMax(array);
        System.out.println("Maximum Value is: "+max);
        int min = getMin(array);
        System.out.println("Minimum Value is: "+min);
    }
         
          
    public static int getMax(int[] inputArray){ 
        int maxValue = inputArray[0]; 
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){ 
                maxValue = inputArray[i]; 
            } 
        } 
        return maxValue; 
    }
         
          
    public static int getMin(int[] inputArray){ 
        int minValue = inputArray[0]; 
        for(int i=1;i<inputArray.length;i++){ 
            if(inputArray[i] < minValue){ 
                minValue = inputArray[i]; 
            } 
        } 
        return minValue; 
    } 
}   
        
        
        
        
//         getRandomArr(10);
//         getMinMaxElArr;
//     }
          
//     public static void getRandomArr(int size) {
//         int[] arr = new int[size];
//         Random random = new Random();
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = random.nextInt(100);
//         }
//         System.out.println(Arrays.toString(arr));
//     } 
    
//     public static void getMinMaxElArr(int [] Array) {
//         int MinEl = Array[0];
//         int MaxEl = Array[0];
//         for (int num : Array) {
//             if (num < MinEl) {
//                 MinEl = num;

//             if (num > MaxEl && num > MinEl) {
//                 MaxEl = num;
//             }
//             }
//         }
//         System.out.println(Arrays.toString(Array));
//         System.out.printf("Минимальное значение %s", MinEl);
//         System.out.printf("Максимальное значение %s", MaxEl);
//     }
// }



   



