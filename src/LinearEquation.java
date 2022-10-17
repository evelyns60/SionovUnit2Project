public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this. y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance() {
        double distance = 	Math.sqrt(Math.pow((double)x2 - x1, 2) + Math.pow((double)y2 - y1, 2));
        return distance;
    }


}
