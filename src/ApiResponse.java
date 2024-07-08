import java.util.ArrayList;
import java.util.List;

public class ApiResponse {

    private String status;
    private List<BusModel> data;

    public ApiResponse(String status, List<BusModel> data) {
        this.status = status;
        this.data = new ArrayList<>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<BusModel> getData() {
        return data;
    }

    public void setData(List<BusModel> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Lista de Dados: " + data;
    }
}
