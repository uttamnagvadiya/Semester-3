Create Table Student(
	StuID int,
	Name varchar(100),
	EnrollmentNo varchar(12),
	Division varchar(50),
	Sem int,
	BirthDate datetime,
	Email varchar(100),
	ContactNo varchar(50)
);



------------- Records --------------

Insert into Student Values (101, 'Naimish Patel', '090200107051', 'BCX-3', 3, '1992-12-06', 'naimishpatel49@gmail.com', '8866205253')
Insert into Student Values (102, 'Firoz A. S.', '090200107090', 'BCY-3', 3, '1994-05-03', 'firoz.me@gmail.com', '8885999922')
Insert into Student Values (103, 'Krunal Vyas', '090243107101', 'BCZ-5', 5, '1984-03-01', 'krunal.vyas@gmail.com', '9990888877')
Insert into Student Values (104, 'Vijay Patel', '090200107102', 'BCX-5', 5, '1985-02-15', 'vijay.patel123@gmail.com', '8787878787')
Insert into Student Values (105, 'Vimal Trivedi', '090200107103', 'BCY-3', 3, '1988-01-20', 'maulik123@gmail.com', '8789564512')



--------------------------------------------------------------------------------------------------------------------------

1.	Select *
	From Student
	Where Sem in (3, 5)
	-----------------
	Select *
	From Student
	Where Sem=3 or Sem=5



2.	Select Name, EnrollmentNo
	From Student
	Where StuID between 103 and 105



3.	Select Name, EnrollmentNo, Email
	From Student
	Where Sem=5



4.	Select Top 3 *
	From Student



5.	Select Top 30 percent  Name, EnrollmentNo
	From Student
	Where ContactNo like '%7'



6.	Select Distinct Sem
	From Student



7.	Select *
	From Student
	Where EnrollmentNo is Null



8.	Select *
	From Student
	Where Name Not like 'V%'



9.	Select *
	From Student
	Where Email like '%3@g%' and Name like '______'



10.	Select *
	From Student
	Where Name like 'F_R%'



11.	Select *
	From Student
	Where ContactNo like '%877%'



12.	Select *
	From Student
	Where Sem=3 and ContactNo Not Like '%[8, 9]%'



13.	Select *
	From Student
	Where BirthDate > '1990-01-01'



14.	Update Student
	Set Division='BCX-5', Sem=5
	Where StuID=102



15.	Update Student
	Set Name='Firoz Sherasiya'
	Where Email='firoz.me@gmail.com' and ContactNo='8885999922'



16.	Alter Table Student 
	Add City varchar(50)

	

17.	Delete From Student
	Where Division='BCX-3'

	

18.	Sp_Rename 'Student.Email', 'EmailAddress', 'Column'



19.	



20.	Truncate Table Student
