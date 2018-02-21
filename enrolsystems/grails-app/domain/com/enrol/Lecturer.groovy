package com.enrol

class Lecturer {

String fullName

String post

String subject

String lecturerEmail

String office

String bio


//Code defining one to many relationship with Module and Course
static hasMany=[modules:Module, courses:Course]

//Relationship is owned by domain class Course
static belongsTo=[Course]

String validatinglecturerEmail(){
return "$lecturerEmail"
}

String toString(){

return fullName

}

    static constraints = {
	fullName blank:false, nullable:false
	post blank:false, nullable:false
	subject blank:false, nullable:false
	lecturerEmail blank:false, nullable:false, email:true
	office blank:false, nullable:false
	bio blank:false, nullable:false, maxSize:5000, widget:'textarea'

    }
}
