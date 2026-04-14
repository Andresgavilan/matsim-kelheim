package org.matsim.dashboard;


import org.matsim.simwrapper.Dashboard;
import org.matsim.simwrapper.Header;
import org.matsim.simwrapper.Layout;
import org.matsim.simwrapper.viz.*;


/**
 * Average DRT dashboard for several runs with the same config but a different random seed. Dashboard for one specific DRT service.
 */
public class OutputTripsDashboard implements Dashboard {

	@Override
	public void configure(Header header, Layout layout) {
		header.title = "Output Trips";
		layout.row("Output_Trips")
			.el(Hexagons.class,(viz, data) -> {
				viz.title = "Output Trips";
				viz.file = "*output_trips.csv.gz";
				viz.projection = "EPSG:25832";
				viz.addAggregation("Trips", "Origins", "start_x",
				"start_y", "Destinations", "end_x", "end_y");
		});

	}
}
