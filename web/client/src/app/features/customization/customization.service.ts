import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ApiEndpoint } from '../../shared/constants/endpoint';

@Injectable({
  providedIn: 'root',
})
export class CustomizationService {
  constructor(private http: HttpClient) {}

  findAll(): Observable<any> {
    return this.http.get(`${ApiEndpoint.Customization.base}`);
  }
}
