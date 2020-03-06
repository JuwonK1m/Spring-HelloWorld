package Assignment.Controller;

import Assignment.Service.SearchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("searchController")
public class SearchController {

    @Autowired
    private SearchServiceImpl searchService;

    public int linearSearch(String nation) {
        return searchService.getLinearSearchLocation(nation);
    }
    public int binarySearch(String nation) {
        return searchService.getBinarySearchLocation(nation);
    }


}
