import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Faculty } from 'src/app/faculty';

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html',
  styleUrls: ['./crud.component.css']
})
export class CrudComponent {

  myForm = new FormGroup({
    FacultyName : new FormControl('', Validators.required),
    FacultyDesignation : new FormControl('', Validators.required)
  });
  
  faculties:Faculty[] = [];

  idToEdit = -1;

  CreateORUpdate(){
    if(this.idToEdit < 0){
      this.faculties.push(<Faculty>this.myForm.value);
    }
    else{
      this.faculties[this.idToEdit] = <Faculty>this.myForm.value;
      this.idToEdit = -1;
    }

    this.myForm.controls.FacultyName.setValue('');
    this.myForm.controls.FacultyDesignation.setValue('');
  }

  Delete(i:any){
    this.faculties.splice(i,1);
  }

  Edit(i:any){
    this.idToEdit = i;
    this.myForm.controls.FacultyName.setValue(this.faculties[i].FacultyName);
    this.myForm.controls.FacultyDesignation.setValue(this.faculties[i].FacultyDesignation);

  }
}
