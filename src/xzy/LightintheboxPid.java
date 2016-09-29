package xzy;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class LightintheboxPid {

	
	public String getPigFromLinght(String keyword) throws IOException {
		
		String url = "http://23.253.5.4:8080/solr/litb/select?q=" + URLEncoder.encode(keyword, "utf-8") 
		    +"silver+pearl+earrings&sort=in_stock%20desc,score%20desc&boost=scale(map(effective_continent_1,10,2000,10),0.5,2.5)"
			+"&fq=available_stocks:US&start=0&rows=100&defType=synonym_edismax&mm=3&synonyms=false&fl=id,score"
		    +"&pf=name_en^20%20description_en^1%20category_en^3%20last_category_en^10&ps=3&pf2=name_en^20%20description_en^1%20category_en^3%20last_category_en^10&ps2=3&tie=0.1&qf=name_en^20%20description_en^1%20category_en^3%20last_category_en^10";
		
		Document document = Jsoup.connect(url).ignoreContentType(true).get();
		Elements element = document.getElementsByTag("body");
		String body = element.text();
		System.out.println("body:" + body);
		
		if (body != null) {
			return body;
		}
		return "null";
	}
	
	public static void main(String[] args) {

		
	}

}
