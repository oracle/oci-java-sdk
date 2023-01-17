/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RetryTokenUtilsTest {
    @Mock private WrappedInvocationBuilder mockedWrappedInvocationBuilder;

    @Test
    public void testRetryTokenUtils_doesNotOverrideOpcRetryTokenHeaderIfPresent() {
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.putSingle("opc-retry-token", "test123");
        when(mockedWrappedInvocationBuilder.getHeaders()).thenReturn(headers);
        RetryTokenUtils.addRetryToken(mockedWrappedInvocationBuilder);
        verify(mockedWrappedInvocationBuilder, times(0)).header(anyString(), anyString());
    }

    @Test
    public void testRetryTokenUtils_doesNotOverrideOpcRetryTokenHeaderIfPresentIgnoreCase() {
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        final String opcRetryTokenHeaderName = "oPc-ReTry-ToKen";
        headers.putSingle(opcRetryTokenHeaderName, "test123");
        when(mockedWrappedInvocationBuilder.getHeaders()).thenReturn(headers);
        RetryTokenUtils.addRetryToken(mockedWrappedInvocationBuilder);
        verify(mockedWrappedInvocationBuilder, times(0)).header(anyString(), anyString());
    }

    @Test
    public void testRetryTokenUtils_addsOpcRetryTokenHeaderIfNotPresent() {
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        when(mockedWrappedInvocationBuilder.getHeaders()).thenReturn(headers);
        RetryTokenUtils.addRetryToken(mockedWrappedInvocationBuilder);
        verify(mockedWrappedInvocationBuilder, times(1)).header(anyString(), anyString());
    }
}
