/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import java.util.List;

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

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

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
