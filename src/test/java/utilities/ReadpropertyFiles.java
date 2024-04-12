package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFiles {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("/home/wadmin/eclipse-workspace/Scinner_TestAutomationFramework/src/test/resources/configfiles/config.properties");
		Properties p = new Properties();
		p.load(fr);

	}	

}
