public class Greedy {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        System.out.println("Selected activities:");

        int lastEnd = end[0];
        System.out.print("Activity 1 ");

        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastEnd) {
                System.out.print("Activity " + (i + 1) + " ");
                lastEnd = end[i];
            }
        }
    }
}
