package assignment.controller;

import assignment.service.SearchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("searchController")
public class SearchController {
    @Autowired
    private SearchServiceImpl searchService;

    @RequestMapping(value = "/assignment", method = RequestMethod.GET)
    public void Search() {
        searchService.linearSearch(900000);
        searchService.binarySearch(900000);
    }
}
