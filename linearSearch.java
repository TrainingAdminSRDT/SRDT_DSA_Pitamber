public class linearSearch {
    public static int LinearSearch(int arr[],int key,int i){
	if(i==arr.length){
		return -1;
	}
	if(arr[i]==key){
		return i;
	}
	return LinearSearch(arr,key,i+1);
}

 public static void main(String[] args) {
int arr[] = {10,45,23,64,12};
int key = 64;
int i = LinearSearch(arr,key,0);
if(i==-1){
	System.out.println("Element not found");
}else{
	System.out.println("Element found at index:"+i);
}
}
}
