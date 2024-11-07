import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int[] dataPoints = new int[100];
        int sum = 0;
        int average = 0;
        int userSearch = 0;
        int numFound = 0;
        int maxIndex = 0;
        int minIndex = 0;


        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rand.nextInt(99)+1;
        }

        for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }

        for(int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }

        average = sum / dataPoints.length;

        System.out.println();
        System.out.println("the sum of all the values is " + sum);
        System.out.println("the average of all the values is " + average);

        userSearch = SafeInput.getRangedInt(in,"input a value:",1,100);

        //findSearch
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(userSearch == dataPoints[i])
                numFound++;
        }
        System.out.println("Found " + numFound + " values matching your search of " + userSearch);

        numFound=0;

        userSearch = SafeInput.getRangedInt(in,"input a value:",1,100);
        //findAll
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(userSearch == dataPoints[i]){
                System.out.println("Found " + userSearch + " at index " + i);
                numFound++;}
        }

        numFound=0;

        userSearch = SafeInput.getRangedInt(in,"input a value:",1,100);
        //findMax
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(userSearch == dataPoints[i])
                maxIndex = i;
                numFound++;
        }
        //findMin
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(userSearch == dataPoints[i]){
                minIndex = i;
            break;}

        }
        System.out.println("The first occurance of number "+userSearch+" is " + minIndex);
        System.out.println("The last occurance of number "+userSearch+" is " + maxIndex);

        System.out.println("Average of dataPoints is: " + SafeInput.getAverage(dataPoints));
    }



}