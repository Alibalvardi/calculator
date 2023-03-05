package com.example.calculatorxiami

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewTreeObserver
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.calculatorxiami.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var haveDot = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onNumberClicked()
        onOperationClicked()

    }

    private fun onNumberClicked() {

        binding.btnDot.setOnClickListener {

            if (binding.txtJavab.text.contains("=")) {

                binding.txtExpression.text = ""
                binding.txtJavab.text = ""

                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }

            val text = binding.txtExpression.text.toString()
            if (text.isEmpty()) {
                haveDot = true
                appendText("0.")
            } else if ( text.substring(
                    text.length - 1,
                    text.length
                ) == "+" || text.substring(text.length - 1, text.length) == "-" || text.substring(
                    text.length - 1,
                    text.length
                ) == "*" || text.substring(text.length - 1, text.length) == "/" || text.substring(
                    text.length - 1,
                    text.length
                ) == ")" || text.substring(text.length - 1, text.length) == "("
            ) {
                haveDot = true
                appendText("0.")
            } else if (!haveDot) {
                haveDot = true
                appendText(".")
            }
        }

        binding.btn0.setOnClickListener {

            if (binding.txtJavab.text.contains("=")) {

                binding.txtExpression.text = ""
                binding.txtJavab.text = ""

                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }

            if (binding.txtExpression.text.isNotEmpty())
                appendText("0")
        }

        binding.btn1.setOnClickListener {
            if (binding.txtJavab.text.contains("=")) {

                binding.txtExpression.text = ""
                binding.txtJavab.text = ""

                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }
            appendText("1")
        }

        binding.btn2.setOnClickListener {
            if (binding.txtJavab.text.contains("=")) {

                binding.txtExpression.text = ""
                binding.txtJavab.text = ""

                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }
            appendText("2")
        }

        binding.btn3.setOnClickListener {
            if (binding.txtJavab.text.contains("=")) {

                binding.txtExpression.text = ""
                binding.txtJavab.text = ""

                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }
            appendText("3")
        }

        binding.btn4.setOnClickListener {
            if (binding.txtJavab.text.contains("=")) {

                binding.txtExpression.text = ""
                binding.txtJavab.text = ""

                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }
            appendText("4")
        }

        binding.btn5.setOnClickListener {
            if (binding.txtJavab.text.contains("=")) {

                binding.txtExpression.text = ""
                binding.txtJavab.text = ""

                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }
            appendText("5")
        }

        binding.btn6.setOnClickListener {
            if (binding.txtJavab.text.contains("=")) {

                binding.txtExpression.text = ""
                binding.txtJavab.text = ""

                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }
            appendText("6")
        }

        binding.btn7.setOnClickListener {
            if (binding.txtJavab.text.contains("=")) {

                binding.txtExpression.text = ""
                binding.txtJavab.text = ""

                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }
            appendText("7")
        }

        binding.btn8.setOnClickListener {
            if (binding.txtJavab.text.contains("=")) {

                binding.txtExpression.text = ""
                binding.txtJavab.text = ""

                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }
            appendText("8")
        }

        binding.btn9.setOnClickListener {
            if (binding.txtJavab.text.contains("=")) {

                binding.txtExpression.text = ""
                binding.txtJavab.text = ""

                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }
            appendText("9")
        }

    }

    @SuppressLint("SetTextI18n")
    private fun onOperationClicked() {

        binding.btnAC.setOnClickListener {

            if (binding.txtJavab.text.contains("=")) {
                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))
            }

            binding.txtExpression.text = ""
            binding.txtJavab.text = ""
        }

        binding.btnDelete.setOnClickListener {

            val oldText = binding.txtExpression.text.toString()
            if (oldText.isNotEmpty() && !binding.txtJavab.text.contains("=")) {
                if (oldText.substring(oldText.length - 1, oldText.length) == ".")
                    haveDot = false
                binding.txtExpression.text = oldText.substring(0, oldText.length - 1)
                appendText("")
                if (binding.txtExpression.text.isEmpty())
                    binding.txtJavab.text = ""
            }
        }

        binding.btnZarb.setOnClickListener {

            val thisChar = '*'

            if (binding.txtJavab.text.contains("=")) {
                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))

                binding.txtExpression.text =
                    binding.txtJavab.text.substring(2, binding.txtJavab.text.length)
                binding.txtJavab.text = binding.txtExpression.text.toString()
            }


            if (binding.txtExpression.text.isNotEmpty()) {
                val lastChar = binding.txtExpression.text.last()
                if (lastChar != '+' && lastChar != '-' && lastChar != '*' && lastChar != '/') {
                    appendText("*")
                    haveDot = false
                } else if (lastChar != thisChar) {
                    val str = binding.txtExpression.text.substring(
                        0,
                        binding.txtExpression.text.length - 1
                    )
                    binding.txtExpression.text = ""
                    appendText("$str*")
                    haveDot = false
                }
            }
        }

        binding.btnTagsim.setOnClickListener {

            val thisChar = '/'

            if (binding.txtJavab.text.contains("=")) {
                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))

                binding.txtExpression.text =
                    binding.txtJavab.text.substring(2, binding.txtJavab.text.length)
                binding.txtJavab.text = binding.txtExpression.text.toString()
            }


            if (binding.txtExpression.text.isNotEmpty()) {
                val lastChar = binding.txtExpression.text.last()
                if (lastChar != '+' && lastChar != '-' && lastChar != '*' && lastChar != '/') {
                    appendText("/")
                    haveDot = false
                } else if (lastChar != thisChar) {
                    val str = binding.txtExpression.text.substring(
                        0,
                        binding.txtExpression.text.length - 1
                    )
                    binding.txtExpression.text = ""
                    appendText("$str/")
                    haveDot = false
                }
            }
        }

        binding.btnAdd.setOnClickListener {

            val thisChar = '+'

            if (binding.txtJavab.text.contains("=")) {
                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))

                binding.txtExpression.text =
                    binding.txtJavab.text.substring(2, binding.txtJavab.text.length)
                binding.txtJavab.text = binding.txtExpression.text.toString()
            }


            if (binding.txtExpression.text.isNotEmpty()) {
                val lastChar = binding.txtExpression.text.last()
                if (lastChar != '+' && lastChar != '-' && lastChar != '*' && lastChar != '/') {
                    appendText("+")
                    haveDot = false
                } else if (lastChar != thisChar) {
                    val str = binding.txtExpression.text.substring(
                        0,
                        binding.txtExpression.text.length - 1
                    )
                    binding.txtExpression.text = ""
                    appendText("$str+")
                    haveDot = false
                }
            }
        }

        binding.btnMenha.setOnClickListener {

            val thisChar = '-'

            if (binding.txtJavab.text.contains("=")) {
                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))

                binding.txtExpression.text =
                    binding.txtJavab.text.substring(2, binding.txtJavab.text.length)
                binding.txtJavab.text = binding.txtExpression.text.toString()
            }



            if (binding.txtExpression.text.isNotEmpty()) {
                val lastChar = binding.txtExpression.text.last()
                if (lastChar != '+' && lastChar != '-' && lastChar != '*' && lastChar != '/') {
                    appendText("-")
                    haveDot = false
                } else if (lastChar != thisChar) {
                    val str = binding.txtExpression.text.substring(
                        0,
                        binding.txtExpression.text.length - 1
                    )
                    binding.txtExpression.text = ""
                    appendText("$str-")
                    haveDot = false
                }
            }
        }

        binding.btnbaz.setOnClickListener {
            if (binding.txtJavab.text.contains("=")) {
                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))

                binding.txtExpression.text =
                    binding.txtJavab.text.substring(2, binding.txtJavab.text.length)
                binding.txtJavab.text = binding.txtExpression.text.toString()
            }
            appendText("(")
            haveDot = false
        }

        binding.btnbaste.setOnClickListener {
            if (binding.txtJavab.text.contains("=")) {
                val color = binding.txtJavab.textColors
                binding.txtExpression.textSize = 56F
                binding.txtExpression.setTextColor(color)

                binding.txtJavab.textSize = 35F
                binding.txtJavab.setTextColor(ContextCompat.getColor(this, R.color.gray_dark))

                binding.txtExpression.text =
                    binding.txtJavab.text.substring(2, binding.txtJavab.text.length)
                binding.txtJavab.text = binding.txtExpression.text.toString()
            }
            appendText(")")
            haveDot = false
        }

        binding.btnMosavi.setOnClickListener {

            if (!binding.txtJavab.text.contains("=")) {
                try {
                    val expression =
                        ExpressionBuilder(binding.txtExpression.text.toString()).build()
                    val result = expression.evaluate()
                    val longResult = result.toLong()

                    if (result == longResult.toDouble())
                        binding.txtJavab.text = "= $longResult"
                    else
                        binding.txtJavab.text = "= $result"

                    //35  56
                    val color = binding.txtExpression.textColors
                    binding.txtExpression.textSize = 35F
                    binding.txtExpression.setTextColor(
                        ContextCompat.getColor(
                            this,
                            R.color.gray_dark
                        )
                    )

                    binding.txtJavab.textSize = 56F
                    binding.txtJavab.setTextColor(color)

                } catch (E: Exception) {
                    val lastChar = binding.txtExpression.text.last()
                    if (lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/') {

                        val str = binding.txtExpression.text.substring(
                            0,
                            binding.txtExpression.text.length - 1
                        )
                        binding.txtExpression.text = str

                        val expression =
                            ExpressionBuilder(binding.txtExpression.text.toString()).build()
                        val result = expression.evaluate()
                        val longResult = result.toLong()

                        if (result == longResult.toDouble())
                            binding.txtJavab.text = "= $longResult"
                        else
                            binding.txtJavab.text = "= $result"

                        //35  56
                        val color = binding.txtExpression.textColors
                        binding.txtExpression.textSize = 35F
                        binding.txtExpression.setTextColor(
                            ContextCompat.getColor(
                                this,
                                R.color.gray_dark
                            )
                        )

                        binding.txtJavab.textSize = 56F
                        binding.txtJavab.setTextColor(color)

                    } else
                        Toast.makeText(this, "error...", Toast.LENGTH_LONG).show()
                }
            }


        }
    }

    private fun appendText(text: String) {

        binding.txtExpression.append(text)

        try {

            val expression = ExpressionBuilder(binding.txtExpression.text.toString()).build()
            val result = expression.evaluate()
            val longResult = result.toLong()

            if (result == longResult.toDouble())
                binding.txtJavab.text = "$longResult"
            else
                binding.txtJavab.text = "$result"

        } catch (e: Exception) {
        }

        val viewTree: ViewTreeObserver = binding.horizontalScrollViewText.viewTreeObserver
        viewTree.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {

                binding.horizontalScrollViewText.viewTreeObserver.removeOnGlobalLayoutListener(this)
                binding.horizontalScrollViewText.scrollTo(binding.txtExpression.width, 0)

            }

        })

    }


}
