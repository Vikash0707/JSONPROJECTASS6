//import io.restassured.path.json.JsonPath;
import okhttp3.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class  PetstoreSwaggerApiTest {

    @Test( description= "Creating a user Resourcen in  swagger Server", priority = 1)
    public void Createuser(){
        OkHttpClient client = new OkHttpClient();
       RequestBody requestBody  =  RequestBody.create(new File("/Users/superaxis/Documents/repo/JSONPROJECTASS2/src/test/java/CreatePet.json"), MediaType.parse("application/json"));
            Request request  = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user")
              //  .header("Connection","keep-alive")
                    .header("accept","application/json")

                    .header("Content-Type","application/json")
                .post(requestBody)
                .build();


            try{
              Response response = client.newCall(request).execute();
              String responseString = response.body().string();
             // response.code();

              System.out.println("responseString : "+ responseString);
             // jsonpath



            } catch (IOException e){
                throw new RuntimeException(e);
            }
    }


    @Test( description= "Arraylist  a user Resourcen in  swagger Server", priority = 2)
     public void CreateArrayuserList(){

        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody  =  RequestBody.create(new File("/Users/superaxis/Documents/repo/JSONPROJECTASS2/src/test/java/ArrayPostlistpet.json"), MediaType.parse("application/json"));
        Request request  = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/createWithList")
                //  .header("Connection","keep-alive")
                .header("accept","application/json")

                .header("Content-Type","application/json")
                .post(requestBody)
                .build();


        try {
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();

            System.out.println("responseString : "+ responseString);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Test( description= "getCreateuser a user Resourcen in  swagger Server", priority = 3)
    public void getCreateuser(){
        OkHttpClient client = new OkHttpClient();
        String username ="Vikash.ji";
        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/"+username)
                .get()
                .build();

          try {
              Response response = client.newCall(request).execute();
              String responseString = response.body().string();

              System.out.println("responseString : "+ responseString);
          } catch (IOException e){
              throw new RuntimeException(e);
          }

    }

    @Test( description= "updateuser a user Resourcen in  swagger Server", priority = 4)
    public void updateuser(){
        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody  =  RequestBody.create(new File("/Users/superaxis/Documents/repo/JSONPROJECTASS2/src/test/java/updateuser.json"), MediaType.parse("application/json"));
        Request request  = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user")
                //  .header("Connection","keep-alive")
                .header("accept","application/json")

                .header("Content-Type","application/json")
                .post(requestBody)
                .build();


        try{
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();
            // response.code();

            System.out.println("responseString : "+ responseString);
            // jsonpath

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    @Test( description= "get a user Resourcen in  swagger Server", priority = 5)
    public void getCreateuser2(){
        OkHttpClient client = new OkHttpClient();
        String email ="vikash.kumar@gmail.com";
        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/"+email)
                .get()
                .build();

        try {
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();

            System.out.println("responseString : "+ responseString);
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
    @Test( description= "deleteuser a user Resourcen in  swagger Server", priority = 6)
    public void Deleteuser(){
        OkHttpClient client = new OkHttpClient();
        String username ="Vikash.ji";
        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/"+username)
                .delete()
                .build();

        try{
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();


            System.out.println("responseString : "+ responseString);


        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    @Test( description= "Loginuser a user Resourcen in  swagger Server", priority = 7)

    public void loginuserafter(){
        OkHttpClient client = new OkHttpClient();
        String username ="Vikash.ji";
        String password="1234";
        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/"+username + password)
                .get()
                .build();

        try{
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();


            System.out.println("responseString : "+ responseString);


        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Test( description= "logout a user Resourcen in  swagger Server", priority = 8)

    public void logoutuser(){
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/logout")
                .get()
                .build();

        try{
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();


            System.out.println("responseString : "+ responseString);


        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }





}
