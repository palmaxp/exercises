package supermercado;

public class SuperMercado {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João", "11649843990");
        Cliente c2 = new Cliente("Guilherme", "11843643940");
        Cliente c3 = new Cliente("Marcus", "11957884395");
        Cliente c4 = new Cliente("Jean", "11685843920");
        Cliente c5 = new Cliente("Pavan", "11569843910");
        
        Produto p1 = new Produto("Arroz", 13.50, 1000);
        Produto p2 = new Produto("Feijão", 9.50, 1000);
        Produto p3 = new Produto("Batata Doce", 4.19, 1000);
        Produto p4 = new Produto("Frango", 10.00, 1000);
        Produto p5 = new Produto("Saladinha", 3.00, 1000);
        
        Item i1 = new Item(p1, 1);
        Item i2 = new Item(p2, 2);
        
        Pedido pd1 = new Pedido(c1);
        pd1.adicionarItem(i1);
        pd1.adicionarItem(i2);
        
        System.out.println("Nome do cliente: " + pd1.getCliente().getNome());
        System.out.println("========= Itens comprados =========");        
        Item itens[] = pd1.getItens();        
        for (int i = 0; i < pd1.getI(); i++) {
            System.out.println("Produtos: " + itens[i].getProduto().getNome());
            System.out.println(" | Quantidade: " + itens[i].getQtdComprada());
            System.out.println(" | Valor: " + itens[i].getProduto().getPreco());
        }
        System.out.println("Total: " + pd1.getValorTotal());
    }
}