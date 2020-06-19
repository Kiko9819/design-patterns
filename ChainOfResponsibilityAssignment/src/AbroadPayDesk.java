public class AbroadPayDesk extends PackageHandler {
    @Override
    public void handlePackage(String destination) throws InterruptedException {
        if(destination.equals("Abroad")) {
            System.out.println("Sure, I can handle deliveries abroad, wait a moment please.");
            this.setPreparationState();
            notifyObservers();
        } else {
            System.out.println("Sorry, can't help you with anything here.");
            this.setWaitingState();
        }
    }
}
