import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Invoice } from '../model/invoice';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class InvoiceService {

  private invoicesUrl: string;

  constructor(private http: HttpClient) {
    this.invoicesUrl = 'http://localhost:8080/invoices';
   }

  public findAll():Observable<Invoice[]>{
    return this.http.get<Invoice[]>(this.invoicesUrl);
  }

  public save (invoice: Invoice){
    return this.http.post<Invoice>(this.invoicesUrl, invoice);
  }

}
