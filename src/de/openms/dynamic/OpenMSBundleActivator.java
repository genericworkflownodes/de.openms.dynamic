package de.openms.dynamic;

import java.util.Collections;
import java.util.List;

import org.osgi.framework.BundleContext;

import com.genericworkflownodes.knime.custom.GenericActivator;
import com.genericworkflownodes.knime.custom.config.IPluginConfiguration;
import com.genericworkflownodes.knime.custom.config.impl.PluginConfiguration;
import com.genericworkflownodes.knime.toolfinderservice.ExternalTool;

public class OpenMSBundleActivator extends GenericActivator {

	private static OpenMSBundleActivator INSTANCE = null;
    private static IPluginConfiguration PLUGIN_CONFIG = null;

    public OpenMSBundleActivator() {}
    
    @Override
    public void start(BundleContext context) throws Exception {
    	super.start(context);
    	initializePlugin();
    	INSTANCE = this;
    }
    
    public static OpenMSBundleActivator getInstance() {
        return INSTANCE;
    }

    @Override
    public IPluginConfiguration getPluginConfiguration() {
        if (PLUGIN_CONFIG == null) {
            // construct the plugin config
            PLUGIN_CONFIG = new PluginConfiguration("de.openms", "OpenMS",
            		OpenMSBundleActivator.getInstance().getProperties(), getClass());
        }
        return PLUGIN_CONFIG;
    }

	@Override
	public List<ExternalTool> getTools() {
		// This method is not necessary anymore
		return Collections.emptyList();
	}
}
