package Sorting;

public class Shortest_path {

    public static float getshortestpath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if (dir == 's') {
                y--;

            }
            // North
            else if (dir == 'n') {
                y++;
            }
            // West
            else if (dir == 'w') {
                x--;

            }
            // East
            else {
                x++;
            }

        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) (Math.sqrt(x2 + y2));

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getshortestpath(str));
    }
}
