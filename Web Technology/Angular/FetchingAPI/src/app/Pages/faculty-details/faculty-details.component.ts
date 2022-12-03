import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ApiFacultiesService } from 'src/app/api-faculty.service';
import { Faculties } from 'src/app/ClassFiles/faculties';

@Component({
  selector: 'app-faculty-details',
  templateUrl: './faculty-details.component.html',
  styleUrls: ['./faculty-details.component.css']
})
export class FacultyDetailsComponent {

  id = 0;
  facultyData:Faculties = new Faculties();

  constructor(private __activateRoute : ActivatedRoute, private __api : ApiFacultiesService, private router : Router) {

  }

  ngOnInit(){
    this.id = this.__activateRoute.snapshot.params["id"];
    this.__api.getFacultyById(this.id).subscribe((res:any)=>{
      this.facultyData = res;
    })
  }

  delete(){
    this.__api.deleteFacultyById(this.id).subscribe((res)=>{
      this.router.navigate(['/faculties']);
    });
  }

}
