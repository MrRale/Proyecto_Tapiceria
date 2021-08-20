import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { productostock } from 'src/app/shared/models/productostock';
import { ArticuloService } from '../../articulos/articulo.service';


@Component({
  selector: 'app-productos',
  templateUrl: './productos.component.html',
  styleUrls: ['./productos.component.scss']
})
export class ProductosComponent implements OnInit {

  public productostock: productostock[]
  cantidad:number=10
  constructor(private prodstock:ArticuloService) { }

  ngOnInit() {
    this.prodstock.getAllProductoStock().subscribe((res) => {
      this.productostock = res;
    });
  }

  comprar(pros:productostock){
    this.prodstock.pagarProductoStock(pros, 10);
  }

}
