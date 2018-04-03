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

WebUI.navigateToUrl('https://route-report.com/')

WebUI.maximizeWindow()

String pass = '111111'

String mail = 'rostyslav.biliaiev@route-report.com'



WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Login_registration/input_in_login'), mail)

WebUI.setText(findTestObject('Login_registration/input_in_password'), pass)

WebUI.click(findTestObject('Login_registration/button_LOG IN'))

WebUI.verifyElementPresent(findTestObject('Login_registration/span_My spoken languages'), 20)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Edit_report'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Edit_report/Step_1/ver_Step_1_is_loaded'), 30)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Edit_report/but_Step_5'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Edit_report/Step_5/but_request_support'), 30)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Edit_report/Step_5/but_request_support'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_Popup_support_shows'), 30)

WebUI.click(findTestObject('Object Repository/Account/Other/choose_subject_to_support'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_popup_help_shows'), 30)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_send_msg_to_support'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_error_Enter_your_message_HelpPopup'), 30)

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_chat_with_support_field'), 'testtstststststststst')

WebUI.uploadFile(findTestObject('Object Repository/Account/Buttons/button_upload_image_in_chat_with_support'), 'D:\\test-photo.jpg')

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/Buttons/button_Save_img_chat_support'), 30)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Save_img_chat_support'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_send_msg_to_support'))

WebUI.switchToDefaultContent()







