package com.example.aboutscreenmfa

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aboutscreenmfa.databinding.ActivityMainBinding
import com.example.aboutscreenmfa.databinding.CustomBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowAbout.setOnClickListener{ showBottomSheetDialog() }
        binding.githubbtn.setOnClickListener{ openGithub() }
    }

    private fun showBottomSheetDialog() {
        val dialog = BottomSheetDialog(this)

        val sheetBinding: CustomBottomSheetBinding =
            CustomBottomSheetBinding.inflate(layoutInflater, null, false)

        dialog.setContentView(sheetBinding.root)
        dialog.show()
    }

    private fun openGithub() {
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/marcosfandrade")))
    }
}