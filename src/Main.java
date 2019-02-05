public class Main {

    public static void main(String[] args) {

        int[] values = new int[] {11, 13, 4 ,14, 9, 22};
        ClosestPoints points = new ClosestPoints();
        int[] closest = points.bruteForce(values);

        System.out.println(values[closest[0]]);
        System.out.println(values[closest[1]]);


        int[] orderedValues = new int[] {11, 13, 4 ,14, 9, 22};//{7, 18, 22 ,100, 104};
        closest = points.refineForce(orderedValues);

        System.out.println(orderedValues[closest[0]]);
        System.out.println(orderedValues[closest[1]]);

    }


}
