import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var currentNumber = StringBuilder()
    private var result = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set click listeners for number buttons
        button0.setOnClickListener { appendNumber("0") }
        button1.setOnClickListener { appendNumber("1") }
        button2.setOnClickListener { appendNumber("2") }
        button3.setOnClickListener { appendNumber("3") }
        button4.setOnClickListener { appendNumber("4") }
        button5.setOnClickListener { appendNumber("5") }
        button6.setOnClickListener { appendNumber("6") }
        button7.setOnClickListener { appendNumber("7") }
        button8.setOnClickListener { appendNumber("8") }
        button9.setOnClickListener { appendNumber("9") }

        // Set click listener for the addition button
        buttonAdd.setOnClickListener { performAddition() }

        // Set click listener for the equals button
        buttonEquals.setOnClickListener { showResult() }

        // Clear the TextView when the app starts
        textViewResult.text = ""
    }

    private fun appendNumber(number: String) {
        currentNumber.append(number)
        textViewResult.text = currentNumber.toString()
    }

    private fun performAddition() {
        // Check if the currentNumber is not empty before performing addition
        if (currentNumber.isNotEmpty()) {
            result += currentNumber.toString().toInt()
            currentNumber.clear()
        }
    }

    private fun showResult() {
        textViewResult.text = result.toString()
    }
}
