package myTYFirstPorject;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgpractice2 {

	@Test(dataProvider = "Laptops")
	public void getData(String org, String Loc, String Course) {
		System.out.println("Organization----->" + org + "is Located in--->" + Loc + "Course Availabe is" + Course);
	}

	
}
///	public Object [][] data1(){
//		
//		HashMap<String, String> map=new HashMap<String, String>();
//		
//		map.put(null, null);
//		map.put(null, null);
//		Object[][] obj=new Object[2][2];
//		obj[][]=map;
//		
//		return null;
