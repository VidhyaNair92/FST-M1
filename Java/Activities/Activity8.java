package activities;

class CustomException extends Exception {
    private String message;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
    class Activity8{
        public static void exceptionTest(String str) throws CustomException {
        if(str==null){
        throw new CustomException("String value is null");
        }
        else{
            System.out.println(str);
        }
    }
    public static  void main(String[] args){
        try {
            Activity8.exceptionTest("Printed in Console");
            Activity8.exceptionTest("null");

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
