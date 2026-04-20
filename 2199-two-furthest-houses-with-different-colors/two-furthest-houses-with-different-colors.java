class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int max=0;
        // from first 
        for(int i=0;i<n;i++)
        {
          if(colors[0]!=colors[i])
          {
            max=Math.max(max,i);
          }
        }
        // from last 
         for(int i=0;i<n;i++)
        {
          if(colors[n-1]!=colors[i])
          {
            max=Math.max(max,n-i-1);
          }
        }
        return max;
        
    }
}