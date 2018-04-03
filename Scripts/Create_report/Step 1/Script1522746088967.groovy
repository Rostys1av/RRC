import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Desktop.Action

import javax.swing.plaf.basic.BasicButtonListener.Actions

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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.junit.After
import org.openqa.selenium.WebDriver
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.route-report.com/')

WebUI.maximizeWindow()

String mail = 'rostyslav.biliaiev@route-report.com'

String pass = '111111'

String bigtext = RandomStringUtils.randomNumeric(2000)

mydate = new Date()

formattedDate = mydate.format('MMdd')

dateHour = mydate.format('HHmmss')

String x = (('_date_' + formattedDate) + '_time_') + dateHour

String title = 'Automated test was executed' + x

String authors_text = 'Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors '

String youtube = 'https://youtu.be/2VjmdTtcEQE'

WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Login_registration/input_in_login'), mail )

WebUI.setText(findTestObject('Login_registration/input_in_password'), pass)

WebUI.click(findTestObject('Login_registration/button_LOG IN'))

WebUI.verifyElementPresent(findTestObject('Login_registration/span_My spoken languages'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Step_1/but_Open_draft'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_1/ver_popup_My_drafts_shows'), 30)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Step_1/but_Create_New_report'))

WebUI.delay(3)

WebUI.switchToWindowTitle('Write report - Route Report')

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_1/ver_Popup_select_types_date'), 30)

WebUI.click(findTestObject('Object Repository/Step_1/but_Language_DE'))

WebUI.click(findTestObject('Step_1/select_date_From'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Payments/select_month'), 1)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_1/Set_date_1'))

WebUI.click(findTestObject('Object Repository/Step_1/select_date_To'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_1/Set_date_3'))

WebUI.click(findTestObject('Object Repository/Step_1/Set_Type_OTHER'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_1/ver_List_of_kinds'), 30)

WebUI.click(findTestObject('Object Repository/Step_1/Set_kind_Art(museums)'))

WebUI.click(findTestObject('Object Repository/Step_1/but_OK_in_popup_select_types_and_date'))

WebUI.setText(findTestObject('Object Repository/Step_1/input_Title_of_report_field'), title)

WebUI.setText(findTestObject('Object Repository/Step_1/input_Text_from_author'), authors_text)

WebUI.uploadFile(findTestObject('Object Repository/Step_1/but_Add_main_photo'), 'D:\\test-photo.jpg')

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_1/but_save_adde_photo'), 30)

WebUI.click(findTestObject('Object Repository/Step_1/but_save_adde_photo'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Step_1/but_open_map(Start)'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_1/but_Start(popup_on_the_map)'), 30)

WebUI.click(findTestObject('Object Repository/Step_1/but_Start(popup_on_the_map)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Map/input_Search_field'), 'London')

WebUI.click(findTestObject('Object Repository/Map/Select_London'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Map/ver_pop_waypoint_shows'), 30)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Map/but_Edit_waypoint_name'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Map/input_City_name_waypint'), 'Testcityname')

WebUI.click(findTestObject('Object Repository/Map/select_waypoint_Day'))

WebUI.click(findTestObject('Object Repository/Map/select_waypoint_Day_1'))

WebUI.click(findTestObject('Object Repository/Map/but_Save_waypoint'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Map/but_Delete_waypoint'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_1/but_Start(popup_on_the_map)'), 30)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_1/but_Start(popup_on_the_map)'))

WebUI.delay(3)

WebUI.clickOffset(findTestObject('Object Repository/Map/input_Search_field'), 500, 200)



WebUI.waitForElementVisible(findTestObject('Object Repository/Map/ver_pop_waypoint_shows'), 30)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Map/select_waypoint_Day'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Map/select_waypoint_Day_1'))

WebUI.delay(1)

WebUI.clickOffset(findTestObject('Object Repository/Map/input_Search_field'), 400, 300)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Map/ver_pop_waypoint_shows'), 30)

WebUI.click(findTestObject('Object Repository/Map/select_waypoint_Day'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Map/select_waypoint_Day_1'))

WebUI.delay(1)

WebUI.clickOffset(findTestObject('Object Repository/Map/input_Search_field'), 300, 300)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Map/ver_pop_waypoint_shows'), 30)

WebUI.click(findTestObject('Object Repository/Map/select_waypoint_Day'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Map/select_waypoint_Day_3'))

WebUI.click(findTestObject('Object Repository/Map/but_Close_Map'))

WebUI.click(findTestObject('Object Repository/Step_1/but_Next(to_step_2)'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_2/ver_Step_is_loaded'), 10)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Step_1/but_Save_draft'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_1/ver_popup_report_was_saved'), 10)

WebUI.closeBrowser()



	













