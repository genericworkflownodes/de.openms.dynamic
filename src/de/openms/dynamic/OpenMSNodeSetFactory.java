package de.openms.dynamic;

import com.genericworkflownodes.knime.dynamic.DynamicGenericNodeFactory;
import com.genericworkflownodes.knime.dynamic.DynamicGenericNodeSetFactory;

public class OpenMSNodeSetFactory extends DynamicGenericNodeSetFactory {

	public OpenMSNodeSetFactory() {
		super("payload/descriptors");
	}

	@Override
	public Class<? extends DynamicGenericNodeFactory> getNodeFactory() {
		return OpenMSNodeFactory.class;
	}

	@Override
	public String getCategoryPath() {
		return "/community/openms";
	}

	@Override
	protected String getIdForTool(String relPath) {
		return "de.openms." + relPath.replace('/', '.').replaceAll("[^0-9a-zA-Z]", "_");
	}
}
