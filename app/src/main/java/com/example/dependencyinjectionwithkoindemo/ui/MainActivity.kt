package com.example.dependencyinjectionwithkoindemo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dependencyinjectionwithkoindemo.R
import com.example.dependencyinjectionwithkoindemo.Student
import org.koin.android.ext.android.get

// Injecting dependencies
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  var friend = get<Friend>()
        //  friend.hangout()
        // var course = get<SchoolCourse>()

        var student = get<Student>()
        student.show() // It will print : I am studying koin and We are hanging out

    }
}
