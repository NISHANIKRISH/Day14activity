package com;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
public class surveymain {
	public static void main(String[] args) {
        List<SurveyReport> surveyReports = new ArrayList<>();
        surveyReports.add(new SurveyReport(1, "Erric", "Mumbai", 100, 10, 20));
        surveyReports.add(new SurveyReport(2, "Ray", "Delhi", 150, 12, 30));
        surveyReports.add(new SurveyReport(3, "Charlie", "Bangalore", 200, 8, 25));

        int maxRequests = surveyReports.stream()
                .mapToInt(SurveyReport::getTotal_connection_request)
                .max()
                .orElse(0);

        System.out.println("Maximum number of requests received: " + maxRequests);

        OptionalDouble averageCompletionTime = surveyReports.stream()
                .mapToDouble(SurveyReport::getNo_of_days_for_request_completion)
                .average();

        if (averageCompletionTime.isPresent()) {
            System.out.println("Average time for request completion: " + averageCompletionTime.getAsDouble());
        } else {
            System.out.println("No data available.");
        }

        double totalAveragePerDay = surveyReports.stream()
                .mapToDouble(SurveyReport::getAverage_request_per_day)
                .sum();

        System.out.println("Total average_request_per_day: " + totalAveragePerDay);
       

        long locationDelhiCount = surveyReports.stream()
                .filter(report -> report.getLocation().equals("Delhi"))
                .count();

        System.out.println("Location count for Delhi: " + locationDelhiCount);
    }





}
