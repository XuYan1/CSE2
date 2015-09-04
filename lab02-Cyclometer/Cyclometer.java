// Xu Yan
// lab02-Cyclometer
// Bicycle cyclometer program
//
// This program takes the time of each of the 2 trips and the number of times 
// the front wheel rotated to calculate the length of each trip, the number of 
// counts of each trip, the distance of each trip, and the distance of both 
// trips added together

public class Cyclometer{
    
    // main method required for all Java programs
    
public static void main(String[] args){
    
    // variable declaration
    
    double secsTrip1=480;       // the length of trip 1 is 480 seconds
    double secsTrip2=3220;      // the length of trip 2 is 3220 seconds
    int countsTrip1=1561;       // the wheel rotated 1561 times in trip 1
    int countsTrip2=9037;       // the wheel rotated 9037 times in trip 2
    
    // constant declaration
    
    double wheelDiameter=27.0;  // the diameter of the wheel is 27 inches
    double PI=3.14159;          // the value of pi
    int feetPerMile=5280;       // convertion from feet to mile
    int inchesPerFoot=12;       // convertion from inches to feet
    int secondsPerMinute=60;    // convertion from seconds to minute
    
    // output variable declaration

    double distanceTrip1;       // distance of trip 1
    double distanceTrip2;       // distance of trip 2
    double totalDistance;       // total distance of both trips
    
    // printing trip times and counts
    
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+ 
        " minutes and had "+countsTrip1+ " counts.");
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+ 
        " minutes and had "+countsTrip2+ " counts.");
    
    // calculating trip distances
    
    distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;     
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
    totalDistance=distanceTrip1+distanceTrip2;
    
    // printing trip distances
    
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
}
}