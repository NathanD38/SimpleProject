// our main program - creating 6 objects out of our classes on demand,
// by getting an instance of each from our factory class.
// the final object throws an exception which is handled.

public class ShipFactoryMain {
    public static void main(String[] args) throws InvalidShipException {
        ShipFactory shipFactory = new ShipFactory();
        Sailable myShip1 = shipFactory.getShip("BulkCarrierShip");
        myShip1.sail();
        Sailable myShip2 = shipFactory.getShip("ContainerShip");
        myShip2.sail();
        Sailable myShip3 = shipFactory.getShip("CruiseShip");
        myShip3.sail();
        Sailable myShip4 = shipFactory.getShip("RoRoShip");
        myShip4.sail();
        Sailable myShip5 = shipFactory.getShip("TankerShip");
        myShip5.sail();
        Sailable myShip6 = shipFactory.getShip("BattleCruiserShip");
        myShip6.sail();

    }
}
