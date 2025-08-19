/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.paginator.internal;

import com.oracle.bmc.model.BmcException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.NoSuchElementException;
import java.util.function.Function;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ResponseIteratorTest {

    @Mock private Object requestBuilder;
    @Mock private Function<Object, String> nextPageTokenRetrievalFunction;
    @Mock private Function<RequestBuilderAndToken<Object>, Object> requestBuilderFunction;
    @Mock private Function<Object, Object> pageRetrievalFunction;
    @InjectMocks private ResponseIterator<Object, Object, Object> responseIterator;

    @Before
    public void setup() {
        reset(
                requestBuilder,
                nextPageTokenRetrievalFunction,
                requestBuilderFunction,
                pageRetrievalFunction);
        responseIterator =
                new ResponseIterator<>(
                        requestBuilder,
                        nextPageTokenRetrievalFunction,
                        requestBuilderFunction,
                        pageRetrievalFunction);
    }

    @Test
    public void testHasNext_WithNoCurrentResponse() {
        Object request = new Object();
        when(requestBuilderFunction.apply(any(RequestBuilderAndToken.class))).thenReturn(request);
        when(pageRetrievalFunction.apply(request)).thenReturn(new Object());

        boolean hasNext = responseIterator.hasNext();

        assertTrue(hasNext);
        verify(requestBuilderFunction, times(1)).apply(any(RequestBuilderAndToken.class));
        verify(pageRetrievalFunction, times(1)).apply(request);
    }

    @Test
    public void testHasNext_WithCurrentResponseAndNextPageToken() {
        responseIterator.currentResponse = new Object();
        responseIterator.nextPageToken = "nextPageToken";

        boolean hasNext = responseIterator.hasNext();

        assertTrue(hasNext);
    }

    @Test
    public void testHasNext_WithCurrentResponseAndNoNextPageToken() {
        responseIterator.currentResponse = new Object();
        responseIterator.nextPageToken = null;

        boolean hasNext = responseIterator.hasNext();

        assertFalse(hasNext);
    }

    @Test
    public void testNext_NoCurrentResponse() {
        Object request = new Object();
        when(requestBuilderFunction.apply(any(RequestBuilderAndToken.class))).thenReturn(request);
        when(pageRetrievalFunction.apply(request)).thenReturn(new Object());
        when(nextPageTokenRetrievalFunction.apply(any())).thenReturn("nextPageToken");

        Object next = responseIterator.next();

        assertNotNull(next);
        verify(requestBuilderFunction, times(1)).apply(any(RequestBuilderAndToken.class));
        verify(pageRetrievalFunction, times(1)).apply(request);
        verify(nextPageTokenRetrievalFunction, times(1)).apply(any());
    }

    @Test
    public void testNext_WithCurrentResponseAndNextPageToken() {
        responseIterator.currentResponse = new Object();
        responseIterator.nextPageToken = "nextPageToken";
        Object request = new Object();
        when(requestBuilderFunction.apply(any(RequestBuilderAndToken.class))).thenReturn(request);
        when(pageRetrievalFunction.apply(request)).thenReturn(new Object());
        when(nextPageTokenRetrievalFunction.apply(any())).thenReturn("nextPageToken");

        Object next = responseIterator.next();

        assertNotNull(next);
        verify(requestBuilderFunction, times(1)).apply(any(RequestBuilderAndToken.class));
        verify(pageRetrievalFunction, times(1)).apply(request);
        verify(nextPageTokenRetrievalFunction, times(2)).apply(any());
    }

    @Test(expected = NoSuchElementException.class)
    public void testNext_WithCurrentResponseAndNoNextPageToken() {
        responseIterator.currentResponse = new Object();
        responseIterator.nextPageToken = null;

        responseIterator.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove() {
        responseIterator.remove();
    }

    @Test(expected = BmcException.class)
    public void testHasNext_ThrowsBmcException() {
        // Arrange
        Object request = new Object();
        when(requestBuilderFunction.apply(any(RequestBuilderAndToken.class))).thenReturn(request);
        when(pageRetrievalFunction.apply(request)).thenThrow(BmcException.class);

        // Act
        try {
            responseIterator.hasNext();
        } finally {
            verify(requestBuilderFunction, times(1)).apply(any(RequestBuilderAndToken.class));
            verify(pageRetrievalFunction, times(1)).apply(request);
        }
    }
}
