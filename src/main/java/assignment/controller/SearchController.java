package assignment.controller;

import assignment.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("searchController")
public class SearchController {
    @Autowired
    private SearchService searchService;

    @RequestMapping(value = "/linear")
    public void linearSearch() {
        searchService.linearSearch(900000);
    }
    @RequestMapping(value = "/binary")
    public void binarySearch() {
        searchService.binarySearch(900000);
    }
}
