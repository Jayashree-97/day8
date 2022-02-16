package Day8;

public class LineComparisonUC3 {
    public static void main(String[] args){
        String x1 = "2";
        String x2 = "2";
        String y1 = "2";
        String y2 = "3";
        String xy = new String("x1");

        System.out.println(x1 + " .equals " + x2 + " : " + x1.equals(x2));
        System.out.println(x1 + " .equals " + y1 + " : " + y2.equals (y1));
        System.out.println(y2 + " .equals " + y1 + " : " +  y2.equals(y1));
        System.out.println(x1 + " .equals " + y2 +" : " +  x1.equals(y2));

    }
}


