import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

    // inner class Harddisk
    public class Harddisk {
        int kapasitas;
        String merk;
        String Tipe;

        Harddisk(int kapasitas, String merk, String Tipe) {
            this.kapasitas = kapasitas;
            this.merk = merk;
            this.Tipe = Tipe;
        }
        public void getInfoHarddisk() {
            System.out.println("kapasitas: " + kapasitas + "GB");
            System.out.println("merk: " + merk);
            System.out.println("Tipe:" + Tipe);
        }
    }
    // inner class Motherboard
    public class Motherboard {
        int RAM;
        String Merek;

        Motherboard(int RAM,  String Merek) {
            this.RAM = RAM;
            this.Merek = Merek;
        }

        public void getMotherboardInfo() {
            System.out.println("RAM: " + this.RAM + "GB");
            System.out.println("Merek: " + this.Merek);
        }
    }
    // inner class PowerSuply
    public class PowerSupply {
        double Harga;
        String Keluaran;

        PowerSupply(double Harga, String Keluaran) {
            this.Harga = Harga;
            this.Keluaran = Keluaran;
        }

        public void getInfoPowerSupply() {
            System.out.println("Harganya: " + this.Harga);
            System.out.println("Keluaran: " + this.Keluaran + "Tahun");
        }
    }
    // inner class VGACard
    public class VGACard {
        private String model;

        public VGACard(String model) {
            this.model = model;
        }

        public void getVGACardInfo() {
            System.out.println("VGACard Model: " + this.model);
        }
    }
}

