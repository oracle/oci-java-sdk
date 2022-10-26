/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AuthorizationRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AuthorizationRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "requestId",
        "userPrincipal",
        "svcPrincipal",
        "serviceName",
        "context",
        "policyHash"
    })
    public AuthorizationRequest(
            String requestId,
            Principal userPrincipal,
            Principal svcPrincipal,
            String serviceName,
            java.util.List<PermissionContext> context,
            String policyHash) {
        super();
        this.requestId = requestId;
        this.userPrincipal = userPrincipal;
        this.svcPrincipal = svcPrincipal;
        this.serviceName = serviceName;
        this.context = context;
        this.policyHash = policyHash;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The id of this request. It is a GUID. */
        @com.fasterxml.jackson.annotation.JsonProperty("requestId")
        private String requestId;

        /**
         * The id of this request. It is a GUID.
         *
         * @param requestId the value to set
         * @return this builder
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            this.__explicitlySet__.add("requestId");
            return this;
        }
        /** The user principal object */
        @com.fasterxml.jackson.annotation.JsonProperty("userPrincipal")
        private Principal userPrincipal;

        /**
         * The user principal object
         *
         * @param userPrincipal the value to set
         * @return this builder
         */
        public Builder userPrincipal(Principal userPrincipal) {
            this.userPrincipal = userPrincipal;
            this.__explicitlySet__.add("userPrincipal");
            return this;
        }
        /** The service principal object for service to service calls. */
        @com.fasterxml.jackson.annotation.JsonProperty("svcPrincipal")
        private Principal svcPrincipal;

        /**
         * The service principal object for service to service calls.
         *
         * @param svcPrincipal the value to set
         * @return this builder
         */
        public Builder svcPrincipal(Principal svcPrincipal) {
            this.svcPrincipal = svcPrincipal;
            this.__explicitlySet__.add("svcPrincipal");
            return this;
        }
        /** The name of the service that is making this authorization request */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The name of the service that is making this authorization request
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** A set of permission contexts */
        @com.fasterxml.jackson.annotation.JsonProperty("context")
        private java.util.List<PermissionContext> context;

        /**
         * A set of permission contexts
         *
         * @param context the value to set
         * @return this builder
         */
        public Builder context(java.util.List<PermissionContext> context) {
            this.context = context;
            this.__explicitlySet__.add("context");
            return this;
        }
        /**
         * The hash of cached policy on the caller service side. If this is different than what
         * Identity has, it will send the most recent policy statements.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("policyHash")
        private String policyHash;

        /**
         * The hash of cached policy on the caller service side. If this is different than what
         * Identity has, it will send the most recent policy statements.
         *
         * @param policyHash the value to set
         * @return this builder
         */
        public Builder policyHash(String policyHash) {
            this.policyHash = policyHash;
            this.__explicitlySet__.add("policyHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthorizationRequest build() {
            AuthorizationRequest model =
                    new AuthorizationRequest(
                            this.requestId,
                            this.userPrincipal,
                            this.svcPrincipal,
                            this.serviceName,
                            this.context,
                            this.policyHash);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthorizationRequest model) {
            if (model.wasPropertyExplicitlySet("requestId")) {
                this.requestId(model.getRequestId());
            }
            if (model.wasPropertyExplicitlySet("userPrincipal")) {
                this.userPrincipal(model.getUserPrincipal());
            }
            if (model.wasPropertyExplicitlySet("svcPrincipal")) {
                this.svcPrincipal(model.getSvcPrincipal());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("context")) {
                this.context(model.getContext());
            }
            if (model.wasPropertyExplicitlySet("policyHash")) {
                this.policyHash(model.getPolicyHash());
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

    /** The id of this request. It is a GUID. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    private final String requestId;

    /**
     * The id of this request. It is a GUID.
     *
     * @return the value
     */
    public String getRequestId() {
        return requestId;
    }

    /** The user principal object */
    @com.fasterxml.jackson.annotation.JsonProperty("userPrincipal")
    private final Principal userPrincipal;

    /**
     * The user principal object
     *
     * @return the value
     */
    public Principal getUserPrincipal() {
        return userPrincipal;
    }

    /** The service principal object for service to service calls. */
    @com.fasterxml.jackson.annotation.JsonProperty("svcPrincipal")
    private final Principal svcPrincipal;

    /**
     * The service principal object for service to service calls.
     *
     * @return the value
     */
    public Principal getSvcPrincipal() {
        return svcPrincipal;
    }

    /** The name of the service that is making this authorization request */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The name of the service that is making this authorization request
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** A set of permission contexts */
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    private final java.util.List<PermissionContext> context;

    /**
     * A set of permission contexts
     *
     * @return the value
     */
    public java.util.List<PermissionContext> getContext() {
        return context;
    }

    /**
     * The hash of cached policy on the caller service side. If this is different than what Identity
     * has, it will send the most recent policy statements.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("policyHash")
    private final String policyHash;

    /**
     * The hash of cached policy on the caller service side. If this is different than what Identity
     * has, it will send the most recent policy statements.
     *
     * @return the value
     */
    public String getPolicyHash() {
        return policyHash;
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
        sb.append("AuthorizationRequest(");
        sb.append("super=").append(super.toString());
        sb.append("requestId=").append(String.valueOf(this.requestId));
        sb.append(", userPrincipal=").append(String.valueOf(this.userPrincipal));
        sb.append(", svcPrincipal=").append(String.valueOf(this.svcPrincipal));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", context=").append(String.valueOf(this.context));
        sb.append(", policyHash=").append(String.valueOf(this.policyHash));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthorizationRequest)) {
            return false;
        }

        AuthorizationRequest other = (AuthorizationRequest) o;
        return java.util.Objects.equals(this.requestId, other.requestId)
                && java.util.Objects.equals(this.userPrincipal, other.userPrincipal)
                && java.util.Objects.equals(this.svcPrincipal, other.svcPrincipal)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.context, other.context)
                && java.util.Objects.equals(this.policyHash, other.policyHash)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.requestId == null ? 43 : this.requestId.hashCode());
        result =
                (result * PRIME)
                        + (this.userPrincipal == null ? 43 : this.userPrincipal.hashCode());
        result = (result * PRIME) + (this.svcPrincipal == null ? 43 : this.svcPrincipal.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.context == null ? 43 : this.context.hashCode());
        result = (result * PRIME) + (this.policyHash == null ? 43 : this.policyHash.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
