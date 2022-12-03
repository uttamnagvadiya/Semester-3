import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ApiFacultiesService } from 'src/app/api-faculty.service';

@Component({
  selector: 'app-add-new-faculty',
  templateUrl: './add-new-faculty.component.html',
  styleUrls: ['./add-new-faculty.component.css']
})
export class AddNewFacultyComponent {

  id = -1;

  buttonValue = "Add";

  constructor(private __api:ApiFacultiesService, private __router:Router, private __activateRoute : ActivatedRoute) {}

  myForm = new FormGroup({
    FacultyName:new FormControl(''),
    FacultyDesignation:new FormControl(''),
    FacultyQualification:new FormControl(''),
    FacultyExperience:new FormControl(''),
    FacultyWorkingSince:new FormControl(''),
    FacultyMobileNumber:new FormControl(),
    FacultyEmail:new FormControl(''),
    FacultySeating:new FormControl(''),
    FacultyAreaSpecialization:new FormControl(''),
    FacultySubjectsTaught:new FormControl(''),
    FacultyImage:new FormControl('')
  });

  ngOnInit(){
    if(this.__activateRoute.snapshot.params['id'] != null){
      this.id = this.__activateRoute.snapshot.params['id'];
      this.buttonValue = "Edit";
      this.__api.getFacultyById(this.id).subscribe((res : any)=>{
        this.myForm.controls.FacultyAreaSpecialization.setValue(res.FacultyAreaSpecialization);
        this.myForm.controls.FacultyDesignation.setValue(res.FacultyDesignation);
        this.myForm.controls.FacultyEmail.setValue(res.FacultyEmail);
        this.myForm.controls.FacultyExperience.setValue(res.FacultyExperience);
        this.myForm.controls.FacultyImage.setValue(res.FacultyImage);
        this.myForm.controls.FacultyMobileNumber.setValue(res.FacultyMobileNumber);
        this.myForm.controls.FacultyName.setValue(res.FacultyName);
        this.myForm.controls.FacultyQualification.setValue(res.FacultyQualification);
        this.myForm.controls.FacultySeating.setValue(res.FacultySeating);
        this.myForm.controls.FacultySubjectsTaught.setValue(res.FacultySubjectsTaught);
        this.myForm.controls.FacultyWorkingSince.setValue(res.FacultyWorkingSince);
      });
    }
  }

  insertFaculty(){

    if (this.id > 0) {
      this.__api.updateFaculty(this.id, this.myForm.value).subscribe((res)=>{
        this.__router.navigate(['/faculties']);
      });
    }
    else{
      this.__api.insertFaculty(this.myForm.value).subscribe((res)=>{
        this.__router.navigate(['/faculties']);
      });
    }

  }
}
