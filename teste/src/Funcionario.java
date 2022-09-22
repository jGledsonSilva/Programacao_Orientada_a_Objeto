public class Funcionario {

    private int identificador;
    private static int nfuncionario = 1;

    private String nome ;//= { "João", "Maria", "José", "Pedro", "Ana", "Paulo", "Carlos", "Ricardo", "Mariana", "Julia" };
    private String dataAdmissao ;//= { "01/01/2010", "02/02/2011", "03/03/2012", "04/04/2013", "05/05/2014", "06/06/2015", "07/07/2016", "08/08/2017", "09/09/2018", "10/10/2019" };
    private double salario;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario >= 1100.00) {
            this.salario = salario;
        }
        else {
            System.out.println("\n\tSalário não pode ser menor que 1100.00");
        }
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.identificador = nfuncionario++;
    }
    public int getIdentificador() {
        return this.identificador;
    }

    static void tirarFerias(String nome) {
        System.out.println("\n\tFuncionário: " + nome + " está de férias por 30 dias.");
    }

    static void tirarFerias(String nome, int dias) {
        System.out.println("\n\tFuncionário: " + nome + " está de férias por " + dias + " dias.");
    }
        
}