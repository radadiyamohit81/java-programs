class merge
{
    static int bstSort(int arr[], int temp[], int left, int right)
    {
      int mid, inv_count = 0;
      if (right > left)
      {
        mid = (right + left)/2;
        inv_count  = bstSort(arr, temp, left, mid);
        inv_count += bstSort(arr, temp, mid+1, right);
        inv_count += invertbst(arr, temp, left, mid+1, right);
      }
      return inv_count;
    }
    static int invertbst(int arr[], int temp[], int left, int mid, int right)
    {
      int i, j, k;
      int invcount = 0;
      
      i = left; 
      j = mid;  
      k = left; 
      while ((i <= mid - 1) && (j <= right))
      {
        if (arr[i] <= arr[j])
        {
          temp[k++] = arr[i++];
        }
        else
        {
          temp[k++] = arr[j++];
          invcount = invcount + (mid - i);
        }
      }
      while (i <= mid - 1)
        temp[k++] = arr[i++]; 
      while (j <= right)
        temp[k++] = arr[j++];
      for (i=left; i <= right; i++)
        arr[i] = temp[i];     
      return invcount;
    }
    public static void main(String[] args) 
    {
        int arr[] = new int[]{1, 20, 6, 4, 5};
        int count= bstSort(arr, temp, 0, 5 - 1);
        System.out.println("the number of inversion is = "+count);
    }
    }
}
