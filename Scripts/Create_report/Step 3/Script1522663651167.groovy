import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Desktop.Action as Action
import javax.swing.plaf.basic.BasicButtonListener.Actions as Actions
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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.junit.After as After
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.route-report.com/')

WebUI.maximizeWindow()

String mail = 'rostyslav.biliaiev@route-report.com'

String pass = '111111'

String bigtext = RandomStringUtils.randomNumeric(6000)

mydate = new Date()

formattedDate = mydate.format('MMdd')

dateHour = mydate.format('HHmmss')

String x = (('_date_' + formattedDate) + '_time_') + dateHour

String title = 'Automated test was executed' + x

String authors_text = 'Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors '

String youtube = 'https://youtu.be/2VjmdTtcEQE'

WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Login_registration/input_in_login'), mail)

WebUI.setText(findTestObject('Login_registration/input_in_password'), pass)

WebUI.click(findTestObject('Login_registration/button_LOG IN'))

WebUI.verifyElementPresent(findTestObject('Login_registration/span_My spoken languages'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Edit_report_first'))

WebUI.switchToWindowTitle('Write report - Route Report')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_1/but_Step3'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_3/ver_Step_3_is_loaded'), 30)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Step_3/input_preparation'), bigtext)

WebUI.click(findTestObject('Step_3/Packinglist/but_Add_packing_list'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Step_3/Packinglist/ver_packing'), 20)

WebUI.setText(findTestObject('Step_3/Packinglist/input_Packing_name'), x)

WebUI.delay(2)

//WebUI.uploadFile(findTestObject('Object Repository/Step_3/Packinglist/but_add_photo_Packinglist'), 'D:\\test-photo.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Step_3/Packinglist/but_add_description_Packing'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Step_3/Packinglist/input_desc_packing'), x)

WebUI.click(findTestObject('Object Repository/Step_3/Packinglist/but_brand'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_3/Packinglist/input_brand_name'), 30)

WebUI.setText(findTestObject('Object Repository/Step_3/Packinglist/input_brand_name'), x)

WebUI.setText(findTestObject('Object Repository/Step_3/Packinglist/input_model'), x)

WebUI.click(findTestObject('Object Repository/Step_3/Packinglist/but_save_packinglist'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_3/Packinglist/ver_item_adde'), 30)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_3/but_1st_day'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Step_3/input_text_days'), bigtext)

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_3/but_add_places'), 10)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_3/but_add_places'))

WebUI.waitForElementVisible(findTestObject('Map_places/tab_waypoints_top_part'), 10)

WebUI.delay(1)

WebUI.click(findTestObject('Map_places/tab_waypoints_top_part'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Map_places/ver_tab_waipoints_shows'), 10)

WebUI.click(findTestObject('Map_places/tab_places_top_part'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Map_places/ver_tab_places_shows'), 10)

WebUI.click(findTestObject('Map_places/but_hide(show)_tabs'))

WebUI.setText(findTestObject('Object Repository/Map_places/input_search'), 'London')

WebUI.click(findTestObject('Object Repository/Map_places/select_1st_result'))

WebUI.delay(4)

WebUI.waitForElementVisible(findTestObject('Object Repository/Map_places/but_choose_places'), 10)

WebUI.click(findTestObject('Object Repository/Map_places/but_choose_places'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Map_places/but_add_place(begining)'), 10)

WebUI.click(findTestObject('Object Repository/Map_places/but_add_place(begining)'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Map_places/but_select_ORA_activity'), 10)

WebUI.click(findTestObject('Object Repository/Map_places/but_select_ORA_activity'))

WebUI.click(findTestObject('Object Repository/Map_places/but_add_place_select_activity'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Map_places/input_place_name'), 10)

WebUI.setText(findTestObject('Object Repository/Map_places/input_place_name'), 'TestName')

WebUI.click(findTestObject('Object Repository/Map_places/select_place_category(2nd_lvl)'))

WebUI.click(findTestObject('Object Repository/Map_places/select_2lvl_Water'))

WebUI.click(findTestObject('Object Repository/Map_places/select_places_category(3rd_lvl)'))

WebUI.click(findTestObject('Object Repository/Map_places/select_3rd_lvl_Boat_trip'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Map_places/but_set_days'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Map_places/set_day'), 10)

WebUI.click(findTestObject('Object Repository/Map_places/set_day'))

WebUI.uploadFile(findTestObject('Object Repository/Map_places/add_photo_1'), 'D:\\test-photo.jpg')

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Map_places/Step 2_3'))

WebUI.setText(findTestObject('Object Repository/Map_places/input_mail'), mail)

WebUI.setText(findTestObject('Object Repository/Map_places/input_web'), 'www.test.test')

WebUI.setText(findTestObject('Object Repository/Map_places/input_phone'), '132456798')

WebUI.click(findTestObject('Object Repository/Map_places/Step_3_3'))

WebUI.click(findTestObject('Object Repository/Map_places/but_rate'))

WebUI.setText(findTestObject('Object Repository/Map_places/input_price_place'), '100')

WebUI.setText(findTestObject('Object Repository/Map_places/input_feedback'), 'jhgjg')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Map_places/select_add_other_categories'))

WebUI.click(findTestObject('Object Repository/Map_places/select_ORA_other_categories'))

WebUI.click(findTestObject('Map_places/select_2nd_lvl_other_activity'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Map_places/select_2nd_lvl_Ground'))

WebUI.click(findTestObject('Object Repository/Map_places/select_3rd_lvl_categories'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Map_places/select_3rd_lvl_Off-road'))

WebUI.click(findTestObject('Object Repository/Map_places/but_add_other_categories'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Map_places/but_save_place'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Map_places/ver_tab_places_shows'), 10)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Map/but_Close_Map'))

WebUI.click(findTestObject('Object Repository/Step_3/but_add_Youtube'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_3/input_video_code'), 20)

WebUI.setText(findTestObject('Object Repository/Step_3/input_video_code'), youtube)

WebUI.click(findTestObject('Object Repository/Step_3/but_save_video_youtube'))

WebUI.delay(1)

//WebUI.uploadFile(findTestObject('Object Repository/Step_3/but_Add_Other'), 'D:\\RUSSIAN.docx', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_3/but_2nd_day'))

WebUI.setText(findTestObject('Object Repository/Step_3/input_text_days'), bigtext)

//WebUI.uploadFile(findTestObject('Object Repository/Step_3/but_add_photo_days'), 'D:\\test-photo.jpg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Step_3/but_add_Youtube'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_3/input_video_code'), 20)

WebUI.setText(findTestObject('Object Repository/Step_3/input_video_code'), youtube)

WebUI.click(findTestObject('Object Repository/Step_3/but_save_video_youtube'))

WebUI.delay(2)

//WebUI.uploadFile(findTestObject('Object Repository/Step_3/but_Add_Other'), 'D:\\RUSSIAN.docx', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Step_3/but_3rd_day'))

WebUI.setText(findTestObject('Object Repository/Step_3/input_text_days'), bigtext)

//WebUI.uploadFile(findTestObject('Object Repository/Step_3/but_add_photo_days'), 'D:\\test-photo.jpg', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Step_3/but_add_Youtube'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_3/input_video_code'), 20)

WebUI.setText(findTestObject('Object Repository/Step_3/input_video_code'), youtube)

WebUI.click(findTestObject('Object Repository/Step_3/but_save_video_youtube'))

WebUI.delay(2)

//WebUI.uploadFile(findTestObject('Object Repository/Step_3/but_Add_Other'), 'D:\\RUSSIAN.docx', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.closeBrowser()

