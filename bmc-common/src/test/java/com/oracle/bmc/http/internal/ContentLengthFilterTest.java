/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import org.glassfish.jersey.internal.guava.Sets;
import org.glassfish.jersey.internal.util.collection.ImmutableMultivaluedMap;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.client.ClientRequestContext;
import java.net.URI;
import java.util.Collections;
import java.util.Set;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ContentLengthFilterTest {

    @Mock private ClientRequestContext mockContext;
    @Mock private ImmutableMultivaluedMap<String, Object> mockHeaders;

    private ContentLengthFilter filterUnderTest = new ContentLengthFilter();

    @Before
    public void setUp() {
        final Set<String> headerKeySet = Sets.newHashSet();
        headerKeySet.add("some-header");
        headerKeySet.add("content-length");

        when(mockHeaders.keySet()).thenReturn(headerKeySet);
        doReturn(Collections.singletonList("25")).when(mockHeaders).remove(eq("content-length"));

        when(mockContext.getMethod()).thenReturn(HttpMethod.GET);
        when(mockContext.getUri()).thenReturn(URI.create("https://some.endpoint.com"));
        when(mockContext.getHeaders()).thenReturn(mockHeaders);
    }

    @Test
    public void filter_withNullHeaders_shouldNotThrowException() {
        when(mockContext.getHeaders()).thenReturn(null);
        filterUnderTest.filter(mockContext);
    }

    @Test
    public void filter_withNoContentLengthKey_shouldNotThrowException() {
        final Set<String> headersKeySetWithNoContentLength = Sets.newHashSet();
        headersKeySetWithNoContentLength.add("some-header");
        when(mockHeaders.keySet()).thenReturn(headersKeySetWithNoContentLength);

        filterUnderTest.filter(mockContext);
    }

    @Test
    public void filter_withContentLengthHeader_shouldRemoveContentLength() {
        filterUnderTest.filter(mockContext);
        verify(mockHeaders).remove(eq("content-length"));
    }

    @Test
    public void filter_withNoContentLengthHeaderRemoved_shouldNotThrowException() {
        doReturn(null).when(mockHeaders).remove(eq("content-length"));
        filterUnderTest.filter(mockContext);
        verify(mockHeaders).remove(eq("content-length"));
    }
}
