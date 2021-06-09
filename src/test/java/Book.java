import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Book {

    @SerializedName("page")
    private String page;

//    @SerializedName("per_page")
//    private String perPage;

//    public String getPerPage() {
//        return perPage;
//    }
//
//    public void setPerPage(String perPage) {
//        this.perPage = perPage;
//    }
//
//    public String getTotal() {
//        return total;
//    }
//
//    public void setTotal(String total) {
//        this.total = total;
//    }

//    @SerializedName("total")
//    private String total;

    @SerializedName("total_pages")
    private String totalPages;

    @SerializedName("data")
    private List<DetailsClass> data;

    public List<DetailsClass> getData() {
        return data;
    }

    public void setData(List<DetailsClass> data) {
        this.data = data;
    }

    @SerializedName("support")

    private SupportClass support;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }


    public SupportClass getSupport() {
        return support;
    }

    public void setSupport(SupportClass support) {
        this.support = support;
    }
}
