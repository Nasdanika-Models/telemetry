import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.telemetry.util.TelemetryEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.telemetry {
	exports org.nasdanika.models.telemetry;
	exports org.nasdanika.models.telemetry.impl;
	exports org.nasdanika.models.telemetry.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.ncore;
	
	provides CapabilityFactory with TelemetryEPackageResourceSetCapabilityFactory;
}
