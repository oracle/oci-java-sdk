/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.audit.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AuditEvent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AuditEvent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventId")
        private String eventId;

        public Builder eventId(String eventId) {
            this.eventId = eventId;
            this.__explicitlySet__.add("eventId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventSource")
        private String eventSource;

        public Builder eventSource(String eventSource) {
            this.eventSource = eventSource;
            this.__explicitlySet__.add("eventSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventType")
        private String eventType;

        public Builder eventType(String eventType) {
            this.eventType = eventType;
            this.__explicitlySet__.add("eventType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventTime")
        private java.util.Date eventTime;

        public Builder eventTime(java.util.Date eventTime) {
            this.eventTime = eventTime;
            this.__explicitlySet__.add("eventTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("principalId")
        private String principalId;

        public Builder principalId(String principalId) {
            this.principalId = principalId;
            this.__explicitlySet__.add("principalId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialId")
        private String credentialId;

        public Builder credentialId(String credentialId) {
            this.credentialId = credentialId;
            this.__explicitlySet__.add("credentialId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestAction")
        private String requestAction;

        public Builder requestAction(String requestAction) {
            this.requestAction = requestAction;
            this.__explicitlySet__.add("requestAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestId")
        private String requestId;

        public Builder requestId(String requestId) {
            this.requestId = requestId;
            this.__explicitlySet__.add("requestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestAgent")
        private String requestAgent;

        public Builder requestAgent(String requestAgent) {
            this.requestAgent = requestAgent;
            this.__explicitlySet__.add("requestAgent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
        private java.util.Map<String, java.util.List<String>> requestHeaders;

        public Builder requestHeaders(
                java.util.Map<String, java.util.List<String>> requestHeaders) {
            this.requestHeaders = requestHeaders;
            this.__explicitlySet__.add("requestHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestOrigin")
        private String requestOrigin;

        public Builder requestOrigin(String requestOrigin) {
            this.requestOrigin = requestOrigin;
            this.__explicitlySet__.add("requestOrigin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestParameters")
        private java.util.Map<String, java.util.List<String>> requestParameters;

        public Builder requestParameters(
                java.util.Map<String, java.util.List<String>> requestParameters) {
            this.requestParameters = requestParameters;
            this.__explicitlySet__.add("requestParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestResource")
        private String requestResource;

        public Builder requestResource(String requestResource) {
            this.requestResource = requestResource;
            this.__explicitlySet__.add("requestResource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseHeaders")
        private java.util.Map<String, java.util.List<String>> responseHeaders;

        public Builder responseHeaders(
                java.util.Map<String, java.util.List<String>> responseHeaders) {
            this.responseHeaders = responseHeaders;
            this.__explicitlySet__.add("responseHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseStatus")
        private String responseStatus;

        public Builder responseStatus(String responseStatus) {
            this.responseStatus = responseStatus;
            this.__explicitlySet__.add("responseStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseTime")
        private java.util.Date responseTime;

        public Builder responseTime(java.util.Date responseTime) {
            this.responseTime = responseTime;
            this.__explicitlySet__.add("responseTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responsePayload")
        private java.util.Map<String, Object> responsePayload;

        public Builder responsePayload(java.util.Map<String, Object> responsePayload) {
            this.responsePayload = responsePayload;
            this.__explicitlySet__.add("responsePayload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditEvent build() {
            AuditEvent __instance__ =
                    new AuditEvent(
                            tenantId,
                            compartmentId,
                            eventId,
                            eventSource,
                            eventType,
                            eventTime,
                            principalId,
                            credentialId,
                            requestAction,
                            requestId,
                            requestAgent,
                            requestHeaders,
                            requestOrigin,
                            requestParameters,
                            requestResource,
                            responseHeaders,
                            responseStatus,
                            responseTime,
                            responsePayload);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditEvent o) {
            Builder copiedBuilder =
                    tenantId(o.getTenantId())
                            .compartmentId(o.getCompartmentId())
                            .eventId(o.getEventId())
                            .eventSource(o.getEventSource())
                            .eventType(o.getEventType())
                            .eventTime(o.getEventTime())
                            .principalId(o.getPrincipalId())
                            .credentialId(o.getCredentialId())
                            .requestAction(o.getRequestAction())
                            .requestId(o.getRequestId())
                            .requestAgent(o.getRequestAgent())
                            .requestHeaders(o.getRequestHeaders())
                            .requestOrigin(o.getRequestOrigin())
                            .requestParameters(o.getRequestParameters())
                            .requestResource(o.getRequestResource())
                            .responseHeaders(o.getResponseHeaders())
                            .responseStatus(o.getResponseStatus())
                            .responseTime(o.getResponseTime())
                            .responsePayload(o.getResponsePayload());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the tenant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    String tenantId;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The GUID of the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventId")
    String eventId;

    /**
     * The source of the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventSource")
    String eventSource;

    /**
     * The type of the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventType")
    String eventType;

    /**
     * The time the event occurred, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventTime")
    java.util.Date eventTime;

    /**
     * The OCID of the user whose action triggered the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principalId")
    String principalId;

    /**
     * The credential ID of the user. This value is extracted from the HTTP 'Authorization' request header. It consists of the tenantId, userId, and user fingerprint, all delimited by a slash (/).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialId")
    String credentialId;

    /**
     * The HTTP method of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestAction")
    String requestAction;

    /**
     * The opc-request-id of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    String requestId;

    /**
     * The user agent of the client that made the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestAgent")
    String requestAgent;

    /**
     * The HTTP header fields and values in the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
    java.util.Map<String, java.util.List<String>> requestHeaders;

    /**
     * The IP address of the source of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestOrigin")
    String requestOrigin;

    /**
     * The query parameter fields and values for the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestParameters")
    java.util.Map<String, java.util.List<String>> requestParameters;

    /**
     * The resource targeted by the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestResource")
    String requestResource;

    /**
     * The headers of the response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseHeaders")
    java.util.Map<String, java.util.List<String>> responseHeaders;

    /**
     * The status code of the response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseStatus")
    String responseStatus;

    /**
     * The time of the response to the audited request, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseTime")
    java.util.Date responseTime;

    /**
     * Metadata of interest from the response payload. For example, the OCID of a resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responsePayload")
    java.util.Map<String, Object> responsePayload;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
