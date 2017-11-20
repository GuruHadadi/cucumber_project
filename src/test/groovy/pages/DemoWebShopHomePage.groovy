package pages

import geb.Page

public class DemoWebShopHomePage extends Page {
    static at = { title == "Demo Web Shop" }
    static content = {
        loginlnk { $("a.ico-login") }
        userIdtxt { $("input#Email") }
        passwordtxt { $("input#Password") }
        loginbtn { $("input[value='Log in']") }
    }
}