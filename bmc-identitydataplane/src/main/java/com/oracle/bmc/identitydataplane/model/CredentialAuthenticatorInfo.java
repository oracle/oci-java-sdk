/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CredentialAuthenticatorInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CredentialAuthenticatorInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The raw credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("rawCredential")
        private String rawCredential;

        /**
         * The raw credential.
         *
         * @param rawCredential the value to set
         * @return this builder
         */
        public Builder rawCredential(String rawCredential) {
            this.rawCredential = rawCredential;
            this.__explicitlySet__.add("rawCredential");
            return this;
        }
        /** The id of the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The id of the user.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /** The id of the tenant. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * The id of the tenant.
         *
         * @param tenantId the value to set
         * @return this builder
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /** The name of the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The name of the user.
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /** The name of the tenant. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
        private String tenantName;

        /**
         * The name of the tenant.
         *
         * @param tenantName the value to set
         * @return this builder
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            this.__explicitlySet__.add("tenantName");
            return this;
        }
        /** The credential identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialIdentifier")
        private String credentialIdentifier;

        /**
         * The credential identifier.
         *
         * @param credentialIdentifier the value to set
         * @return this builder
         */
        public Builder credentialIdentifier(String credentialIdentifier) {
            this.credentialIdentifier = credentialIdentifier;
            this.__explicitlySet__.add("credentialIdentifier");
            return this;
        }
        /** The credential list. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialList")
        private java.util.List<String> credentialList;

        /**
         * The credential list.
         *
         * @param credentialList the value to set
         * @return this builder
         */
        public Builder credentialList(java.util.List<String> credentialList) {
            this.credentialList = credentialList;
            this.__explicitlySet__.add("credentialList");
            return this;
        }
        /** The name of the service that is making this authorization request. */
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * The name of the service that is making this authorization request.
         *
         * @param service the value to set
         * @return this builder
         */
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /** The id of the client. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * The id of the client.
         *
         * @param clientId the value to set
         * @return this builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CredentialAuthenticatorInfo build() {
            CredentialAuthenticatorInfo model =
                    new CredentialAuthenticatorInfo(
                            this.rawCredential,
                            this.userId,
                            this.tenantId,
                            this.userName,
                            this.tenantName,
                            this.credentialIdentifier,
                            this.credentialList,
                            this.service,
                            this.clientId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CredentialAuthenticatorInfo model) {
            if (model.wasPropertyExplicitlySet("rawCredential")) {
                this.rawCredential(model.getRawCredential());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("tenantName")) {
                this.tenantName(model.getTenantName());
            }
            if (model.wasPropertyExplicitlySet("credentialIdentifier")) {
                this.credentialIdentifier(model.getCredentialIdentifier());
            }
            if (model.wasPropertyExplicitlySet("credentialList")) {
                this.credentialList(model.getCredentialList());
            }
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The raw credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("rawCredential")
    private final String rawCredential;

    /**
     * The raw credential.
     *
     * @return the value
     */
    public String getRawCredential() {
        return rawCredential;
    }

    /** The id of the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The id of the user.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /** The id of the tenant. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * The id of the tenant.
     *
     * @return the value
     */
    public String getTenantId() {
        return tenantId;
    }

    /** The name of the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The name of the user.
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /** The name of the tenant. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
    private final String tenantName;

    /**
     * The name of the tenant.
     *
     * @return the value
     */
    public String getTenantName() {
        return tenantName;
    }

    /** The credential identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialIdentifier")
    private final String credentialIdentifier;

    /**
     * The credential identifier.
     *
     * @return the value
     */
    public String getCredentialIdentifier() {
        return credentialIdentifier;
    }

    /** The credential list. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialList")
    private final java.util.List<String> credentialList;

    /**
     * The credential list.
     *
     * @return the value
     */
    public java.util.List<String> getCredentialList() {
        return credentialList;
    }

    /** The name of the service that is making this authorization request. */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * The name of the service that is making this authorization request.
     *
     * @return the value
     */
    public String getService() {
        return service;
    }

    /** The id of the client. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * The id of the client.
     *
     * @return the value
     */
    public String getClientId() {
        return clientId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CredentialAuthenticatorInfo(");
        sb.append("super=").append(super.toString());
        sb.append("rawCredential=").append(String.valueOf(this.rawCredential));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", tenantName=").append(String.valueOf(this.tenantName));
        sb.append(", credentialIdentifier=").append(String.valueOf(this.credentialIdentifier));
        sb.append(", credentialList=").append(String.valueOf(this.credentialList));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
