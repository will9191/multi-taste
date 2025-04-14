import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ApiEndpoint } from '../../shared/constants/endpoint';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ComboService {
  constructor(private http: HttpClient) {}

  findAll(): Observable<any> {
    return this.http.get(`${ApiEndpoint.Combo.base}`);
  }

  delete(id: any) {
    return id;
  }
}
