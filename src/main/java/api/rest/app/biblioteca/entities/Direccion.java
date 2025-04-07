package api.rest.app.biblioteca.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long direccion_id;
    @Column(nullable = false, length = 55)
    private String calle;
    @Column(nullable = false, length = 5)
    private Integer numero;
    @Column(nullable = false, length = 40)
    private String provincia;
    @Column(nullable = false, length = 40)
    private String municipio;
    private Integer cp;
    private String ccaa;
    private String pais;
    @Column(nullable = true)
    private String puerta;
    @OneToMany(mappedBy = "direccion")
    private List<Usuario> usuarios;


    public Direccion() {
    }

    public Direccion(Long direccion_id, String calle, Integer numero, String provincia, String municipio, Integer cp,
            String ccaa, String pais, String puerta) {
        this.direccion_id = direccion_id;
        this.calle = calle;
        this.numero = numero;
        this.provincia = provincia;
        this.municipio = municipio;
        this.cp = cp;
        this.ccaa = ccaa;
        this.pais = pais;
        this.puerta = puerta;
    }

    public Long getDireccion_id() {
        return direccion_id;
    }

    public void setDireccion_id(Long direccion_id) {
        this.direccion_id = direccion_id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getCcaa() {
        return ccaa;
    }

    public void setCcaa(String ccaa) {
        this.ccaa = ccaa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

}
