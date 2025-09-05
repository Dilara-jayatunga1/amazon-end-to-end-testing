package com.Stepdefinitions;

import java.io.IOException;

import com.Baseclass.Library;
import com.Pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMobile_Testcase extends Library {
    SearchPage sp;

    @Given("Launch the Amazon web application")
    public void launch_the_amazon_web_application() throws IOException {
        launchApplication();
    }

    @When("close the pop up")
    public void close_the_pop_up() {
    	 sp = new SearchPage(driver);
    	sp.handlepopup();
        System.out.println(driver.getTitle());
    }

    @Then("it should navigate to the Home page")
    public void it_should_navigate_to_the_home_page() {
        sp = new SearchPage(driver);
        sp.homescreen();
    }

    @Given("User enter the Text in the Search Field")
    public void user_enter_the_text_in_the_search_field() {
        sp.Search("Mobile");
    }

    @When("click the search button")
    public void click_the_search_button() {
        sp.ClickSearch();
    }

    @Then("it should navigate to the search result page and display the relevant details")
    public void it_should_navigate_to_the_search_result_page_and_display_the_relevant_details() {
        System.out.println("Search results displayed");
    }
}