public class Application {
    static int binarySearch(int[] list,int key){
        int low  = 0;
        int high = list.length -1;
        while(high>=low){
            int mid  = (low + high)/2;
            if(key<list[mid])high = mid -1;
            else if(key == list[mid]) return mid;
            else low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(BinarySearch.list,2));
        System.out.println(binarySearch(BinarySearch.list,11));
        System.out.println(binarySearch(BinarySearch.list,79));
        System.out.println(binarySearch(BinarySearch.list,1));
        System.out.println(binarySearch(BinarySearch.list,5));
        System.out.println(binarySearch(BinarySearch.list,80));
    }
}
