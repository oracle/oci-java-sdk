/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class ClientRuntimeTest {

    private static void setEnvironmentVariable(Map<String, String> newEnvMap) throws Exception {
        try {
            Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
            Field theEnvironmentField = processEnvironmentClass.getDeclaredField("theEnvironment");
            theEnvironmentField.setAccessible(true);
            Map<String, String> env = (Map<String, String>) theEnvironmentField.get(null);
            env.putAll(newEnvMap);
            Field theCaseInsensitiveEnvironmentField =
                    processEnvironmentClass.getDeclaredField("theCaseInsensitiveEnvironment");
            theCaseInsensitiveEnvironmentField.setAccessible(true);
            Map<String, String> caseSensitiveEnvMap =
                    (Map<String, String>) theCaseInsensitiveEnvironmentField.get(null);
            caseSensitiveEnvMap.putAll(newEnvMap);
        } catch (NoSuchFieldException e) {
            Class[] classes = Collections.class.getDeclaredClasses();
            Map<String, String> env = System.getenv();
            for (Class cl : classes) {
                if ("java.util.Collections$UnmodifiableMap".equals(cl.getName())) {
                    Field field = cl.getDeclaredField("m");
                    field.setAccessible(true);
                    Object obj = field.get(env);
                    Map<String, String> map = (Map<String, String>) obj;
                    map.clear();
                    map.putAll(newEnvMap);
                }
            }
        }
    }

    // This test checks the values of all the parameters used to form the user agent.
    @Test
    public void checkUserAgentParameters() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_SDK_APPEND_USER_AGENT", "test-env-var");
        setEnvironmentVariable(newEnvMap);
        String clientUserAgent = "foobar";
        ClientRuntime.setClientUserAgent(clientUserAgent);
        String userAgent = ClientRuntime.getRuntime().getUserAgent();
        assertTrue(userAgent.contains(ClientRuntime.getRuntime().getClientInfo()));
        assertTrue(userAgent.contains(System.getProperty("os.name")));
        assertTrue(userAgent.contains(System.getProperty("os.version")));
        assertTrue(userAgent.contains(System.getProperty("java.version")));
        assertTrue(userAgent.contains(System.getProperty("java.vm.name")));
        assertTrue(userAgent.contains(System.getProperty("java.vm.version")));
        assertTrue(userAgent.contains(clientUserAgent));
        assertTrue(userAgent.endsWith(System.getenv("OCI_SDK_APPEND_USER_AGENT")));
    }
}
