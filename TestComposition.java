public class TestComposition {
    public static void main(String[] args) {
        Processor intelProcessor = new Processor("Intel", "17");
        Computer dellComputer = new Computer(intelProcessor, "Dell");

        System.out.println(dellComputer);
    }
}
