/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.OCID;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.UpdateInstanceDetails;
import com.oracle.bmc.core.model.UpdateInstanceAgentConfigDetails;
import com.oracle.bmc.core.requests.GetInstanceRequest;
import com.oracle.bmc.core.requests.UpdateInstanceRequest;
import java.util.HashMap;
import java.util.Map;

public class UpdateInstanceExample {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("You must pass in an instance id");
            return;
        }

        String instanceId = args[0];

        if (!OCID.isValid(instanceId)) {
            System.out.println(String.format("%s is not a valid instance id", instanceId));
            return;
        }

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        ComputeClient compute = new ComputeClient(provider);
        compute.setRegion(Region.US_PHOENIX_1);

        GetInstanceRequest getInstanceRequest =
                GetInstanceRequest.builder().instanceId(instanceId).build();
        Instance instance = compute.getInstance(getInstanceRequest).getInstance();

        Map<String, String> metadata = new HashMap<>(instance.getMetadata());
        Map<String, Object> extendedMetadata = new HashMap<>(instance.getExtendedMetadata());
        System.out.println("Before update: " + instance);

        // Add any arbitrary string -> string metadata
        metadata.put("server-mode", "survival");

        // Add any arbitrary string -> object metadata
        Map<String, Object> options = new HashMap<>();
        options.put("level-name", "world");
        options.put("max-build-height", 256);
        extendedMetadata.put("options", options);

        String newDisplayName = "server";

        boolean isMonitoringDisabled = false;
        if (instance.getAgentConfig() != null
                && !instance.getAgentConfig().getIsMonitoringDisabled()) {
            isMonitoringDisabled = true;
        }

        UpdateInstanceAgentConfigDetails updateInstanceAgentConfigDetails =
                UpdateInstanceAgentConfigDetails.builder()
                        .isMonitoringDisabled(isMonitoringDisabled)
                        .build();

        compute.updateInstance(
                UpdateInstanceRequest.builder()
                        .instanceId(instanceId)
                        .updateInstanceDetails(
                                UpdateInstanceDetails.builder()
                                        .displayName(newDisplayName)
                                        .metadata(metadata)
                                        .extendedMetadata(extendedMetadata)
                                        // agentConfig is an optional parameter
                                        .agentConfig(updateInstanceAgentConfigDetails)
                                        .build())
                        .build());

        instance = compute.getInstance(getInstanceRequest).getInstance();

        System.out.println("After update: " + instance);
    }
}
