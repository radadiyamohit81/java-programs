import java.util.Scanner;
class InvertCount
{
    static int count=0;
    void bst(int a[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int [n1];
        int R[] = new int [n2];
        for (int i=0;i<n1;i++)
        {
            L[i] = a[l + i];
        }
        for (int j=0;j<n2;j++)
        {
            R[j] = a[m + 1+ j];
        }
        int i = 0, j = 0;
        int k = l;
        while(i<n1 && j<n2)
        {

            if (L[i]<=R[j])
            {
                a[k]=L[i];
                i++;

            }
            else
            {
                a[k]=R[j];
                j++;

            }
            k++;

        }

        while(i<n1)
        {
            a[k]=L[i];
            i++;
            k++;

        }
        while(j<n2)
        {
            a[k]=R[j];
            j++;
            k++;

        }
    }

    void sort(int a[], int l, int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            sort(a,l,m);
            sort(a,m+1,r);
            bst(a,l,m,r);
        }

    }
    static void printArray(int a[])
    {
        int n = a.length;
        for (int i=0; i<n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    static void inversioncount(int a[],int n)
    {
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    count++;
                    System.out.println(a[i]+","+a[j]);
                }
            }
        }
        System.out.println("count= "+count);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of array");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Given Array");
        printArray(a);
        inversioncount(a,n);
        InvertCount ob = new InvertCount();
        ob.sort(a, 0, a.length-1);
        System.out.println("\nSorted array");
        printArray(a);

    }
}