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

Mobile.tap(findTestObject('Home/ImageView_AppleWatch'), 0)

Mobile.tap(findTestObject('Home/btn_AddToCart'), 0)

Mobile.setText(findTestObject('Home/input_NumberOrder'), '1', 0)

Mobile.tap(findTestObject('Home/btn_AddNumberOrder'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Home/btn_Cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/txt_NameProductCart'), 0)

Mobile.verifyElementText(findTestObject('Cart/txt_NameProductCart'), 'Apple watch series 3 GPS 42mm Black')

Mobile.verifyElementVisible(findTestObject('Cart/txt_PriceQtyCart'), 0)

Mobile.verifyElementText(findTestObject('Cart/txt_PriceQtyCart'), '400 USD x 1')

Mobile.verifyElementVisible(findTestObject('Cart/txt_subtotalCart'), 0)

Mobile.verifyElementText(findTestObject('Cart/txt_subtotalCart'), '400 USD')

Mobile.verifyElementVisible(findTestObject('Cart/txt_TotalCart'), 0)

Mobile.tap(findTestObject('Cart/btn_CheckoutCart'), 0)

Mobile.setText(findTestObject('Checkout/input_NameCheckout'), 'Santi', 0)

Mobile.setText(findTestObject('Checkout/input_EmailCheckout'), 'test@gmail.com', 0)

Mobile.setText(findTestObject('Checkout/input_PhoneCheckout'), '081992718198', 0)

Mobile.setText(findTestObject('Checkout/input_AddressCheckout'), 'Denpasar', 0)

Mobile.tap(findTestObject('Checkout/dropdown_Shipping'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.selectListItemByLabel(findTestObject('Checkout/dropdown_ListShipping'), 'FedEx', 0)

Mobile.setText(findTestObject('Checkout/input_CommentCheckout'), 'Taruh depan pintu', 0)

Mobile.verifyElementVisible(findTestObject('Checkout/txt_OrderDetail'), 0)

Mobile.tap(findTestObject('Checkout/btn_ProcessCheckout'), 0)

Mobile.verifyElementVisible(findTestObject('Checkout/btn_YesConfirmCheckout'), 0)

Mobile.tap(findTestObject('Checkout/btn_YesConfirmCheckout'), 0)

Mobile.verifyElementVisible(findTestObject('Checkout/txt_LoadingSubmitOrder'), 0)

Mobile.verifyElementVisible(findTestObject('Checkout/txt_CongratulationSuccessCheckout'), 0)

Mobile.tap(findTestObject('Checkout/btn_OkSuccessCheckout'), 0)

Mobile.tap(findTestObject('Profile/btn_Profil'), 0)

Mobile.tap(findTestObject('History/btn_History'), 0)

Mobile.verifyElementVisible(findTestObject('History/txt_TotalPurchase'), 0)

Mobile.verifyElementText(findTestObject('History/txt_TotalPurchase'), '440 USD')

Mobile.tap(findTestObject('History/btn_ChooseHistory'), 0)

Mobile.verifyElementVisible(findTestObject('History/txt_DetailTotalOrder'), 0)

Mobile.verifyElementText(findTestObject('History/txt_DetailTotalOrder'), '440 USD')

Mobile.verifyElementVisible(findTestObject('History/txt_DetailOrderProduct'), 0)

Mobile.verifyElementText(findTestObject('History/txt_DetailOrderProduct'), '1 Apple watch series 3 GPS 42mm Black 400 USD,\n\nOrder : 400 USD\nTax : 10 % : 40 USD\nTotal : 440 USD')

WebUI.callTestCase(findTestCase('Reusable/Terminate Existing App'), [:], FailureHandling.STOP_ON_FAILURE)

