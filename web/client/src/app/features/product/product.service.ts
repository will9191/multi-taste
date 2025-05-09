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

  findByCategory(slug: string): Observable<any> {
    return this.http.get(`${ApiEndpoint.Product.base}/category/${slug}`);
  }

  getProductsByStoreAndCategory(
    store: string,
    mode: string,
    category: string
  ): Observable<any> {
    return this.http.get(
      `${ApiEndpoint.Product.base}/store/${store}/${mode}/${category}`
    );
  }

  getProductByStoreAndCategory(
    store: string,
    mode: string,
    category: string,
    product: string
  ): Observable<any> {
    return this.http.get(
      `${ApiEndpoint.Product.base}/store/${store}/${mode}/${category}/${product}`
    );
  }

  delete(id: any) {
    return id; // this.http.delete()
  }
}
