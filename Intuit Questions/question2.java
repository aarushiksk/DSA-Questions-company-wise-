import java.util.Arrays;
public class question2 {
    /*You are given an array arr[ ] of size N consisting of only positive integers. Your task is to find the count 
    of special numbers in the array. A number is said to be a special number if it is divisible by at least 1 other element of the array*/
    public static void main(String args[])
    {
        int arr[]={2,3,6};
        System.out.println(countSpecial(arr));
    }
    public static int countSpecial(int arr[])
    {
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i<arr.length-1&&arr[i]==arr[i+1])
              count++;
            else{
                for(int j=0;j<i;j++)
                {
                    if(arr[i]%arr[j]==0)
                    {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
