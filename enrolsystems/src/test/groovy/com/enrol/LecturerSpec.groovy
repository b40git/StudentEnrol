package com.enrol

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class LecturerSpec extends Specification implements DomainUnitTest<Lecturer> {

    def setup() {
    }

    def cleanup() {
    }

    void invalidEmail() {
        when:"Email is invalid"
	def emailtest=new Lecturer(
	fullName:'Dave Wright',
	post:'egesdgpost',
	subject:'Mobile Applications',
	lecturerEmail:'dwright',
	office:'officenamehere',
	bio:'''insert bio here''')

	then:"Validation should fail "
	emailtest.validatinglecturerEmail()
    }
}
