import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    // 把结果集保存在动态规划的数组里
    public static List<String> generateParenthesis(int n) {
        if (n == 0) return new ArrayList<>();

        // 这里dp数组我们把他变成列表，方便调用
        List<List<String>> dp = new ArrayList<>(n);

        List<String> dp0 = new ArrayList<>();
        dp0.add("");
        dp.add(dp0);

        for (int i = 1; i <= n ; i++) {
            List<String> cur = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                // 可能的合法括号数
                List<String> str1 = dp.get(j);
                // 剩下的合法括号数
                List<String> str2 = dp.get(i - 1 - j);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        //枚举右括号的位置
                        cur.add("(" + s1 + ")" + s2);
                    }
                }
            }
            dp.add(cur);
        }
        return dp.get(n);
    }
}
