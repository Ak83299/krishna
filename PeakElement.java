//     public static void main(String[] args)
//     {
//     int[] a = {1,3,1,4,53,3,5};
//     List<Integer> b = new ArrayList<>();

    
//    for (int i = 1; i < a.length-1; i++)
//    {        
//     if(a[i]>a[i+1] && a[i]>a[i-1])
//     {
//       b.add(a[i]);
//     }
//    }
//    System.out.println(b);
// } 
    
// }
public class PeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        PeakElement pe = new PeakElement();
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int peakIndex = pe.findPeakElement(nums);
        System.out.println("Peak element is at index " + peakIndex + ", value: " + nums[peakIndex]);
    }
}
