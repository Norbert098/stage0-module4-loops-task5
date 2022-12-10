package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        for (int i = 0; i < sideLength; i++) { // rows
            for (int j = 0; j < sideLength; j++) { //col
                if (i == sideLength/2 || j == sideLength/2) {
                    System.out.print('8');
                } else
                    System.out.print(' ');
            }
            System.out.println(); //change of row
        }
    }

    public static void main(String[] args) {
        Cross cross = new Cross();
        cross.printCross(3);
    }

}
