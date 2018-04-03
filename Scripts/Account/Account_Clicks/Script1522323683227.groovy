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

String pass = '111111'

String mail = 'rostyslav.biliaiev@route-report.com'

WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Login_registration/input_in_login'), mail)

WebUI.setText(findTestObject('Login_registration/input_in_password'), pass)

WebUI.click(findTestObject('Login_registration/button_LOG IN'))

WebUI.verifyElementPresent(findTestObject('Login_registration/span_My spoken languages'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_trophy'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Account/ver/ver_Trophy_board_shows'), 30)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Close_Trophy_boaed'))

WebUI.click(findTestObject('Object Repository/Account/Buttons/but_Support'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Account/ver/ver_Popup_support_shows'), 30)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_close_Popup_support'))

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_withdrowal'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Account/ver/ver_Popup_need_more_money_for_withdr'), 30)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_close_popup_withdrawal'))

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_block_add_posts'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/Buttons/button_Add_post'), 30)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_block_purchased_reports'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_purchesed_block_shows'), 30)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Block_reports'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Account/ver/ver_Block_reports_shows'), 30)

WebUI.closeBrowser()



