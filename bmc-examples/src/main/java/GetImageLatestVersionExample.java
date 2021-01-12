/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.util.List;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.model.Image;
import com.oracle.bmc.core.requests.ListImagesRequest;
import com.oracle.bmc.core.responses.ListImagesResponse;

public class GetImageLatestVersionExample {

    public static void main(String[] args) throws Exception {

        // TODO: Fill in these values
        Region region = Region.US_PHOENIX_1;
        String operatingSystem = "Oracle Linux";
        String operatingSystemVersion = "6.7";

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // Find matching images
        ComputeClient computeClient = new ComputeClient(provider);
        computeClient.setRegion(region);

        ListImagesResponse listImagesResponse =
                computeClient.listImages(
                        ListImagesRequest.builder()
                                .compartmentId(provider.getTenantId())
                                .operatingSystem(operatingSystem)
                                .operatingSystemVersion(operatingSystemVersion)
                                .build());

        computeClient.close();

        List<Image> matchingImages = listImagesResponse.getItems();

        if (matchingImages.size() == 0) {
            System.out.println("No matching images found.");
        } else {
            /*
             * Images are sorted by system images first, then custom images, secondarily sorted by image display name.
             * Since image display names take the format of "<OS>-<OSVersion>-<Year>.<Month>.<Day>-<Iteration>",
             * the first image returned for a list operation sorted by OS and OS version will be the the latest system
             * image for that OS / OS version.
             */
            Image latestImageVersion = matchingImages.get(0);

            System.out.println(latestImageVersion);
        }
    }
}
