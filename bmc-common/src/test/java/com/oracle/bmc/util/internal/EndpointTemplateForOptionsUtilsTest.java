/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import com.oracle.bmc.Service;
import com.oracle.bmc.helper.EnvironmentVariablesHelper;
import com.oracle.bmc.http.client.internal.parameterizedendpoints.ParameterizedEndpointUtil;
import com.oracle.bmc.util.internal.EndpointTemplateForOptionsUtils;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EndpointTemplateForOptionsUtilsTest {

    private static final com.oracle.bmc.Service SERVICE_USES_DS_BY_DEFAULT =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("TESTSERVICE1")
                    .serviceEndpointPrefix("testservice1")
                    .serviceEndpointTemplate(
                            "https://testservice1.{dualStack?ds.:}{region}.{secondLevelDomain}")
                    .endpointServiceName("testservice1")
                    .serviceUsesDualStackByDefault()
                    .build();

    private static final com.oracle.bmc.Service SERVICE_DOES_NOT_USE_DS_BY_DEFAULT =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("TESTSERVICE2")
                    .serviceEndpointPrefix("testservice2")
                    .serviceEndpointTemplate(
                            "https://testservice2.{dualStack?ds.:}{region}.{secondLevelDomain}")
                    .endpointServiceName("testservice2")
                    .build();

    @Test
    public void testIsDualStackEndpointEnabledWhenServiceUsesDualStackByDefault() {
        assertTrue(
                EndpointTemplateForOptionsUtils.isDualStackEnabledForClientDefault(
                        SERVICE_USES_DS_BY_DEFAULT));
        assertTrue(getResolvedEndpoint(SERVICE_USES_DS_BY_DEFAULT).contains("testservice1.ds."));

        assertFalse(
                EndpointTemplateForOptionsUtils.isDualStackEnabledForClientDefault(
                        SERVICE_DOES_NOT_USE_DS_BY_DEFAULT));
        assertFalse(
                getResolvedEndpoint(SERVICE_DOES_NOT_USE_DS_BY_DEFAULT)
                        .contains("testservice2.ds."));
    }

    @Test
    public void testIsDualStackEndpointEnabledWhenDualStackOptedViaEnvVar() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_DUAL_STACK_ENDPOINT_ENABLED", "True");
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        assertTrue(
                EndpointTemplateForOptionsUtils.isDualStackEnabledForClientDefault(
                        SERVICE_USES_DS_BY_DEFAULT));
        assertTrue(getResolvedEndpoint(SERVICE_USES_DS_BY_DEFAULT).contains("testservice1.ds."));
        assertTrue(
                EndpointTemplateForOptionsUtils.isDualStackEnabledForClientDefault(
                        SERVICE_DOES_NOT_USE_DS_BY_DEFAULT));
        assertTrue(
                getResolvedEndpoint(SERVICE_DOES_NOT_USE_DS_BY_DEFAULT)
                        .contains("testservice2.ds."));

        newEnvMap.put("OCI_DUAL_STACK_ENDPOINT_ENABLED", "false");
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        assertFalse(
                EndpointTemplateForOptionsUtils.isDualStackEnabledForClientDefault(
                        SERVICE_USES_DS_BY_DEFAULT));
        assertFalse(getResolvedEndpoint(SERVICE_USES_DS_BY_DEFAULT).contains("testservice1.ds."));
        assertFalse(
                EndpointTemplateForOptionsUtils.isDualStackEnabledForClientDefault(
                        SERVICE_DOES_NOT_USE_DS_BY_DEFAULT));
        assertFalse(
                getResolvedEndpoint(SERVICE_DOES_NOT_USE_DS_BY_DEFAULT)
                        .contains("testservice2.ds."));
    }

    private static String getResolvedEndpoint(Service service) {
        Map<String, Boolean> optionsMap = new HashMap<>();
        optionsMap.put(
                ParameterizedEndpointUtil.DUAL_STACK_OPTION,
                EndpointTemplateForOptionsUtils.isDualStackEnabledForClientDefault(service));
        String resolvedEndpoint =
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        service.getServiceEndpointTemplate(), Collections.emptyMap(), optionsMap);
        return resolvedEndpoint;
    }
}
