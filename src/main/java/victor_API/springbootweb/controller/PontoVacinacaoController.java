package victor_API.springbootweb.controller;

import victor_API.springbootweb.model.PontoVacinacao;
import victor_API.springbootweb.repository.PontoVacinacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PontoVacinacaoController {
    @Autowired
    private PontoVacinacaoRepository repository;

    @GetMapping("/points")
    public List<PontoVacinacao> getAll(){
        return repository.listAll();
    }

}
