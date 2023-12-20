class BinarSearch{
public static void main(String[] args) {
    int a[]={2,4,6,8,8,9,11,14,34,45,67};
    int target=8;
    int st=0;
    int end=a.length-1;
    int mid;
    while(st<=end){
        mid=st+(end-st)/2;
        if(a[mid]==target){
            System.out.println("target is at index: "+mid);
            //one occurencemeank break here
            //break;
            st=mid+1;// Move to the right to find other occurrences
        
        }
        else if(a[mid]>target){
            end=mid-1;
        }
        else if(a[mid]<target){
            st=mid+1;
        }
    }
}
}