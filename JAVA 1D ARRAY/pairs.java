public class pairs{
    public static int pairArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+ curr + ","+ arr[j] +")" );
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int idx = pairArray(arr);
    }

}