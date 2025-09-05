class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
    int Max=Integer.MIN_VALUE;
    int Min=Integer.MAX_VALUE;
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]>Max){
            Max=arr[i];
        }
        if(arr[i]<Min){
            Min=arr[i];
        }
    }
    return new Pair(Min,Max);
    
    
}
}
