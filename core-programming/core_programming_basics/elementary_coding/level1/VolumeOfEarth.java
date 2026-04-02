package core_programming_basics.elementary_coding.level1;

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378;
        double volume = (4.0/3.0) * (22.0/7.0) * Math.pow(radius,3);
        System.out.println("Volume of Earth in cubic kilometers is : " + volume + " " + "and in cublic miles is : " + volume/1.6);
    }
}
