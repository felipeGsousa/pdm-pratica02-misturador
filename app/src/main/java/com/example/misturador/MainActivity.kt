package com.example.misturador

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var seekbarRed: SeekBar
    private lateinit var seekbarGreen: SeekBar
    private lateinit var seekbarBlue: SeekBar
    private lateinit var textViewMensagem: TextView
    private lateinit var primeiraCor: PrimeiraCor
    private lateinit var valoresRgb: ArrayList<Int>
    private lateinit var tela: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.primeiraCor = PrimeiraCor()
        this.valoresRgb = ArrayList()
        this.tela = findViewById(R.id.telaCores)

        this.valoresRgb = primeiraCor.setCores()

        this.textViewMensagem = findViewById(R.id.codCores)

        this.seekbarRed = findViewById(R.id.seekbarRed)
        this.seekbarGreen = findViewById(R.id.seekbarGreen)
        this.seekbarBlue = findViewById(R.id.seekbarBlue)

        definePrimeiraCor()

        this.seekbarRed.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                atualizaTela()
                atualizaTextView()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}

            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
        this.seekbarGreen.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                atualizaTela()
                atualizaTextView()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}

            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
        this.seekbarBlue.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                atualizaTela()
                atualizaTextView()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}

            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
    }

    private fun definePrimeiraCor(){

        tela.setBackgroundColor(Color.rgb(valoresRgb[0], valoresRgb[1], valoresRgb[2]))

        seekbarRed.progress = valoresRgb[0]
        seekbarGreen.progress = valoresRgb[1]
        seekbarBlue.progress = valoresRgb[2]

        atualizaTextView()
    }

    private fun atualizaTextView(){
        this.textViewMensagem.text = "%x".format(seekbarRed.progress).toUpperCase() + "%x".format(seekbarGreen.progress).toUpperCase() + "%x".format(seekbarBlue.progress).toUpperCase()
    }

    private fun atualizaTela(){
        this.tela.setBackgroundColor(Color.rgb(seekbarRed.progress, seekbarGreen.progress, seekbarBlue.progress))
    }
}