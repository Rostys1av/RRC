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

WebUI.navigateToUrl('https://www.route-report.com/')

WebUI.maximizeWindow()

String pass = '111111'

String wrongpass = '123123123123'

String newpass = '222222'

String mail = 'rostyslav.biliaiev@route-report.com'

WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Login_registration/input_in_login'), mail)

WebUI.setText(findTestObject('Login_registration/input_in_password'), pass)

WebUI.click(findTestObject('Login_registration/button_LOG IN'))

WebUI.verifyElementPresent(findTestObject('Login_registration/span_My spoken languages'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_change_password'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_change_pass_form_shows'), 2)

WebUI.setText(findTestObject('Account/Input_fields/input_old_password_field'), wrongpass)

WebUI.setText(findTestObject('Account/Input_fields/input_newpass_field'), newpass)

WebUI.setText(findTestObject('Account/Input_fields/input_confirm_newpass_field'), newpass )

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_save_new_pass'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/warnings(validator_msg)/ver_msg_old_pass_incorrect_shows'), 2)

WebUI.clearText(findTestObject('Account/Input_fields/input_old_password_field'))

WebUI.clearText(findTestObject('Account/Input_fields/input_newpass_field'))

WebUI.clearText(findTestObject('Account/Input_fields/input_confirm_newpass_field'))

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_save_new_pass'))

WebUI.verifyElementVisible(findTestObject('Account/ver/ver_error_msg_old_pass_field'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Account/ver/ver_error_msg_new_pass'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Account/ver/ver_error_msg_confirm_pass_field'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Cancel_change_pass'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_change_password'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Account/ver/ver_change_pass_form_shows'))

WebUI.setText(findTestObject('Account/Input_fields/input_old_password_field'), pass)

WebUI.setText(findTestObject('Account/Input_fields/input_newpass_field'), newpass)

WebUI.setText(findTestObject('Account/Input_fields/input_confirm_newpass_field'), wrongpass)

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Account/ver/ver_error_msg_confirm_pass_field'))

WebUI.delay(2)

WebUI.clearText(findTestObject('Account/Input_fields/input_old_password_field'))

WebUI.clearText(findTestObject('Account/Input_fields/input_newpass_field'))

WebUI.clearText(findTestObject('Account/Input_fields/input_confirm_newpass_field'))

WebUI.setText(findTestObject('Account/Input_fields/input_old_password_field'), pass)

WebUI.setText(findTestObject('Account/Input_fields/input_newpass_field'), newpass)

WebUI.setText(findTestObject('Account/Input_fields/input_confirm_newpass_field'), newpass)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_save_new_pass'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Log-out'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Account/ver/ver_log_out_OK'), 2)

WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Login_registration/input_in_login'), mail)

WebUI.setText(findTestObject('Login_registration/input_in_password'), newpass)

WebUI.click(findTestObject('Login_registration/button_LOG IN'))

WebUI.verifyElementPresent(findTestObject('Login_registration/span_My spoken languages'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_change_password'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_change_pass_form_shows'), 2)

WebUI.setText(findTestObject('Account/Input_fields/input_old_password_field'), newpass)

WebUI.setText(findTestObject('Account/Input_fields/input_newpass_field'), pass)

WebUI.setText(findTestObject('Account/Input_fields/input_confirm_newpass_field'), pass )

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_save_new_pass'))

WebUI.closeBrowser()












