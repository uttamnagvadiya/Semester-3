import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './Pages/about/about.component';
import { ContactComponent } from './Pages/contact/contact.component';
import { HomeComponent } from './Pages/home/home.component';
import { FacultiesComponent } from './Pages/faculties/faculties.component';
import { FacultyDetailsComponent } from './Pages/faculty-details/faculty-details.component';
import { AddNewFacultyComponent } from './Pages/add-new-faculty/add-new-faculty.component';

const routes: Routes = [
  {path:"", component:HomeComponent},
  {path:"about", component:AboutComponent},
  {path:"contact", component:ContactComponent},
  {path:"faculties", component:FacultiesComponent},
  {path:"faculty/add", component:AddNewFacultyComponent},
  {path:"faculty/details/edit/:id", component:AddNewFacultyComponent},
  {path:"faculty/profile/:id", component:FacultyDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
