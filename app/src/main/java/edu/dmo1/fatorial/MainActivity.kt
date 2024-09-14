package edu.dmo1.fatorial

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var factorialButton: Button
    private lateinit var numberEdit: EditText
    private lateinit var outputText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Obtendo referencias dos elementos de layout.
         */
        factorialButton = findViewById(R.id.button_calculate)
        numberEdit = findViewById(R.id.edit_number)
        outputText = findViewById(R.id.text_output)

        /**
         * Definindo o comportamento do listener do botão.
         */
        factorialButton.setOnClickListener {
            val number = numberEdit.text.toString().toInt()
            var factorial = 1;
            for (i in 2..number){
                factorial *= i;
            }
            outputText.setText("$number! = $factorial")
        }
    }
}