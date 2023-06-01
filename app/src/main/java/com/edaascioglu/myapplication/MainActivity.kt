package com.edaascioglu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var j=-10
        if(j==0) {
            ilkFonksiyon()
        }else {
        ikinciFonksiyon()
        }

        val x
       cikarma(x:500,y:20)

        println(x)



        button.setOnClickListener{ it:View!
            val toplamaSonucu= toplma(a:10,b:50)
              textView.text
        }

    }

    fun ilkFonksiyon(){
        println("ilk fonksiyon çalıştırıldı.")
    }
    fun ikinciFonksiyon(){
        println("ikinci fonksiyon çalıştırıldı.")
    }
//girdi almak
    fun cikarma(x: Int, y: Int){

   val textView
    textView.text="Sonuc:$(x-y)"
    }
//çıktı vermek-döndürmek(return)
        fun toplama(a: Int, b:Int) :Int {
      return a+b
 }
    fun degistir(view : View) {
        val a
        val toplamaSonucu = toplama(a:10,b:50)
        val textView
        textView.text="Sonuç: ${toplamaSonucu}"
    }
}