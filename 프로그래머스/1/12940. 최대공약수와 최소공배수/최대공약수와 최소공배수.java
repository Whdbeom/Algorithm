class Solution {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = findGCD(n, m);

        answer[1] = n * m / answer[0];

        return answer;
    }

    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}