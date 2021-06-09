
import com.google.gson.JsonObject;
import com.jayway.restassured.RestAssured;
import org.junit.Before;
import org.testng.annotations.Test;
import org.testng.annotations.*;


import java.util.ArrayList;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;


public class Testing {

    @BeforeMethod
    public void setUp()
    {
        RestAssured.baseURI="http://reqres.in/api/users";
    }

    @Test
    public void ApiTesting() {
        System.out.println();
        DetailsClass dc=new DetailsClass();
        dc.setAvatar("ava");
        dc.setEmail("vvv");
        dc.setFirstName("hhh");
        DetailsClass dc1=new DetailsClass();
        dc1.setAvatar("ava");
        dc1.setEmail("vvv");
        dc1.setFirstName("hhh");
        List<DetailsClass> list=new ArrayList<>();
       SupportClass supp=new SupportClass();
       supp.setText("vvvv");
       supp.setUrl("hhhh");
       Book book=new Book();
       book.setTotalPages("11");
       book.setPage("4");
       book.setSupport(supp);
       book.setData(list);
       System.out.println(book.getData()+ book.getPage()  + book.getSupport() +  book.getTotalPages());
       String str=given().queryParam("page","2").when()
               .get().jsonPath().get("data[0].first_name").toString(); // .get().andReturn().asString();
       System.out.println(str);
        Book book1=given().queryParam("page","2").when()
                .get().as(Book.class);
        System.out.println(book1.getPage()+" "+book1.getPage().equalsIgnoreCase("2"));
       // given().header("contentType","application / json").when().body(book).post().getStatusCode();


    }



}
