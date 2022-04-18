// creating a custom exception if an invalid ship was provided

public class InvalidShipException extends Exception {
    public InvalidShipException(String errorMessage) {
        super(errorMessage);
    }
}
