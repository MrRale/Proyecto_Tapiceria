package com.comercial.acat.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.comercial.acat.entity.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer>  {

	
}
