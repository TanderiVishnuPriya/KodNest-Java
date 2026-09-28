class Books {
    private int pageNum;

    public void setData(int x) {
        if (x > 0) {
            pageNum = x;
        }
    }

    public int getData() {
        return pageNum;
    }
}

public class BookApps {
    public static void main(String[] args) {
        Books b = new Books();
        b.setData(100);
        System.out.println(b.getData());
    }
}
