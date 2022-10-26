/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.graalvm;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.Region;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SimpleAuthenticationDetailsProvider;
import com.oracle.bmc.core.Compute;
import com.oracle.bmc.core.model.Image;
import com.oracle.bmc.core.model.Shape;
import com.oracle.bmc.core.requests.ListImagesRequest;
import com.oracle.bmc.core.requests.ListShapesRequest;
import com.oracle.bmc.core.responses.ListImagesResponse;
import com.oracle.bmc.core.responses.ListShapesResponse;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.util.internal.StringUtils;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public abstract class BaseTest {
    private static final boolean INITIALIZED = init();

    private static final String CRUD_PREFIX = "JavaSDK.CRUD.";
    private static final String SDK_TEST_COMPARTMENT_ID_ENV_VARIABLE = "SDK_TEST_COMPARTMENT_ID";
    private static final String INTEGRATION_PASS_PHRASE_ENV_VARIABLE = "INTEGRATION_PASS_PHRASE";
    private static final String INTEGRATION_TEST_CONFIG_FILE_ENV_VARIABLE =
            "INTEGRATION_TEST_CONFIG_FILE";
    private static final String INTEGRATION_TEST_FIRST_AD = "INTEGRATION_TEST_FIRST_AD";
    private static final String TENANCY_CONFIG_VARIABLE = "tenancy";
    private static final String FINGERPRINT_CONFIG_VARIABLE = "fingerprint";
    private static final String PUBLIC_KEY_CONFIG_VARIABLE = "public_key";
    private static final String KEY_FILE_CONFIG_VARIABLE = "key_file";
    private static final String USER_CONFIG_VARIABLE = "user";
    private static final String ADMIN_CONFIG_SECTION = "ADMIN";

    protected static BasicAuthenticationDetailsProvider ADMIN_AUTH_PROVIDER;
    protected static ClientConfigurator ADMIN_CONFIGURATOR;

    private static String ADMIN_TENANT_ID;

    private static String sdkTestCompartmentId;
    private static SimpleAuthenticationDetailsProvider.SimpleAuthenticationDetailsProviderBuilder
            CLIENT_BUILDER;
    private static String USER_PUBLIC_KEY;

    private static TaggingResourceHelper TAGGING_RESOURCE_HELPER;

    private static final String INTEGRATION_TEST_REGION_ENV_VARIABLE = "INTEGRATION_TEST_REGION";
    private static final String INTEGRATION_TEST_SHORT_REGION_ENV_VARIABLE =
            "INTEGRATION_TEST_SHORT_REGION";
    private static final String INTEGRATION_TEST_ENDPOINT_SUFFIX_ENV_VARIABLE =
            "INTEGRATION_TEST_ENDPOINT_SUFFIX";

    private static boolean init() {
        sdkTestCompartmentId = System.getenv(SDK_TEST_COMPARTMENT_ID_ENV_VARIABLE);
        if (StringUtils.isBlank(sdkTestCompartmentId)) {
            System.err.println(
                    "Must provide test compartment ID: export "
                            + SDK_TEST_COMPARTMENT_ID_ENV_VARIABLE
                            + "='<compartmentId>'");
            return false;
        }

        String passPhrase = System.getenv(INTEGRATION_PASS_PHRASE_ENV_VARIABLE);
        if (StringUtils.isBlank(passPhrase)) {
            System.err.println(
                    "Must provide non-blank test pass phrase: export "
                            + INTEGRATION_PASS_PHRASE_ENV_VARIABLE
                            + "='<passphrase>'");
            return false;
        }

        String testRegion = System.getenv(INTEGRATION_TEST_REGION_ENV_VARIABLE);
        String testEndpointSuffix = System.getenv(INTEGRATION_TEST_ENDPOINT_SUFFIX_ENV_VARIABLE);
        if ((StringUtils.isBlank(testRegion) && StringUtils.isBlank(testEndpointSuffix))
                || ((!StringUtils.isBlank(testRegion)
                        && !StringUtils.isBlank(testEndpointSuffix)))) {
            System.err.println(
                    "Must provide either a non-blank test region or a non-blank test endpoint suffix:\nexport "
                            + INTEGRATION_TEST_REGION_ENV_VARIABLE
                            + "='<region>'\nor\nexport "
                            + INTEGRATION_TEST_ENDPOINT_SUFFIX_ENV_VARIABLE
                            + "='<suffix>' (region was '"
                            + testRegion
                            + "' and endpoint suffix was '"
                            + testEndpointSuffix
                            + "')");
            return false;
        }

        String configFileName = getConfigFileName();
        System.out.println("Using config file " + configFileName);

        try {
            final ConfigFile defaultConfigFile =
                    ConfigFileReader.parse(
                            BaseTest.class.getClassLoader().getResourceAsStream(configFileName),
                            null);

            Supplier<InputStream> defaultKeySupplier =
                    () ->
                            BaseTest.class
                                    .getClassLoader()
                                    .getResourceAsStream(
                                            defaultConfigFile.get(KEY_FILE_CONFIG_VARIABLE));

            CLIENT_BUILDER =
                    SimpleAuthenticationDetailsProvider.builder()
                            .tenantId(defaultConfigFile.get(TENANCY_CONFIG_VARIABLE))
                            .fingerprint(defaultConfigFile.get(FINGERPRINT_CONFIG_VARIABLE))
                            .passPhrase(passPhrase)
                            .privateKeySupplier(defaultKeySupplier);

            final String userPublicKey = defaultConfigFile.get(PUBLIC_KEY_CONFIG_VARIABLE);

            String key;
            String publicKey = "";
            try (InputStream publicKeyStream =
                    BaseTest.class.getClassLoader().getResourceAsStream(userPublicKey)) {
                try (BufferedReader reader =
                        new BufferedReader(new InputStreamReader(publicKeyStream))) {
                    while ((key = reader.readLine()) != null) {
                        publicKey += key + '\n';
                    }
                }
            }
            USER_PUBLIC_KEY = publicKey;

            final ConfigFile adminConfigFile =
                    ConfigFileReader.parse(
                            BaseTest.class.getClassLoader().getResourceAsStream(configFileName),
                            ADMIN_CONFIG_SECTION);

            Supplier<InputStream> adminKeySupplier =
                    () ->
                            BaseTest.class
                                    .getClassLoader()
                                    .getResourceAsStream(
                                            adminConfigFile.get(KEY_FILE_CONFIG_VARIABLE));

            ADMIN_TENANT_ID = adminConfigFile.get(TENANCY_CONFIG_VARIABLE);

            SimpleAuthenticationDetailsProvider adminUserCredential =
                    SimpleAuthenticationDetailsProvider.builder()
                            .tenantId(ADMIN_TENANT_ID)
                            .userId(adminConfigFile.get(USER_CONFIG_VARIABLE))
                            .fingerprint(adminConfigFile.get(FINGERPRINT_CONFIG_VARIABLE))
                            .passPhrase(passPhrase)
                            .privateKeySupplier(adminKeySupplier)
                            .build();

            ADMIN_AUTH_PROVIDER = adminUserCredential;
        } catch (IOException e) {
            System.err.println(
                    "Failed to initialize integration tests when trying to parse the config");
            e.printStackTrace(System.err);
            return false;
        } catch (Throwable t) {
            // Ensure that any exception thrown includes the stacktrace in the test run output
            System.err.println("Failed to initialize integration tests");
            t.printStackTrace(System.err);
            throw t;
        }

        return passPhrase != null;
    }

    public static String getConfigFileName() {
        String configFileName = System.getenv(INTEGRATION_TEST_CONFIG_FILE_ENV_VARIABLE);

        if (configFileName != null) {
            return configFileName;
        }

        configFileName = "config";
        String region = System.getenv(INTEGRATION_TEST_REGION_ENV_VARIABLE);
        if (region != null) {
            return configFileName + "_" + region;
        }
        String endpointSuffix = System.getenv(INTEGRATION_TEST_ENDPOINT_SUFFIX_ENV_VARIABLE);
        if (endpointSuffix != null) {
            return configFileName + "_" + endpointSuffix;
        }
        return configFileName;
    }

    @BeforeAll
    public static void verifyInitialized() throws Exception {
        Assumptions.assumeTrue(INITIALIZED);
    }

    public static String getTestCompartmentId() {
        return sdkTestCompartmentId;
    }

    public static BasicAuthenticationDetailsProvider createUserProvider(String userId) {
        return CLIENT_BUILDER.userId(userId).build();
    }

    public static ClientConfigurator createUserConfigurator(String userId) {
        return null;
    }

    protected static String getNonAdminPublicKey() {
        return USER_PUBLIC_KEY;
    }

    protected static String createCrudName() {
        // this picks out the simple class name and method name of the caller
        String suffix = "";
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i = 0;
            while (stackTrace[i].getClassName() != Thread.class.getName()) {
                ++i;
            }
            ++i; // skip Thread.getStackTrace
            while (i < stackTrace.length) {
                StackTraceElement ste = stackTrace[i++];
                Class<?> clazz = Class.forName(ste.getClassName());
                if (!Modifier.isAbstract(clazz.getModifiers())) {
                    suffix = "." + clazz.getSimpleName() + "." + ste.getMethodName();
                    break;
                }
            }
        } catch (ClassNotFoundException | RuntimeException e) {
            // ignore, just don't use a suffix
        }
        return CRUD_PREFIX + System.currentTimeMillis() + suffix;
    }

    protected static String getCrudPrefix() {
        return CRUD_PREFIX;
    }

    protected static String getTenantId() {
        return Validate.notNull(ADMIN_TENANT_ID, "ADMIN_TENANT_ID must not be null");
    }

    public static Optional<Region> getTestRegion() {
        // region could be empty, not required
        String region = System.getenv(INTEGRATION_TEST_REGION_ENV_VARIABLE);
        if (region != null) {
            return Optional.of(Region.fromRegionId(region));
        } else {
            return Optional.empty();
        }
    }

    public static Optional<String> getTestEndpointSuffix() {
        // endpoint suffix could be empty, not required
        return Optional.ofNullable(System.getenv(INTEGRATION_TEST_ENDPOINT_SUFFIX_ENV_VARIABLE));
    }

    public static String getTestEndpoint(Service service) {
        // Fix DEX-4072, allow service team to set per-service's endpoint through
        // SERVICENAME_ENDPOINT
        Optional<String> endpoint =
                Optional.ofNullable(
                        System.getenv(service.getServiceName().toUpperCase() + "_ENDPOINT"));

        if (endpoint.isPresent()) {
            return endpoint.get();
        } else {
            Optional<String> testEndpointSuffix = getTestEndpointSuffix();
            if (testEndpointSuffix.isPresent()) {
                return "https://"
                        + service.getServiceEndpointPrefix()
                        + "."
                        + testEndpointSuffix.get();
            } else {
                return getTestRegion().get().getEndpoint(service).get();
            }
        }
    }

    public static List<AvailabilityDomain> reorderAvailabilityDomain(List<AvailabilityDomain> ADs) {
        String firstAD = System.getenv(INTEGRATION_TEST_FIRST_AD);
        LinkedList<AvailabilityDomain> ret = new LinkedList<>();
        if (firstAD == null) {
            return ADs;
        } else {
            for (AvailabilityDomain AD : ADs) {
                if (AD.getName().equals(firstAD)) {
                    System.out.println(
                            String.format(
                                    "Inserting %s to be the first Available Domain", firstAD));
                    ret.addFirst(AD);
                } else {
                    ret.add(AD);
                }
            }
        }
        return ret;
    }

    public static String getImageIdForOsAndShape(
            Compute client, String requestedOs, String requestedShape) {
        Validate.isTrue(!StringUtils.isBlank(requestedOs), "requestedOs may not be blank");
        Validate.isTrue(!StringUtils.isBlank(requestedShape), "requestedShape may not be blank");

        ListImagesResponse listImagesResponse =
                client.listImages(
                        ListImagesRequest.builder().compartmentId(getTestCompartmentId()).build());

        assertNotNull(listImagesResponse);

        // Find an Oracle Linux image
        for (Image image : listImagesResponse.getItems()) {
            if (requestedOs.equals(image.getOperatingSystem()) && image.getBaseImageId() == null) {
                ListShapesResponse listShapesResponse =
                        client.listShapes(
                                ListShapesRequest.builder()
                                        .compartmentId(getTestCompartmentId())
                                        .imageId(image.getId())
                                        .build());
                String page = listShapesResponse.getOpcNextPage();
                do {
                    for (Shape sh : listShapesResponse.getItems()) {
                        if (requestedShape.equals(sh.getShape())) {
                            return image.getId();
                        }
                    }
                    if (page != null) {
                        listShapesResponse =
                                client.listShapes(
                                        ListShapesRequest.builder()
                                                .compartmentId(getTestCompartmentId())
                                                .imageId(image.getId())
                                                .page(page)
                                                .build());

                        page = listShapesResponse.getOpcNextPage();
                    }
                } while (page != null);
            }
        }

        throw new IllegalArgumentException("No compatible image found for shape " + requestedShape);
    }
}
