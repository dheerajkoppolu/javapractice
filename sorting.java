//sorting of elements in the array
import java.util.Arrays; 
public class sorting {
public static void main(String[] args){   
    
    int[] my_array1 = {
            1,5,3,8,55,66,11,0,4};
            
    String[] my_array2 = {
            "Java",
			
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };        
    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
    
    System.out.println("Original string array : "+Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}
