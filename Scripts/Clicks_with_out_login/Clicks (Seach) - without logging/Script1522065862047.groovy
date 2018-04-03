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

WebUI.setText(findTestObject('Search_Authors/input_search'), 'Chacagua')

WebUI.delay(5)

WebUI.click(findTestObject('Search_Authors/price_button_search'))

WebUI.waitForElementPresent(findTestObject('Search_Authors/button_SIGN UP'), 
    5)

WebUI.delay(1)

WebUI.click(findTestObject('Search_Authors/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Search_Authors/Button_Follow author_Search_page'))

WebUI.waitForElementPresent(findTestObject('Search_Authors/button_SIGN UP'), 
    5)

WebUI.delay(1)

WebUI.click(findTestObject('Search_Authors/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Search_Authors/Button_add_to_favorite_Search_page'))

WebUI.waitForElementPresent(findTestObject('Search_Authors/button_SIGN UP'), 
    5)

WebUI.delay(1)

WebUI.click(findTestObject('Search_Authors/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Search_Authors/Button_Compare_report_row_Search_page'))

WebUI.waitForElementPresent(findTestObject('Search_Authors/button_SIGN UP'), 
    5)

WebUI.delay(1)

WebUI.click(findTestObject('Search_Authors/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Search_Authors/Button_Cart_top_section_Search'))

WebUI.waitForElementPresent(findTestObject('Search_Authors/button_SIGN UP'),
	5)

WebUI.delay(1)

WebUI.closeBrowser()




