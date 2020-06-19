public class PreparationState implements State {

    PackageHandler packageHandler;

    public PreparationState(PackageHandler packageHandler) {
        this.packageHandler = packageHandler;
    }

    @Override
    public void preparePackage() {
        System.out.println("Preparing your package");
        packageHandler.setPayDeskState(packageHandler.getPreparationState());
    }

    @Override
    public void waitForCustomer() {
        System.out.println("Waiting for customer");
        packageHandler.setPayDeskState(packageHandler.getWaitingState());
    }
}
