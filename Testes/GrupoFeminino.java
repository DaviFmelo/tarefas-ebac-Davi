import java.util.Scanner;

public class GrupoFeminino {
    String nome;
    String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "GrupoMasculino{" +
                "nome= " + nome +
                ", sexo= " + sexo;
    }
}
