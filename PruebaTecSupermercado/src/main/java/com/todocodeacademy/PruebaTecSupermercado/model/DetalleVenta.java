package com.todocodeacademy.PruebaTecSupermercado.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Venta
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="ventaId")
    private Venta venta;

    //Producto
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="productoId")
    private Producto prod;
    private Integer cantProd;
    private Double precio;

}
