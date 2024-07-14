import java.util.Scanner;

public class IdenticalArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] list1 = new int[3][3];
        list1[0][0] = 51;
        list1[0][1] = 25;
        list1[0][2] = 22;
        list1[1][0] = 6;
        list1[1][1] = 1;
        list1[1][2] = 4;
        list1[2][0] = 24;
        list1[2][1] = 54;
        list1[2][2] = 6;
        int[][] list2 = new int[3][3];
        list2[0][0] = 51;
        list2[0][1] = 22;
        list2[0][2] = 25;
        list2[1][0] = 6;
        list2[1][1] = 1;
        list2[1][2] = 4;
        list2[2][0] = 24;
        list2[2][1] = 54;

        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter list2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2[i][j] = input.nextInt();
            }
        }

        if (equals(list1, list2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }

    /** Return true if m1 and m2 are identical */
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }

        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) {
                return false;
            }
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
