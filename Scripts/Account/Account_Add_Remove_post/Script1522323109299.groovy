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

dateHour = mydate.format('HHmm')

dateHourfull = mydate.format('HHmmss')

String pass = '111111'

String mail = 'rostyslav.biliaiev@route-report.com'

String title = 'Automated Test was executed'

String post_text = 'Automated Test Executed Automated Test Executed Automated Test Executed Automated Test Executed Automated Test Executed Automated Test Executed'

String youtube = 'https://youtu.be/Mb-7AWpXK-o'

WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Login_registration/input_in_login'), mail)

WebUI.setText(findTestObject('Login_registration/input_in_password'), pass)

WebUI.click(findTestObject('Login_registration/button_LOG IN'))

WebUI.verifyElementPresent(findTestObject('Login_registration/span_My spoken languages'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_block_add_posts'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Add_post'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/Buttons/button_Pulish_post'), 10)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_Post_title_field'), (((title + '_date_') + formattedDate) + 
    '_time_') + dateHour)

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_Post_text_field'), post_text)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Pulish_post'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/Button_Remove_Post'))

WebUI.closeBrowser()



