package com.fatec.backendfornecedor.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.backendfornecedor.entities.Fornecedor;

@RestController
public class FornecedorController {
    
    @GetMapping("Fornecedor")
    @ResponseBody
    public Fornecedor getFornecedor(){
        Fornecedor f = new Fornecedor(1,"kibarato@gmail","kibarato");
        return f;
    }


    @GetMapping("Fornecedores")
    @ResponseBody
    public List<Fornecedor> getFornecedores(){
        List <Fornecedor> Fornecedores = new ArrayList<Fornecedor>();
        Fornecedor f1 = new Fornecedor(1, "papelariareal@gmail.com", "PapelariaReal");
        Fornecedor f2 = new Fornecedor(2, "tupypapelaria@gmail.com", "TupyPapelaria");
        Fornecedores.add(f1);
        Fornecedores.add(f2);
        return Fornecedores;
    }
}
