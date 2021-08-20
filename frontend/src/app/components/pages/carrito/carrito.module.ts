import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { CarritoRoutingModule } from "./carrito-routing.module";
import { CarritoComponent } from "./carrito.component";
import { MaterialModule } from "../../../material.module";
import { ReactiveFormsModule } from "@angular/forms";

@NgModule({
  declarations: [CarritoComponent],
  imports: [
    CommonModule,
    CarritoRoutingModule,
    MaterialModule,
    ReactiveFormsModule,
  ],
})
export class CarritoModule {}
