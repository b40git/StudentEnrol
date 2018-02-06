package com.enrol

class BootStrap {

    def init = { servletContext ->
	def computing=new Course(
	department:'Computing',
	title:'BSc Hon Computing',
	leader:'Dr Michelle Murphy',
	code:'CS123',
	startDate:new Date('09/09/2018'),
	endDate:new Date('07/07/2022'),
	description:'''Lorem ipsym dolor sit amet, cum sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates''',
	numberOfStudents:55,
	tuitionFees:9000.60,
	studyMode:'Fulltime').save()

	def engineering=new Course(
	department:'Engineering',
	title:'BSc Hon Engineering',
	leader:'Dr Phil Smith',
	code:'EN113',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	description:'''Lorem ipsym dolor sait amet, cum sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates''',
	numberOfStudents:90,
	tuitionFees:9000.00,
	studyMode:'Fulltime').save()

	def student1=new Student(
	name:'Joe James',
	studentID:'JJ0001',
	dob:new Date('03/01/1989'),
	isFundingAvailable:true,
	email:'jj89@gmail.com',
	username:'joej89',
	password:'ssaprwdo',
	course:'computing').save()

	def student2=new Student(
	name:'Ryan Lee',
	studentID:'JJ0049',
	dob:new Date('21/05/1999'),
	isFundingAvailable:true,
	email:'rlee@gmail.com',
	username:'ryanlee1',
	password:'pasword2134',
	course:'engineering').save()




    }
    def destroy = {
    }
}
