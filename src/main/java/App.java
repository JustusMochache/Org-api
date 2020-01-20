
//import static spark.Spark.port;
import  com.google.gson.*;

import DB.DB;
import dao.*;
import exceptions.ApiException;
import models.*;
import spark.ModelAndView;
import spark.template.handlebars.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;



public class App {

    public static void main(String[] args) {

        staticFileLocation("/public");

        ProcessBuilder process = new ProcessBuilder();
        Integer port;

        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        }else {
            port = 4567;
        }
        port(port);
}
