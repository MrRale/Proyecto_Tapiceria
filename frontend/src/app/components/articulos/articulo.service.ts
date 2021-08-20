import { Injectable } from "@angular/core";
import { ArticuloI } from "../../shared/models/articulo.interface";
import { Observable } from "rxjs";
import { HttpClient } from "@angular/common/http";
import { productostock } from "src/app/shared/models/productostock";
import { usuario } from "src/app/shared/models/usuario";

@Injectable({
  providedIn: "root",
})
export class ArticuloService {
  private urlAPI = "/papeleriaWS/resources/ArticuloWS/";
  private urlProductoStock="http://localhost:9090/productostock"
  private urlUsuario="http://localhost:9090/usuario"

  constructor(private http: HttpClient) {}

  public getAllArticulos(): Observable<ArticuloI[]> {
    return this.http.get<ArticuloI[]>(this.urlAPI);
  }

  public getAllProductoStock():Observable<productostock[]>{
    return this.http.get<productostock[]>(this.urlProductoStock+"/listar")
  }

  public pagarProductoStock(ps:productostock, cant:any){
    console.log(cant)
    return this.http.post<productostock>(this.urlProductoStock+"/pagar/"+`${cant}`,ps)
  }

  enviarProductoStock(ps:productostock):Observable<productostock>{
    return this.http.post<productostock>(this.urlProductoStock,ps)
  }

  logearUsuario(id:number){
return this.http.get<usuario>(this.urlUsuario+"/"+`${id}`)
  }

  registrarUsuario(u:usuario):Observable<usuario>{
    return this.http.post<usuario>(this.urlUsuario,u)
  }

  public getOneArticulo(id: ArticuloI): Observable<ArticuloI> {
    //console.log(this.urlAPI + id);
    return this.http.get<ArticuloI>(this.urlAPI + id);
  }

  public createArticulo(articulo: ArticuloI) {
    console.log(articulo);
    return this.http.post(this.urlAPI, articulo);
  }

  public editArticulo(articulo: ArticuloI) {
    console.log(articulo);
    return this.http.put(this.urlAPI, articulo);
  }

  public deleteArticulo(articulo: ArticuloI) {
    return this.http.delete(this.urlAPI + articulo.id);
  }
}
