import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'; 


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MyNavComponent } from './shared/components/my-nav/my-nav.component';
import { HttpClientModule } from '@angular/common/http';
import { MaterialModule } from './material.module';
import { ContainerAppComponent } from './components/pages/container-app/container-app.component';
import { ModalComponent } from './shared/components/modal/modal.component';
import { NewArticuloComponent } from "./components/articulos/new-articulo/new-articulo.component";
import { ReactiveFormsModule } from "@angular/forms";
import { EditArticuloComponent } from './components/articulos/edit-articulo/edit-articulo.component';
import { EditArticuloModule } from './components/articulos/edit-articulo/edit-articulo.module';
import { ModalPComponent } from './shared/components/modal-p/modal-p.component';
import { ModalUComponent } from './shared/components/modal-u/modal-u.component';
import { UsuarioComponent } from './components/usuarios/usuario/usuario.component';
import { NewUsuarioModule } from './components/usuarios/new-usuario/new-usuario.module';
import { EditUsuarioModule } from './components/usuarios/edit-usuario/edit-usuario.module';
import { EditPedidoModule } from './components/pedidos/edit-pedido/edit-pedido.module';
import { NewPedidoModule } from './components/pedidos/new-pedido/new-pedido.module';
import { PedidoComponent } from './components/pedidos/pedido/pedido.component';
import { NewPedidoComponent } from './components/pedidos/new-pedido/new-pedido.component';
import { EditPedidoComponent } from './components/pedidos/edit-pedido/edit-pedido.component';
import { EditUsuarioComponent } from './components/usuarios/edit-usuario/edit-usuario.component';
import { NewUsuarioComponent } from './components/usuarios/new-usuario/new-usuario.component';
import { ModalMiComponent } from './shared/components/modal-mi/modal-mi.component';
import { NewComponent } from './components/pages/mis-pedidos/new/new.component';
import { CatalogComponent } from './components/auth/catalog/catalog.component';
import { ProductosComponent } from './components/pages/productos/productos.component';
import { CarritoComponent } from './components/pages/carrito/carrito.component';
import { ListProductsComponent } from './components/pages/productos/list-products/list-products.component';
import { DetailProductComponent } from './components/pages/productos/detail-product/detail-product.component';


@NgModule({
  declarations: [
    AppComponent,
    MyNavComponent,
    ContainerAppComponent,
    ModalComponent,
    NewArticuloComponent,
    EditArticuloComponent,
    ModalPComponent,
    ModalUComponent,
    UsuarioComponent,
    PedidoComponent,
    NewPedidoComponent,
    EditPedidoComponent,
    EditUsuarioComponent,
    NewUsuarioComponent,
    ModalMiComponent,
    NewComponent,
    CatalogComponent,
    ProductosComponent,
    CarritoComponent,
    ListProductsComponent,
    DetailProductComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MaterialModule,
    ReactiveFormsModule,
    EditArticuloModule,
    NewUsuarioModule,
    EditUsuarioModule,
    EditPedidoModule,
    NewPedidoModule,
 

  ],
  entryComponents: [ModalComponent, ModalUComponent, ModalPComponent, ModalMiComponent],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
