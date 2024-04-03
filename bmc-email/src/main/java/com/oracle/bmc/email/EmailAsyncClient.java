/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.email.requests.*;
import com.oracle.bmc.email.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Email service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
public class EmailAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements EmailAsync {
    /** Service instance for Email. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("EMAIL")
                    .serviceEndpointPrefix("email")
                    .serviceEndpointTemplate("https://ctrl.email.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EmailAsyncClient.class);

    EmailAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, EmailAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "email";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public EmailAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new EmailAsyncClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public java.util.concurrent.Future<ChangeEmailDomainCompartmentResponse>
            changeEmailDomainCompartment(
                    ChangeEmailDomainCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeEmailDomainCompartmentRequest,
                                    ChangeEmailDomainCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getEmailDomainId(), "emailDomainId must not be blank");
        Objects.requireNonNull(
                request.getChangeEmailDomainCompartmentDetails(),
                "changeEmailDomainCompartmentDetails is required");

        return clientCall(request, ChangeEmailDomainCompartmentResponse::builder)
                .logger(LOG, "changeEmailDomainCompartment")
                .serviceDetails(
                        "Email",
                        "ChangeEmailDomainCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/EmailDomain/ChangeEmailDomainCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeEmailDomainCompartmentRequest::builder)
                .basePath("/20170907")
                .appendPathParam("emailDomains")
                .appendPathParam(request.getEmailDomainId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeEmailDomainCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeEmailDomainCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSenderCompartmentResponse> changeSenderCompartment(
            ChangeSenderCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeSenderCompartmentRequest, ChangeSenderCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getSenderId(), "senderId must not be blank");
        Objects.requireNonNull(
                request.getChangeSenderCompartmentDetails(),
                "changeSenderCompartmentDetails is required");

        return clientCall(request, ChangeSenderCompartmentResponse::builder)
                .logger(LOG, "changeSenderCompartment")
                .serviceDetails(
                        "Email",
                        "ChangeSenderCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Sender/ChangeSenderCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSenderCompartmentRequest::builder)
                .basePath("/20170907")
                .appendPathParam("senders")
                .appendPathParam(request.getSenderId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeSenderCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDkimResponse> createDkim(
            CreateDkimRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateDkimRequest, CreateDkimResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateDkimDetails(), "createDkimDetails is required");

        return clientCall(request, CreateDkimResponse::builder)
                .logger(LOG, "createDkim")
                .serviceDetails(
                        "Email",
                        "CreateDkim",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Dkim/CreateDkim")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDkimRequest::builder)
                .basePath("/20170907")
                .appendPathParam("dkims")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.email.model.Dkim.class, CreateDkimResponse.Builder::dkim)
                .handleResponseHeaderString(
                        "Content-Location", CreateDkimResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateDkimResponse.Builder::etag)
                .handleResponseHeaderString("Location", CreateDkimResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDkimResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDkimResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateEmailDomainResponse> createEmailDomain(
            CreateEmailDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEmailDomainRequest, CreateEmailDomainResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateEmailDomainDetails(), "createEmailDomainDetails is required");

        return clientCall(request, CreateEmailDomainResponse::builder)
                .logger(LOG, "createEmailDomain")
                .serviceDetails(
                        "Email",
                        "CreateEmailDomain",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/EmailDomain/CreateEmailDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEmailDomainRequest::builder)
                .basePath("/20170907")
                .appendPathParam("emailDomains")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.email.model.EmailDomain.class,
                        CreateEmailDomainResponse.Builder::emailDomain)
                .handleResponseHeaderString(
                        "Content-Location", CreateEmailDomainResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateEmailDomainResponse.Builder::etag)
                .handleResponseHeaderString("Location", CreateEmailDomainResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEmailDomainResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateEmailDomainResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSenderResponse> createSender(
            CreateSenderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateSenderRequest, CreateSenderResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateSenderDetails(), "createSenderDetails is required");

        return clientCall(request, CreateSenderResponse::builder)
                .logger(LOG, "createSender")
                .serviceDetails(
                        "Email",
                        "CreateSender",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Sender/CreateSender")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSenderRequest::builder)
                .basePath("/20170907")
                .appendPathParam("senders")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.email.model.Sender.class,
                        CreateSenderResponse.Builder::sender)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSenderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateSenderResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSuppressionResponse> createSuppression(
            CreateSuppressionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSuppressionRequest, CreateSuppressionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSuppressionDetails(), "createSuppressionDetails is required");

        return clientCall(request, CreateSuppressionResponse::builder)
                .logger(LOG, "createSuppression")
                .serviceDetails(
                        "Email",
                        "CreateSuppression",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Suppression/CreateSuppression")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSuppressionRequest::builder)
                .basePath("/20170907")
                .appendPathParam("suppressions")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.email.model.Suppression.class,
                        CreateSuppressionResponse.Builder::suppression)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSuppressionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDkimResponse> deleteDkim(
            DeleteDkimRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteDkimRequest, DeleteDkimResponse>
                    handler) {

        Validate.notBlank(request.getDkimId(), "dkimId must not be blank");

        return clientCall(request, DeleteDkimResponse::builder)
                .logger(LOG, "deleteDkim")
                .serviceDetails(
                        "Email",
                        "DeleteDkim",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Dkim/DeleteDkim")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDkimRequest::builder)
                .basePath("/20170907")
                .appendPathParam("dkims")
                .appendPathParam(request.getDkimId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDkimResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDkimResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEmailDomainResponse> deleteEmailDomain(
            DeleteEmailDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteEmailDomainRequest, DeleteEmailDomainResponse>
                    handler) {

        Validate.notBlank(request.getEmailDomainId(), "emailDomainId must not be blank");

        return clientCall(request, DeleteEmailDomainResponse::builder)
                .logger(LOG, "deleteEmailDomain")
                .serviceDetails(
                        "Email",
                        "DeleteEmailDomain",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/EmailDomain/DeleteEmailDomain")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEmailDomainRequest::builder)
                .basePath("/20170907")
                .appendPathParam("emailDomains")
                .appendPathParam(request.getEmailDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteEmailDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEmailDomainResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSenderResponse> deleteSender(
            DeleteSenderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteSenderRequest, DeleteSenderResponse>
                    handler) {

        Validate.notBlank(request.getSenderId(), "senderId must not be blank");

        return clientCall(request, DeleteSenderResponse::builder)
                .logger(LOG, "deleteSender")
                .serviceDetails(
                        "Email",
                        "DeleteSender",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Sender/DeleteSender")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSenderRequest::builder)
                .basePath("/20170907")
                .appendPathParam("senders")
                .appendPathParam(request.getSenderId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSenderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSuppressionResponse> deleteSuppression(
            DeleteSuppressionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSuppressionRequest, DeleteSuppressionResponse>
                    handler) {

        Validate.notBlank(request.getSuppressionId(), "suppressionId must not be blank");

        return clientCall(request, DeleteSuppressionResponse::builder)
                .logger(LOG, "deleteSuppression")
                .serviceDetails(
                        "Email",
                        "DeleteSuppression",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Suppression/DeleteSuppression")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSuppressionRequest::builder)
                .basePath("/20170907")
                .appendPathParam("suppressions")
                .appendPathParam(request.getSuppressionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSuppressionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDkimResponse> getDkim(
            GetDkimRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDkimRequest, GetDkimResponse> handler) {

        Validate.notBlank(request.getDkimId(), "dkimId must not be blank");

        return clientCall(request, GetDkimResponse::builder)
                .logger(LOG, "getDkim")
                .serviceDetails(
                        "Email",
                        "GetDkim",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Dkim/GetDkim")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDkimRequest::builder)
                .basePath("/20170907")
                .appendPathParam("dkims")
                .appendPathParam(request.getDkimId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.email.model.Dkim.class, GetDkimResponse.Builder::dkim)
                .handleResponseHeaderString("etag", GetDkimResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetDkimResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEmailConfigurationResponse> getEmailConfiguration(
            GetEmailConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEmailConfigurationRequest, GetEmailConfigurationResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetEmailConfigurationResponse::builder)
                .logger(LOG, "getEmailConfiguration")
                .serviceDetails(
                        "Email",
                        "GetEmailConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Configuration/GetEmailConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEmailConfigurationRequest::builder)
                .basePath("/20170907")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.email.model.Configuration.class,
                        GetEmailConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString(
                        "opc-request-id", GetEmailConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEmailDomainResponse> getEmailDomain(
            GetEmailDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEmailDomainRequest, GetEmailDomainResponse>
                    handler) {

        Validate.notBlank(request.getEmailDomainId(), "emailDomainId must not be blank");

        return clientCall(request, GetEmailDomainResponse::builder)
                .logger(LOG, "getEmailDomain")
                .serviceDetails(
                        "Email",
                        "GetEmailDomain",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/EmailDomain/GetEmailDomain")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEmailDomainRequest::builder)
                .basePath("/20170907")
                .appendPathParam("emailDomains")
                .appendPathParam(request.getEmailDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.email.model.EmailDomain.class,
                        GetEmailDomainResponse.Builder::emailDomain)
                .handleResponseHeaderString("etag", GetEmailDomainResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEmailDomainResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSenderResponse> getSender(
            GetSenderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSenderRequest, GetSenderResponse>
                    handler) {

        Validate.notBlank(request.getSenderId(), "senderId must not be blank");

        return clientCall(request, GetSenderResponse::builder)
                .logger(LOG, "getSender")
                .serviceDetails(
                        "Email",
                        "GetSender",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Sender/GetSender")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSenderRequest::builder)
                .basePath("/20170907")
                .appendPathParam("senders")
                .appendPathParam(request.getSenderId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.email.model.Sender.class, GetSenderResponse.Builder::sender)
                .handleResponseHeaderString(
                        "opc-request-id", GetSenderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetSenderResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSuppressionResponse> getSuppression(
            GetSuppressionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSuppressionRequest, GetSuppressionResponse>
                    handler) {

        Validate.notBlank(request.getSuppressionId(), "suppressionId must not be blank");

        return clientCall(request, GetSuppressionResponse::builder)
                .logger(LOG, "getSuppression")
                .serviceDetails(
                        "Email",
                        "GetSuppression",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Suppression/GetSuppression")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSuppressionRequest::builder)
                .basePath("/20170907")
                .appendPathParam("suppressions")
                .appendPathParam(request.getSuppressionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.email.model.Suppression.class,
                        GetSuppressionResponse.Builder::suppression)
                .handleResponseHeaderString(
                        "opc-request-id", GetSuppressionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Email",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20170907")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.email.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDkimsResponse> listDkims(
            ListDkimsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDkimsRequest, ListDkimsResponse>
                    handler) {
        Objects.requireNonNull(request.getEmailDomainId(), "emailDomainId is required");

        return clientCall(request, ListDkimsResponse::builder)
                .logger(LOG, "listDkims")
                .serviceDetails(
                        "Email",
                        "ListDkims",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Dkim/ListDkims")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDkimsRequest::builder)
                .basePath("/20170907")
                .appendPathParam("dkims")
                .appendQueryParam("emailDomainId", request.getEmailDomainId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.email.model.DkimCollection.class,
                        ListDkimsResponse.Builder::dkimCollection)
                .handleResponseHeaderString("opc-next-page", ListDkimsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDkimsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEmailDomainsResponse> listEmailDomains(
            ListEmailDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEmailDomainsRequest, ListEmailDomainsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEmailDomainsResponse::builder)
                .logger(LOG, "listEmailDomains")
                .serviceDetails(
                        "Email",
                        "ListEmailDomains",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/EmailDomain/ListEmailDomains")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEmailDomainsRequest::builder)
                .basePath("/20170907")
                .appendPathParam("emailDomains")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.email.model.EmailDomainCollection.class,
                        ListEmailDomainsResponse.Builder::emailDomainCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListEmailDomainsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListEmailDomainsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSendersResponse> listSenders(
            ListSendersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSendersRequest, ListSendersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSendersResponse::builder)
                .logger(LOG, "listSenders")
                .serviceDetails(
                        "Email",
                        "ListSenders",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Sender/ListSenders")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSendersRequest::builder)
                .basePath("/20170907")
                .appendPathParam("senders")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("domain", request.getDomain())
                .appendQueryParam("emailAddress", request.getEmailAddress())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.email.model.SenderSummary.class,
                        ListSendersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSendersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSendersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSendersResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSendersResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSuppressionsResponse> listSuppressions(
            ListSuppressionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSuppressionsRequest, ListSuppressionsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSuppressionsResponse::builder)
                .logger(LOG, "listSuppressions")
                .serviceDetails(
                        "Email",
                        "ListSuppressions",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Suppression/ListSuppressions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSuppressionsRequest::builder)
                .basePath("/20170907")
                .appendPathParam("suppressions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("emailAddress", request.getEmailAddress())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.email.model.SuppressionSummary.class,
                        ListSuppressionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSuppressionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSuppressionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSuppressionsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "Email",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/WorkRequestErrorCollection/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20170907")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.email.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "Email",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/WorkRequestLogEntryCollection/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20170907")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.email.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "Email",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/WorkRequestSummaryCollection/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20170907")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.email.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDkimResponse> updateDkim(
            UpdateDkimRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateDkimRequest, UpdateDkimResponse>
                    handler) {

        Validate.notBlank(request.getDkimId(), "dkimId must not be blank");
        Objects.requireNonNull(request.getUpdateDkimDetails(), "updateDkimDetails is required");

        return clientCall(request, UpdateDkimResponse::builder)
                .logger(LOG, "updateDkim")
                .serviceDetails(
                        "Email",
                        "UpdateDkim",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Dkim/UpdateDkim")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDkimRequest::builder)
                .basePath("/20170907")
                .appendPathParam("dkims")
                .appendPathParam(request.getDkimId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDkimResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDkimResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateEmailDomainResponse> updateEmailDomain(
            UpdateEmailDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateEmailDomainRequest, UpdateEmailDomainResponse>
                    handler) {

        Validate.notBlank(request.getEmailDomainId(), "emailDomainId must not be blank");
        Objects.requireNonNull(
                request.getUpdateEmailDomainDetails(), "updateEmailDomainDetails is required");

        return clientCall(request, UpdateEmailDomainResponse::builder)
                .logger(LOG, "updateEmailDomain")
                .serviceDetails(
                        "Email",
                        "UpdateEmailDomain",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/EmailDomain/UpdateEmailDomain")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEmailDomainRequest::builder)
                .basePath("/20170907")
                .appendPathParam("emailDomains")
                .appendPathParam(request.getEmailDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateEmailDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEmailDomainResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSenderResponse> updateSender(
            UpdateSenderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateSenderRequest, UpdateSenderResponse>
                    handler) {

        Validate.notBlank(request.getSenderId(), "senderId must not be blank");
        Objects.requireNonNull(request.getUpdateSenderDetails(), "updateSenderDetails is required");

        return clientCall(request, UpdateSenderResponse::builder)
                .logger(LOG, "updateSender")
                .serviceDetails(
                        "Email",
                        "UpdateSender",
                        "https://docs.oracle.com/iaas/api/#/en/emaildelivery/20170907/Sender/UpdateSender")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSenderRequest::builder)
                .basePath("/20170907")
                .appendPathParam("senders")
                .appendPathParam(request.getSenderId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.email.model.Sender.class,
                        UpdateSenderResponse.Builder::sender)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSenderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateSenderResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EmailAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EmailAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EmailAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EmailAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EmailAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EmailAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EmailAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider);
    }
}
