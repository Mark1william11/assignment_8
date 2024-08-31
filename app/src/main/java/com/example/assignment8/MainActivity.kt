package com.example.assignment8

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignment8.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        val bookList = listOf(
            Books("One Hundred Years of Solitude", "Gabriel Garcia Marquez", R.drawable.solitude),
            Books("Terra Nostra", "Carlos Fuentes", R.drawable.nostra),
            Books("Angels & Demons", "Dan Brown", R.drawable.angels),
            Books("The Sword Thief", "Peter Lerangis", R.drawable.sword),
            Books("Inferno", "Dan Brown", R.drawable.angels),
            Books("Bloodline", "James Rollins", R.drawable.blood),
            Books("The House of The Spirits", "Isabel Alende", R.drawable.spirits)
        )

        val bookAdapter = BookAdapter(bookList)
        binding.rvUsers.layoutManager = LinearLayoutManager(this)
        binding.rvUsers.adapter = bookAdapter



        binding.toolbar.toolbar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.notification ->{
                    Toast.makeText(this, getString(R.string.notification_clicked), Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }


        binding.toolbar.toolbar.setNavigationOnClickListener {
            binding.drawer.open()
        }

        binding.navigationView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.Reviews -> {
                    Toast.makeText(this, getString(R.string.reviews_clicked), Toast.LENGTH_SHORT).show()
                    binding.drawer.close()
                    true
                }
                R.id.favorite -> {
                    Toast.makeText(this, getString(R.string.favorite_clicked), Toast.LENGTH_SHORT).show()
                    binding.drawer.close()
                    true
                }
                R.id.search -> {
                    Toast.makeText(this, getString(R.string.search_clicked), Toast.LENGTH_SHORT).show()
                    binding.drawer.close()
                    true
                }
                R.id.profile -> {
                    Toast.makeText(this, getString(R.string.profile_clicked), Toast.LENGTH_SHORT).show()
                    binding.drawer.close()
                    true
                }
                R.id.settings -> {
                    Toast.makeText(this, getString(R.string.settings_clicked), Toast.LENGTH_SHORT).show()
                    binding.drawer.close()
                    true
                }
                else -> false
            }
        }

    }
}