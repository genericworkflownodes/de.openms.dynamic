This is an example plugin for using the dynamic node generation capabilities of the
GenericKNIMENodes base plugin (https://github.com/genericworkflownodes/GenericKnimeNodes).
You should:
- import this into your KNIME SDK,
- change the names and descriptions in/of the sources and configuration
files (plugin.xml, META-INF/MANIFEST.MF)
    - plugin.xml:
        - You need to set the name of the factory-class in the sources.in the nodeset extension point
        - You need to add all filetypes that your executables are able to consume to the filehandling.mimetypes extension point.
        - You can add subcategories and icons for it in the repository.categories extension point.
        - You can add more extension points that your plugin will use (usually only needed if you have own additional Java sources in the plugin.
    - MANIFEST.MF: See META-INF subfolder.for instructions
- put your executables, descriptions and dependencies in the subfolders of your payload folder (for everything about descriptions of tools with CTD, see here https://github.com/Workflowconversion)
- build and test in a KNIME Instance started in the SDK (see KNIME developer guide) 
- (export as a plugin or create an update site)

Please have a look in the subfolders for further instructions.
