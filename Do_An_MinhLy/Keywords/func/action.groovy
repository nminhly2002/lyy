package func

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class action {

	/**
	 * Đăng nhập hệ thống
	 * @param username: Username đăng nhập hệ thống
	 * @param password: Tên user bên góc phải phía trên của chương trình
	 */
	public static void login (String username, String password) {
		
		'Mở trình duyệt'
		WebUI.openBrowser('')
		
		'Phóng to cửa sổ màn hình'
		WebUI.maximizeWindow()
		
		WebUI.navigateToUrl(GlobalVariable.bUrl)
		
		'Nhập email'
		WebUI.setText(findTestObject('events/btnEmail'), username)
		
		'Nhập mật khẩu'
		WebUI.setText(findTestObject('events/btnPassword'), password)
		
		'Click vào checkbox "Tôi không phải Robot"'
		WebUI.click(findTestObject('events/chkRobot'))
		
		'Click Submit'
		WebUI.click(findTestObject('events/btnSubmit'))
	}
}
