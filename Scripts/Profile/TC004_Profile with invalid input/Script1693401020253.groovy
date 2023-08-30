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

Mobile.setText(findTestObject('Profile/input_Profile'), '', 0)

Mobile.tap(findTestObject('Profile/btn_OkInputProfile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_Email'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Profile/btn_Email'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Profile/input_Profile'), 'emailgmail.com', 0)

Mobile.tap(findTestObject('Profile/btn_OkInputProfile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_Phone'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Profile/btn_Phone'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Profile/input_Profile'), '0', 0)

Mobile.tap(findTestObject('Profile/btn_OkInputProfile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_Address'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Profile/btn_Address'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Profile/input_Profile'), '', 0)

Mobile.tap(findTestObject('Profile/btn_OkInputProfile'), 0)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Profile/txt_NameProfile'), GlobalVariable.Global_NameProfile, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Profile/txt_Email'), GlobalVariable.Global_EmailProfile, FailureHandling.STOP_ON_FAILURE)

//seharusnya no hp diberi batas minimal 10-12, sehingga jika user memasukkan kurang dari itu maka error.
Mobile.verifyElementText(findTestObject('Profile/txt_Phone'), GlobalVariable.Global_PhoneProfile, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Profile/txt_Address'), GlobalVariable.Global_AddressProfile, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable/Terminate Existing App'), [:], FailureHandling.STOP_ON_FAILURE)

