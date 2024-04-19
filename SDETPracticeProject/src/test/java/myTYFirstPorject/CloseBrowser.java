package myTYFirstPorject;

import java.io.IOException;

public class CloseBrowser {
	public static void main(String[] args) throws Exception {
		Runtime runtime = Runtime.getRuntime();

		//Process pro=runtime.exec("taskkill/im firefox.exe/f/t");
		Process pro = runtime.exec("taskkill /im chrome.exe /f /t");
	}
}
