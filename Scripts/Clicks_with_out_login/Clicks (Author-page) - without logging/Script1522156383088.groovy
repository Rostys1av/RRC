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

WebUI.click(findTestObject('Header-Footer/Header buttons/Header_Button__Authors'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_block_TOP AUTHORS'), 2)

WebUI.click(findTestObject('Object Repository/Search_Authors/link_Ana Maria Diez Venezuela01'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_Authors_page'), 2)

WebUI.click(findTestObject('Authors_and_Author_page/Button_follow'))

WebUI.delay(1)

WebUI.click(findTestObject('Authors_and_Author_page/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Authors_and_Author_page/Button_cart'))

WebUI.delay(1)

WebUI.click(findTestObject('Authors_and_Author_page/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Authors_and_Author_page/Button_favorite'))

WebUI.delay(1)

WebUI.click(findTestObject('Authors_and_Author_page/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Authors_and_Author_page/button_compare'))

WebUI.delay(1)

WebUI.click(findTestObject('Authors_and_Author_page/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Authors_and_Author_page/button_posts'))

WebUI.delay(1)

WebUI.click(findTestObject('Authors_and_Author_page/button_reports'))

WebUI.delay(1)

WebUI.click(findTestObject('Authors_and_Author_page/button_detail_report_inf'))

WebUI.switchToWindowIndex(2)

WebUI.verifyElementPresent(findTestObject('Authors_and_Author_page/ver_detail_page_loaded'), 0)

WebUI.closeBrowser()





