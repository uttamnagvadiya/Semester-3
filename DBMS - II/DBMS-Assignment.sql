
--PR_MST_City_Select
1.	Create Procedure PR_MST_City_Select
	as
	Begin
		Select MST_City.CityID, CityName, Pincode, CityRemarks, MST_State.StateID, MST_State.StateName 
		From MST_State
		Inner Join MST_City
		on MST_State.StateID = MST_City.StateID
	End




	--PR_MST_City_Insert 'Udaipur', '354546', 221002, 'avg'
2.	Create Procedure PR_MST_City_Insert
	@cityname		varchar(250),
	@pincode		varchar(8),
	@stateID		int,
	@cityRemarks	varchar(250)
	
	as
	Begin
		Insert into MST_City
		(
			CityName,
			Pincode,
			StateID,
			CityRemarks
		)
		Values
		(
			@cityname,
			@pincode,
			@stateID,
			@cityRemarks
		)
	End



--PR_MST_City_Update 1010, 'Jabalpur', '354352', 221007, 'good'
3.	Create Procedure PR_MST_City_Update
	@cityID			int,
	@cityname		varchar(250),
	@pincode		varchar(8),
	@stateID		int,
	@cityRemarks	varchar(250)
	
	as
	Begin
		Update MST_City
		Set
			CityName = @cityname,
			Pincode = @pincode,
			StateID = @stateID,
			CityRemarks	= @cityRemarks
		Where
			CityID = @cityID
	End




--PR_MST_City_Delete 1021
4.	Create Procedure PR_MST_City_Delete
	@cityID int
	as
	Begin
		Delete From MST_City
		Where CityID = @cityID
	End

	


	--PR_MST_City_SelectByPK 1005
5.	Create Proc PR_MST_City_SelectByPK
	@cityID int
	as
	Begin 
		Select *
		From MST_City
		Where CityID = @cityID
	End





	--PR_MST_City_SelectByPincodeStartWith360
6.	Create Procedure PR_MST_City_SelectByPincodeStartWith360
	as
	Begin
		Select *
		From MST_City
		Where Pincode like '360%'
	End




	--PR_MST_City_SelectByCityNamePincode 'Rajkot', '657676'
7.	Create Procedure PR_MST_City_SelectByCityNamePincode
	@cityName	varchar(250),
	@pincode	varchar(250)
	as
	Begin
		Select *
		From MST_City
		Where CityName = @cityName or Pincode = @pincode
	End





	--PR_MST_City_SelectByCityRemarks 'avg'
8.	Create Procedure PR_MST_City_SelectByCityRemarks
	@cityRemarks	varchar(250)
	as
	Begin
		Select *
		From MST_City
		Where CityRemarks = @cityRemarks
	End





	--PR_MST_City_SelectByStateID 221009
9.	Create Procedure PR_MST_City_SelectByStateID
	@stateID int
	as
	Begin
		Select *
		From MST_City
		Where StateID = @stateID
	End




	--PR_MST_City_SelectByStateIDCityID 221001, 1004
10.	Create Procedure PR_MST_City_SelectByStateIDCityID
	@stateID int, 
	@cityID  int
	as
	Begin
		Select *
		From MST_City
		Where StateID = @stateID or CityID = @cityID
	End
