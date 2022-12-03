import { TestBed } from '@angular/core/testing';

import { ApiFacultiesService } from './api-faculty.service';

describe('ApiStudentService', () => {
  let service: ApiFacultiesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ApiFacultiesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
