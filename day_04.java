//problem link: https://leetcode.com/problems/ugly-number-ii

// TimeComplexity O(n)
class Solution {

public int nthUglyNumber(int n) {
    if(n<=0)
        return 0;
 
    int list[]=new int[n];
 
    int i=0;
    int j=0;
    int k=0;
    list[0]=1;
    for(int p=1;p<n;p++)
    {
        int m2 = list[i]*2;
        int m3 = list[j]*3;
        int m5 = list[k]*5;
 
        list[p]= Math.min(m2, Math.min(m3, m5));
        
 
        if(list[p]==m2)
            i++;
 
        if(list[p]==m3)
            j++;
 
        if(list[p]==m5)
            k++;
    }
 
    return list[n-1];
}
}