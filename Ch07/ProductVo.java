package JavaProgramming.Ch07;

public class ProductVo {
    private static int count;

    public enum DataType {
        INSERT, UPDATE, DELETE, NORMAL
    }

    ;

    private String productNo;
    private String productName;
    private int price;

    private DataType dataType = DataType.NORMAL;

    static {
        System.out.println("ProductVo - 정적 초기화 구간 실행 ");
        System.out.println("ProductVo - count = " + count);
    }

    {
        count++;
        System.out.println("ProductVo - 초기화 구간 실행 count[" + count + "]");

        if (count < 10) {
            productNo = "a00" + count;
        } else if (count < 100) {
            productNo = "a0" + count;
        } else {
            productNo = "a" + count;
        }
        System.out.println("ProductVo - productNo [" + productNo + "]");
    }

    public ProductVo() {
        System.out.println("ProductVo-생성자함수1 실행");
    }

    public ProductVo(String productName, int price) {
        this.productName = productName;
        this.price = price;
        System.out.println("ProductVo- 생성자함수2 실행");
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return productNo + "\t" + productName + "\t" + price;
    }

    public String[] getData() {
        return new String[]{
                productNo, productName + price
        };
    }
    public static class TableInfo {
        public static final String[] HEADER_NAME_INFO
                = new String[]{"품목번호","품목명","단가","상태"};
        public final static int[] WIDTH_INFO = {100,400,100,80};
    }
}
