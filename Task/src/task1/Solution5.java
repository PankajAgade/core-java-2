package task1;

class Solution5
{
  public static void main(String[] args) 
  {
    int[] arr1 = {9,12,15,18};
    int[] arr2 = {8,10,13,17};
    int[] arr3 = {5,11,14,16};

    int arr1_len = 0;
    int arr2_len = 0;
    int arr3_len = 0;

    for(int p: arr1)
    {
      arr1_len++;
    }

    for(int p: arr2)
    {
      arr2_len++;
    }

    for(int p: arr3)
    {
      arr3_len++;
    }
    
    minDiffTriplet(arr1, arr2, arr3, arr1_len, arr2_len, arr3_len);
  }

   public static void minDiffTriplet(int[] arr1, int[] arr2, int[] arr3, int arr1_len,int arr2_len, int arr3_len)
   {
       int i = 0;
       int j = 0;
       int k = 0;

       int diff = 10000; 
       int a=0;
       int b=0;
       int c=0;
      while(i<arr1_len && j<arr2_len && k<arr3_len )
      {
        int sum = 0;
        sum = arr1[i] + arr2[j] + arr3[k];

        int max = 0;

        if(arr1[i] < arr2[j] && arr2[j] > arr3[k])
        {
          max = arr2[j];
        }
        else if(arr2[j] < arr1[i] && arr1[i] > arr3[k])
        {
          max = arr1[i];
        }
        else if(arr1[i] < arr3[k] && arr3[k] > arr2[j])
        {
          max = arr3[k];
        }


        int min = 0;

        if(arr1[i] > arr2[j] && arr2[j] < arr3[k])
        {
          min = arr2[j];
        }
        else if(arr2[j] > arr1[i] && arr1[i] < arr3[k])
        {
          min = arr1[i];
        }
        else if(arr1[i] > arr3[k] && arr3[k] < arr2[j])
        {
          min = arr3[k];
        }

      if(min == arr1[i])
      {
        i++;
      }
      else if(min == arr2[j])
      {
        j++;
      }
      else if(min == arr3[k])
      {
        k++;
      }

      if(diff  > (max-min))
      {
        diff  = max - min;
        a = min;
        b = max;
        c = sum - (max+min);
      }

      }
      System.out.println(diff);
      System.out.println(a+" , "+b+" , "+c);
   }
   
}