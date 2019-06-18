
const selenium = require('selenium-webdriver');
const driver = new selenium.Builder().forBrowser('chrome').build();
const url = 'https://www.ultimateqa.com/filling-out-forms/';
driver.get(url);

const By = selenium.By;

/**
 * Use xpath
 */
const xpath = driver.findElement(By.xpath('//*[@id="et_pb_contact_name_0"]'));
xpath.sendKeys('Found this input by XPath');

/**
 * Use form name
 */
const name = driver.findElement(By.name('et_pb_contact_message_1'));
name.sendKeys('Found this text area by NAME!!!');

/**
 * Use CSS class
 */
driver.findElement(By.id('et_pb_contact_form_1')).findElement(By.css('input')).sendKeys('Found by method chaining');
