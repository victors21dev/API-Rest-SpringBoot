package victor_API.springbootweb.model;

public class PontoVacinacao {
    private Number id;
    private String cities;
    private String vaccionation;
    private String idCity;

    public PontoVacinacao() {
    }

    public PontoVacinacao(Number id, String cities, String vaccionation, String idCity) {
        this.id = id;
        this.cities = cities;
        this.vaccionation = vaccionation;
        this.idCity = idCity;
    }

    public String getCities() {
        return cities;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public String getVaccionation() {
        return vaccionation;
    }

    public void setVaccionation(String vaccionation) {this.vaccionation = vaccionation;}

    public String getidCity() {
        return idCity;
    }

    public void setidCity(String idCity) {this.idCity = idCity;}

    @Override
    public String toString() {
        return "Points{" +
                "id='" + id + '\'' +
                "cities='" + cities + '\'' +
                ", points_vaccionation='" + vaccionation + '\'' +
                ", idCity='" + idCity + '\'' +
                '}';
    }
}
