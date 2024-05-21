/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.paginator.internal;

import java.util.Optional;
import java.util.function.Function;

/**
 * Contains common functionality for classes which will iterate over the results of paginated
 * list operations in a service.
 *
 * @param <REQUESTBUILDER> the type of a builder which can produce requests for a list operation
 * @param <REQUEST> the type of a request to a list operation. This type must match the type produced
 * by REQUESTBUILDER
 * @param <RESPONSE> the type of the response from a list operation
 */
public abstract class AbstractResponseIterator<REQUESTBUILDER, REQUEST, RESPONSE> {
    /**
     * A builder which can be used to construct requests to the list operation
     */
    protected final REQUESTBUILDER requestBuilder;

    /**
     * A function which can be used to extract the next page token from a response from a list
     * operation
     */
    protected final Function<RESPONSE, String> nextPageTokenRetrievalFunction;

    /**
     * A function which can call a list operation with a request and return the response from
     * that call
     */
    protected final Function<REQUEST, RESPONSE> pageRetrievalFunction;

    /**
     * A function which constructs a request to a list operation based on a builder object
     * and pagination token
     */
    protected final Function<RequestBuilderAndToken<REQUESTBUILDER>, REQUEST>
            requestBuilderFunction;

    /**
     * The most recent response/result of calling the list operation. If the operation has never
     * been called, then this will be null
     */
    protected RESPONSE currentResponse;

    /**
     * The page token to use on the next request to the list operation
     */
    protected String nextPageToken;

    /**
     * Constructs a new AbstractResponseIterator.
     *
     * @param requestBuilder a builder object which can create requests for a list operation
     * @param nextPageTokenRetrievalFunction a function which can extract the next page token from a
     * response produced by a list operation
     * @param requestBuilderFunction a function which can build a request for a list operation based on
     * a builder object and a pagination token to use
     * @param pageRetrievalFunction a function which will call a list operation with a request and return
     * the response of the call
     */
    public AbstractResponseIterator(
            final REQUESTBUILDER requestBuilder,
            final Function<RESPONSE, String> nextPageTokenRetrievalFunction,
            final Function<RequestBuilderAndToken<REQUESTBUILDER>, REQUEST> requestBuilderFunction,
            final Function<REQUEST, RESPONSE> pageRetrievalFunction) {

        this.requestBuilder = requestBuilder;
        this.nextPageTokenRetrievalFunction = nextPageTokenRetrievalFunction;
        this.requestBuilderFunction = requestBuilderFunction;
        this.pageRetrievalFunction = pageRetrievalFunction;
    }

    /**
     * Based on the state of this class, produces the next request that should be used when calling
     * the list operation so that the next page of results will be returned. This will just create the
     * request and not make any service calls
     *
     * @return the next request that should be used when calling the list operation
     */
    protected REQUEST getNextRequest() {
        final RequestBuilderAndToken<REQUESTBUILDER> requestBuilderAndToken =
                RequestBuilderAndToken.subsequentPage(requestBuilder, getNextPageToken());

        return requestBuilderFunction.apply(requestBuilderAndToken);
    }

    /**
     * Gets the page token that should be used when the list operation is next called.
     *
     * @return null if we have not previously made a request to fetch any results. Otherwise,
     * an Optional containing the next page token to use. If there is no next page token
     * to use then an empty/absent Optional will be returned
     */
    protected Optional<String> getNextPageToken() {
        if (currentResponse == null) {
            return null;
        }

        return Optional.ofNullable(nextPageTokenRetrievalFunction.apply(currentResponse));
    }

    /**
     * Updates the state of this class with the next page of results
     */
    protected void fetchNextPage() {
        currentResponse = pageRetrievalFunction.apply(getNextRequest());
        nextPageToken = nextPageTokenRetrievalFunction.apply(currentResponse);
    }
}
