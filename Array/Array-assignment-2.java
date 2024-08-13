class Tester {

    public static double[] findDetails(double[] salary) {
        if (salary == null || salary.length == 0) {
            return new double[]{0, 0, 0}; // Handle edge case for empty or null array
        }

        double total = 0;
        int countGreater = 0;
        int countLesser = 0;
        int n = salary.length;

        // Calculate the total sum
        for (double s : salary) {
            total += s;
        }

        // Calculate the average salary
        double averageSalary = total / n;

        // Count salaries greater than and lesser than the average
        for (double s : salary) {
            if (s > averageSalary) {
                countGreater++;
            } else if (s < averageSalary) {
                countLesser++;
            }
        }

        // Return the result as an array
        return new double[]{averageSalary, countGreater, countLesser};
    }

    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: " + details[0]);
        System.out.println("Number of salaries greater than the average salary: " + (int)details[1]);
        System.out.println("Number of salaries lesser than the average salary: " + (int)details[2]);
    }
}
