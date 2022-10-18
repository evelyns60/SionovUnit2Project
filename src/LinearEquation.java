public class LinearEquation {
    private int  x1;
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
        return roundedToHundredth(distance);
    }

    public double slope() {
        double slope = ((double)(y2) - y1)/(x2-x1);
        return roundedToHundredth(slope);
    }

    public double yIntercept() {
        double yIntercept = y2 - (slope() * x2);
        return roundedToHundredth(yIntercept);
    }

    public String equation() {


        if (((double)(y2) - y1)/(x2-x1) % 1 == 0) {        //is it a whole number
            if (yIntercept() == 0) {                       //is y intercept zero
                return "y = " + slope() + "x";
            } else {                                       //is y intercept not zero
                return "y = " + slope() + "x + " + yIntercept();
            }
        } else {                                          //is it a fraction
            int rise = y2 - y1;
            int run = x2 - x1;
            String fractionSlope = rise + "/" + run;
            return "y = " + fractionSlope +  "x + " + yIntercept();
        }

    }

    public String coordinateForX(double xValue) {
        double yValue = slope() * xValue + yIntercept();
        return "(" + xValue + ", " + yValue + ")";
    }

    public String lineInfo() {
        String str = "The two  points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        str += "\nThe equation of the line between these points is: " + equation();
        str += "\nThe slope of this line is: " + slope();
        str += "\nThe y-intercept of this line is: " + yIntercept();
        str += "\nThe distance between the two points is: " + distance();
        return str;
    }

    public double roundedToHundredth(double toRound) {
        return Math.round(toRound*100) / 100.0;
    }
}
