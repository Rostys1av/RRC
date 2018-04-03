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

WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Login_registration/input_in_login'), 'rostyslav.biliaiev@route-report.com')

WebUI.setText(findTestObject('Login_registration/input_in_password'), '111111')

WebUI.click(findTestObject('Login_registration/button_LOG IN'))

WebUI.verifyElementPresent(findTestObject('Login_registration/span_My spoken languages'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Header-Footer/Block_Purchased reports'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header-Footer/Button_More'), 0)

WebUI.click(findTestObject('Object Repository/Header-Footer/Button_More'))

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(5)

WebUI.delay(2)

WebUI.click(findTestObject('Header-Footer/View report language buttons/View_report_a_lang_item_l de'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_View_report'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header-Footer/Button_Download the report'), 'Bericht herunterladen')

WebUI.click(findTestObject('Header-Footer/View report language buttons/View_report_a_lang_item_l ru'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_View_report'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header-Footer/Button_Download the report'), 'Скачать отчет')

WebUI.click(findTestObject('Header-Footer/View report language buttons/View_report_a_lang_item_l fr'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_View_report'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header-Footer/Button_Download the report'), 'Télécharger le rapport')

WebUI.click(findTestObject('Header-Footer/View report language buttons/View_report_a_lang_item_l es'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_View_report'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header-Footer/Button_Download the report'), 'Descarga el reportaje')

WebUI.click(findTestObject('Header-Footer/View report language buttons/View_report_a_lang_item_l it'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_View_report'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header-Footer/Button_Download the report'), 'Scarica il reportage')

WebUI.click(findTestObject('Header-Footer/View report language buttons/View_report_a_lang_item_l pl'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_View_report'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header-Footer/Button_Download the report'), 'Ściągnij Raport')

WebUI.click(findTestObject('Header-Footer/View report language buttons/View_report_a_lang_item_l gb'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_View_report'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header-Footer/Button_Download the report'), 'Download the report')

WebUI.closeBrowser()

