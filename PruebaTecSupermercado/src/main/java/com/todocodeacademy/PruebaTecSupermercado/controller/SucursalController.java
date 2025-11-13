package com.todocodeacademy.PruebaTecSupermercado.controller;

import com.todocodeacademy.PruebaTecSupermercado.dto.SucursalDTO;
import com.todocodeacademy.PruebaTecSupermercado.service.ISucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/sucursales")
public class SucursalController {

    @Autowired
    private ISucursalService sucursalService;

    @GetMapping
    public ResponseEntity<List<SucursalDTO>> traerSucursales() {
        return ResponseEntity.ok(sucursalService.traerSucursales());
    }

    @PostMapping
    public ResponseEntity<SucursalDTO> create(@RequestBody SucursalDTO dto) {
        SucursalDTO created = sucursalService.crearSucursal(dto);
        return ResponseEntity.created(URI.create("/api/sucursales/" + created.getId()))
                .body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SucursalDTO> update(@PathVariable Long id, @RequestBody SucursalDTO dto) {
        return ResponseEntity.ok(sucursalService.actualizarSucursal(id,dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        sucursalService.eliminarSucursal(id);
        return ResponseEntity.noContent().build();
    }
}
