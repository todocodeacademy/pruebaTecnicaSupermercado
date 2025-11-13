package com.todocodeacademy.PruebaTecSupermercado.dto;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetalleVentaDTO {
    private Long id;
    private String nombreProd;
    private Integer cantProd;
    private Double precio;
    private Double subtotal;
}
