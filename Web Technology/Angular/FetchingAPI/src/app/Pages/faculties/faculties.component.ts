import { Component } from '@angular/core';
import { ApiFacultiesService } from 'src/app/api-faculty.service';
import { Faculties } from 'src/app/ClassFiles/faculties';

@Component({
  selector: 'app-students',
  templateUrl: './faculties.component.html',
  styleUrls: ['./faculties.component.css']
})
export class FacultiesComponent {
  
  data:Faculties[] = [];

  constructor(private __api : ApiFacultiesService) {}

  ngOnInit(){
    this.__api.getAllFaculties().subscribe((res : any)=>{
      this.data = res;      
    });
  }
}
