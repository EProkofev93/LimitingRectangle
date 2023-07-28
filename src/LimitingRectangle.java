import java.util.Arrays;

public class LimitingRectangle {
    int x;
    int y;
    String str = "";
    int[][] points = new int[][]{{0,0},{0,0}};


    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    public void getWidth() {
        if (points[0][0] < points[1][0]) {
            int x = points[1][0] - points[0][0];
            System.out.print(x + " ");

        }
        if ((points[0][0] > points[1][0])) {
            int x = points[0][0] - points[1][0];
            System.out.print(x + " ");

        }



    }
    public void getHeight() {
        if (points[1][1] < points[0][1]) {
            int y = points[0][1] - points[1][1];
            System.out.println(y + " ");

        }
        if ((points[1][1] > points[0][1])) {
            int y = points[1][1] - points[0][1];
            System.out.println(y + " ");

        }


    }
    public void getBorders() {
        System.out.println(points[0][1] + ", " + points[1][1] + ", " + points[0][0] + ", " + points[1][0]);



    }
}
