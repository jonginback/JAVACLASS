package org.dimgo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;


public class WebCrawling {
    public static void main(String[] args) {
        try{
        Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
            //System.out.println(doc.html());
            Elements result = doc.select("[id=realTimeRankFavorite]").select("li").select("a");
            List<String> list = result.eachText();
            int i = 0;
            for(String title : list){
                System.out.printf("%d.%s\n",++i,title);
            }
    }catch(Exception e){

        }
}
}
