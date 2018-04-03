import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Desktop.Action as Action
import javax.swing.plaf.basic.BasicButtonListener.Actions as Actions
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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.junit.After as After
import org.openqa.selenium.WebDriver as WebDriver
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

WebUI.switchToWindowTitle('Write report - Route Report')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Step_1/but_Step4'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_4/ver_step4_isloaded'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Step_4/but_add_language'))

WebUI.click(findTestObject('Object Repository/Step_4/EN_lang'))

WebUI.setText(findTestObject('Object Repository/Step_4/input_phone'), '13245678')

WebUI.setText(findTestObject('Object Repository/Step_4/input_mail'), 'mail@com.com')

WebUI.setText(findTestObject('Object Repository/Step_4/input_FB'), 'FB')

WebUI.setText(findTestObject('Object Repository/Step_4/input_Skype'), 'Skype')

WebUI.setText(findTestObject('Object Repository/Step_4/inpuit_viber'), '132132')

WebUI.setText(findTestObject('Object Repository/Step_4/input_Whatapp'), '32123')

/*WebUI.click(findTestObject('Object Repository/Step_4/select_ohther_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Step_4/Other_Telegram'))

WebUI.delay(2)*/

WebUI.setText(findTestObject('Object Repository/Step_4/input_coment'), 'x')

WebUI.click(findTestObject('Object Repository/Step_4/button_Next_step5'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_5/ver_Step5_isloaded'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Step_5/but_Publish_report'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Step_5/ver_publish_ok'), 20)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Step_5/but_OK_cong'))

WebUI.closeBrowser()

