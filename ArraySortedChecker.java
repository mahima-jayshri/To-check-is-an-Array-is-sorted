public class ArraySortedChecker{
    public static void main(String[] args)
    {
        int arr1[]={1,2,3,4};
        System.out.println(isSorted(arr1));
        int arr2[]={13,18,3};
        System.out.println(isSorted(arr2));

    }

    static boolean isSorted(int arr[])
    {
       for(int i=0; i<(arr.length-1);i++)
       {
        if (arr[i]>arr[i+1])
        {
           return false;
        }
    }
    return true;
       
    } 
    
}
