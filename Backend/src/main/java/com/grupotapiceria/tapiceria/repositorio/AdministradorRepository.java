package com.grupotapiceria.tapiceria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupotapiceria.tapiceria.model.Administrador;

public interface AdministradorRepository extends JpaRepository<Administrador, Long > {
	

}
