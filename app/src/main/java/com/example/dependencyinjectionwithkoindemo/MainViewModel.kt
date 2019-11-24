package com.example.dependencyinjectionwithkoindemo

/*Here we have 3 classes Student,SchoolCourse and Friend
Student can be enrolled in any course and Student can have friends
 */

class Student(private var course: SchoolCourse, private var friend: Friend) {

    /*Here SchoolCourse and Friends are tightly coupled with Student class means each time you
    we are creating Student class ,we are forced to create SchoolCourse and Friend Object which is
    a bad practice .Defining dependency inside the class is not recommended but we can provide the
    dependencies through constructor.Here comes the role of Koin.Koin is a dependency injection framework
    that helps us to manipulate dependencies rather than creating them inside the class.
    * */

    // var course = SchoolCourse()  // Defining dependency SchoolCourse inside Student class (Not recommended)
    // var friend = Friend() // Defining dependency Friend inside Student class (Not recommended)

    fun show() {
        course.study()
        friend.hangout()
    }
}

class SchoolCourse {
    fun study() {
        println("I am studying koin")
    }
}

class Friend {
    fun hangout() {
        println("We are hanging out")
    }
}