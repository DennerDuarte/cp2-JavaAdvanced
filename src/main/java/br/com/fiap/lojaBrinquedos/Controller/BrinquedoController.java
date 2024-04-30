package br.com.fiap.lojaBrinquedos.Controller;

import br.com.fiap.lojaBrinquedos.DTO.BrinquedoDTO;
import br.com.fiap.lojaBrinquedos.Service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService brinquedoService;

    @GetMapping
    public List<BrinquedoDTO> getAll(){
        return brinquedoService.getAll();
    }

    @GetMapping("/{id}")
    public BrinquedoDTO getById(@PathVariable Long id){
        return brinquedoService.getById(id);
    }

    @PostMapping("/criar")
    public ResponseEntity<BrinquedoDTO> criarBrinquedo(@RequestBody BrinquedoDTO brinquedo){
        BrinquedoDTO novoBrinquedo = brinquedoService.criarBrinquedo(brinquedo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoBrinquedo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarBrinquedo(@PathVariable Long id){
        boolean brinquedoDeletado = brinquedoService.deleteBrinquedo(id);
        if(brinquedoDeletado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<BrinquedoDTO> atualizarBrinquedo(@PathVariable Long id, @RequestBody BrinquedoDTO brinquedo){
        BrinquedoDTO brinquedoAtualiazado = brinquedoService.updateBrinquedo(id, brinquedo);

        if(brinquedoAtualiazado != null){
            return ResponseEntity.ok(brinquedoAtualiazado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
