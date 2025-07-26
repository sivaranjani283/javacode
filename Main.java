import java.util.*;
class Main{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        double distance=sc.nextDouble();
        double time=sc.nextDouble();
        double speedLimit=sc.nextDouble();
        double distanceInMiles=distance / 5280;
        double timeInHour=time / 3600;
        double averagespeed=distanceInMiles / timeInHour;
        if(averagespeed > speedLimit)
        {
            System.out.println("Speeding");
        }
        else
        {
            System.out.println("Not Speeding");
        }
    }
}