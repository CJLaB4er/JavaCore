package sem4.hw;

public class Shop {


    public static void main(String[] args) {

        int countOrders = 0;

        Object[][] list = new Object[][]{
                {clients[0], products[0], 10},
                {new Client("Виктор"), products[1], 50},
                {clients[2], new Product("Авокадо", 100), 1},
                {clients[3], products[2], 15},
                {clients[0], products[3], -1}
        };

        for (int i = 0; i < orders.length; i++) {
            try {
                orders[i] = buy((Client) list[i][0], (Product) list[i][1], (int) list[i][2]);
                countOrders += 1;
            } catch (ClientException e) {
                System.out.println(e.getMessage());
            } catch (ProductException e) {
                System.out.println(e.getMessage());
            } catch (AmountException e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.printf("Всего успешных покупок: %d", countOrders);
    }


    private static Client[] clients = {
            new Client("Иван"),
            new Client("Олег"),
            new Client("Виктор"),
            new Client("Alex")
    };

    private static Product[] products = {
            new Product("Яблоко", 10),
            new Product("Апельсин", 15),
            new Product("Банан", 8),
            new Product("Арбуз", 20),

    };

    private static Order[] orders = new Order[5];


    private static class Client {
        String name;

        public Client(String name) {
            this.name = name;

        }

        @Override
        public String toString() {
            return "Client{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    private static class Product {
        String name;
        int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "product{" +
                    "name='" + name + '\'' +
                    ", cost=" + price +
                    '}';
        }
    }

    public static class Order {
        Client client;
        Product product;
        int amount;


        public Order(Client client, Product product, int amount) {
            this.client = client;
            this.product = product;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "client=" + client +
                    ", product=" + product +
                    ", amount=" + amount +
                    '}';
        }

    }

    public static class ClientException extends RuntimeException {
        public ClientException(String message) {
            super(message);
        }
    }

    public static class ProductException extends RuntimeException {
        public ProductException(String message) {
            super(message);
        }
    }

    public static class AmountException extends RuntimeException {
        public AmountException(String message) {
            super(message);
        }

    }

    private static boolean inArray(Object[] arr, Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(o)) return true;
        }
        return false;
    }

    public static Order buy(Client client, Product product, int amount) {
        if (!inArray(clients, client)) {
            throw new ClientException("Заказ не создан: неизвестный клиент - " + client);
        }
        if (!inArray(products, product)) {
            throw new ProductException("Заказ не создан: неизвестный продукт - " + product);
        }
        if (amount < 1) {
            throw new AmountException("Заказ не создан: некорректное количество - " + amount);
        }
        System.out.printf("Заказ успешно создан. %s, %s, количество: %d\n", client, product, amount);
        return new Order(client, product, amount);

    }

}
