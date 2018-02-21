package com.enrol

class BootStrap {

    def init = { servletContext ->
	
	def leader1=new Leader(
	fullName:'Dr Tom Donaldson',
	department:'Computing',
	subject:'Mobile Applications',
	leaderEmail:'t.donaldson@emai.com',
	username:'tdonald',
	password:'secret',
	office:'B-9432',
	bio:'''Insert the bidsfewgo of loren ipsum donald t''').save()	

	def leader2=new Leader(
	fullName:'Dr Owen Philips',
	department:'Engineering',
	subject:'Quantum Mechanics',
	leaderEmail:'drowen@aol.com',
	username:'drophil',
	password:'p4sw0rd',
	office:'9132',
	bio:'''Insert the bio of loren ipsum gipdum''').save()

	def leader3=new Leader(
	fullName:'Dr Phil Mitchell',
	department:'Computing',
	subject:'Programming',
	leaderEmail:'drphil@tal.com',
	username:'iamphil',
	password:'ph1lm31n',
	office:'8055',
	bio:'''Insert the bio for larun upsim gipdum''').save()	

	def computing=new Course(
	department:'Computing',
	title:'BSc Hon Computing',
	leader:leader3,
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
	leader:leader2,
	code:'EN113',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	description:'''Lorem ipsym dolor sait amet, cum sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates''',
	numberOfStudents:90,
	tuitionFees:9000.00,
	studyMode:'Fulltime').save()

	def animation=new Course(
	department:'Computing',
	title:'BSc Hon Interactive Media with Animation',
	leader:leader1,
	code:'IMA101',
	startDate:new Date('19/09/2017'),
	endDate:new Date('19/08/2020'),
	description:'''Lorem ipsym dolor sait amet, cum sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide vulputate tacimates''',
	numberOfStudents:55,
	tuitionFees:9000,
	studyMode:'Fulltime').save()

	def student1=new Student(
	name:'Joe James',
	studentID:'JJ0001',
	dob:new Date('03/01/1989'),
	isFundingAvailable:true,
	email:'jj89@gmail.com',
	username:'joej89',
	password:'ssaprwdo',
	course:computing).save()

	def student2=new Student(
	name:'Ryan Lee',
	studentID:'JJ0049',
	dob:new Date('21/05/1999'),
	isFundingAvailable:true,
	email:'rlee@gmail.com',
	username:'ryanlee1',
	password:'pasword2134',
	course:engineering).save()

	def student3=new Student(
	name:'Jane Armando',
	studentID:'b38845',
	dob:new Date('10/11/1996'),
	isFundingAvailable:true,
	email:'kst@email.com',
	username:'rvg96',
	password:'secret',
	course:animation).save()

	def student4=new Student(
	name:'Jess Armando',
	studentID:'b308125',
	dob:new Date('04/01/1995'),
	isFundingAvailable:true,
	email:'ja2@email.com',
	username:'jarm95',
	password:'secret',
	course:animation).save()

	def student5=new Student(
	name:'Paul James',
	studentID:'b51521',
	dob:new Date('29/11/1993'),
	isFundingAvailable:true,
	email:'pj1@email.com',
	username:'pj1993',
	password:'secret',
	course:computing).save()

	def lecturermatt=new Lecturer(
	fullName:'Matthew Smith',
	post:'Lecturer',
	subject:'Mobile Applications',
	lecturerEmail:'matthew123@gmail.com',
	office:'5323',
	bio:'''Insert the bio of matt ''').save()

	def lecturerryan=new Lecturer(
	fullName:'Ryan Thomas',
	post:'Assistant Lecturer',
	subject:'Web Design',
	lecturerEmail:'ryant01@gmail.com',
	office:'G501',
	bio:'''Insert the bio of loren ipsum ''').save()

	def lecturersteve=new Lecturer(
	fullName:'Dr Steve Crossbar',
	post:'Lecturer',
	subject:'Web Design',
	lecturerEmail:'s.h.crossbar@theUni.ac.uk',
	office:'Office-2211',
	bio:'''Insert the bidsfewgo of loren ipsum ''').save()

	def module1=new Module(
	title:'Professional Studies',
	code:'PS410',
	credits:40,
	lecturer:lecturermatt,
	description:'''Professional studies lorem ipsum''').save()

	def module2=new Module(
	title:'System Architectures',
	code:'SYS234',
	credits:20,
	lecturer:lecturerryan,
	description:'''Lorem ipsum dipsum dolor studies lorem ipsum''').save()

	def module3=new Module(
	title:'Web Design',
	code:'W4ST3',
	credits:20,
	lecturer:lecturersteve,
	description:'''Ludus cotnetuous nut amd lorem ipsum''').save()

	def module4=new Module(
	title:'Software Engineering',
	code:'SE021',
	credits:20,
	lecturer:lecturersteve,
	description:'''SoftwareEng lorem ipsum''').save()

	def module5=new Module(
	title:'Computing Project',
	code:'CP46',
	credits:40,
	lecturer:lecturersteve,
	description:'''Computing Project lorem ipsum''').save()

	def module6=new Module(
	title:'Web Analytics',
	code:'WAN81',
	credits:20,
	lecturer:lecturersteve,
	description:'''Web lorem ipsum''').save()

		
	lecturerryan.addToModules(module1)
	lecturerryan.addToModules(module2)
	lecturersteve.addToModules(module3)
	lecturersteve.addToModules(module4)
	computing.addToLecturers(lecturerryan)
	animation.addToLecturers(lecturerryan)	
	lecturersteve.addToCourses(computing)
	lecturersteve.addToCourses(engineering)
	lecturerryan.addToCourses(computing)
	lecturermatt.addToCourses(engineering)
	computing.addToStudents(student1)
	engineering.addToStudents(student2)
	animation.addToStudents(student3)
	animation.addToStudents(student4)
	module1.addToCourses(engineering)
	module2.addToCourses(computing)
	module4.addToCourses(computing)
	module5.addToCourses(computing)
	student1.addToModules(module2)
	student1.addToModules(module3)
	student1.addToModules(module4)
	student1.addToModules(module5)
	student1.addToModules(module6)
	student5.addToModules(module2)
	student5.addToModules(module5)
	
		
		


    }
    def destroy = {
    }
}
