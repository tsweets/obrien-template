package org.beer30.sbmvc.thymeleaf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "dashboard";
    }
    @GetMapping("/page-blank")
    public String pageBlank(Model model) {
        model.addAttribute("appName", appName);
        return "page-blank";
    }

    @GetMapping("/page-404")
    public String page404(Model model) {
        model.addAttribute("appName", appName);
        return "page-404";
    }

    @GetMapping("/dashboard")
    public String dashboardPage(Model model) {
        model.addAttribute("appName", appName);
        return "dashboard";
    }

    @GetMapping("/page-tables")
    public String pageTables(Model model) {
        model.addAttribute("appName", appName);
        return "page-tables";
    }

    @GetMapping("/page-cards")
    public String pageCards(Model model) {
        model.addAttribute("appName", appName);
        return "page-cards";
    }

    @GetMapping("/page-buttons")
    public String pageButtons(Model model) {
        model.addAttribute("appName", appName);
        return "page-buttons";
    }

    @GetMapping("/page-login")
    public String pageLogin(Model model) {
        model.addAttribute("appName", appName);
        return "page-login";
    }

    @GetMapping("/page-typeahead")
    public String pageTypeahead(Model model) {
        model.addAttribute("appName", appName);
        return "page-typeahead";
    }

    @GetMapping("/page-about")
    public String pageAbout(Model model) {
        model.addAttribute("appName", appName);
        return "page-about";
    }

    @GetMapping("/page-bs-buttons")
    public String pageBsButtons(Model model) {
        model.addAttribute("appName", appName);
        return "page-bs-buttons";
    }

    @GetMapping("/page-bs-tables")
    public String pageBsTables(Model model) {
        model.addAttribute("appName", appName);
        return "page-bs-tables";
    }

    @GetMapping("/page-bs-typography")
    public String pageBsTypography(Model model) {
        model.addAttribute("appName", appName);
        return "page-bs-typography";
    }

    @GetMapping("/page-bs-forms")
    public String pageBsForms(Model model) {
        model.addAttribute("appName", appName);
        return "page-bs-forms";
    }

    @GetMapping("/page-bs-navs")
    public String pageBsNavs(Model model) {
        model.addAttribute("appName", appName);
        return "page-bs-navs";
    }

    @GetMapping("/page-bs-indicators")
    public String pageBsIndicators(Model model) {
        model.addAttribute("appName", appName);
        return "page-bs-indicators";
    }

    @GetMapping("/page-bs-progress")
    public String pageBsProgress(Model model) {
        model.addAttribute("appName", appName);
        return "page-bs-progress";
    }

    @GetMapping("/page-bs-containers")
    public String pageBsContainers(Model model) {
        model.addAttribute("appName", appName);
        return "page-bs-containers";
    }

    @GetMapping("/page-bs-dialogs")
    public String pageBsDialogs(Model model) {
        model.addAttribute("appName", appName);
        return "page-bs-dialogs";
    }
}
