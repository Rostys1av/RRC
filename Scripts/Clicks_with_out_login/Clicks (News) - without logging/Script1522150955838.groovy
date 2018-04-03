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

WebUI.click(findTestObject('Object Repository/Header-Footer/Header buttons/Header_Button_NewsOffers'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_news'), 2)

WebUI.click(findTestObject('Object Repository/Page_NewsOffers/Icon-likes news'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NewsOffers/ver-pop up login'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_NewsOffers/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Object Repository/Page_NewsOffers/Icon-comments news'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NewsOffers/ver-pop up login'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_NewsOffers/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Object Repository/Page_NewsOffers/News_How to travel with passive'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NewsOffers/ver_new is loaded'), 2)

WebUI.click(findTestObject('Page_NewsOffers/Icon likes vi news inside top'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NewsOffers/ver-pop up login'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_NewsOffers/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Object Repository/Page_NewsOffers/Icon-comments news inside'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NewsOffers/ver-pop up login'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_NewsOffers/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Page_NewsOffers/Icon likes vi news inside bottom '))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NewsOffers/ver-pop up login'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_NewsOffers/Close_button_registration_pop-up'))

WebUI.closeBrowser()

