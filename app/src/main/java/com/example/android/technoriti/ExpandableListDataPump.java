package com.example.android.technoriti;

/**
 * Created by Pratyush_PR on 2/26/2018.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Pratyush_PR on 2/26/2018.
 */

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> sponshorship = new ArrayList<String>();
        sponshorship.add("India");
        sponshorship.add("Pakistan");
        sponshorship.add("Australia");
        sponshorship.add("England");
        sponshorship.add("South Africa");

        List<String> management = new ArrayList<String>();
        management.add("Brazil");
        management.add("Spain");
        management.add("Germany");
        management.add("Netherlands");
        management.add("Italy");

        List<String> hospitality = new ArrayList<String>();
        hospitality.add("United States");
        hospitality.add("Spain");
        hospitality.add("Argentina");
        hospitality.add("France");
        hospitality.add("Russia");

        List<String> cultural = new ArrayList<String>();
        cultural.add("United States");
        cultural.add("Spain");
        cultural.add("Argentina");
        cultural.add("France");
        cultural.add("Russia");

        List<String> tech = new ArrayList<String>();
        tech.add("United States");
        tech.add("Spain");
        tech.add("Argentina");
        tech.add("France");
        tech.add("Russia");

        expandableListDetail.put("SPONSORSHIP TEAM", sponshorship);
        expandableListDetail.put("MANAGEMENT TEAM", management);
        expandableListDetail.put("HOSPITALITY TEAM", hospitality);
        expandableListDetail.put("CULTURAL TEAM", cultural);
        expandableListDetail.put("TECH TEAM", tech);
        return expandableListDetail;
    }
}


