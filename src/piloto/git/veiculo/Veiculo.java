package piloto.git.veiculo;

import java.io.Serializable;

public class Veiculo implements Serializable {

    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public Veiculo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("{");
        output.append("id : ").append(getId());
        output.append(",placa : ").append("\"").append(getPlaca()).append("\"");
        output.append(",marca : ").append("\"").append(getMarca()).append("\"");
        output.append(",modelo : ").append("\"").append(getModelo()).append("\"");
        output.append(",cor : ").append("\"").append(getCor()).append("\"");
        output.append(",ano : ").append(getAno());
        output.append("}");
        return output.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
