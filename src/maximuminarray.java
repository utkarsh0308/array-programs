public class maximuminarray {
    public static void main(String[] args) {
        int[] arr = {45, 53, 66,108,1,405,1023,14,66};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxval = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
