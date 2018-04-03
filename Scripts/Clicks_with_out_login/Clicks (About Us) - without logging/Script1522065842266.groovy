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

WebUI.click(findTestObject('Object Repository/About US/Button_JOIN US NOW'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/About US/Close_button_registration_pop-up'), 5)

WebUI.click(findTestObject('Object Repository/About US/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Object Repository/About US/Button_Sign_Up'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/About US/Close_button_registration_pop-up'), 5)

WebUI.click(findTestObject('Object Repository/About US/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Object Repository/About US/Icon_Button_Sign_Up'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/About US/Close_button_registration_pop-up'), 5)

WebUI.click(findTestObject('Object Repository/About US/Close_button_registration_pop-up'))

WebUI.click(findTestObject('Object Repository/About US/Botton_Manual'))

WebUI.switchToWindowTitle('User manual - Route Report')

titleWindowManual_1 = WebUI.getWindowTitle()

WebUI.verifyMatch(titleWindowManual_1, 'User manual - Route Report', false)

WebUI.closeWindowTitle('User manual - Route Report')

WebUI.switchToWindowTitle('Route Report - Earn money while traveling')

WebUI.click(findTestObject('Object Repository/About US/Icon_Button_Manual'))

WebUI.switchToWindowTitle('User manual - Route Report')

titleWindowManual_2 = WebUI.getWindowTitle()

WebUI.verifyMatch(titleWindowManual_2, 'User manual - Route Report', false)

WebUI.closeWindowTitle('User manual - Route Report')

WebUI.switchToWindowTitle('Route Report - Earn money while traveling')

WebUI.click(findTestObject('Object Repository/About US/Button_Add_report'))

WebUI.waitForElementPresent(findTestObject('Object Repository/About US/Pop_up_select_kind_of_travel'), 5)

titleWindowAdd_report_1 = WebUI.getWindowTitle()

WebUI.back()

WebUI.click(findTestObject('Object Repository/About US/Icon_Button_Add_report'))

WebUI.waitForElementPresent(findTestObject('Object Repository/About US/Pop_up_select_kind_of_travel'), 5)

WebUI.closeWindowTitle('Write report - Route Report')

WebUI.switchToWindowTitle('Route Report - Earn money while traveling')



WebUI.click(findTestObject('Object Repository/About US/Icon_FAQ'))

WebUI.switchToWindowTitle('FAQ - Route Report')

titleWindowFAQ_1 = WebUI.getWindowTitle()

WebUI.verifyMatch(titleWindowFAQ_1, 'FAQ - Route Report', false)

WebUI.closeWindowTitle('FAQ - Route Report')

WebUI.switchToWindowTitle('Route Report - Earn money while traveling')

WebUI.click(findTestObject('Object Repository/About US/Button_Get_paid'))

WebUI.switchToWindowTitle('FAQ - Route Report')

titleWindowFAQ_2 = WebUI.getWindowTitle()

WebUI.verifyMatch(titleWindowFAQ_2, 'FAQ - Route Report', false)

WebUI.closeBrowser()



