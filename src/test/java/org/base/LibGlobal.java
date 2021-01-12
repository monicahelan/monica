package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static JavascriptExecutor jsexecute() {
		js = (JavascriptExecutor) driver;
		return js;

	}

	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void type(WebElement element, String data) {
		try {
			element.sendKeys(data);
		} catch (Exception e) {
			js.executeScript("arguments[0].setAttributes('value','" + data + "'", element);
		}
	}

	public void btnClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			element.submit();
		}
	}

	public void mouseOver(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public void selectByText(WebElement element, String data) {
		Select s = new Select(element);
		try {
			s.selectByVisibleText(data);
		} catch (Exception e) {
			s.selectByValue(data);
		}
	}

	public static String excelRead(String sheetName, int rowNo, int cellNo) throws IOException {

		File file = new File(System.getProperty("user.dir")+"\\Files\\Excel\\inncon.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String value = " ";
		int cellType = cell.getCellType();
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			value = dateFormat.format(dateCellValue);
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}
		return value;
		
	}
	public static void screenshots(String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+"\\Files\\Screenshots\\"+name+".png");
		FileUtils.copyFile(src, file);
	}
}
