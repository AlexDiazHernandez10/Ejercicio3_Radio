package mx.edu.tecmm.moviles.ejercicio3_radio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edNum1: EditText
    lateinit var edNum2: EditText
    lateinit var  rdSuma: RadioButton
    lateinit var rdResta: RadioButton
    lateinit var lblResultado: TextView
    lateinit var rdDividir:  RadioButton
    lateinit var rdMultiplicar:  RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        edNum1 = findViewById(R.id.edNum1)
        edNum2 = findViewById(R.id.edNum2)
        rdSuma = findViewById(R.id.rdSuma)
        rdResta = findViewById(R.id.rdResta)
        lblResultado = findViewById(R.id.txt_resultado)
        rdDividir = findViewById(R.id.rdDividir)
        rdMultiplicar = findViewById(R.id.rdMultiplicar)
    }
    fun presiono (view: View){
        var res:Double = 0.0
        val num1 = edNum1.text.toString().toDouble()
        val num2 = edNum2.text.toString().toDouble()
        if (rdSuma.isChecked)
            res = num1 +num2
        else if (rdResta.isChecked)
            res = num1 - num2
        lblResultado.text = "El resultado es $res"

        if (rdDividir.isChecked)
            res = num1 /num2
        else if (rdMultiplicar.isChecked)
            res = num1 * num2
        lblResultado.text = "El resultado es $res"
    }
}