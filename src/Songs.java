public class Songs {
    private String judulLagu, penyanyi;

    public Songs (String judulLagu, String penyanyi){
        this.judulLagu=judulLagu;
        this.penyanyi=penyanyi;

    }
    public String getjudulLagu(){
        return judulLagu;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "Judul Lagu='" + judulLagu + '\'' +
                ", Penyanyi='" + penyanyi + '\'' +
                '}';
    }
}
