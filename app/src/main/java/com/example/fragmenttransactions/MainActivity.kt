package com.example.fragmenttransactions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
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
            R.id.btn_lion -> {
                binding.btnLion.setBackgroundColor(ContextCompat.getColor(this, R.color.primary))
                binding.btnLion.setTextColor(ContextCompat.getColor(this, R.color.white))
                binding.btnElephant.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnElephant.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnDog.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnDog.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnCat.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnCat.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnSheep.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnSheep.setTextColor(ContextCompat.getColor(this, R.color.gray))
                replaceFragment(LionFragment())
            }

            R.id.btn_elephant -> {
                binding.btnLion.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnLion.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnElephant.setBackgroundColor(ContextCompat.getColor(this, R.color.primary))
                binding.btnElephant.setTextColor(ContextCompat.getColor(this, R.color.white))
                binding.btnDog.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnDog.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnCat.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnCat.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnSheep.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnSheep.setTextColor(ContextCompat.getColor(this, R.color.gray))
                replaceFragment(ElephantFragment())
            }

            R.id.btn_dog -> {
                binding.btnLion.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnLion.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnElephant.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnElephant.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnDog.setBackgroundColor(ContextCompat.getColor(this, R.color.primary))
                binding.btnDog.setTextColor(ContextCompat.getColor(this, R.color.white))
                binding.btnCat.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnCat.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnSheep.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnSheep.setTextColor(ContextCompat.getColor(this, R.color.gray))
                replaceFragment(DogFragment())
            }

            R.id.btn_cat -> {
                binding.btnLion.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnLion.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnElephant.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnElephant.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnDog.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnDog.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnCat.setBackgroundColor(ContextCompat.getColor(this, R.color.primary))
                binding.btnCat.setTextColor(ContextCompat.getColor(this, R.color.white))
                binding.btnSheep.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnSheep.setTextColor(ContextCompat.getColor(this, R.color.gray))
                replaceFragment(CatFragment())
            }

            R.id.btn_sheep -> {
                binding.btnLion.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnLion.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnElephant.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnElephant.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnDog.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnDog.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnCat.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                binding.btnCat.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.btnSheep.setBackgroundColor(ContextCompat.getColor(this, R.color.primary))
                binding.btnSheep.setTextColor(ContextCompat.getColor(this, R.color.white))
                replaceFragment(SheepFragment())
            }

            else -> {}
        }
    }
}