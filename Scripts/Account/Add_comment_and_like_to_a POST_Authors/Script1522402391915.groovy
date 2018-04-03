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

String s = ((('Comment was added by automated test at' + 'date_') + formattedDate) + '_time_') + dateHour

WebUI.click(findTestObject('Object Repository/Header-Footer/Header buttons/Header_Button__Authors'))

WebUI.delay(1)

WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Object Repository/Login_registration/input_in_nickname'), x)

WebUI.setText(findTestObject('Login_registration/input_in_email_registration_field'), x + '@test.com')

WebUI.click(findTestObject('Object Repository/Login_registration/button_SIGN UP'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Authors_and_Author_page/button_Like_last_post'))

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Authors_and_Author_page/button_Like_last_post'), 'data-is-like', 
    '1', 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Authors_and_Author_page/Button_add_comment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Authors_and_Author_page/button_Add_comment_if_there_is_another_comment'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Authors_and_Author_page/ver_popup_add_comment_shows'), 2)

WebUI.setText(findTestObject('Object Repository/Authors_and_Author_page/input_commnt_text_field'), s)

WebUI.click(findTestObject('Object Repository/Authors_and_Author_page/button_Publish_added_comment'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Authors_and_Author_page/ver_popup_add_comment_shows'), 2)

WebUI.delay(3)

WebUI.closeBrowser()

