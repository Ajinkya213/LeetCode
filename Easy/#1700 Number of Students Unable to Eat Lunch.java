class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();

        for (int student : students) {
            queue.add(student);
        }

        int count = 0;

        for (int i = 0; i < sandwiches.length;) {
            if (queue.peek() == sandwiches[i]) {
                queue.poll();
                i++;
                count = 0;
            } else {
                int student = queue.poll();
                queue.offer(student);
                count++;
            }


            if (count == queue.size()) {
                break;
            }
        }

        return queue.size();
    }
}
