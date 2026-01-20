/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.paginator.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;

/**
 * An iterator for iterating over response objects returned from a list operation. Each time we
 * advance the iterator (via its {@link #next()} method) we will call the list operation of the
 * service for the next response.
 *
 * <p>This iterator does not support removal of elements.
 *
 * @param <REQUESTBUILDER> the type of a builder which can produce requests for a list operation
 * @param <REQUEST> the type of a request to a list operation. This type must match the type
 *     produced by REQUESTBUILDER
 * @param <RESPONSE> the type of the response from a list operation
 */
public class ResponseIterator<REQUESTBUILDER, REQUEST, RESPONSE>
        extends AbstractResponseIterator<REQUESTBUILDER, REQUEST, RESPONSE>
        implements Iterator<RESPONSE> {

    /**
     * Constructs a new ResponseIterator.
     *
     * @param requestBuilder a builder object which can create requests for a list operation
     * @param nextPageTokenRetrievalFunction a function which can extract the next page token from a
     *     response produced by a list operation
     * @param requestBuilderFunction a function which can build a request for a list operation based
     *     on a builder object and a pagination token to use
     * @param pageRetrievalFunction a function which will call a list operation with a request and
     *     return the response of the call
     */
    public ResponseIterator(
            final REQUESTBUILDER requestBuilder,
            final Function<RESPONSE, String> nextPageTokenRetrievalFunction,
            final Function<RequestBuilderAndToken<REQUESTBUILDER>, REQUEST> requestBuilderFunction,
            final Function<REQUEST, RESPONSE> pageRetrievalFunction) {

        super(
                requestBuilder,
                nextPageTokenRetrievalFunction,
                requestBuilderFunction,
                pageRetrievalFunction);
    }

    @Override
    public RESPONSE next() {
        if (currentResponse != null && nextPageToken == null) {
            throw new NoSuchElementException(
                    "There are no more elements available to this iterator");
        }

        fetchNextPage();
        return currentResponse;
    }

    @Override
    public boolean hasNext() {
        if (currentResponse == null) {
            // fetch the first page
            fetchFirstPage();
            return true;
        }
        return nextPageToken != null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Removal is not supported");
    }
}
