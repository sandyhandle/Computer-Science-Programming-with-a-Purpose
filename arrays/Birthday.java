public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // Number of days in a year
        int trials = Integer.parseInt(args[1]); // Number of trials

        int[] counts = new int[n + 1]; // Array to store count of people for each trial

        for (int t = 0; t < trials; t++) {
            boolean[] birthdays = new boolean[n]; // Array to track birthdays

            int peopleCount = 0;
            while (true) {
                int birthday = (int) (Math.random() * n);
                peopleCount++;
                if (birthdays[birthday]) {
                    break;
                }
                birthdays[birthday] = true;
            }

            counts[peopleCount]++;
        }

        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += counts[i];
            double fraction = (double) total / trials;
            System.out.printf("%d\t%d\t%.6f\n", i, counts[i], fraction);
            if (fraction >= 0.5) {
                break;
            }
        }
    }
}
