package bangundatar;

public class PersegiPanjang extends BangunDatar {
    private float p;
    private float l;

    public PersegiPanjang(float p, float l) {
        this.p = p;
        this.l = l;

    }

    public void hitungLuas() {
        this.luas = p * l;
    }

    public void hitungKeliling() {
        this.keliling = 4 * (p + l);
    }

}
