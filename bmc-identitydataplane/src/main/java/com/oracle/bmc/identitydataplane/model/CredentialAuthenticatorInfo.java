/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CredentialAuthenticatorInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CredentialAuthenticatorInfo {
    @Deprecated
    @java.beans.ConstructorProperties({
        "rawCredential",
        "userId",
        "tenantId",
        "userName",
        "tenantName",
        "credentialIdentifier",
        "credentialList",
        "service",
        "clientId"
    })
    public CredentialAuthenticatorInfo(
            String rawCredential,
            String userId,
            String tenantId,
            String userName,
            String tenantName,
            String credentialIdentifier,
            java.util.List<String> credentialList,
            String service,
            String clientId) {
        super();
        this.rawCredential = rawCredential;
        this.userId = userId;
        this.tenantId = tenantId;
        this.userName = userName;
        this.tenantName = tenantName;
        this.credentialIdentifier = credentialIdentifier;
        this.credentialList = credentialList;
        this.service = service;
        this.clientId = clientId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The raw credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rawCredential")
    private final String rawCredential;

    public String getRawCredential() {
        return rawCredential;
    }

    /**
     * The id of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    public String getUserId() {
        return userId;
    }

    /**
     * The id of the tenant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    public String getTenantId() {
        return tenantId;
    }

    /**
     * The name of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    public String getUserName() {
        return userName;
    }

    /**
     * The name of the tenant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
    private final String tenantName;

    public String getTenantName() {
        return tenantName;
    }

    /**
     * The credential identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialIdentifier")
    private final String credentialIdentifier;

    public String getCredentialIdentifier() {
        return credentialIdentifier;
    }

    /**
     * The credential list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialList")
    private final java.util.List<String> credentialList;

    public java.util.List<String> getCredentialList() {
        return credentialList;
    }

    /**
     * The name of the service that is making this authorization request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    public String getService() {
        return service;
    }

    /**
     * The id of the client.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    public String getClientId() {
        return clientId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CredentialAuthenticatorInfo(");
        sb.append("rawCredential=").append(String.valueOf(this.rawCredential));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", tenantName=").append(String.valueOf(this.tenantName));
        sb.append(", credentialIdentifier=").append(String.valueOf(this.credentialIdentifier));
        sb.append(", credentialList=").append(String.valueOf(this.credentialList));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CredentialAuthenticatorInfo)) {
            return false;
        }

        CredentialAuthenticatorInfo other = (CredentialAuthenticatorInfo) o;
        return java.util.Objects.equals(this.rawCredential, other.rawCredential)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.tenantName, other.tenantName)
                && java.util.Objects.equals(this.credentialIdentifier, other.credentialIdentifier)
                && java.util.Objects.equals(this.credentialList, other.credentialList)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.rawCredential == null ? 43 : this.rawCredential.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.tenantName == null ? 43 : this.tenantName.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialIdentifier == null
                                ? 43
                                : this.credentialIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialList == null ? 43 : this.credentialList.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
