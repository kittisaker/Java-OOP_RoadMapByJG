public class Computer {
    private Processor processor;
    private String brand;
    
    public Computer(Processor processor, String brand) {
        this.processor = processor;
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString(){
        return "Computer[Brand : " + brand + ", " + processor.toString() + "]";
    }
}
