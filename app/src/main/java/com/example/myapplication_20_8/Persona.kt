package com.example.myapplication_20_8

import java.time.LocalDate
import java.time.Period
import java.util.Objects

class Persona {
    // Setters
    // Getters
    var firstName: String?
    var lastName: String?

    // Constructor
    constructor(firstName: String?, lastName: String?) {
        this.firstName = firstName
        this.lastName = lastName
    }

    val fullName: String
        // Utility methods
        get() = firstName + " " + lastName
}