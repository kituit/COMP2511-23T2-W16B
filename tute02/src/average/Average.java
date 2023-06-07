package average;

public class Average {
    /**
     * Returns the average of an array of numbers
     *
     * @param nums the array of integer numbers
     * @return the average of the numbers
     */
    public float computeAverage(int[] nums) {
        float result = 0;
        for (Integer num: nums) {
            result += num;
        }
        return result / nums.length;
    }

    public static float computeAverageStatic(int[] nums) {
        float result = 0;
        for (Integer num: nums) {
            result += num;
        }
        return result / nums.length;
    }

    public static void main(String[] args) {
        
        int[] nums = { 1, 2, 3, 4 };

        // Non Static: Method is tied to an Average object
        // so we can only access the method via an object
        Average average = new Average();
        float result1 = average.computeAverage(nums);

        // Static: Method is tied to the Average class
        // so we can access the method by just referencing the class it is
        // part of
        float result2 = Average.computeAverageStatic(nums);
        // object.method()

    }

}
