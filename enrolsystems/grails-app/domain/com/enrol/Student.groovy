package com.enrol

class Student {

String name

String studentID

Date dob

Boolean isFundingAvailable

String email

String username

String password

Course course

//Code defining one to many relationship with Module
static hasMany=[modules:Module]

//Relationship is owned by domain class Module
static belongsTo=[Module]

String toString(){
return "$name, $studentID, $course"



}

    static constraints = {
	name blank:false, nullable:false
	studentID blank:false, nullable:false
	dob blank:false, nullable:false
	email blank:false, nullable:false, email:true
	username blank:false, nullable:false, unique:true
	password blank:false, nullable:false
	isFundingAvailable blank:false, nullable:false
	course blank:false, nullable:false

    }
}
