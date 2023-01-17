/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.util.internal.ReflectionUtils;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for DefaultConfigurator.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ReflectionUtils.class)
public class DefaultConfiguratorTest {

    @Test
    public void createJerseyDefaultConfiguratorIfApacheClassAbsent() {
        PowerMockito.mockStatic(ReflectionUtils.class);
        PowerMockito.when(ReflectionUtils.isClassPresent(Matchers.anyString(), Matchers.any()))
                .thenReturn(false);
        DefaultConfigurator defaultConfigurator = new DefaultConfigurator();
        assertTrue(
                defaultConfigurator.getEffectiveClientConfigurator()
                        instanceof JerseyDefaultConnectorConfigurator);
    }
}
