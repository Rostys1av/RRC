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
import create_report.create_report as create_report
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.route-report.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Header-Footer/Header buttons/Header_Button_Create a report'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_Pop_up_select_kind_of_travel'), 2)

WebUI.back()

WebUI.click(findTestObject('Header-Footer/Header buttons/Header_Button_Create a report'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_Pop_up_select_kind_of_travel'), 2)

WebUI.back()

WebUI.click(findTestObject('Header-Footer/Header buttons/Header_Button_About us'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_JOIN US NOW'), 2)

WebUI.click(findTestObject('Header-Footer/Header buttons/Header_Button_Search report'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_Search block'), 2)

WebUI.click(findTestObject('Header-Footer/Header buttons/Header_Button__Authors'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_block_TOP AUTHORS'), 2)

WebUI.click(findTestObject('Header-Footer/Header buttons/Header_Button_User Manual'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_Users Manual'), 2)

WebUI.click(findTestObject('Header-Footer/Header buttons/Header_Button_FAQ'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_FAQ'), 2)

WebUI.click(findTestObject('Header-Footer/Header buttons/Header_Button_Contact us'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_Contact form'), 2)

WebUI.click(findTestObject('Header-Footer/Header buttons/Header_Button_NewsOffers'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_news'), 2)

WebUI.click(findTestObject('Object Repository/Header-Footer/Footer buttons/Footer_Button_About us'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_JOIN US NOW'), 2)

WebUI.click(findTestObject('Header-Footer/Footer buttons/Footer_Button_Search report'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_Search block'), 2)

WebUI.click(findTestObject('Header-Footer/Footer buttons/Footer_Button_Authors'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_block_TOP AUTHORS'), 2)

WebUI.click(findTestObject('Header-Footer/Footer buttons/Footer_Button_User Manual'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_Users Manual'), 2)

WebUI.click(findTestObject('Header-Footer/Footer buttons/Footer_Button_FAQ'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_FAQ'), 2)

WebUI.click(findTestObject('Header-Footer/Footer buttons/Footer_Button_Contact us'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_Contact form'), 2)

WebUI.click(findTestObject('Header-Footer/Footer buttons/Footer_Button_NewsOffers'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Ver_Buttons/ver_news'), 2)

WebUI.closeBrowser()

