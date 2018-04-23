/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browsertabproject;

import int105.model.Browser;
import int105.model.Tab;

/**
 *
 * @author Tisanai.Cha
 */
public class TinyBrowser {

    public static void main(String[] args) {
        //add two tabs to the Browser pointing to “www.sit.kmutt.ac.th” and "www.kmutt.ac.th" respectively
        Browser browser = new Browser(5);
        /*
        Tab tab1 = new Tab("www.sit.kmutt.ac.th");
        Tab tab2 = new Tab("www.kmutt.ac.th");

        //แบบที่ 1;
        browser.newTab(tab1);
        browser.newTab(tab2);

        //แบบที่ 2;
     
        browser.newTab(new Tab("Jirapan.in.th"));
        browser.newTab(new Tab("itrack.in.th"));

         */

        System.out.println("Output #01\n" + browser);

        //change the URL of the default tab (at index 0) to "www.kmutt.ac.th"
        //??????
        browser.setActiveTabIndex(0);
        Tab tempTab = browser.getActiveTab();
        tempTab.setUrl("www.kmutt.ac.th");

        System.out.println(browser.getActiveTab().getPageContent());

        System.out.println("Output #02\n" + browser);
        
        System.out.println(browser.LastTab().getPageContent());
        System.out.println(browser.LastTab().getUrl());
    }
}
