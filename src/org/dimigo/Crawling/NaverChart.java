package org.dimigo.Crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class NaverChart {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://datalab.naver.com/keyword/realtimeList.naver").get();
            System.out.println(doc.html());
            Elements elements = doc.select("[data-age=all]").select("div")
                    .select("ul").select("li").select("span");
            // 이렇게 select()안에 다 써도 됨
            // Elements elements = doc.select("[data-age=all] div ul li span");
            List<String> keywords = elements.eachText();

            System.out.println("<< 네이버 실시간 검색어 >>");
            for(int i=0; i<keywords.size(); i++) {
                System.out.println((i+1) + ". " + keywords.get(i));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}