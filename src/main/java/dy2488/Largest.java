package dy2488;

public class Largest {
    public static int larget(int[] list)
    {
        int index,max=Integer.MIN_VALUE;
        for(index=0;index<list.length;index++)
        {
            if(list[index]>=max)
            {
                max=list[index];
            }
        }
        return max;
    }
}
