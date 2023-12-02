package com.lazyprogrammer.lazyprocessorexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lazy.processor.Private

//@Private
class MainActivity : AppCompatActivity() {
   //@Private
    var mName: String = "Anindya Das"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}