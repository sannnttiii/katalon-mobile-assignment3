import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Reusable/Start Existing App'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Profile/btn_Profil'), 0)

Mobile.tap(findTestObject('Profile/btn_Edit'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_Name'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Profile/btn_Name'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Profile/input_Profile'), 'Santi', 0)

Mobile.tap(findTestObject('Profile/btn_OkInputProfile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_Email'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Profile/btn_Email'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Profile/input_Profile'), 'email@gmail.com', 0)

Mobile.tap(findTestObject('Profile/btn_OkInputProfile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_Phone'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Profile/btn_Phone'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Profile/input_Profile'), '08189188102', 0)

Mobile.tap(findTestObject('Profile/btn_OkInputProfile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_Address'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Profile/btn_Address'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Profile/input_Profile'), 'Surabaya nich', 0)

Mobile.tap(findTestObject('Profile/btn_OkInputProfile'), 0)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Profile/txt_NameProfile'), 'Santi', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Profile/txt_Email'), 'email@gmail.com', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Profile/txt_Phone'), '08189188102', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Profile/txt_Address'), 'Surabaya nich', FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable/Terminate Existing App'), [:], FailureHandling.STOP_ON_FAILURE)

