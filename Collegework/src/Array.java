public class Array {
    public static void main(String[] args) {
        System.out.println("Name: Sayan Mukherjee Rollno- 12021004009001");
        int[][][] sourceArray = {
                { {1, 2}, {3, 4} },
                { {5, 6}, {7, 8} }
        };
        int[][][] destinationArray = new int[2][2][2];
        for (int[][] source2DArray : sourceArray) {
            for (int[] source1DArray : source2DArray) {
                for (int i = 0; i < source1DArray.length; i++) {
                    int value = source1DArray[i];
                    destinationArray[i / 2][i % 2][source2DArray == sourceArray[0] ? 0 : 1] = value;
                }
            }
        }
        for (int[][] dest2DArray : destinationArray) {
            for (int[] dest1DArray : dest2DArray) {
                for (int value : dest1DArray) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
