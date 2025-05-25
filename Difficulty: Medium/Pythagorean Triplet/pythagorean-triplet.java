class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            m.put(arr[i]*arr[i],i);
            arr[i]=arr[i]*arr[i];
        } 
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            int sum=arr[i]+arr[j];
            if(m.containsKey(sum))
                return true;
            }
        }return false;
    }
}