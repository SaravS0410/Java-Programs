public class TestingEnvironment {
    public static void main(String[] args) {
        int[] arr = new int[] {10,24,21,15,12};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                //System.out.println("i value "+ i);
                //System.out.println("j value "+ j);
                if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
                
             
            }
        System.out.println(arr[i]);
        }
    }
    
}