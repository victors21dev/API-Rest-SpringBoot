package victor_API.springbootweb.repository;

import victor_API.springbootweb.model.PontoVacinacao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PontoVacinacaoRepository {
    public List<PontoVacinacao> listAll(){
        List<PontoVacinacao> pontoVacinacoes = new ArrayList<>();
        pontoVacinacoes.add(new PontoVacinacao(1,"Coruripe","Alto do SQL","1"));
        pontoVacinacoes.add(new PontoVacinacao(2,"Maceió","Ponta Python","2"));
        pontoVacinacoes.add(new PontoVacinacao(3,"Maceió","Praia Java","2"));
        pontoVacinacoes.add(new PontoVacinacao(4,"Maceió","Shopping Lua","2"));
        pontoVacinacoes.add(new PontoVacinacao(5,"Maceió","Praça CenteScript","2"));
        pontoVacinacoes.add(new PontoVacinacao(6,"Marechal Deodoro","Taylor Swift","3"));
        pontoVacinacoes.add(new PontoVacinacao(7,"Piranhas","Lagoa dos Git","4"));
        pontoVacinacoes.add(new PontoVacinacao(8,"Maragogi","Rua do MongoDB","5"));
        pontoVacinacoes.add(new PontoVacinacao(9,"Pilar","Rua C++","6"));
        pontoVacinacoes.add(new PontoVacinacao(10,"Capela","Praça do PHP","7"));
        return pontoVacinacoes;
    }
}
