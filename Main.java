public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();

        // bikin object harddisk
        CPU.Harddisk AIDE = myKomputer.new Harddisk(1000, "Toshiba", "AIDE");
        // vga
        CPU.VGACard card = myKomputer.new VGACard("S3 ViRGE");
        // motherboard
        CPU.Motherboard PapanInduk = myKomputer.new Motherboard(12, "Samsung");
        // powersupply
        CPU.PowerSupply elektronik = myKomputer.new PowerSupply(104000, "2022");

    }
}