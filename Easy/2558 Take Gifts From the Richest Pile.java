class Solution {
    public long pickGifts(int[] gft, int k) {
        Queue<Integer> max = new PriorityQueue<>((a, b) -> b - a);
        long ans = 0;

        for (int g : gft)
        { max.add(g);
            ans += g;

        }

        for (int i = 0; i < k; i++) {
            int val = max.poll();
            ans = ans - val;
            int rem = (int) Math.sqrt(val);
            ans = ans + rem;
            max.add(rem);
        }

        return ans; }
}