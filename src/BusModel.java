public class BusModel {
    private Long id_mod_bus;
    private String fr_thumb_title;
    private String dt_mod_year_prod;
    private String dt_mod_style;

    public BusModel() {
    }

    public BusModel(Long id_mod_bus, String fr_thumb_title, String dt_mod_year_prod, String dt_mod_style) {
        this.id_mod_bus = id_mod_bus;
        this.fr_thumb_title = fr_thumb_title;
        this.dt_mod_year_prod = dt_mod_year_prod;
        this.dt_mod_style = dt_mod_style;
    }

    public Long getId_mod_bus() {
        return id_mod_bus;
    }

    public void setId_mod_bus(Long id_mod_bus) {
        this.id_mod_bus = id_mod_bus;
    }

    public String getFr_thumb_title() {
        return fr_thumb_title;
    }

    public void setFr_thumb_title(String fr_thumb_title) {
        this.fr_thumb_title = fr_thumb_title;
    }

    public String getDt_mod_year_prod() {
        return dt_mod_year_prod;
    }

    public void setDt_mod_year_prod(String dt_mod_year_prod) {
        this.dt_mod_year_prod = dt_mod_year_prod;
    }

    public String getDt_mod_style() {
        return dt_mod_style;
    }

    public void setDt_mod_style(String dt_mod_style) {
        this.dt_mod_style = dt_mod_style;
    }

    @Override
    public String toString() {
        return "Modelo: " + fr_thumb_title + " (" + id_mod_bus + ")" +
                "\nEstilo: " + dt_mod_style +
                "\nFabricação: " + dt_mod_year_prod +
                "\n";
    }
}
