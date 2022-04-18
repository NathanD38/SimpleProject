// our factory pattern method with a getShip method, based on the ship type.

public class ShipFactory {
    public Sailable getShip(String shipType) throws InvalidShipException {
        if (shipType == null) {
            return null;
        }
        if (shipType.equalsIgnoreCase("BulkCarrierShip")){
            return new BulkCarrierShip();
        } else if (shipType.equalsIgnoreCase("ContainerShip")) {
            return new ContainerShip();
        } else if (shipType.equalsIgnoreCase("CruiseShip")) {
            return new CruiseShip();
        } else if (shipType.equalsIgnoreCase("RoRoShip")) {
            return new RoRoShip();
        } else if (shipType.equalsIgnoreCase("TankerShip")) {
            return new TankerShip();
        } else {
            throw new InvalidShipException("Invalid Ship");
        }
    }
}
