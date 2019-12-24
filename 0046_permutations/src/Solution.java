import java.util.ArrayList;
import java.util.List;

public class Solution {
    static  List<List<Integer>> listList;

    public static List<List<Integer>> permute(int[] nums) {
        listList = new ArrayList<>();
        permute(nums, new ArrayList<>());
        return listList;
    }

    private static void permute(int[] nums, List<Integer> list) {
        int n = nums.length;
        if (list.size() == n) {
            listList.add(new ArrayList<>(list));
            return;
        }
        for (int num : nums) {
            if (list.contains(num))
                continue;
            list.add(num);
            permute(nums, list);
            list.remove(list.size() - 1);
        }
    }
}
