package java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketCapCrawlingDemo {
	
	public static void main(String[] args) {
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20200101&end=20200527";
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements trElements = doc.select(".cmc-table__table-wrapper-outer table tbody tr");
		
		System.out.println("날짜\t시가\t고가\t저가\t종가\t거래량\t총량");
		
		for(int i=0;i<trElements.size();i++) {
			Element trElement = trElements.get(i);
			
			Elements tdElements = trElement.select("td");
			for(int j=0;j<tdElements.size();j++) {
				Element tdElement = tdElements.get(j);
				System.out.println(tdElement.text()+"\t");
			}
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
