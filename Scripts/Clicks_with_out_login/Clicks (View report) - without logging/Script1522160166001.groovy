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

WebUI.navigateToUrl('https://www.route-report.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Search_Authors/a_Search report'))

WebUI.click(findTestObject('View_report/Report_row_link_to_details'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_detail_report_page'), 2)

WebUI.click(findTestObject('View_report/Button_more'))

WebUI.switchToWindowIndex(2)

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_View_report_loaded'), 2)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/View_report/Button_cart'))

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_pop_up_login_show'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/View_report/button_close_pop_up_login'))

WebUI.click(findTestObject('View_report/Buttons_top/button_Home_top_navmenu'))

WebUI.delay(2)

WebUI.click(findTestObject('View_report/Buttons_top/Button_Route_top_navmenu'))

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_Route_loaded(map)'), 1)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_route_top'))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Route_Stats'))

WebUI.delay(1)

WebUI.click(findTestObject('View_report/Drop_button_route_top'))

WebUI.delay(1)

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Route_Map'))

WebUI.delay(2)

WebUI.click(findTestObject('View_report/Buttons_top/Button_Description_top_navmenu'))

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_Description_is_loaded'), 2)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_description_top'))

WebUI.delay(2)

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Description_top_preparation'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_description_top'))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Description_top_days'))

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_description_top'))

WebUI.delay(2)

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Description_top_summary'))

WebUI.delay(3)

WebUI.click(findTestObject('View_report/Buttons_top/Button_Details_top_navmenu'))

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_Details_is_loaded'), 2)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_details_top '))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Details_top_ORA'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_details_top '))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Details_top_FSE'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_details_top '))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Details_top_US'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_details_top '))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Details_top_ACC'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_details_top '))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Details_top_ACont'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_details_top '))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Details_top_CR'))

WebUI.delay(3)

WebUI.click(findTestObject('View_report/Buttons_top/Button_Files_top_navmenu '))

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_File_is_loaded'), 2)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_files_top'))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Files_top_image_video'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_files_top'))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Files_top_Maps'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_files_top'))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Files_top_Docs'))

WebUI.delay(2)

WebUI.click(findTestObject('View_report/Buttons_top/Button_Services_top_navmenu'))

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_Services_is_loaded'), 2)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_services_top'))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Services_top_reports'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_services_top'))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Services_top_About_country'))

WebUI.click(findTestObject('View_report/Buttons_footer/Button_Home_footer_navmenu'))

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_View_report_loaded'), 2)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/View_report/Buttons_footer/Button_Home_footer_navmenu'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('View_report/Buttons_footer/Button_Route_footer_navmenu'))

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_Route_loaded(map)'), 2)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/View_report/Buttons_footer/Button_Home_footer_navmenu'), 2)

WebUI.click(findTestObject('View_report/Buttons_footer/Button_Description_footer_navmenu'))

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_Description_is_loaded'), 2)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_description_top'))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Description_top_days'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/View_report/Drop_button_description_top'))

WebUI.click(findTestObject('View_report/buttons Submenu/Button_submenu_Description_top_summary'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('View_report/Buttons_footer/Button_Details_footer_navmenu'), 2)

WebUI.delay(1)

WebUI.click(findTestObject('View_report/Buttons_footer/Button_Details_footer_navmenu'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_Details_is_loaded'), 2)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/View_report/Buttons_footer/Button_Home_footer_navmenu'), 2)

WebUI.click(findTestObject('View_report/Buttons_footer/Button_Files_footer_navmenu'))

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_File_is_loaded'), 2)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/View_report/Buttons_footer/Button_Home_footer_navmenu'), 2)

WebUI.click(findTestObject('View_report/Buttons_footer/Button_Services_footer_navmenu'))

WebUI.verifyElementPresent(findTestObject('View_report/buttons ver/ver_Services_is_loaded'), 2)

WebUI.closeBrowser()

