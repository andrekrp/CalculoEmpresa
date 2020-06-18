package com.serasa.empresa.resouce;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.serasa.empresa.Empresa;
import com.serasa.empresa.repository.EmpresaRepository;
import com.serasa.empresa.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaResouce {
	@Autowired
	EmpresaRepository repositorio;

	@Autowired
	EmpresaService service;

	@GetMapping
	public List<Empresa> listagemDeEmpresas() {
		return repositorio.findAll();
	}

		@GetMapping("/{id}")
		public ResponseEntity<Empresa> listagemDeEmpresasPorId(@PathVariable Long id) {
			Optional<Empresa> optional = repositorio.findById(id);

			return optional.isPresent() ? ResponseEntity.ok(optional.get())
					: ResponseEntity.notFound().build();
		}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		repositorio.deleteById(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Empresa> alterar(@PathVariable Long id, @RequestBody Empresa empresa) {
		return ResponseEntity.ok(service.alterarEmpresa(id, empresa));
	}

	@PostMapping
	@ResponseStatus( HttpStatus.CREATED)
	public void novaEmpresa(@RequestBody Empresa empresa, HttpServletResponse response) {

		Empresa empresaCriada = repositorio.save(empresa);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(empresaCriada.getId()).toUri();

		response.setHeader("Location", uri.toASCIIString());
	}

	}
