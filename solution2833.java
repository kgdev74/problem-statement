public class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, blank = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L') left++;
            else if (ch == 'R') right++;
            else blank++;
        }

        int pos1 = right - (left + blank);

        int pos2 = (right + blank) - left;

        return Math.max(Math.abs(pos1), Math.abs(pos2));
    }
}