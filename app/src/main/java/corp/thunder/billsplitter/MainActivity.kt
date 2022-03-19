package corp.thunder.billsplitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun splitBill(view: View) {
        val billAmount = findViewById<EditText>(R.id.billAmount)
        val totalPerson = findViewById<EditText>(R.id.persons)
        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val amount = billAmount.editableText.toString()
            val people = totalPerson.editableText.toString()

        if (amount.isNotEmpty() && people.isNotEmpty()) {
            if(people.toDouble()!=0.0){
            var bill: Double = amount.toDouble() / people.toDouble()
            tvMessage.text = "Each person will have to pay an amount of $bill"}
        }
        if (amount.isEmpty() && people.isEmpty()) {
            tvMessage.text = "Please enter the amount"
        }
        if (people.isEmpty() && amount.isNotEmpty()) {
            tvMessage.text = "Please enter the no of person"
        }
        if(people.isNotEmpty()&&people.toDouble()==0.0) {
            tvMessage.text = "No of person cannot be Zero"
        }
    }
}