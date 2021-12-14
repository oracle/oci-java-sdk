/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuthorizationRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AuthorizationRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("requestId")
        private String requestId;

        public Builder requestId(String requestId) {
            this.requestId = requestId;
            this.__explicitlySet__.add("requestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userPrincipal")
        private Principal userPrincipal;

        public Builder userPrincipal(Principal userPrincipal) {
            this.userPrincipal = userPrincipal;
            this.__explicitlySet__.add("userPrincipal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("svcPrincipal")
        private Principal svcPrincipal;

        public Builder svcPrincipal(Principal svcPrincipal) {
            this.svcPrincipal = svcPrincipal;
            this.__explicitlySet__.add("svcPrincipal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("context")
        private java.util.List<PermissionContext> context;

        public Builder context(java.util.List<PermissionContext> context) {
            this.context = context;
            this.__explicitlySet__.add("context");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyHash")
        private String policyHash;

        public Builder policyHash(String policyHash) {
            this.policyHash = policyHash;
            this.__explicitlySet__.add("policyHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthorizationRequest build() {
            AuthorizationRequest __instance__ =
                    new AuthorizationRequest(
                            requestId,
                            userPrincipal,
                            svcPrincipal,
                            serviceName,
                            context,
                            policyHash);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthorizationRequest o) {
            Builder copiedBuilder =
                    requestId(o.getRequestId())
                            .userPrincipal(o.getUserPrincipal())
                            .svcPrincipal(o.getSvcPrincipal())
                            .serviceName(o.getServiceName())
                            .context(o.getContext())
                            .policyHash(o.getPolicyHash());

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
     * The id of this request. It is a GUID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    String requestId;

    /**
     * The user principal object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userPrincipal")
    Principal userPrincipal;

    /**
     * The service principal object for service to service calls.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("svcPrincipal")
    Principal svcPrincipal;

    /**
     * The name of the service that is making this authorization request
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    String serviceName;

    /**
     * A set of permission contexts
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    java.util.List<PermissionContext> context;

    /**
     * The hash of cached policy on the caller service side. If this is different than what Identity has, it will
     * send the most recent policy statements.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyHash")
    String policyHash;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
