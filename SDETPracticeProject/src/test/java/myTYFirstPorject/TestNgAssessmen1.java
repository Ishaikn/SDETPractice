package myTYFirstPorject;

import org.testng.annotations.Test;

public class TestNgAssessmen1 {
	@Test
	public Object[][] Laptops() {

		Object[][] obj = new Object[3][3];
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
	public Object[][] Mobiles(){

		Object[][] obj = new Object[3][3];
		obj[0][0] = "S1Pro";
		obj[0][1] = "Vivo";
		obj[0][2] = "Make in Andhara Pradesh";

		obj[1][0] = "Aspiron";
		obj[1][1] = "Samsung";
		obj[1][2] = "Make in Karnataka";

		obj[2][0] = "Aspire";
		obj[2][1] = "Milton";
		obj[2][2] = "Make in Tamil Nadu";

		return obj;

	}
}
