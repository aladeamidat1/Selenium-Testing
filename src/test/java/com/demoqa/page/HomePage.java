package com.demoqa.page;

import com.demoqa.page.forms.FormsPage;
import com.suacedemo.pages.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
