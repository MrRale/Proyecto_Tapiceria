import { Component, OnInit } from "@angular/core";
import { AuthService } from "../../../shared/services/auth.service";
import { UsuarioI } from "../../../shared/models/usuario.interface";
import { Observable } from "rxjs";
import { FormGroup, FormControl, Validators } from "@angular/forms";
import { Router } from "@angular/router";

import Swal from "sweetalert2";
import { ArticuloService } from "../../articulos/articulo.service";

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.scss"],
})
export class LoginComponent implements OnInit {
  public usuario$: Observable<UsuarioI>;

  idusuario:number
  constructor(private route: Router, private usuarioSvc: AuthService,
    private usService:ArticuloService) {}

  loginForm = new FormGroup({
    correo: new FormControl("", [Validators.required, Validators.email]),
    password: new FormControl("", Validators.required),
  });

  ngOnInit() {}

  onIniciar(event:any){
    console.log(this.idusuario)
    this.usService.logearUsuario(this.idusuario).subscribe(data=>{
      console.log(data)
    })
  }

  onLogin(form: UsuarioI) {
    if (this.loginForm.status == "VALID") {
      //console.log(this.loginForm.status);
      this.usuarioSvc.getLogin(form).subscribe(
        (res) => {
          //console.log("Succes", res);
          if (res.id != null) {
            this.usuarioSvc.userData = res;
            this.route.navigate(["/"]);
          } else {
            Swal.fire("Error al iniciar sesión", "Cedula o contraseña incorrecta", "warning");
          }
        },
        (err) => {
          console.log("Error", err);
        }
      );
    }
  }
}
