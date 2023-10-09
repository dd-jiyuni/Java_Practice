package JavaProgramming.Ch03;

import JavaProgramming.Ch03.service.ProductService;
import JavaProgramming.Ch03.vo.ProductVo;

public class TestMain {
    public static void main(String[] args) {
        ProductVo product1 = new ProductVo();
        product1.setProductNo("a001");
        product1.setProductName("아메리카노");
        product1.setPrice(4000);

        ProductVo product2 = new ProductVo();
        product2.setProductNo("a002");
        product2.setProductName("카페라떼");
        product2.setPrice(4300);

        ProductVo product3 = new ProductVo();
        product3.setProductNo("a003");
        product3.setProductName("카페모카");
        product3.setPrice(4500);

        ProductService service = new ProductService();

        service.insertProduct(product1);
        service.insertProduct(product2);
        service.insertProduct(product3);

        int price = product1.getPrice() + 200;
        product1.setPrice(price);
        int updateProduct = service.updateProduct(product1);

        service.deleteProduct("a003");

        ProductVo productVo = service.getProduct("a001");
    }
}
