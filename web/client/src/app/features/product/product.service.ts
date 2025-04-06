import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ApiEndpoint } from '../../shared/constants/endpoint';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  constructor(private http: HttpClient) {}

  

  findAll(): Observable<any> {
    return this.http.get(`${ApiEndpoint.Product.base}`);
  }

  delete(id: any) {
    return id; // this.http.delete()
  }
}
