package com.todocodeacademy.PruebaTecSupermercado.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductoDTO {
    private Long id;
    private String nombre;
    private String categoria;
    private Double precio;
    private int cantidad;
}
