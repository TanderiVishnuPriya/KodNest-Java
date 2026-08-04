public class ProgressReport {
    public static void main(String[] args) {
        int completedTopics = 17;
        int totalTopics = 20;
        int dailyLHours = 3;
        int learningDays = 5;
        int remTopics = totalTopics - completedTopics;
        int weeklyLHours = dailyLHours * learningDays;
        double percentage = (double) completedTopics * 100 / totalTopics;
        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + remTopics);
        System.out.println("Weekly Learning Hours: " + weeklyLHours);
        System.out.println("Progress Percentage: " + percentage);
    }
}