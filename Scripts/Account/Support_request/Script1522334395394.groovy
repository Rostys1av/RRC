import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.media.rtp.rtcp.Report as Report
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

mydate = new Date()

formattedDate = mydate.format('MMdd')

dateHour = mydate.format('HHmm')

String x = 'Automated test was executed, account (Report row)'

String s = 'Automated test was executed, account'

String z = 'Automated test was executed, contact form'

String y = 'Automated test was executed, contact form with out logging'

String r = 'Automated test was executed, Step 5'

WebUI.click(findTestObject('Object Repository/Header-Footer/Header buttons/Header_Button_Contact us'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_Contact form'), 2)

WebUI.click(findTestObject('Page_Contact us - Route Report/button_Send'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact us - Route Report/error_Please provide your email'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact us - Route Report/error_Please write your message'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact us - Route Report/error_Select the subject of your'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Contact us - Route Report/input_email'), mail)

WebUI.click(findTestObject('Object Repository/Page_Contact us - Route Report/input_subject-name-input'))

WebUI.click(findTestObject('Object Repository/Page_Contact us - Route Report/Dropdown_element'))

WebUI.setText(findTestObject('Page_Contact us - Route Report/input_message'), (((y + '_date_') + formattedDate) + '_time_') + 
    dateHour)

WebUI.click(findTestObject('Object Repository/Page_Contact us - Route Report/button_Send'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact us - Route Report/Message is sent Thank you'))

WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Login_registration/input_in_login'), mail)

WebUI.setText(findTestObject('Login_registration/input_in_password'), pass)

WebUI.click(findTestObject('Login_registration/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Header-Footer/Header buttons/Account_button'))

WebUI.verifyElementPresent(findTestObject('Login_registration/span_My spoken languages'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/but_Support'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_Popup_support_shows'), 30)

WebUI.click(findTestObject('Object Repository/Account/Other/choose_subject_to_support'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_popup_help_shows'), 30)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_send_msg_to_support'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_error_Enter_your_message_HelpPopup'), 30)

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_chat_with_support_field'), (((x + '_date_') + 
    formattedDate) + '_time_') + dateHour)

WebUI.uploadFile(findTestObject('Object Repository/Account/Buttons/button_upload_image_in_chat_with_support'), 'D:\\test-photo.jpg')

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/Buttons/button_Save_img_chat_support'), 30)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Save_img_chat_support'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_send_msg_to_support'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Account/ver/ver_sent_text_in_chat'), (((x + '_date_') + formattedDate) + 
    '_time_') + dateHour)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_close_popup_chat'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/but_Support'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_Popup_support_shows'), 0)

WebUI.click(findTestObject('Object Repository/Account/Other/choose_subject_to_support'))

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_send_msg_to_support'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_error_Enter_your_message_HelpPopup'), 30)

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_chat_with_support_field'), (((s + '_date_') + 
    formattedDate) + '_time_') + dateHour)

WebUI.uploadFile(findTestObject('Object Repository/Account/Buttons/button_upload_image_in_chat_with_support'), 'D:\\test-photo.jpg')

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/Buttons/button_Save_img_chat_support'), 30)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Save_img_chat_support'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_send_msg_to_support'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Account/ver/ver_sent_text_in_chat'), (((s + '_date_') + formattedDate) + 
    '_time_') + dateHour)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_close_popup_chat'))

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

WebUI.setText(findTestObject('Object Repository/Account/Input_fields/input_chat_with_support_field'), (((r + '_date_') + formattedDate) + 
    '_time_') + dateHour)

WebUI.uploadFile(findTestObject('Object Repository/Account/Buttons/button_upload_image_in_chat_with_support'), 'D:\\test-photo.jpg')

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/Buttons/button_Save_img_chat_support'), 30)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Save_img_chat_support'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_send_msg_to_support'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Header-Footer/Header buttons/Header_Button_Contact us'))

WebUI.switchToWindowTitle('Contact us - Route Report')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_Contact form'), 3)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Contact us - Route Report/input_subject-name-input'))

WebUI.click(findTestObject('Object Repository/Page_Contact us - Route Report/Dropdown_element'))

WebUI.setText(findTestObject('Page_Contact us - Route Report/input_message'), (((y + '_date_') + formattedDate) + 
    '_time_') + dateHour)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Contact us - Route Report/button_Send'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Contact us - Route Report/Message is sent Thank you'), 
    30)

WebUI.closeBrowser()

