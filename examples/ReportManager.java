import java.io.FileWriter;
import java.io.IOException;

public class ReportManager {
    public void generateReport(String data) {
        String formatted = data.toUpperCase();

        try (FileWriter writer = new FileWriter("report.txt")) {
            writer.write(formatted);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Sending report by email...");
    }
}