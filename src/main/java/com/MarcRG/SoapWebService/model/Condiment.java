package com.MarcRG.SoapWebService.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Condiment extends AbstratClass{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nomCondiment", nullable = false)
    private String nomCondiment;

    @Column(name = "quantite", nullable = false)
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name = "idPlat")
    private Plat plat;
}
