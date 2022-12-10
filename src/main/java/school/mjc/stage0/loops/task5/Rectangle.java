package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        for (int i = 0; i < height; i++) { // rows
            for (int j = 0; j < length; j++) { //col
                if (i == 0 || i == height - 1 || j == 0 || j == length - 1) {
                    System.out.print('8');
                } else
                    System.out.print(' ');
            }
            System.out.println(); //change of row
        }

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.printRectangleFrom8s(5, 6);
    }
}
