package enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK"),
    BAC_REQUEST(400,"Bad Request"),
    NOT_FOUND(404,"Not Found"),
    INTERNAL_SEVER_ERROR(500, "Internal Server Error");


    private int code;
    String meesage;

    public int getCode() {
        return code;
    }

    public String getMeesage() {
        return meesage;
    }

    HttpStatus(int code, String meesage) {
        this.code = code;
        this.meesage = meesage;
    }
   public static HttpStatus findByCode(int httpCode){
       if (httpCode == 200) {
           for (HttpStatus status :values() ) {
               if (status.getCode()==httpCode){
                   return status;
               }
           }
           }
       return null;
    }
    public boolean isSuccess(){
        return code >= 200&& code<=299;
    }
}
