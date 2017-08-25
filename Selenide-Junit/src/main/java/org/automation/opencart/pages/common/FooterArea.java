package org.automation.opencart.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.String;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FooterArea extends PageBase {

    private String opencart_css="a[href='http://www.opencart.com']";

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=4']")
    
    public String aboutUsLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=6']")
    
    public String deliveryInfoLink;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=3']")
    
    public String privacyPolicyLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=5']")
    
    public String termsAndConditionLink;
    @FindBy(css = ".account-login footer div.container div.row div:nth-of-type(2) ul.list-unstyled li:nth-of-type(1) a")
    
    public String contactUsLink;
    public String returnsLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/sitemap']")
    
    public String siteMapLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/manufacturer']")
    
    public String brandsLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=account/voucher']")
    
    public String giftVoucersLink;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=affiliate/account']")
    
    public String affiliatesLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/special']")
    
    public String specialsLink;

    @FindBy(css = "a[title='My Account']")
    
    public String myAccountLink;
    @FindBy(css = "#column-right div.list-group a:nth-of-type(7)")
    
    public String orderHistoryLink;
    @FindBy(id = "wishlist-total")
    

    public String wishListLink;
    @FindBy(css = "#column-right div.list-group a:nth-of-type(12)")
    
    public String newsLetterLink;

    public String copyright;

    //this

}