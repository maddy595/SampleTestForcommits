package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleClass2 {

	public static void main(String[] args) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
                //Returns the captured file path
		return destination; */
		String screenshotNmae="test1";
//		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
//		System.out.println(nameofCurrMethod);
//		String destination = System.getProperty("user.dir") + "\\FailedTestsScreenshots\\"+nameofCurrMethod+dateName+".png";
//		System.out.println(dateName);
//		System.out.println(destination);
		System.out.println("Hello World2");
	}

}
