package com.example.misturador

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.SeekBar
import android.widget.TextView

class ManipulaTela {

    private var seekbarRed: SeekBar
    private var seekbarGreen: SeekBar
    private var seekbarBlue: SeekBar
    private var tela: View
    private var textViewMensagem: TextView

    constructor(
        seekbarRed: SeekBar,
        seekbarGreen: SeekBar,
        seekbarBlue: SeekBar,
        tela: View,
        textViewMensagem: TextView
    ) {
        this.seekbarRed = seekbarRed
        this.seekbarGreen = seekbarGreen
        this.seekbarBlue = seekbarBlue
        this.tela = tela
        this.textViewMensagem = textViewMensagem
    }

    fun atualizaTextView(){
        this.textViewMensagem.text = "#" + "%x".format((this.tela.getBackground() as ColorDrawable).color).toUpperCase().subSequence(2,8)

        /*"%x".format(seekbarRed.progress).toUpperCase() +
                "%x".format(seekbarGreen.progress).toUpperCase() +
                "%x".format(seekbarBlue.progress).toUpperCase()*/
    }

    fun atualizaTela(){
        this.tela.setBackgroundColor(Color.rgb(seekbarRed.progress, seekbarGreen.progress, seekbarBlue.progress))
    }
}