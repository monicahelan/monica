 package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
public  static void generateJvm(String json) {
	File file=new File("C:\\Users\\Dell\\eclipse-workspace\\Lennox\\src\\test\\resources\\Reports");
Configuration config=new Configuration(file, "Lennox");
config.addClassifications("projectname", "Lennox");
config.addClassifications("browser", "chrome");
config.addClassifications("browserversion", "87");
List<String>li=new ArrayList<String>();
li.add(json);
ReportBuilder builder=new ReportBuilder(li, config);
builder.generateReports();
}


}
