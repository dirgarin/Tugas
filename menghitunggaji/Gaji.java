package menghitunggaji;

public class Gaji {
    private String golongan;
    private boolean istri;
    private int jumlahAnak = 0;

    public Gaji(String golongan, boolean istri, int jumlahAnak) {
        this.golongan = golongan;
        this.istri = istri;
        this.jumlahAnak = jumlahAnak;
    }

    public int golongans() {
        switch (golongan) {
            case "1":
                return 3000000;
            case "2":
                return 4000000;
            case "3":
                return 5000000;
            case "4":
                return 6000000;
            default:
                return 0;
        }
    }

    public double totalGaji() {
        double totalGaji = golongans();
        double gajiTunjanganIstri = tunjanganIstri();
        double gajiTunjanganAnak = tunjanganAnak();
        totalGaji += gajiTunjanganIstri + gajiTunjanganAnak;
        return totalGaji;
    }

    public double tunjanganIstri() {
        return istri ? 0.2 * golongans() : 0;
    }

    public double tunjanganAnak() {
        return 15000 * jumlahAnak;
    }
}
