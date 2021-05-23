package dy2488;

import javax.swing.plaf.IconUIResource;

public class test_1 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
        {
            for(int j=1;j<=50;j++)
            {
                for(int k=1;k<=50;k++)
                {
                    if(i+j>k && i+k>j && j+k>i)
                    {
                        if(i*i+j*j==k*k || i*i+k*k==j*j || j*j+k*k==i*i)
                        {
                            continue;
                        }
                        if(i==j && j==k)
                        {
                            continue;
                        }
                        if(i==j || j==k || i==k)
                        {
                            continue;
                        }
                        else
                        {
                            System.out.println(i+"="+j+"="+k);
                        }

                    }
                    else
                    {
                        continue;
                    }
                }
            }
        }
    }
}
