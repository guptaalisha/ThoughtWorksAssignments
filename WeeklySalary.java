package com.thoughtworks;
import java.util.*;
public class WeeklySalary {

    public static int calculateWeeklySal(int [] dailyHrs){
        int weeklySal=0;
        int totalWeekHrs=0;
        //calculate salary from Monday to Friday
        for(int i=1;i<6;i++){
            totalWeekHrs+=dailyHrs[i];
            weeklySal += dailyHrs[i]*100;
            if(dailyHrs[i]>8)
                weeklySal += (dailyHrs[i]-8)*15;
        }
        //if weekly working hrs is more than 40, extra Rs25
        if(totalWeekHrs>40)
            weeklySal += (totalWeekHrs-40)*25;
        //25% bonus if working on saturday
        weeklySal += dailyHrs[6]*125;
        //50% bonus if working on sunday
        weeklySal += dailyHrs[0]*150;
        return weeklySal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dailyHrs[] = new int[7];
        System.out.println("Enter daily working hours: ");
        for(int i=0;i<7;i++) {
            dailyHrs[i] = sc.nextInt();
        }
        System.out.println("Jeevitha's Weekly Salary is: "+calculateWeeklySal(dailyHrs));
    }
}
