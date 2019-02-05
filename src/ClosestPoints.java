import java.util.Arrays;

public class ClosestPoints {

    /**
     * A Brute Force method to return the closest points in an array of n elements
     * Complexity of the algorithm is O(n^2)
     * @param values - set of values to find the ones which are closest
     * @return int[] - index of the closest elements at [0], [1]
     */
    public int[] bruteForce(int values[]) {

        // Initialize variables
        int length = values.length;
        int minDistance = Integer.MAX_VALUE;
        int closestIndex[] = new int[2];

        // Compare all elements by looping through the array twice
        for (int i = 0; i < length; ++i)
            for (int j = i+1; j < length; ++j)
                // keep the pair of values if a smallest distance is found.
                if (Math.abs(values[i] - values[j]) < minDistance) {
                    minDistance = Math.abs(values[i] - values[j]);
                    closestIndex[0] = i;
                    closestIndex[1] = j;
                }

        // Return closest indices.
        return closestIndex;
    }



    /**
     * A more refine way to find the solution would be to first order the list
     * and then just compare adjacent elements.
     * Complexity of the algorithm is O(n * log(n))
     * @param values - set of values to find the ones which are closest
     * @return int[] - index of the closest elements at [0], [1]
     */
    public int[] refineForce(int values[]) {

        // Initialize variables
        int length = values.length;
        int minDistance = Integer.MAX_VALUE;
        int closestIndex[] = new int[2];

        // Order the array
        Arrays.sort(values);

        // Loop once through the ordered array
        for(int i = 0; i < length - 1; i++) {
            if (Math.abs(values[i] - values[i+1]) < minDistance) {
                minDistance = Math.abs(values[i] - values[i+1]);
                closestIndex[0] = i;
                closestIndex[1] = i+1;
            }
        }

        // Return closest indices.
        return closestIndex;
    }





}
