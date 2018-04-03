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

WebUI.delay(4)

WebUI.click(findTestObject('Header-Footer/Header buttons/Language_Button_DE'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Header buttons/Header_Button_Create a report'), 2)

WebUI.verifyElementText(findTestObject('Header-Footer/Header buttons/Header_Button_About us'), 'ÜBER UNS')

WebUI.click(findTestObject('Header-Footer/Header buttons/Language_Button_RU'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Header buttons/Header_Button_Create a report'), 2)

WebUI.verifyElementText(findTestObject('Header-Footer/Header buttons/Header_Button_About us'), 'О ПРОЕКТЕ')

WebUI.click(findTestObject('Header-Footer/Header buttons/Language_Button_FR'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Header buttons/Header_Button_Create a report'), 3)

WebUI.verifyElementText(findTestObject('Header-Footer/Header buttons/Header_Button_About us'), 'À PROPOS DE NOUS')

WebUI.click(findTestObject('Header-Footer/Header buttons/Language_Button_ES'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Header buttons/Header_Button_Create a report'), 3)

WebUI.verifyElementText(findTestObject('Header-Footer/Header buttons/Header_Button_About us'), 'SOBRE NOSOTROS')

WebUI.click(findTestObject('Header-Footer/Header buttons/Language_Button_IT'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Header buttons/Header_Button_Create a report'), 2)

WebUI.verifyElementText(findTestObject('Header-Footer/Header buttons/Header_Button_About us'), 'SU DI NOI')

WebUI.click(findTestObject('Header-Footer/Header buttons/Language_Button_PL'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Header buttons/Header_Button_Create a report'), 2)

WebUI.verifyElementText(findTestObject('Header-Footer/Header buttons/Header_Button_About us'), 'O NAS')

WebUI.click(findTestObject('Header-Footer/Header buttons/Language_Button_EN'))

WebUI.waitForElementPresent(findTestObject('Header-Footer/Header buttons/Header_Button_Create a report'), 2)

WebUI.verifyElementText(findTestObject('Header-Footer/Header buttons/Header_Button_About us'), 'ABOUT US')

WebUI.closeBrowser()

