import java.util.Map.Entry;
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] wArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(wArr, (a,b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a-b : Integer.bitCount(a) - Integer.bitCount(b));
        return Arrays.stream(wArr).mapToInt(Integer::intValue).toArray();
    }
}