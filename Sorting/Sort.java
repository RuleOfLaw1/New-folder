import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int numbers[] = { 7,3,5,2,3,1,5,8};
        var sorter = new Sort();
        sorter.insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    };
// Linear: O(n) for best case and Quadratic: O(n2) for worst case scenarios
    public void insertionSort(int[] array){
        for(var i = 1; i < array.length; i++){ // iterate over array objects
            var current = array[i]; // store the current item in the variable, current
            
            var j = i - 1; // start iteration from the prev. item in the array
            while(j >= 0 && array[j] > current){// check if the prev. item is > current item 
                array[j + 1] = array[j]; //shift items in the array > current to the right hand side
                j--; // decrement j
            }
            array[j + 1] = current; // store the current item @ index j+1
        }
        
    }
    
}