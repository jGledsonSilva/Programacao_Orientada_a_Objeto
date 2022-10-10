import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("joao");
        Relogio r = new Relogio();

        r.horaAtual();
        f1.setSalario(1100.00);
        System.out.println("\nindentificador: "+ f1.getIdentificador());
        System.out.println("nome: "+ f1.getNome());
        System.out.println("salario: "+ f1.getSalario());
        f1.setDataAdmissao("06/06/2003");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date data = sdf.parse(f1.getDataAdmissao());
            String strDate= sdf.format(data);  
            System.out.println("data de adimição: "+strDate);  
        } catch (ParseException e) {
            e.printStackTrace();
        }  
    }

}
