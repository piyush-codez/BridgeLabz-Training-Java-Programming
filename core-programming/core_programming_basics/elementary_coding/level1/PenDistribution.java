package core_programming_basics.elementary_coding.level1;

public class PenDistribution {
    public static void main(String[] args) {
        int pen = 14;
        int students = 3;
        int remainingPen = pen % students;
        int penPerStu = pen / students;
        System.out.println("Pen per Student is : " + penPerStu + " " + "and the remaining pen are : " + remainingPen );
    }
}
