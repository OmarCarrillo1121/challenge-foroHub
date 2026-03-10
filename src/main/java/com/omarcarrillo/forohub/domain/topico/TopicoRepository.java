package com.omarcarrillo.forohub.domain.topico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
    // Aquí podrías agregar métodos personalizados si los necesitaras
}