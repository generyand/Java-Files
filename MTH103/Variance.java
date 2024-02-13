public class Variance {

    public static void main(String[] args) {
        double[][] nums = {
                { 1, (double) 1 / 6 },
                { 2, (double) 1 / 6 },
                { 3, (double) 1 / 6 },
                { 4, (double) 1 / 6 },
                { 5, (double) 1 / 6 },
                { 6, (double) 1 / 6 }
        };

        System.out.printf("Variance: %.4f\n", variance(nums));
        System.out.printf("Standard Deviation: %.4f\n", standardDev(nums));
    }

    static double sum(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][0];
        }
        return sum;
    }

    static double mean(double[][] arr) {
        return sum(arr) / arr.length;
    }

    static double variance(double[][] arr) {
        double result = 0;
        double mean = mean(arr);
        for (int i = 0; i < arr.length; i++) {
            result += Math.pow(arr[i][0] - mean, 2) * arr[i][1];
        }
        return result;
    }

    static double standardDev(double[][] arr) {
        return Math.sqrt(variance(arr));
    }
}