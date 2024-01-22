import java.util.*;

public class PedidosDeBolo {
    public static void main(String[] args) {
      

        Scanner scanner = new Scanner(System.in);
        Scanner scnQuantidade = new Scanner(System.in);
        Scanner scnCliente = new Scanner(System.in);

        System.out.println("Informe o quantidade do bolo:");
        String quantidade = scanner.nextLine();
        System.out.println("Informe o nome do cliente:");
        String cliente = scanner.nextLine();

        String sabor = obterSaborValido(scanner);
        try {
            
            PedidoBolo novoPedido = new PedidoBolo();
            novoPedido.setSabor(sabor);
            novoPedido.setQuantidade(quantidade);
            novoPedido.setCliente(cliente);
    
            BancoDeDados.adicionarPedido(novoPedido);
    
            scanner.close();
        
        } catch (Exception e) {
            e.printStackTrace();

        
            scanner.close();
        
    }

    private static String obterSaborValido(Scanner scanner) {
        String sabor;
        do {
            System.out.println("Escolha o sabor do bolo (cenoura, coco, fuba ou chocolate):");
            sabor = scanner.nextLine().toLowerCase();

         
            if (!sabor.equals("cenoura") && !sabor.equals("coco") && !sabor.equals("fuba") && !sabor.equals("chocolate")) {
                System.out.println("Opção inválida. Por favor, escolha um sabor válido.");
            }
        } while (!sabor.equals("cenoura") && !sabor.equals("coco") && !sabor.equals("fuba") && !sabor.equals("chocolate"));

        return sabor;
    }
}