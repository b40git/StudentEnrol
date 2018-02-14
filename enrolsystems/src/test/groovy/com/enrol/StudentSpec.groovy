package com.enrol

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class StudentSpec extends Specification implements DomainUnitTest<Student> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {

	when:"A Student has name, ID and course"
	def janet=new Student(
	name:'Janet Taylor',
	studentID:'45907812',
	course:'BSc Hon Engineering')

	then:"the toString method will merge them. "
	janet.toString()=='Janet Taylor, 45907812, BSc Hon Engineering'

        
    }
}
