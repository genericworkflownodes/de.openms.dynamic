Rename (usually only the prefix) of the sources and class names as you wish.
Additionally set category path and (optionally) the path to the node descriptions in the YOURNAMENodeSetFactory.java.
Set properties about execution of the tools in the plugin.properties:
- commandGenerator
    - com.genericworkflownodes.knime.execution.impl.OpenMSCommandGenerator (if your tools can consume CTD based inis)
    - com.genericworkflownodes.knime.execution.impl.CLICommandGenerator (if KNIME should generate a usual command line call with options)
    - com.genericworkflownodes.knime.execution.impl.DockerCommandGenerator (basically CLI for running inside a docker container)
- dockerMachine (only used when calling tools inside a docker container)
- executor
    - com.genericworkflownodes.knime.execution.impl.LocalToolExecutor (to execute on the local machine)
    - com.genericworkflownodes.knime.execution.impl.LocalDockerToolExecutor (to execute inside a locally running docker container)
