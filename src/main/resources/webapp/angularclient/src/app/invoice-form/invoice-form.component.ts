import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Invoice } from '../model/invoice';
import { InvoiceService } from '../service/invoice.service';

@Component({
  selector: 'app-invoice-form',
  templateUrl: './invoice-form.component.html',
  styleUrls: ['./invoice-form.component.css']
})
export class InvoiceFormComponent {

  invoice: Invoice;

  constructor(
      private route: ActivatedRoute,
      private router: Router,
      private invoiceService: InvoiceService) {
        this.invoice = new Invoice();
  }

  onSubmit() {
      this.invoiceService.save(this.invoice).subscribe(result => this.gotoInvoiceList());
  }

    gotoInvoiceList() {
      this.router.navigate(['/invoices']);
    }
}
