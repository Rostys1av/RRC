import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://route-report.doinsane.com/')

WebUI.maximizeWindow()

mydate = new Date()

formattedDate = mydate.format('MMdd')

dateHour = mydate.format('HHmmss')

String x = (('date_' + formattedDate) + '_time_') + dateHour

String card = '4111111111111111'

String date = '1122'

String CVV = '111'

String name = 'Test name'

String wrongname = '63487fhsldfgh&*(^^&'

WebUI.click(findTestObject('Object Repository/Header-Footer/Header buttons/Header_Button__Authors'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Authors_and_Author_page/ver_Authors_Page_is_loaded'), 2)

WebUI.delay(1)

WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Object Repository/Login_registration/input_in_nickname'), x)

WebUI.setText(findTestObject('Login_registration/input_in_email_registration_field'), x + '@test.com')

WebUI.click(findTestObject('Object Repository/Login_registration/button_SIGN UP'))

WebUI.delay(2)

WebUI.click(findTestObject('Payments/button_Cart_first_report'))

WebUI.waitForElementVisible(findTestObject('Payments/button_Go_to_cart'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Payments/button_Go_to_cart'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Payments/ver_Cart_is_shows'), 2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Payments/button_Purchase'), 30)

WebUI.click(findTestObject('Object Repository/Payments/button_Purchase'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Payments/ver_pop_card_detail_shows'), 30)

WebUI.setText(findTestObject('Object Repository/Payments/input_Card_number_field'), card)

WebUI.setText(findTestObject('Object Repository/Payments/input_User_name_field'), wrongname)

WebUI.waitForElementVisible(findTestObject('Object Repository/Payments/ver_Error_msg'), 2)

WebUI.delay(1)

WebUI.clearText(findTestObject('Object Repository/Payments/input_User_name_field'))

WebUI.setText(findTestObject('Object Repository/Payments/input_User_name_field'), name)

WebUI.setText(findTestObject('Object Repository/Payments/input_CVV_field'), CVV)

WebUI.setText(findTestObject('Object Repository/Payments/input_date_exp_field'), date)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Payments/button_Purchase_final'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/Payments/ver_Payment_OK'), 30)

WebUI.click(findTestObject('Object Repository/Payments/ver_Payment_OK'))

WebUI.delay(1)

WebUI.closeBrowser()

