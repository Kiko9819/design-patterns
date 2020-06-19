public class Main {
    public static void main(String[] args) throws InterruptedException {

        PackageHandler local = new LocalPayDesk();
        PackageHandler country = new CountryPayDesk();
        PackageHandler abroad = new AbroadPayDesk();
        Observer boy = new ObserverBoy();

        local.subscribe(boy);
        country.subscribe(boy);
        abroad.subscribe(boy);

        local.setSuccessor(country);
        country.setSuccessor(abroad);

        country.handlePackage("Abroad");

        local.unsubscribe(boy);
        country.unsubscribe(boy);
        abroad.unsubscribe(boy);
    }
}
