package com.example.dependencyinjectionwithkoindemo

import org.koin.core.module.Module
import org.koin.dsl.module

/*  With Koin, setting up dependency injection is kind of a manual process,
    we essentially plug our services/dependencies into the module graphs and those dependencies will
    later get resolved at runtime .

    Module serves as a container for a collection of services/dependencies  that should be
    provided at runtime. We put all the services that a module should provide in the module block
    Inside module function we define our dependencies

 */
var appModule: Module = module {
    /* 1. Provide the following dependencies:
     SchoolCourse,Friend and Student.

     2. Also we need to specify the scope of dependencies .Scoping means providing the lifetime
      or duration of the object.We can use single or factory keyword for scoping .

      a) factory : A factory serves the purpose of qualifying a dependency,
      it tells the Koin framework not to retain this instance but rather,
      create a new instance of this service anywhere the service is required.

      b) single : The single definition does the exact opposite of the what factory does.
       It tells Koin to retain the instance and provide that single instance wherever needed.*/

    // Defines a singleton of SchoolCourse i.e single instance of SchoolCourse will be created
    single { SchoolCourse() }

    //Defines a factory(Create new instance every time
    factory { Friend() }

    //Defines a factory(Create new instance every time
    /* Here student class require two dependencies namely SchoolCourse and Friend
    How does Koin knows from where these dependencies are coming from.

    The get function is a generic function that is used to resolve dependencies where
    needed. You use it to resolve any particular dependency that we need.
    */
    factory { Student(get(), get()) }

}