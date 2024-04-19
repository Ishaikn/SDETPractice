package myTYFirstPorject;

import org.testng.annotations.Test;

public class TestNgAssessmen {
	@Test(dataProviderClass=TestNgAssessmen1.class, dataProvider = "Laptops")
	public void getData(String cmp, String Maker, String design) {
		System.out.println("Organization----->" + cmp + "is Located in--->" + Maker + "Course Availabe is" + design);
	}
//	Test(dataProviderClass=TestNgAssessmen1.class, dataProvider = "Mobiles")
//	public void getData(String org, String Loc, String Course) {
//		System.out.println("Organization----->" + org + "is Located in--->" + Loc + "Course Availabe is" + Course);
//	}

}
