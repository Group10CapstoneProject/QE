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

Mobile.startExistingApplication('com.example.capstone_alterra_flutter')

Mobile.tap(findTestObject('Object Repository/Membership/android.view.View-Profile'), 0)

Mobile.tap(findTestObject('Membership/android.widget.Button-Activasi Member'), 0)

Mobile.tap(findTestObject('Object Repository/Membership/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Membership/android.widget.EditText - Masukkan jumlah angka disini'), 0)

Mobile.setText(findTestObject('Object Repository/Membership/android.widget.EditText - Masukkan jumlah angka disini (1)'), 
    '3', 0)

Mobile.tap(findTestObject('Object Repository/Membership/android.widget.Button-Lanjutkan Pembayaran'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Membership/android.widget.Button-Metode'), 0)

Mobile.tap(findTestObject('Membership/android.widget.RadioButton-Bank BNI'), 0)

Mobile.tap(findTestObject('Object Repository/Membership/android.widget.Button-Terapkan'), 0)

Mobile.tap(findTestObject('Object Repository/Membership/android.widget.Button-Bayar'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Membership/android.view.View-Konfirmasi Pembayaran Page'), 0)

Mobile.closeApplication()

