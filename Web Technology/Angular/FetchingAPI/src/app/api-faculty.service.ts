import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiFacultiesService {

  constructor(private __http : HttpClient) { }

  getAllFaculties() {
    return this.__http.get("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject");
  };

  getFacultyById(id : any) {
    return this.__http.get("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject/"+id);
  }

  deleteFacultyById(id : any) {
    return this.__http.delete("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject/"+id);
  }

  insertFaculty(form : any) {
    return this.__http.post("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject", form);
  }

  updateFaculty(id:any, form:any) {
    return this.__http.put("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject/"+id, form); 
  }
}
