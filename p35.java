import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p35 {
    public static List<Integer> intersect(int[] nums1, int[] nums2) {
        // Create an empty map to count the number of elements in nums1
        Map<Integer, Integer> nums1Map = new HashMap<>();

        for (int num : nums1) {
            nums1Map.put(num, nums1Map.getOrDefault(num, 0) + 1);
        }

        // Create an empty list to append intersected elements
        List<Integer> result = new ArrayList<>();

        // Iterate through nums2
        // If the same number is present in the map and the count is greater than 0,
        // add the element to the list and decrement the count in the map
        for (int num : nums2) {
            if (nums1Map.containsKey(num) && nums1Map.get(num) > 0) {
                result.add(num);
                nums1Map.put(num, nums1Map.get(num) - 1);
            }
        }

        result.sort();

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 5, 6, 4, 86, 2, 3, 3, 2, 1};
        int[] nums2 = {2, 2, 2, 3, 5, 8, 4, 6, 4, 87, 9};

        List<Integer> intersection = intersect(nums1, nums2);

        System.out.println(intersection);
    }
}
