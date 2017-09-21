package de.openms.dynamic;

import com.genericworkflownodes.knime.custom.config.IPluginConfiguration;
import com.genericworkflownodes.knime.dynamic.DynamicGenericNodeFactory;

public class OpenMSNodeFactory extends DynamicGenericNodeFactory {

	@Override
	protected IPluginConfiguration getPluginConfig() {
		return OpenMSBundleActivator.getInstance().getPluginConfiguration();
	}
}
