/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.paginator.internal;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

/**
 * An iterator for iterating over response objects returned from a list operation. This iterator handles
 * calling the service for additional data when needed. However, not every advancement of the iterator
 * (via its {@link #next()} method) will result in a method call. Instead, the logic of this iterator
 * can be described as:
 *
 * <ol>
 *   <li>Fetch a page of results from the service</li>
 *   <li>{@link #next()} will vend individual model/resource objects from that page until there are no more to vend</li>
 *   <li>Call the service for the next page of results</li>
 *   <li>Repeat steps 2 and 3 until there are no more results</li>
 * </ol>
 *
 * This iterator does not support removal of elements.
 *
 * @param <REQUESTBUILDER> the type of a builder which can produce requests for a list operation
 * @param <REQUEST> the type of a request to a list operation. This type must match the type produced
 * by REQUESTBUILDER
 * @param <RESPONSE> the type of the response from a list operation
 * @param <ITEMTYPE> the type of the model/resource returned inside the response
 */
public class ResponseRecordIterator<REQUESTBUILDER, REQUEST, RESPONSE, ITEMTYPE>
        extends AbstractResponseIterator<REQUESTBUILDER, REQUEST, RESPONSE>
        implements Iterator<ITEMTYPE> {

    private final Function<RESPONSE, List<ITEMTYPE>> retrieveItemsFromResponseFunction;

    private List<ITEMTYPE> currentItems;
    private Iterator<ITEMTYPE> currentIterator;

    /** Constructs a new ResponseRecordIterator.
     *
     * @param requestBuilder a builder object which can create requests for a list operation
     * @param nextPageTokenRetrievalFunction a function which can extract the next page token from a
     * response produced by a list operation
     * @param requestBuilderFunction a function which can build a request for a list operation based on
     * a builder object and a pagination token to use
     * @param pageRetrievalFunction a function which will call a list operation with a request and return
     * the response of the call
     * @param retrieveItemsFromResponseFunction a function which can extract the collection of results
     * from a response produced by a list operation
     */
    public ResponseRecordIterator(
            final REQUESTBUILDER requestBuilder,
            final Function<RESPONSE, String> nextPageTokenRetrievalFunction,
            final Function<RequestBuilderAndToken<REQUESTBUILDER>, REQUEST> requestBuilderFunction,
            final Function<REQUEST, RESPONSE> pageRetrievalFunction,
            final Function<RESPONSE, List<ITEMTYPE>> retrieveItemsFromResponseFunction) {

        super(
                requestBuilder,
                nextPageTokenRetrievalFunction,
                requestBuilderFunction,
                pageRetrievalFunction);
        this.retrieveItemsFromResponseFunction = retrieveItemsFromResponseFunction;
    }

    @Override
    public ITEMTYPE next() {
        if (currentResponse == null) {
            getFirstPage();
        }

        if (currentIterator.hasNext()) {
            return currentIterator.next();
        } else {
            // If the current iterator doesn't have any items, then hasNext will advance us to the next
            // page of results (if there are any)
            if (hasNext()) {
                return currentIterator.next();
            } else {
                throw new NoSuchElementException(
                        "There are no more elements available to this iterator");
            }
        }
    }

    @Override
    public boolean hasNext() {
        if (currentResponse == null) {
            getFirstPage();
        }

        /*
         * We have more results if:
         *  - The current iterator can still vend results
         *  - The current iterator cannot vend more results, but there are more results on the next page
         *
         * If there is no next page token at this stage, then there are no more results
         */
        if (currentIterator.hasNext()) {
            return true;
        } else if (nextPageToken == null) {
            return false;
        } else {
            getNextPage();

            while (currentItems.isEmpty() && nextPageToken != null) {
                getNextPage();
            }
            return currentIterator.hasNext();
        }
    }

    private void getNextPage() {
        fetchNextPage();
        currentItems = retrieveItemsFromResponseFunction.apply(currentResponse);
        currentIterator = currentItems.iterator();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Removal is not supported");
    }

    private void getFirstPage() {
        final RequestBuilderAndToken<REQUESTBUILDER> requestBuilderAndToken =
                RequestBuilderAndToken.initialPage(requestBuilder);

        currentResponse =
                pageRetrievalFunction.apply(requestBuilderFunction.apply(requestBuilderAndToken));
        nextPageToken = nextPageTokenRetrievalFunction.apply(currentResponse);
        currentItems = retrieveItemsFromResponseFunction.apply(currentResponse);
        currentIterator = currentItems.iterator();
    }
}
