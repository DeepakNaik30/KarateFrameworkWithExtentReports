package examples.users;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance(){
        return extent;
    }

    public static void createInstance(String fileName){
//        platform = getCurrentPlatform();
//        String fileName1 = getReportFileLocation(platform);
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);

        htmlReporter.setAppendExisting(true);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setEncoding("UTF-8");
        htmlReporter.config().setProtocol(Protocol.HTTPS);
        htmlReporter.config().setDocumentTitle("Extent Report Generation from Karate Framework");
        htmlReporter.config().setReportName("Extent Report Generation Demo");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setChartVisibilityOnOpen(false);
        htmlReporter.config().setTimeStampFormat("MM/dd/yyyy hh:mm:ss a");

        extent = new ExtentReports();
        extent.setSystemInfo("Created By", "Deepak Naik");
        extent.setSystemInfo("Browser", "Chrome");
        extent.attachReporter(htmlReporter);
    }

    public static void  initializeExtentReport(){
        System.out.println("Initialize Extent report was called");
        if(ExtentManager.getInstance() == null){
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yy");
            String formattedDate = dateFormat.format(date);
            ExtentManager.createInstance("results/" + "Extent_Report_Demo_" + formattedDate + ".html");
        }
    }
}
