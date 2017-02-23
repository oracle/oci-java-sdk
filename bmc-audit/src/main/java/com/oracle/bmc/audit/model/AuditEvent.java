/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.audit.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = AuditEvent.Builder.class)
public class AuditEvent {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("tenantId")
        private String tenantId;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("eventId")
        private String eventId;

        @JsonProperty("eventSource")
        private String eventSource;

        @JsonProperty("eventType")
        private String eventType;

        @JsonProperty("eventTime")
        private Date eventTime;

        @JsonProperty("principalId")
        private String principalId;

        @JsonProperty("credentialId")
        private String credentialId;

        @JsonProperty("requestAction")
        private String requestAction;

        @JsonProperty("requestId")
        private String requestId;

        @JsonProperty("requestAgent")
        private String requestAgent;

        @JsonProperty("requestHeaders")
        private Map<String, List<String>> requestHeaders;

        @JsonProperty("requestOrigin")
        private String requestOrigin;

        @JsonProperty("requestParameters")
        private Map<String, List<String>> requestParameters;

        @JsonProperty("requestResource")
        private String requestResource;

        @JsonProperty("responseHeaders")
        private Map<String, List<String>> responseHeaders;

        @JsonProperty("responseStatus")
        private String responseStatus;

        @JsonProperty("responseTime")
        private Date responseTime;

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

        @JsonIgnore
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
    @JsonProperty("tenantId")
    @Size(min = 1, max = 255)
    String tenantId;

    /**
     * The OCID of the compartment.
     **/
    @JsonProperty("compartmentId")
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The GUID of the event.
     **/
    @JsonProperty("eventId")
    @Size(min = 1, max = 255)
    String eventId;

    /**
     * The source of the event.
     **/
    @JsonProperty("eventSource")
    @Size(min = 1, max = 255)
    String eventSource;

    /**
     * The type of the event.
     **/
    @JsonProperty("eventType")
    @Size(min = 1, max = 255)
    String eventType;

    /**
     * The time the event occurred, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     **/
    @JsonProperty("eventTime")
    Date eventTime;

    /**
     * The OCID of the user whose action triggered the event.
     **/
    @JsonProperty("principalId")
    @Size(min = 1, max = 255)
    String principalId;

    /**
     * The credential ID of the user. This value is extracted from the HTTP 'Authorization' request header. It consists of the tenantId, userId, and user fingerprint, all delimited by a slash (/).
     **/
    @JsonProperty("credentialId")
    String credentialId;

    /**
     * The HTTP method of the request.
     **/
    @JsonProperty("requestAction")
    @Size(min = 1, max = 255)
    String requestAction;

    /**
     * The opc-request-id of the request.
     **/
    @JsonProperty("requestId")
    String requestId;

    /**
     * The user agent of the client that made the request.
     **/
    @JsonProperty("requestAgent")
    String requestAgent;

    /**
     * The HTTP header fields and values in the request.
     **/
    @JsonProperty("requestHeaders")
    Map<String, List<String>> requestHeaders;

    /**
     * The IP address of the source of the request.
     **/
    @JsonProperty("requestOrigin")
    @Size(min = 1, max = 255)
    String requestOrigin;

    /**
     * The query parameter fields and values for the request.
     **/
    @JsonProperty("requestParameters")
    Map<String, List<String>> requestParameters;

    /**
     * The resource targeted by the request.
     **/
    @JsonProperty("requestResource")
    String requestResource;

    /**
     * The headers of the response.
     **/
    @JsonProperty("responseHeaders")
    Map<String, List<String>> responseHeaders;

    /**
     * The status code of the response.
     **/
    @JsonProperty("responseStatus")
    @Size(min = 1, max = 255)
    String responseStatus;

    /**
     * The time of the response to the audited request, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     **/
    @JsonProperty("responseTime")
    Date responseTime;
}
