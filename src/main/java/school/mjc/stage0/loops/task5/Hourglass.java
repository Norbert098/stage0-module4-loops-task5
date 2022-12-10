package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        for (int i = 0; i < height; i++) {
            if (i<height/2) {
                for (int j = 0; j < height; j++) {
                    if (j >= i && j <= height - (i + 1))
                        System.out.print(8);
                    else
                        System.out.print(" ");
                }
            } else{
                for (int j = height; j > 0; j--) {
                    if (j > height - (i + 1) && j <= i+1)
                        System.out.print(8);
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(5);
    }
}

