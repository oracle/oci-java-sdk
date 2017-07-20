/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.audit.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AuditEvent.Builder.class)
public class AuditEvent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("eventId")
        private String eventId;

        @com.fasterxml.jackson.annotation.JsonProperty("eventSource")
        private String eventSource;

        @com.fasterxml.jackson.annotation.JsonProperty("eventType")
        private String eventType;

        @com.fasterxml.jackson.annotation.JsonProperty("eventTime")
        private java.util.Date eventTime;

        @com.fasterxml.jackson.annotation.JsonProperty("principalId")
        private String principalId;

        @com.fasterxml.jackson.annotation.JsonProperty("credentialId")
        private String credentialId;

        @com.fasterxml.jackson.annotation.JsonProperty("requestAction")
        private String requestAction;

        @com.fasterxml.jackson.annotation.JsonProperty("requestId")
        private String requestId;

        @com.fasterxml.jackson.annotation.JsonProperty("requestAgent")
        private String requestAgent;

        @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
        private java.util.Map<String, java.util.List<String>> requestHeaders;

        @com.fasterxml.jackson.annotation.JsonProperty("requestOrigin")
        private String requestOrigin;

        @com.fasterxml.jackson.annotation.JsonProperty("requestParameters")
        private java.util.Map<String, java.util.List<String>> requestParameters;

        @com.fasterxml.jackson.annotation.JsonProperty("requestResource")
        private String requestResource;

        @com.fasterxml.jackson.annotation.JsonProperty("responseHeaders")
        private java.util.Map<String, java.util.List<String>> responseHeaders;

        @com.fasterxml.jackson.annotation.JsonProperty("responseStatus")
        private String responseStatus;

        @com.fasterxml.jackson.annotation.JsonProperty("responseTime")
        private java.util.Date responseTime;

        public AuditEvent build() {
            return new AuditEvent(
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
                    responseTime);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditEvent o) {
            return tenantId(o.getTenantId())
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
                    .responseTime(o.getResponseTime());
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
    @javax.validation.constraints.Size(min = 1, max = 255)
    String tenantId;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The GUID of the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String eventId;

    /**
     * The source of the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventSource")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String eventSource;

    /**
     * The type of the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventType")
    @javax.validation.constraints.Size(min = 1, max = 255)
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
    @javax.validation.constraints.Size(min = 1, max = 255)
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
    @javax.validation.constraints.Size(min = 1, max = 255)
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
    @javax.validation.constraints.Size(min = 1, max = 255)
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
    @javax.validation.constraints.Size(min = 1, max = 255)
    String responseStatus;

    /**
     * The time of the response to the audited request, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseTime")
    java.util.Date responseTime;
}
