package Day8;

public class LineComparisonUC2 {
        public static void main(String[] args) {
            String x1 = "2";
            String x2 = "2";
            String y1 = "2";
            String y2 = "2";
            String xy = new String("x1");
            System.out.println(x1 + " == " + x2 + " : " + (x1 == x2));
            System.out.println(x1 + " == " + y1 + " : " + (x1 == y1));
            System.out.println(x2 + " == " + y2 + " : " + (x2 == y2));
            System.out.println(x1 + " == " + y2 + " : " + (x1 == y2));
        }
}

