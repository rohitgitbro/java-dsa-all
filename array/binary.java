//import java.util.*;
// binary search

public class binary
{   
    public static int binarySearch(int numbers[], int key)
    {
        int start = 0, end=numbers.length - 1;
        while(start <= end)
        {
            int mid = (start + end / 2);

            //comparisons
            if(numbers[mid] == key)//found
            return mid;

            if(numbers[mid]<key) // right
            start = mid + 1;
            else end = mid - 1; // left
    


        }
        return -1;

    }
    public static void main(String args[])
    {
        int numbers[] = {2,4,6,8,10,12};
        int key = 10;

        System.out.println("index for key is : "+binarySearch(numbers,key));
    }
}
