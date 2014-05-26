package MealPackage;

public class AlcoChildException extends Exception {

    private String errorCode="Child alcohol drink exception";

    public AlcoChildException(String message){
        super(message);
    }

    public String getErrorCode(){
        return this.errorCode;
    }
}
