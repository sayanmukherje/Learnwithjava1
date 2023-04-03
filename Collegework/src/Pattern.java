public class Pattern {
    public static void main(String[] args) {
        System.out.println("Name: Shreasee Ghosh Rollno- 12021004009026");
        System.out.println("****************");
        int size = 7;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("/");
                } else if (i < j && i + j < size - 1) {
                    System.out.print("\\");
                } else if (i > j && i + j > size - 1) {
                    System.out.print("\\");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("*************");
    }
}
