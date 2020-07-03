class Solution {
    int[] prison(int[] a)
    {
        int result[]=new int[8];
        for(int i=1;i<a.length-1;i++)
        {
            if(a[i-1]==a[i+1])
            {
                result[i]=1;
            }
            else
                result[i]=0;
        }
        return result;
    }
    public int[] prisonAfterNDays(int[] cells, int N) {
        int result[] = new int[8];
        
        N%=14;
        if(N==0)
            N=14;
           
        
            for(int x=0;x<N;x++)
            {
                result=prison(cells);
                cells=result;
            }
            
        
        return result;
    }
}