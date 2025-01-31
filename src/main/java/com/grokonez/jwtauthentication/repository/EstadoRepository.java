
package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}