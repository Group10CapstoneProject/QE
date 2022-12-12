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

Mobile.tap(findTestObject('android.view.View-AWAL'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.view.View'), 0)

int x = findTestData('Register').getRowNumbers()

for (i = 1; i <= x; i++) {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Register/android.widget.EditText - NameNama Lengkap X'), 0)

    Mobile.setText(findTestObject('Register/android.widget.EditText - NameNama Lengkap X'), findTestData('Register').getValue(
            1, i), 0)

    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Register/android.widget.EditText - Email AddressContoh  kelompok10gmail.com X'), 0)

    Mobile.setText(findTestObject('Register/android.widget.EditText - Email AddressContoh  kelompok10gmail.com X'), findTestData(
            'Register').getValue(2, i), 0)

    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Register/android.widget.EditText - Password X'), 0)

    Mobile.setText(findTestObject('Register/android.widget.EditText - Password X'), findTestData('Register').getValue(3, 
            i), 0)

    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Register/android.widget.EditText - Confirm Password X'), 0)

    Mobile.setText(findTestObject('Register/android.widget.EditText - Confirm Password X'), findTestData('Register').getValue(
            4, i), 0)

    Mobile.pressBack()

    Mobile.tap(findTestObject('Register/android.widget.Button-Daftar'), 0)

    Mobile.verifyElementExist(findTestObject('Register/android.view.View-Sudah Memiliki Account'), 0)

    if (i == 10) {
        int RN

        RN = ((Math.random() * 500) as int)

        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Register/android.widget.EditText - NameNama Lengkap X'), 0)

        Mobile.setText(findTestObject('Register/android.widget.EditText - NameNama Lengkap X'), findTestData('Register').getValue(
                1, i), 0)

        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Register/android.widget.EditText - Email AddressContoh  kelompok10gmail.com X'), 0)

        Mobile.setText(findTestObject('Register/android.widget.EditText - Email AddressContoh  kelompok10gmail.com X'), 
            ('QEmobile' + RN) + '@gmail.com', 0)

        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Register/android.widget.EditText - Password X'), 0)

        Mobile.setText(findTestObject('Register/android.widget.EditText - Password X'), findTestData('Register').getValue(
                3, i), 0)

        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Register/android.widget.EditText - Confirm Password X'), 0)

        Mobile.setText(findTestObject('Register/android.widget.EditText - Confirm Password X'), findTestData('Register').getValue(
                4, i), 0)

        Mobile.pressBack()

        Mobile.tap(findTestObject('Register/android.widget.Button-Daftar'), 0)

        Mobile.verifyElementVisible(findTestObject('Login/android.view.View-Lupa Password'), 0)

        Mobile.closeApplication()
    }
}

