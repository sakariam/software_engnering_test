package sakariam.itstud.software.modules;

public class leap_year {
    public static int check_Leap_Year(int year)
    {
        boolean yearDiv4 = (year%4==0);
        boolean yearDiv100 = (year%100==0);
        boolean yearDiv400 = (year%400==0);
        boolean yearDiv4000 = (year%4000==0);

        if (((yearDiv4 && !yearDiv100) || yearDiv400) && !yearDiv4000)
            return 1;
        return 0;
    }
}

