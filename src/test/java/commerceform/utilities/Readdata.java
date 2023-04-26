package commerceform.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readdata {
		
		public static Properties getPropertyObject() throws IOException {

			FileInputStream fp = new FileInputStream("C:/Users/hvanum/eclipse-workspace/commerceform/src/main/resources/config");

			Properties prop = new Properties();

			prop.load(fp);

			return prop;

			}

		public CharSequence getFirstname() throws Exception {
			return getPropertyObject().getProperty("Firstname");
		}

		public CharSequence getlastname() throws IOException {
			return getPropertyObject().getProperty("Lastname");
		}

		public CharSequence getemail() throws IOException {
			return getPropertyObject().getProperty("email");
		}

		public CharSequence getCompantname() throws IOException {
			return getPropertyObject().getProperty("Compantname");
		}

		public CharSequence getpwd() throws IOException {
			return getPropertyObject().getProperty("pwd");
		}

		public CharSequence getconfpwd() throws IOException {
			return getPropertyObject().getProperty("confpwd");
		}

	}


