public class AlcoChildException extends Exception {

    private String errorCode="Child alcohol drink exception";

<<<<<<< HEAD
    public AlcoChildException(String message) {
=======
    public AlcoChildException(String message){
>>>>>>> 3450e817d17605f464eef155486ea52715ea497d
        super(message);
    }

    public String getErrorCode(){
        return this.errorCode;
    }
}
