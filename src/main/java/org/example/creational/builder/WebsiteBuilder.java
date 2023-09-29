package org.example.creational.builder;

public class WebsiteBuilder {
    public static void main(String[] args) {
        Website website = new Website();

        website.setName("Visit card");
        website.setCms(CMS.WORDPRESS);
        website.setPrice(500);

        System.out.println(website);
    }
}
