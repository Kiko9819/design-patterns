public class LocalPayDesk extends PackageHandler {

    @Override
    public void handlePackage(String destination) throws InterruptedException {
        if(destination.equals("Local")) {
            System.out.println("Sure, I can handle Local deliveries, wait a moment please.");
            this.setPreparationState();
            notifyObservers();
        } else if(successor != null){
            successor.handlePackage(destination);
            this.setWaitingState();
        }
    }
}
