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

WebUI.navigateToUrl('https://route-report.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Header-Footer/Header buttons/Header_Button_Search report'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header-Footer/Ver_Buttons/ver_Search block'), 10)

WebUI.click(findTestObject('Object Repository/Search/Filter_Days_total'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Search/Filter_Days_total_3-7_days'), 10)

WebUI.click(findTestObject('Object Repository/Search/Filter_Days_total_3-7_days'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Search/Filter_Budget'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Search/Filter_budget_option_under 100'), 10)

WebUI.click(findTestObject('Object Repository/Search/Filter_budget_option_under 100'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Search/Filter_Purpose'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Search/Filter_Purpose_optin_relax'), 10)



WebUI.click(findTestObject('Object Repository/Search/Filter_Purpose_optin_relax'))

WebUI.delay(1)

//WebUI.click(findTestObject('Object Repository/Search/Filter_Team'))

//WebUI.waitForElementVisible(findTestObject('Search/Filter_Team_option_solo'), 10)

//WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/Search/Filter_Team_option_solo'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Search/Report_row'), 10)

WebUI.click(findTestObject('Object Repository/Search/Report_row'))

WebUI.switchToWindowTitle('Authors - Route Report')

WebUI.waitForElementVisible(findTestObject('Object Repository/Search/ver_100_dollars'), 10)

WebUI.verifyMatch(findTestObject('Object Repository/Search/ver_100_dollars'), '$100', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(findTestObject('Object Repository/Search/ver_relax'), 'relaxation', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(findTestObject('Object Repository/Search/ver_solo'), 'solo', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()










