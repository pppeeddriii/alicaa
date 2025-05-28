public class lagu{
    private String band;
    private String judul
    public void IsiPram (String judul, String band) {
        this.judul = judul;
        this.band = band
    }
    public void cetakKeLayar() {
        if(judul==null&&band==null)return;
        System.out.println("Judul:"\nBand:"+pencipta");
    }
}
public class DemoLagu{
    public static void main (String[]args){
        Lagu song = new lagu ();
        song.IsiPram("Dance Beside","All American Reject");
        song.cetakKeLayar();
    }
}