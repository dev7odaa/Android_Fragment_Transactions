package com.example.fragmenttransactions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.viewbinding.ViewBinding
import com.example.fragmenttransactions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLion.setOnClickListener(this)
        binding.btnElephant.setOnClickListener(this)
        binding.btnDog.setOnClickListener(this)
        binding.btnCat.setOnClickListener(this)
        binding.btnSheep.setOnClickListener(this)

        fragmentManager = supportFragmentManager
        replaceFragment(LionFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.btn_lion -> replaceFragment(LionFragment())
            R.id.btn_elephant -> replaceFragment(ElephantFragment())
            R.id.btn_dog -> replaceFragment(DogFragment())
            R.id.btn_cat -> replaceFragment(CatFragment())
            R.id.btn_sheep -> replaceFragment(SheepFragment())
            else -> {}
        }
    }
}