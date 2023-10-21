package com.MarcRG.SoapWebService.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Builder
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Plat extends AbstratClass{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nom", nullable = false)
    private String nom;
    @OneToMany(mappedBy = "plat")
    private List<Condiment> condimentList;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;
}
