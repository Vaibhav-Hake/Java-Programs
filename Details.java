class SelectionSort
{ 
    public static void main(String[]args)
  {
    int[]arr={5,8,7,6,2,4};
    selection(arr);
   //System.out.println(Arrays.toString(arr)); 
System.out.println( selection(arr));   
  } 
  static void selection(int []arr){
    for(int i=0;i<arr.length;i++){
       int last=arr.length-i-1;
       int maxIndex=maxindex(arr,0,last);
       swap(arr,maxIndex,last);
       } 
     }
static int maxindex(int []arr,int start,int end){
    int max=start;
    for(int i=0;i<=end;i++){
        if(arr[start]<arr[i]){
          start=i;
}
}
return max;
}
  static void swap(int[]arr,int first,int end)
{ 
   int temp=arr[first];
  arr[first]=arr[end];
 arr[end]=temp;
 }
}