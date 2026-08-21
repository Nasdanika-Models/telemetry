import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.telemetry.ecore.ECoreGenTelemetryProcessorsCapabilityFactory;

module org.nasdanika.models.telemetry.ecore {
		
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.nasdanika.telemetry.model;
	
	exports org.nasdanika.models.telemetry.ecore;
	opens org.nasdanika.models.telemetry.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenTelemetryProcessorsCapabilityFactory; 		
	
}
