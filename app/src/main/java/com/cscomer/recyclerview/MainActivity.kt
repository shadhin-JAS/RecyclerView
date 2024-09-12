package com.cscomer.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cscomer.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val Names = listOf(
        "John", "Emma", "Oliver", "Sophia", "Liam", "Ava", "Noah", "Isabella", "James", "Mia",
        "Lucas", "Amelia", "Mason", "Harper", "Ethan", "Evelyn", "Logan", "Abigail", "Alexander", "Emily",
        "Jacob", "Ella", "Michael", "Elizabeth", "Daniel", "Sofia", "Henry", "Madison", "Jackson", "Scarlett",
        "Sebastian", "Victoria", "David", "Grace", "Matthew", "Chloe", "Joseph", "Lily", "Samuel", "Zoey",
        "Carter", "Penelope", "Owen", "Lillian", "Wyatt", "Aria", "Jack", "Aubrey", "Luke", "Hannah",
        "Jayden", "Zoe", "Dylan", "Nora", "Levi", "Addison", "Gabriel", "Layla", "Isaac", "Hazel",
        "Anthony", "Ellie", "Julian", "Paisley", "Leo", "Audrey", "Lincoln", "Brooklyn", "Christopher", "Bella",
        "Jaxon", "Claire", "Andrew", "Skylar", "Grayson", "Lucy", "Joshua", "Savannah", "Christopher", "Camila",
        "Ezra", "Ariana", "Nolan", "Genesis", "Hunter", "Kennedy", "Aaron", "Sadie", "Eli", "Allison",
        "Ryan", "Caroline", "Adrian", "Anna", "Thomas", "Ruby", "Charles", "Alice", "Jeremiah", "Hailey"
    )


    lateinit var adapter: NameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        adapter=NameAdapter()
        adapter.submitList(Names)

        binding.recyclerVI.adapter=adapter

    }
}