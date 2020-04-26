package com.company;

import java.util.Observable;
import java.util.Observer;

public class OnlineViewer implements Observer {

    private String viewerName;

    public OnlineViewer(String name) {
        this.setViewerName(name);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println(this.getViewerName() + "(Online Viewer) changed exercise to " + o.toString());
    }

    public String getViewerName() {
        return viewerName;
    }

    public void setViewerName(String viewerName) {
        this.viewerName = viewerName;
    }
}
