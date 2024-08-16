import java.util.Random;

public class caixaEletronico {
    public static void main(String[] args) {
        // instanciando um objeto
        Random rd = new Random();
        // gerando um número aleatório entre 0 e 100
        int numero1 = rd.nextInt(); /*  o nextInt vai gerar número aleatório 
        inteiro pelo random*/
        double numero2 = rd.nextDouble(); /*o nextInt vai gerar número aleatório
        cm cs decimal pelo random*/
        // imprimindo o número gerado
        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
}
}