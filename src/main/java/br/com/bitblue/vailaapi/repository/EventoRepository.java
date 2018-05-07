
package br.com.bitblue.vailaapi.repository;

import br.com.bitblue.vailaapi.model.Evento;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer>{
    
}
