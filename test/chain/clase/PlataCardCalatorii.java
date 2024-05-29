package clase;

public class PlataCardCalatorii extends ModDePlata{
    private int nrCalatorii;

    public PlataCardCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(double pret) {
        if(nrCalatorii>0){
            nrCalatorii--;
            System.out.println("s a efectuat plata cu cardul de calatorii in vla de "+ pret );
        }else{
            super.getSuccesor().plateste(pret);
        }
    }
}
