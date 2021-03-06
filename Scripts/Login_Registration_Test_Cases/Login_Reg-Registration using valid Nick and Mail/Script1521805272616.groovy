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
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

mydate = new Date()

formattedDate = mydate.format('MMdd')

dateHour=mydate.format('HHmmss')

String x = 'date' + formattedDate + 'time' + dateHour

WebUI.navigateToUrl('https://www.route-report.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login_registration/span_Login'))



WebUI.setText(findTestObject('Object Repository/Login_registration/input_in_nickname'), x)

WebUI.setText(findTestObject('Login_registration/input_in_email_registration_field'), x + '@test.com')

WebUI.click(findTestObject('Object Repository/Login_registration/button_SIGN UP'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Login_registration/span_My spoken languages'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Login_registration/span_mail_field_account'), x + '@test.com')



WebUI.closeBrowser()

