package salih_korkmaz.northwind.core.utilities.results;


//Mesaj ve success bilgissi zaten Result içerisinde var
// bu yüzden tekrardan yazmaya gerek yok extend edilir.

public class DataResult<T> extends Result {

    private T data;
    public DataResult(T data,boolean success, String message) {
        //super() base sınıfının consturctorlarını çalıştırmaya yarıyor.
        super(success, message);
        this.data = data;
    }

    //Mesaj geçmek istemeyebilirim işlemden sonra
    public DataResult(T data,boolean success) {
        super(success);
        this.data = data;
    }





}

