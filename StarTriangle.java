package assignment2.java;

public class StarTriangle {
    public static void main (String[] args){
        int row = 7;
        for(int i=0;i<row;i++) {
            for (int j = 0; j <row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
