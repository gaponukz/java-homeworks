class Task5 {
    public static void main(String[] args) {
        Helper obj = new Helper();
        obj.setData(42);
        System.out.println("Значення поля: " + obj.getData());
    }
}

class Helper {
    protected int data;
    
    public void setData(int value) {
        this.data = value;
    }
    
    public int getData() {
        return this.data;
    }
}
