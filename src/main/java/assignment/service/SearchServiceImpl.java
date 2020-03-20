package assignment.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service("searchServiceImpl")
public class SearchServiceImpl implements SearchService {
    private List<Integer> arr;

    public SearchServiceImpl() {
        arr = new ArrayList();

        for (int i = 0; i < 1000000; i++)
            arr.add(i + 1);
    }

    public void linearSearch(int exploreData) {
        arr.indexOf(exploreData);
    }
    public void binarySearch(int exploreData) {
        Collections.binarySearch(arr, exploreData);
    }
}
