public class CountryPayDesk extends PackageHandler {

    @Override
    public void handlePackage(String destination) throws InterruptedException {
        if(destination.equals("Country")) {
            System.out.println("Sure, I can handle in-country deliveries, wait a moment please.");
            this.setPreparationState();
            notifyObservers();
        } else if(successor != null){
            successor.handlePackage(destination);
            this.setWaitingState();
        }
    }
}
