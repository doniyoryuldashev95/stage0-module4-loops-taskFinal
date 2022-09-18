package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                if (j>=cathetusLength-1-i){
                    System.out.print(cathetusLength-j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j < cathetusLength; j++) {
                if (j<=i){
                    System.out.print(j+1);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
