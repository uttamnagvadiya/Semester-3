--PR_Student_New_Select	
	
1.	Create Procedure PR_Student_New_Select
	as
	Begin
		Select * 
		From Student_New
	End 

	exec PR_Student_New_Select



--PR_Student_New_Insert 105, 'sadfsa', 123456789, 'ABC-9', 6, '2022-06-30', 'asdf132@gmail.com', 987654312
2.	Create Procedure PR_Student_New_Insert
	@StuID int, @Name varchar(100), @EnrollmentNo varchar(12), @Division varchar(50), @Sem int,
	@BirthDate datetime, @Email varchar(100), @ContactNo varchar(50)
	as
	Begin

		Insert into Student_New(
			StuID,
		    Name,		  
			EnrollmentNo,  
			Division,      
			Sem ,         
			BirthDate,    
			Email,        
			ContactNo
		)
			    
		 Values(
			@StuID,
			@Name,
			@Enrollmentno,
			@Division,
			@Sem,
			@BirthDate,
			@Email,
			@ContactNo
		 )

	End
	




--PR_Student_New_Update 103, 'oijnfdg', '6549873123', 'EFG-7', 4, '1996-05-12', 'asjhd@456gmail.com', 9632587422 
3.	Alter Procedure PR_Student_New_Update
	@StuID int, @Name varchar(100), @EnrollmentNo varchar(12), @Division varchar(50), @Sem int,
	@BirthDate datetime, @Email varchar(100), @ContactNo varchar(50)
	as
	Begin

		Update Student_New
		Set Name = @Name,
			EnrollmentNo = @Enrollmentno,
			Division = @Division,
			Sem = @Sem,
			BirthDate = @BirthDate,
			Email = @Email,
			ContactNo = @ContactNo

		Where StuID = @StuID

	End



--PR_Student_New_Delete 105
4.	Alter Procedure PR_Student_New_Delete
	@StuID int
	as
	Begin

		Delete From Student_New
		Where	StuID = @StuID 
				

	End
	
