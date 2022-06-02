package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.imports;

/** Regular class import */
import java.util.ArrayList;
import java.util.List;

/** Imports the sort static method in the Collections class */
import static java.util.Collections.sort;

public class ListHelper {
    public List<String> copyAndSortList(List <String> original) {
        List <String> list = new ArrayList<String>(original);
        sort(list);
        return list;
    }
}
