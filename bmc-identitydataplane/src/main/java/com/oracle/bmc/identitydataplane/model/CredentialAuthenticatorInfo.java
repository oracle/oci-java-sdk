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
    builder = CredentialAuthenticatorInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CredentialAuthenticatorInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("rawCredential")
        private String rawCredential;

        public Builder rawCredential(String rawCredential) {
            this.rawCredential = rawCredential;
            this.__explicitlySet__.add("rawCredential");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
        private String tenantName;

        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            this.__explicitlySet__.add("tenantName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialIdentifier")
        private String credentialIdentifier;

        public Builder credentialIdentifier(String credentialIdentifier) {
            this.credentialIdentifier = credentialIdentifier;
            this.__explicitlySet__.add("credentialIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialList")
        private java.util.List<String> credentialList;

        public Builder credentialList(java.util.List<String> credentialList) {
            this.credentialList = credentialList;
            this.__explicitlySet__.add("credentialList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CredentialAuthenticatorInfo build() {
            CredentialAuthenticatorInfo __instance__ =
                    new CredentialAuthenticatorInfo(
                            rawCredential,
                            userId,
                            tenantId,
                            userName,
                            tenantName,
                            credentialIdentifier,
                            credentialList,
                            service,
                            clientId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CredentialAuthenticatorInfo o) {
            Builder copiedBuilder =
                    rawCredential(o.getRawCredential())
                            .userId(o.getUserId())
                            .tenantId(o.getTenantId())
                            .userName(o.getUserName())
                            .tenantName(o.getTenantName())
                            .credentialIdentifier(o.getCredentialIdentifier())
                            .credentialList(o.getCredentialList())
                            .service(o.getService())
                            .clientId(o.getClientId());

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
     * The raw credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rawCredential")
    String rawCredential;

    /**
     * The id of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    String userId;

    /**
     * The id of the tenant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    String tenantId;

    /**
     * The name of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    String userName;

    /**
     * The name of the tenant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
    String tenantName;

    /**
     * The credential identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialIdentifier")
    String credentialIdentifier;

    /**
     * The credential list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialList")
    java.util.List<String> credentialList;

    /**
     * The name of the service that is making this authorization request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    String service;

    /**
     * The id of the client.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    String clientId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
