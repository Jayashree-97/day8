package Day8;

public class LineComparisonUC4 {
    public static void main(String[] args){
        String x1 = "2";
        String x2 = "2";
        String y1 = "3";
        String y2 = "2";
        String xy = new String("x1");

// comaparing
        System.out.println(x1 + " .compareTo " + x2 + " : " + x1.compareTo(x2));
        System.out.println(x1 + " .compareTo " + y1 + " : " + y2.compareTo(y1));
        System.out.println(y2 +" .compareTo " + y1 + " : " + y2.compareTo(y1));
       System.out.println(x1 + " .compareTo " + y2 +" : " + x1.compareTo(y2));
    }
}
