class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map_nums1 = new HashMap<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            map_nums1.put(nums1[i], map_nums1.containsKey(nums1[i]) ? map_nums1.get(nums1[i]) + 1 : 1);        //1,2,2,2,3,4,5
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map_nums1.containsKey(nums2[i])) {
                intersection.add(nums2[i]);

                map_nums1.put(nums2[i], (map_nums1.get(nums2[i])) - 1);
                if (map_nums1.get(nums2[i]) == 0) {
                    map_nums1.remove(nums2[i]);
                }
            }
        }
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}