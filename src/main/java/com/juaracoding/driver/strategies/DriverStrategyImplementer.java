package com.juaracoding.driver.strategies;

public class DriverStrategyImplementer {

    public static DriverStrategy chooseStrategy (String strategy){
        switch (strategy){
            case "chrome":
                return new Chrome();
            case "edge":
                return new MicrosoftEdge();
            default:
                return null;
        }
    }

}
