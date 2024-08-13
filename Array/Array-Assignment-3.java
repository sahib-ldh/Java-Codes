class Tester {
    
    public static int[] findLeapYears(int year) {
        int[] leapYears = new int[15];
        int count = 0;

        // Check if the given year is a leap year
        while (count < 15) {
            if (isLeapYear(year)) {
                leapYears[count] = year;
                count++;
            }
            year++;
        }
        
        return leapYears;
    }

    // Helper method to determine if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2000;
        int[] leapYears = findLeapYears(year);
        for (int index = 0; index < leapYears.length; index++) {
            System.out.println(leapYears[index]);
        }
    }
}

