/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.model.AppCatalogListingResourceVersionSummary;
import com.oracle.bmc.core.model.AppCatalogListingSummary;
import com.oracle.bmc.core.requests.ListAppCatalogListingResourceVersionsRequest;
import com.oracle.bmc.core.requests.ListAppCatalogListingsRequest;
import com.oracle.bmc.core.responses.ListAppCatalogListingResourceVersionsResponse;
import com.oracle.bmc.core.responses.ListAppCatalogListingsResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates how to consume the Image Catalog Listings service using the given Java
 * SDK. This will cover:
 *
 * <ul>
 *   <li>Retrieving a listing
 *   <li>Retrieving all the versions available for the listing
 *   <li>Collating the above information to print the listing id, display name, publisher name,
 *       summary, versions to stdout
 * </ul>
 *
 * This class makes the following assumptions:
 *
 * <ul>
 *   <li>The configuration file used by service clients will be sourced from the default location
 *       (~/.oci/config) and the DEFAULT profile will be used
 *   <li>Resources will be listed from us-phoenix-1
 * </ul>
 */
public class CatalogImageListingResourceVersionsExample {
    public static void main(String[] args) throws Exception {
        // TODO: Fill in these values
        Region region = Region.US_PHOENIX_1;

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ComputeClient computeClient = ComputeClient.builder().region(region).build(provider);

        // Get the first alphabetically sorted listing
        ListAppCatalogListingsResponse listImagesResponse =
                computeClient.listAppCatalogListings(
                        ListAppCatalogListingsRequest.builder()
                                .limit(1)
                                .sortOrder(
                                        ListAppCatalogListingsRequest.SortOrder
                                                .Asc) // sort by displayname
                                .build());

        if (!listImagesResponse.getItems().isEmpty()) {
            AppCatalogListingSummary catalogListingSummary = listImagesResponse.getItems().get(0);

            String listingId = catalogListingSummary.getListingId();
            List<String> resourceVersions = getResourceVersions(computeClient, listingId);

            System.out.printf("Listing Id     :%s%n", listingId);
            System.out.printf("Display Name   :%s%n", catalogListingSummary.getDisplayName());
            System.out.printf("Publisher Name :%s%n", catalogListingSummary.getPublisherName());
            System.out.printf("Summary        :%s%n", catalogListingSummary.getSummary());
            System.out.printf("Versions       :%s%n", resourceVersions);
        } else {
            System.out.println("No images found in the catalog");
        }
    }

    /**
     * Returns an exhaustive list of all versions associated with a listing.
     *
     * @param computeClient the client used to communicate with Compute service
     * @param listingId the OCID of the listing
     * @return all the versions of listing
     */
    private static List<String> getResourceVersions(ComputeClient computeClient, String listingId) {
        List<String> resourceVersions = new ArrayList<>();

        for (ListAppCatalogListingResourceVersionsResponse responseListingResourceVersion :
                computeClient
                        .getPaginators()
                        .listAppCatalogListingResourceVersionsResponseIterator(
                                ListAppCatalogListingResourceVersionsRequest.builder()
                                        .listingId(listingId)
                                        .limit(10)
                                        .sortOrder(
                                                ListAppCatalogListingResourceVersionsRequest
                                                        .SortOrder.Asc)
                                        .build())) {
            for (AppCatalogListingResourceVersionSummary item :
                    responseListingResourceVersion.getItems()) {
                resourceVersions.add(item.getListingResourceVersion());
            }
        }

        return resourceVersions;
    }
}
