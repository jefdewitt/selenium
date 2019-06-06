
const selenium = require('selenium-webdriver');
const driver = new selenium.Builder().forBrowser('chrome').build();
const url = 'https://www.ultimateqa.com/filling-out-forms/';
driver.get(url);

const By = selenium.By;
const field = driver.findElement(By.xpath('//*[@id="et_pb_contact_name_0"]'));
field.sendKeys('Found this input view an explicit XPath');
