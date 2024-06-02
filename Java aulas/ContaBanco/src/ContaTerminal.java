    import java.util.Locale;
    import java.util.Scanner;

    public class ContaTerminal {
        public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
            System.out.println("Digite seu nome ");
            String nomeCliente = scanner.next();
            String sobrenomeCliente = scanner.next();

            System.out.println("Por favor digite o numero da agencia");
            String agencia = scanner.next();

            System.out.println("Digite o numero da conta");
            int conta = scanner.nextInt();
        
            System.out.println("Digite seu saldo");
            double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta +" e seu saldo " + saldo + " já está disponível para saque");
       
    }
}
