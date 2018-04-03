import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.jws.WebResult
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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import net.bytebuddy.asm.Advice.Enter

import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('http://route-report.doinsane.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login_registration/span_Login'))

mydate = new Date()

dateHour=mydate.format('HHmmss')

String x = 'time' + dateHour

WebUI.setText(findTestObject('Object Repository/Login_registration/input_in_nickname'), x)

WebUI.setText(findTestObject('Login_registration/input_in_email_registration_field'), x + '@test.com')

WebUI.click(findTestObject('Object Repository/Login_registration/button_SIGN UP'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Login_registration/span_My spoken languages'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Login_registration/span_mail_field_account'), x + '@test.com')

WebUI.delay(2)

WebUI.click(findTestObject('Account/Buttons/button_change_name_mail_phone'))

WebUI.clearText(findTestObject('Account/Input_fields/input_field_Name'))

WebUI.verifyElementPresent(findTestObject('Account/warnings(validator_msg)/warning_Name_field'), 1)

WebUI.setText(findTestObject('Account/Input_fields/input_field_Name'), 'Name' + x)

WebUI.clearText(findTestObject('Account/Input_fields/input_field_Last_name'))

WebUI.verifyElementPresent(findTestObject('Account/warnings(validator_msg)/warning_Last_name_Field'), 1)

WebUI.setText(findTestObject('Account/Input_fields/input_field_Last_name'), 'Last' + x)

WebUI.clearText(findTestObject('Account/Input_fields/input_Nick_Field'))

WebUI.verifyElementPresent(findTestObject('Account/warnings(validator_msg)/warning_Nick_Field'), 1)

WebUI.setText(findTestObject('Account/Input_fields/input_Nick_Field'), 'Nick' + x)

WebUI.clearText(findTestObject('Account/Input_fields/input_Mail_Field'))

WebUI.verifyElementPresent(findTestObject('Account/warnings(validator_msg)/warning_Mail_Field'), 1)

WebUI.setText(findTestObject('Account/Input_fields/input_Mail_Field'), x + '@new.com')

WebUI.setText(findTestObject('Account/Input_fields/input_Phone_Field'), '123456789')

WebUI.click(findTestObject('Account/Buttons/button_Gender_Male'))

WebUI.click(findTestObject('Account/Buttons/button_Calendar'))

WebUI.verifyElementPresent(findTestObject('Account/Other/Date_picker_calendar'), 1)

WebUI.selectOptionByIndex(findTestObject('Account/Other/date_picker_dropdawn_list_month'), 2)

WebUI.selectOptionByIndex(findTestObject('Account/Other/date_picker_Year'), 1)

WebUI.click(findTestObject('Account/Other/date_picker_Select_date'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Account/Buttons/button_save_changes'))

WebUI.verifyElementPresent(findTestObject('Account/Buttons/button_Gender_Female'), 1)

WebUI.click(findTestObject('Account/Buttons/button_add_language_PLUS'))

WebUI.verifyElementPresent(findTestObject('Account/Buttons/button_add_language_DE'), 1)

WebUI.click(findTestObject('Account/Buttons/button_add_language_DE'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Account/ver/ver_2nd_added_language'), 1)

WebUI.uploadFile(findTestObject('Account/Buttons/button_change_avatar'), 'D:\\test-photo.jpg')

WebUI.waitForElementPresent(findTestObject('Account/ver/ver_pop_up_with_loaded_photo'), 2)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Account/Buttons/button_Cancel'), 120)

WebUI.click(findTestObject('Account/Buttons/button_Add'))

WebUI.delay(1)

WebUI.click(findTestObject('Account/Buttons/button_Green_plus'))

WebUI.waitForElementPresent(findTestObject('Account/ver/ver_popup_subsc_shows'), 2)

WebUI.click(findTestObject('Account/Other/select_subscribe_topic'))

WebUI.click(findTestObject('Account/Buttons/button_close_popup_subscribe'))

WebUI.delay(3)

WebUI.click(findTestObject('Account/Buttons/button_set_address'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Account/ver/ver_popup_Set_address_shows'), 2)

WebUI.setText(findTestObject('Account/Input_fields/input_address_search_field'),'London')

WebUI.click(findTestObject('Account/Other/Choose_london'))

WebUI.delay(1)

WebUI.clickOffset(findTestObject('Account/ver/ver_popup_Set_address_shows'), 100, 400)

WebUI.delay(3)

WebUI.click(findTestObject('Account/Buttons/button_close_popup_set_address'))

WebUI.verifyElementText(findTestObject('Account/ver/ver_Address'), 'United Kingdom')

WebUI.delay(2)

WebUI.closeBrowser()

