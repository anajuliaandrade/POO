package br.edu.fatec.franca.lista6.controller;

import br.edu.fatec.franca.lista6.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ClienteController {
    //simular um banco de dados contendo os clientes
    private static final Map<Long, Cliente> clientes = new HashMap<>();
    static {
        clientes.put(1L, new Cliente(1L, "Ana", "anajulia@gmail", "(16)99978-8732"));
        clientes.put(2L, new Cliente(2L, "Guilherme", "guilherme@gmail", "(16)99108-6906 "));
        clientes.put(3L, new Cliente(3L, "Kelly", "kelly@gmail", "(16)98829-5826"));
    }

    @GetMapping("/clientes/{id}")
    public Cliente findById(@PathVariable Long id) {
        Cliente cliente = clientes.get(id);
        if (cliente != null) {
            return cliente;
        }else {
            return new Cliente(0L, "Cliente não encontrado", "Email não encontrado", "Telefone não encontrado");
        }
    }

    @GetMapping("/clientes")
    public Map<Long, Cliente> findAll() {
        return clientes;
    }

    @PostMapping("/clientes")
    public Cliente add(@RequestBody Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    @PutMapping("/clientes/{id}")
    public String update(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente clienteExistente = clientes.get(id);
        if (clienteExistente != null) {
            clienteExistente.setNome(cliente.getNome());
            clienteExistente.setEmail(cliente.getEmail());
            clienteExistente.setTelefone(cliente.getTelefone());
            clientes.put(cliente.getId(), clienteExistente);
            return "Cliente atualizado com sucesso!";
        }else {
            return "Cliente não existe";
        }
    }
    @DeleteMapping("/clientes/{id}")
    public String delete(@PathVariable Long id) {
        Cliente cliente = clientes.remove(id);
        if (cliente != null) {
            return "Removido com sucesso!";
        }else {
            return "Não foi encontrado";
        }
    }
}
