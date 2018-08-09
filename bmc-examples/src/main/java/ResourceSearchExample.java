
/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.resourcesearch.ResourceSearch;
import com.oracle.bmc.resourcesearch.ResourceSearchClient;
import com.oracle.bmc.resourcesearch.model.*;
import com.oracle.bmc.resourcesearch.requests.GetResourceTypeRequest;
import com.oracle.bmc.resourcesearch.requests.ListResourceTypesRequest;
import com.oracle.bmc.resourcesearch.requests.SearchResourcesRequest;
import com.oracle.bmc.resourcesearch.responses.GetResourceTypeResponse;
import com.oracle.bmc.resourcesearch.responses.ListResourceTypesResponse;
import com.oracle.bmc.resourcesearch.responses.SearchResourcesResponse;

/**
 * This class provides an example on how to use resource-search in the Java SDK to:
 * 1. List searchable types.
 * 2. Get detail of searchable type.
 * 3. Search resources cross type.
 */
public class ResourceSearchExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     */
    public static void main(String[] args) throws Exception {

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ResourceSearch client = ResourceSearchClient.builder().build(provider);

        System.out.println("List all resource types.........");
        listTypes(client);

        System.out.println("Get Group type detail..........");
        getTypeDetails(client, "Group");

        System.out.println("Search for resource by freetext search ............");
        freetextSearch(client, "displayname");

        System.out.println("Search for resource by structured query search............");
        structuredQuerySearch(client);
    }

    private static void listTypes(ResourceSearch client) {
        ListResourceTypesRequest listTypesRequest = ListResourceTypesRequest.builder().build();

        ListResourceTypesResponse listTypesResp = client.listResourceTypes(listTypesRequest);

        for (ResourceType type : listTypesResp.getItems()) {
            System.out.println("Resource : " + type.getName());
        }
    }

    private static void getTypeDetails(ResourceSearch client, String typeName) {
        GetResourceTypeRequest getTypeRequest =
                GetResourceTypeRequest.builder().name(typeName).build();

        GetResourceTypeResponse getTypeResp = client.getResourceType(getTypeRequest);

        System.out.println(getTypeResp.getResourceType());
    }

    private static void freetextSearch(ResourceSearch client, String text) {
        SearchResourcesRequest req =
                SearchResourcesRequest.builder()
                        .searchDetails(FreeTextSearchDetails.builder().text(text).build())
                        .build();

        SearchResourcesResponse resp = client.searchResources(req);

        for (ResourceSummary resource : resp.getResourceSummaryCollection().getItems()) {
            System.out.println(resource);
        }
    }

    private static void structuredQuerySearch(ResourceSearch client) {
        SearchResourcesRequest req =
                SearchResourcesRequest.builder()
                        .searchDetails(
                                StructuredSearchDetails.builder()
                                        .matchingContextType(
                                                SearchDetails.MatchingContextType.Highlights)
                                        .query("query all resources")
                                        .build())
                        .build();

        SearchResourcesResponse resp = client.searchResources(req);

        for (ResourceSummary resource : resp.getResourceSummaryCollection().getItems()) {
            System.out.println(resource);
        }
    }
}
