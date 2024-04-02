package ex5.model;

public class FacadeAutobuz {
    private Autobuz autobuz;

    public FacadeAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public void punePeLiberToateUsile(){
        this.autobuz.punePeLiberUsaDinFata();
        this.autobuz.punePeLiberUsaDinMijloc();
        this.autobuz.punePeLiberUsaDinSpate();
    }

    public void deschideToateUsile(){
        this.autobuz.deschidereUsaDinFata();
        this.autobuz.deschidereUsaDinMijloc();
        this.autobuz.deschidereUsaDinSpate();
    }
}
