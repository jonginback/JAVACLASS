package org.openapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class Search {
    public String search(String search) throws IOException {

        String apiurl = "https://www.googleapis.com/youtube/v3/search";
        apiurl += "?key=AIzaSyCpeqGEMWLJdfRZqfpMMvNFM7fjqHZVWk8";
        apiurl += "&part=snippet&type=video&maxResults=20&videoEmbeddable=true";
        apiurl += "&q="+URLEncoder.encode(search,"UTF-8");

        URL url = new URL(apiurl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while((inputLine = br.readLine()) != null) {
            response.append(inputLine);
        }
        br.close();

        return response.toString();
    }
}