package sakariam.itstud.software.modules;

public class Main {
    public static void main(String[] args)
    {
        int year = 2200;
        if (leap_year.check_Leap_Year(year)==1)
            System.out.printf("Year %d is an leap year\n", year);
        else
            System.out.printf("Year %d is not a leap year\n", year);
    }
}