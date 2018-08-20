import java.util.*;
public class sumofprimefactor {
    public static void main(String[] args)
    {
        int n;
        boolean flag=false;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int sum=0,factor=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                factor=i;
                flag=false;
                for(int j=2;j<factor/2;j++)
                {
                    if(factor%j==0) {
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    sum+=factor;
                    System.out.println(factor);
                }
            }
        }
        System.out.println(sum);
    }
}
