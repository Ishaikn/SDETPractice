package myTYFirstPorject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgPractice3 {

		@Test(dataProvider = "Laptops")
		public void getData(String org, String Loc, String Course) {
			System.out.println("Organization----->" + org + "is Located in--->" + Loc + "Course Availabe is" + Course);
		}

		@DataProvider
		public String[][] Laptops() {

			String[][] obj = new String[3][3];
			obj[0][0] = "YogaSlim";
			obj[0][1] = "Lenovo";
			obj[0][2] = "Make in Andhara Pradesh";

			obj[1][0] = "Aspiron";
			obj[1][1] = "Dell";
			obj[1][2] = "Make in Karnataka";

			obj[2][0] = "Aspire";
			obj[2][1] = "Acer";
			obj[2][2] = "Make in Tamil Nadu";

			return obj;

		}
	}
