import java.sql.Date;

public class Animal {
    private String especie;
    private char sexo;
    private String nome;
    private Date datadenascimento;
    
    public Animal(){}
    
    public Animal(String especie, char sexo) {
        this.especie = especie;
        this.sexo = sexo;
    }
    
    public Animal(String especie, char sexo, String nome, Date datadenascimento) {
        this(especie, sexo);
        this.nome = nome;
        this.datadenascimento = datadenascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(Date datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
