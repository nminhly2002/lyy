import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import func.action 


'Đăng nhập hệ thống'
action.login(username, password)

'Kiểm tra đăng nhập thành công'
WebUI.verifyElementVisible(findTestObject('events/txtName'))

'Click Events'
WebUI.click(findTestObject('events/btnEvents'))


'--------------------------------------Tạo Event---------------------------------------'
'Click Add Events'
WebUI.click(findTestObject('events/btnAddEvents'))

'Kiểm tra hiển thị dialog AddEvents'
WebUI.verifyElementVisible(findTestObject('events/txtAddEvents'))

'Nhập Title'
WebUI.setText(findTestObject('events/intTitle'), title)

'Nhập Description'
WebUI.setText(findTestObject('events/intDescription'), description)

'Nhập Ngày bắt đầu'
WebUI.setText(findTestObject('events/intStartDate'), startDate)

'Nhập Thời gian bắt đầu'
WebUI.setText(findTestObject('events/intStartTime'), startTime)

'Nhập Ngày kết thúc'
WebUI.setText(findTestObject('events/intStartDate'), endDate)

'Nhập Thời gian kết thúc'
WebUI.setText(findTestObject('events/intStartTime'), endTime)

'Nhập khu vực'
WebUI.setText(findTestObject('events/intLocation'), location)

'Chọn Client'
WebUI.click(findTestObject('events/ddlClient'))

WebUI.click(findTestObject('events/selectDdl', ['name' : nameClient]))

'Chọn radio button Share With All'
WebUI.click(findTestObject('events/rdbShareWith'))

'Chọn check box Repeat'
WebUI.click(findTestObject('events/chkRepeat'))

'Chọn thời gian nhắc lại'
WebUI.click(findTestObject('events/selectDdl', ['name' : timeRepeat]))

'Click button Save'
WebUI.click(findTestObject('events/btnSave'))

'Kiểm tra sự kiện hiển thị thành công'
WebUI.verifyElementVisible(findTestObject('events/txtTitleEvent', ['nameTitle' : title]))


'--------------------------------------Chỉnh sửa Event------------------------------------'
'Click vào sự kiện vừa tạo'
WebUI.click(findTestObject('events/txtTitleEvent', ['nameTitle' : title]))

'Kiểm tra hiển thị dialog Event Details'
WebUI.verifyElementVisible(findTestObject('events/txtEventDetails'))

'Click button Edit Event'
WebUI.click(findTestObject('events/btnEdit'))

'Click button Save'
WebUI.click(findTestObject('events/btnSave'))


'--------------------------------------Xóa Event------------------------------------'
'Click vào sự kiện vừa tạo'
WebUI.click(findTestObject('events/txtTitleEvent', ['nameTitle' : title]))

'Kiểm tra hiển thị dialog Event Details'
WebUI.verifyElementVisible(findTestObject('events/txtEventDetails'))

'Click button Delete'
WebUI.click(findTestObject('events/btnDelete'))

'Click button Yes'
WebUI.click(findTestObject('events/btnYes'))













