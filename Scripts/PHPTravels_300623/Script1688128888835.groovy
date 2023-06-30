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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://phptravels.net/')

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS/a_Details'))

WebUI.click(findTestObject('Object Repository/Page_Hotel Movenpick Grand Al Bustan/button_Book Now'))

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_Personal Information_userfirst_name'), 'Yunita')

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_First Name_userlast_name'), 'Sugiarto')

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_Last Name_useremail'), 'yunitasugiartoo@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_Email_userphone'), '082233692412')

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_Phone_useraddress'), 'Malang, Indonesia')

WebUI.click(findTestObject('Object Repository/Page_Bookings/button_United States'))

WebUI.click(findTestObject('Object Repository/Page_Bookings/a_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bookings/select_Select Nationality'), 'ID', true)

WebUI.click(findTestObject('Object Repository/Page_Bookings/button_United States_1'))

WebUI.click(findTestObject('Object Repository/Page_Bookings/a_Indonesia_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bookings/select_Select Country'), 'ID', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bookings/select_Mr                        Miss      _9f97ff'), 
    'Miss', true)

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_Title_firstname_1'), 'Yunita')

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_First Name_lastname_1'), 'Sugiarto')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bookings/select_Mr                        Miss      _9f97ff_1'), 
    'Mr', true)

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_Title_firstname_2'), 'Kim')

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_First Name_lastname_2'), 'Mingyu')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bookings/select_1                                   _545fd7'), 
    '7', true)

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_Age_child_firstname_1'), 'Ji')

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_First Name_child_lastname_1'), 'Changmin')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bookings/select_1                                   _545fd7_1'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_Age_child_firstname_2'), 'Kim')

WebUI.setText(findTestObject('Object Repository/Page_Bookings/input_First Name_child_lastname_2'), 'Wonpil')

WebUI.click(findTestObject('Object Repository/Page_Bookings/input_Payment Methods_payment_gateway'))

WebUI.click(findTestObject('Object Repository/Page_Bookings/input_Read Less_agreechb'))

WebUI.click(findTestObject('Object Repository/Page_Bookings/button_Confirm Booking'))

WebUI.click(findTestObject('Object Repository/Page_Hotels Invoice/input_PayPal_form'))

WebUI.click(findTestObject('Object Repository/Page_Pay With Paypal/p_Email sb-itxir5994130personal.example.com'))

WebUI.switchToWindowTitle('Pay With Paypal')

WebUI.click(findTestObject('Object Repository/Page_Pay With Paypal/div_paypal-button-label-container'))

WebUI.setText(findTestObject('Object Repository/Page_Log in to your PayPal account/input_ID_login_email'), 'sb-itxir5994130@personal.example.com')

WebUI.click(findTestObject('Object Repository/Page_Log in to your PayPal account/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to your PayPal account/input_Next_login_password'), 
    'rj2fRmpFATWayYbvRYjxfA==')

WebUI.click(findTestObject('Object Repository/Page_Log in to your PayPal account/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_PayPal Checkout/button_Complete Purchase'))

WebUI.switchToWindowTitle('Hotels Invoice')

WebUI.click(findTestObject('Object Repository/Page_Hotels Invoice/button_Download as PDF'))

WebUI.switchToWindowTitle('Administrators Login')

WebUI.setText(findTestObject('Object Repository/Page_Administrators Login/input_Administrators Login_email'), 'admin@phptravels.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Administrators Login/input_Email_password'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('Object Repository/Page_Administrators Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Flights'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Flights'))

WebUI.click(findTestObject('Object Repository/Page_Flights/a_Add'))

WebUI.click(findTestObject('Object Repository/Page_Flights/body_setTimeout(function()     (.bodyload)._1a5599'))

WebUI.click(findTestObject('Object Repository/Page_Flights/body_setTimeout(function()     (.bodyload)._1a5599_1'))

WebUI.click(findTestObject('Object Repository/Page_Flights/body_setTimeout(function()     (.bodyload)._1a5599_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Flights/b'))

WebUI.click(findTestObject('Object Repository/Page_Flights/b'))

WebUI.setText(findTestObject('Object Repository/Page_Flights/input_Adult Seat Price_ZmxpZ2h0cy5hZHVsdF9z_72cb70'), '1500000')

WebUI.setText(findTestObject('Object Repository/Page_Flights/input_child price_ZmxpZ2h0cy5jaGlsZF9zZWF0X3ByaWNl'), '1000000')

WebUI.setText(findTestObject('Object Repository/Page_Flights/input_infant price_ZmxpZ2h0cy5pbmZhbnRfc2Vh_51c13a'), '1250000')

WebUI.setText(findTestObject('Object Repository/Page_Flights/input_Duration_ZmxpZ2h0cy5kdXJhdGlvbg--'), '30')

WebUI.doubleClick(findTestObject('Object Repository/Page_Flights/dd_000000'))

WebUI.click(findTestObject('Object Repository/Page_Flights/a_Hour_ui-slider-handle ui-state-default ui_035906'))

WebUI.click(findTestObject('Object Repository/Page_Flights/button_Done'))

WebUI.click(findTestObject('Object Repository/Page_Flights/input_Arrival Time_ZmxpZ2h0cy5hcnJpdmFsX3RpbWU-'))

WebUI.click(findTestObject('Object Repository/Page_Flights/a_Hour_ui-slider-handle ui-state-default ui_035906'))

WebUI.click(findTestObject('Object Repository/Page_Flights/button_Done'))

WebUI.click(findTestObject('Object Repository/Page_Flights/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_Flights/a_economy_xcrud-action xcrud-button xcrud-orange'))

WebUI.setText(findTestObject('Object Repository/Page_Flights/input_Adult Seat Price_ZmxpZ2h0cy5hZHVsdF9z_72cb70'), '120')

WebUI.click(findTestObject('Object Repository/Page_Flights/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_Flights/a_economy_xcrud-action xcrud-button xcrud-red'))

WebUI.click(findTestObject('Object Repository/Page_Flights/a_Dashboard'))

