package sample.actuator;

public class Service {
    private Dbcontext dbcontext;

    public Service(Dbcontext dbcontext) {
        this.dbcontext = dbcontext;
    }

    public boolean isDbAvaiable(String query){
        return dbcontext.isAvaiable();
    }

    public String getUniqueId(){

        return "Usaando la base de datos con el id: " + String.valueOf(dbcontext.getUniqueId());
    }
}
