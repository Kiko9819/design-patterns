public abstract class PackageHandler extends Observable {

    public abstract void handlePackage(String destination) throws InterruptedException;

    protected State waitingState;
    protected State preparationState;
    protected State payDeskState;

    protected PackageHandler successor;

    public PackageHandler() {
        waitingState = new WaitingState(this);
        preparationState = new PreparationState(this);

        payDeskState = waitingState;
    }

    public void setSuccessor(PackageHandler successor) {
        this.successor = successor;
    }

    public void setPayDeskState(State state) {
        payDeskState = state;
    }

    public void setWaitingState() {
        payDeskState.waitForCustomer();
    }

    public void setPreparationState() {
        payDeskState.preparePackage();
    }

    public State getWaitingState() {
        return waitingState;
    }

    public State getPreparationState() {
        return preparationState;
    }

}
