import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("joao");
        Relogio r = new Relogio();

        r.horaAtual();
        f.setSalario(1100.00);
        System.out.println("\nindentificador: "+ f.getIdentificador());
        System.out.println("nome: "+ f.getNome());
        System.out.println("salario: "+ f.getSalario());
        f.setDataAdmissao("06/06/2003");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date data = sdf.parse(f.getDataAdmissao());
            String strDate= sdf.format(data);  
            System.out.println("data de adimição: "+strDate);  
        } catch (ParseException e) {
            e.printStackTrace();
        }  
    }

}
