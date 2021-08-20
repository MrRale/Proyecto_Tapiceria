import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { ProductosRoutingModule } from "./productos-routing.module";
import { ProductosComponent } from "./productos.component";
import { MaterialModule } from "../../../material.module";
import { ReactiveFormsModule } from "@angular/forms";

@NgModule({
  declarations: [ProductosComponent],
  imports: [
    CommonModule,
    ProductosRoutingModule,
    MaterialModule,
    ReactiveFormsModule,
  ],
})
export class ProductosModule {}
