/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer;

import com.oracle.bmc.marketplaceprivateoffer.requests.*;
import com.oracle.bmc.marketplaceprivateoffer.responses.*;

/**
 * Use the Marketplace Publisher API to manage the publishing of applications in Oracle Cloud
 * Infrastructure Marketplace.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public interface OfferQuoteAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Creates a new offer quote.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOfferQuoteResponse> createOfferQuote(
            CreateOfferQuoteRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateOfferQuoteRequest, CreateOfferQuoteResponse>
                    handler);

    /**
     * Deletes an offer quote resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOfferQuoteResponse> deleteOfferQuote(
            DeleteOfferQuoteRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteOfferQuoteRequest, DeleteOfferQuoteResponse>
                    handler);

    /**
     * Gets an offer quote by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOfferQuoteResponse> getOfferQuote(
            GetOfferQuoteRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetOfferQuoteRequest, GetOfferQuoteResponse>
                    handler);

    /**
     * Gets an offer quote internal details by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOfferQuoteInternalDetailResponse> getOfferQuoteInternalDetail(
            GetOfferQuoteInternalDetailRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOfferQuoteInternalDetailRequest, GetOfferQuoteInternalDetailResponse>
                    handler);

    /**
     * Returns a list of offer quotes. Requires either a reseller compartment ID or an ISV
     * compartment ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOfferQuotesResponse> listOfferQuotes(
            ListOfferQuotesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListOfferQuotesRequest, ListOfferQuotesResponse>
                    handler);

    /**
     * ISV responds to an offer quote for reseller to review.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RespondToOfferQuoteResponse> respondToOfferQuote(
            RespondToOfferQuoteRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RespondToOfferQuoteRequest, RespondToOfferQuoteResponse>
                    handler);

    /**
     * Sends an offer quote to be reviewed and updated by the ISV. Validation will be run on the
     * offer quote first to verify it is valid and contains all required fields.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SendOfferQuoteResponse> sendOfferQuote(
            SendOfferQuoteRequest request,
            com.oracle.bmc.responses.AsyncHandler<SendOfferQuoteRequest, SendOfferQuoteResponse>
                    handler);

    /**
     * Updates the offer quote.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOfferQuoteResponse> updateOfferQuote(
            UpdateOfferQuoteRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateOfferQuoteRequest, UpdateOfferQuoteResponse>
                    handler);

    /**
     * Withdraws an offer quote and transitions to previous state. Offer quotes can only be
     * withdrawn by reseller before the ISV response and withdrawn by the ISV before reseller
     * acceptance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<WithdrawOfferQuoteResponse> withdrawOfferQuote(
            WithdrawOfferQuoteRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            WithdrawOfferQuoteRequest, WithdrawOfferQuoteResponse>
                    handler);
}
