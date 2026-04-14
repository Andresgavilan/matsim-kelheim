package org.matsim.run;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.network.Link;
import org.matsim.core.controler.Controler;
import org.matsim.core.network.NetworkUtils;

public class RemoveHighways {
    
    public static void main (String[] args) {

        var network = NetworkUtils.readNetwork (    "input/Others/kelheim-v3.0-1pct.output_network.xml.gz" );
        for (Link link : network.getLinks().values()) {
            if (link.getId().equals(Id.createLinkId("322183374")) || link.getId().equals(Id.createLinkId("322186089"))){
                link.setFreespeed(20.);
            }
        }

        NetworkUtils.writeNetwork(network,  "input/Others/kelheim-v3.0-1pct.output_class.xml.gz");
    }
	
}