public class subarray {
    public static int subarrayPrint(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=1;j<arr.length;j++){
                int end = j;
                for(int k = start; k < end; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        subarrayPrint(arr);
    }

    
}
