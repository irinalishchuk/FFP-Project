public class AlcoChildException extends Exception {

    private String errorCode="Child alcohol drinl exception";

    public AlcoChildException(String message, String errorCode){
        super(message);
        this.errorCode=errorCode;
    }

    public String getErrorCode(){
        return this.errorCode;
    }
}
