import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Desktop.Action

import javax.swing.plaf.basic.BasicButtonListener.Actions

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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.junit.After
import org.openqa.selenium.WebDriver
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.route-report.com/')

WebUI.maximizeWindow()

String mail = 'rostyslav.biliaiev@route-report.com'

String pass = '111111'

String bigtext = RandomStringUtils.randomNumeric(2000)

mydate = new Date()

formattedDate = mydate.format('MMdd')

dateHour = mydate.format('HHmmss')

String x = (('_date_' + formattedDate) + '_time_') + dateHour

String title = 'Automated test was executed' + x

String authors_text = 'Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors Text from authors '

String youtube = 'https://youtu.be/2VjmdTtcEQE'

WebUI.click(findTestObject('Login_registration/span_Login'))

WebUI.setText(findTestObject('Login_registration/input_in_login'), mail)

WebUI.setText(findTestObject('Login_registration/input_in_password'), pass)

WebUI.click(findTestObject('Login_registration/button_LOG IN'))

WebUI.verifyElementPresent(findTestObject('Login_registration/span_My spoken languages'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Account/Buttons/button_Edit_report_first'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Step_1/but_Next(to_step_2)'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_2/ver_Step_is_loaded'), 10)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_2/ver_Step_is_loaded'), 10)

WebUI.click(findTestObject('Step_2/set_Purpose'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_2/set_Purpose_option'))

WebUI.click(findTestObject('Object Repository/Step_2/set_Main_team'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_2/set_Main_team_option'))

WebUI.click(findTestObject('Object Repository/Step_2/set_Most_of_Acc'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_2/set_Most_of_Acc_option'))

WebUI.click(findTestObject('Object Repository/Step_2/set_Trainig_level'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_2/set_Training_level_option'))

WebUI.click(findTestObject('Object Repository/Step_2/set_Pets'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_2/set_Pets_option'))

WebUI.click(findTestObject('Object Repository/Step_2/set_Sport_category'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_2/set_Sport_category_option'))

WebUI.click(findTestObject('Object Repository/Step_2/set_Age'))

WebUI.click(findTestObject('Object Repository/Step_2/set_Age_option'))

WebUI.setText(findTestObject('Object Repository/Step_2/input_number_team'), '10')

WebUI.setText(findTestObject('Object Repository/Step_2/input_covered'), '15')

WebUI.setText(findTestObject('Object Repository/Step_2/input_Days'), '3')

WebUI.setText(findTestObject('Object Repository/Step_2/input_Budget'), '300')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_1/but_Save_draft'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_1/ver_popup_report_was_saved'), 10)

WebUI.closeBrowser()