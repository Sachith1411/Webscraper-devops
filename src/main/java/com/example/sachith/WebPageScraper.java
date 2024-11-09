package com.example.sachith;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class WebPageScraper {

    public static void main(String[] args) {
        // URL of the webpage to scrape
        String url = "https://webscraper.io/test-sites/e-commerce/allinone"; // replace with actual URL

        try {
            // Connect to the webpage and fetch the HTML document
            Document doc = Jsoup.connect(url).get();

            // Display the page title
            System.out.println("Title: " + doc.title());

            // Extract and display all paragraph elements
            Elements paragraphs = doc.select("p");
            for (Element paragraph : paragraphs) {
                System.out.println(paragraph.text());
            }
        } catch (IOException e) {
            System.err.println("Error fetching the URL: " + e.getMessage());
        }
    }
}
