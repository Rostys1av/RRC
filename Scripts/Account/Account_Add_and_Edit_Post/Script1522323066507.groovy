import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.jws.WebResult as WebResult
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

WebUI.navigateToUrl('http://route-report.doinsane.com/')

WebUI.maximizeWindow()

mydate = new Date()

formattedDate = mydate.format('MMdd')

dateHour=mydate.format('HHmm')

dateHourfull=mydate.format('HHmmss')

String pass = '111111'

String mail = 'rostyslav.biliaiev@route-report.com'

String title_small = 'YO'

String title = 'Automated Test was executed' 

String post_text_small = 'Short text'

String post_text = 'Automated Test Executed Automated Test Executed Automated Test Executed Automated Test Executed Automated Test Executed Automated Test Executed'

String youtube = 'https://youtu.be/Mb-7AWpXK-o'

String post_text_edited = 'This post was edited'

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

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Pulish_post'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Account/warnings(validator_msg)/ver_error_Post_Title_field'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Account/warnings(validator_msg)/ver_error_Post_text_field'))

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_Post_title_field'), title_small)

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_Post_text_field'), post_text_small)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Pulish_post'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Account/warnings(validator_msg)/ver_error_Post_Title_field'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Account/warnings(validator_msg)/ver_error_Post_text_field'))

WebUI.clearText(findTestObject('Object Repository/Account/Input_fields/input_Post_title_field'))

WebUI.clearText(findTestObject('Object Repository/Account/Input_fields/input_Post_text_field'))

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_Post_title_field'), title + '_date_' + formattedDate + '_time_' + dateHour)

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_Post_text_field'), post_text)

WebUI.uploadFile(findTestObject('Object Repository/Account/Buttons/button_add_photo_to_post'), 'D:\\test-photo.jpg')

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_pop_up_with_loaded_photo'), 120)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Add_photo_to_the_post_popup'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_open_Youtube'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_popup_upload_Youtube_shows'), 30)

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_field_Add_video_code_Youtube'), youtube)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_add_Youtube_code'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_pupup_youtube'), 30)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Add_photo_to_the_post_popup'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Pulish_post'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Edit_last_post'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/Buttons/button_Pulish_post'), 10)

WebUI.clearText(findTestObject('Object Repository/Account/Input_fields/input_Post_text_field'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_Post_text_field'), post_text_edited + '_time_' + dateHourfull + post_text_edited + post_text_edited + post_text_edited + post_text_edited )

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Pulish_post'))

WebUI.closeBrowser()