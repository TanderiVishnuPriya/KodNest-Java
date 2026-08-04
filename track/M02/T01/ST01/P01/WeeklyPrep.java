public class WeeklyPrep {
    public static void main(String[] args) {
        // Convert the given pseudocode into Java code
        int javaHoursPD = 2;
        int aptitudeHoursPD = 1;
        int prepDays = 5;
        int javaW = javaHoursPD * prepDays;
        int aptitudeW = aptitudeHoursPD * prepDays;
        int total = javaW + aptitudeW;
        System.out.println("Java: " + javaW);
        System.out.println("Aptitude: " + aptitudeW);
        System.out.println("Total: " + total);
    }
}
