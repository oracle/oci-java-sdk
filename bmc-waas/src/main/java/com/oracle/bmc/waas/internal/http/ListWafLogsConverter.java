/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.waas.model.*;
import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.extern.slf4j.Slf4j
public class ListWafLogsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static ListWafLogsRequest interceptRequest(ListWafLogsRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, ListWafLogsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getWaasPolicyId(), "waasPolicyId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20181116")
                        .path("waasPolicies")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getWaasPolicyId()))
                        .path("wafLogs");

        if (request.getLimit() != null) {
            target =
                    target.queryParam(
                            "limit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLimit()));
        }

        if (request.getPage() != null) {
            target =
                    target.queryParam(
                            "page",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPage()));
        }

        if (request.getTimeObservedGreaterThanOrEqualTo() != null) {
            target =
                    target.queryParam(
                            "timeObservedGreaterThanOrEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeObservedGreaterThanOrEqualTo()));
        }

        if (request.getTimeObservedLessThan() != null) {
            target =
                    target.queryParam(
                            "timeObservedLessThan",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeObservedLessThan()));
        }

        if (request.getTextContains() != null) {
            target =
                    target.queryParam(
                            "textContains",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTextContains()));
        }

        if (request.getAccessRuleKey() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "accessRuleKey",
                            request.getAccessRuleKey(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getAction() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "action",
                            request.getAction(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getClientAddress() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "clientAddress",
                            request.getClientAddress(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getCountryCode() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "countryCode",
                            request.getCountryCode(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getCountryName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "countryName",
                            request.getCountryName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getFingerprint() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "fingerprint",
                            request.getFingerprint(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getHttpMethod() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "httpMethod",
                            request.getHttpMethod(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getIncidentKey() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "incidentKey",
                            request.getIncidentKey(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getLogType() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "logType",
                            request.getLogType(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getOriginAddress() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "originAddress",
                            request.getOriginAddress(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getReferrer() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "referrer",
                            request.getReferrer(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getRequestUrl() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "requestUrl",
                            request.getRequestUrl(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getResponseCode() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "responseCode",
                            request.getResponseCode(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getThreatFeedKey() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "threatFeedKey",
                            request.getThreatFeedKey(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getUserAgent() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "userAgent",
                            request.getUserAgent(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getProtectionRuleKey() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "protectionRuleKey",
                            request.getProtectionRuleKey(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, ListWafLogsResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListWafLogsResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, ListWafLogsResponse>() {
                            @Override
                            public ListWafLogsResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for ListWafLogsResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.util.List<WafLog>>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        new javax.ws.rs.core.GenericType<
                                                                java.util.List<WafLog>>() {});

                                com.oracle.bmc.http.internal.WithHeaders<java.util.List<WafLog>>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                ListWafLogsResponse.Builder builder = ListWafLogsResponse.builder();

                                builder.items(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcNextPageHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                ListWafLogsResponse responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
