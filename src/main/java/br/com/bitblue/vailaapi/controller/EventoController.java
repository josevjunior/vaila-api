
package br.com.bitblue.vailaapi.controller;

import br.com.bitblue.vailaapi.model.Evento;
import br.com.bitblue.vailaapi.repository.EventoRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", 
        produces = "application/json;charset=UTF-8", 
        consumes = "application/json;charset=UTF-8")
public class EventoController {
    
    @Autowired
    private EventoRepository eventoRepository;
    
    @GetMapping("/eventos")
    public List<Evento> getAll(){
        return eventoRepository.findAll();
    }
    
    @PostMapping("/eventos")
    public Evento create(@Valid @RequestBody Evento evento){
        return eventoRepository.save(evento);
    }
    
    @GetMapping("/eventos/{id}")
    public Evento getEventoById(@PathVariable(name = "id") Integer id) throws Exception{
        return eventoRepository.findById(id).orElseThrow(()->new Exception("Resource " + id + " not found"));
    }
    
    @PutMapping("/eventos")
    public Evento updateEvento(@Valid @RequestBody Evento evento){
        return eventoRepository.save(evento);
    }
    
    @DeleteMapping("/eventos")
    public ResponseEntity<?> DeleteEvento(@Valid @RequestBody Evento evento){
        
        eventoRepository.delete(evento);
        
        return ResponseEntity.ok().build();
        
    }
    
    
}
