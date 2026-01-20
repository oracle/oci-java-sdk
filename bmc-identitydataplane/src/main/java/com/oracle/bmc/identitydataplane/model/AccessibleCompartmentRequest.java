/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
        builder = AccessibleCompartmentRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AccessibleCompartmentRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"authorizationRequest", "compartmentIds"})
    public AccessibleCompartmentRequest(
            AuthorizationRequest authorizationRequest, java.util.List<String> compartmentIds) {
        super();
        this.authorizationRequest = authorizationRequest;
        this.compartmentIds = compartmentIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The authorization request. */
        @com.fasterxml.jackson.annotation.JsonProperty("authorizationRequest")
        private AuthorizationRequest authorizationRequest;

        /**
         * The authorization request.
         *
         * @param authorizationRequest the value to set
         * @return this builder
         */
        public Builder authorizationRequest(AuthorizationRequest authorizationRequest) {
            this.authorizationRequest = authorizationRequest;
            this.__explicitlySet__.add("authorizationRequest");
            return this;
        }
        /** The list of compartment ids. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIds")
        private java.util.List<String> compartmentIds;

        /**
         * The list of compartment ids.
         *
         * @param compartmentIds the value to set
         * @return this builder
         */
        public Builder compartmentIds(java.util.List<String> compartmentIds) {
            this.compartmentIds = compartmentIds;
            this.__explicitlySet__.add("compartmentIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessibleCompartmentRequest build() {
            AccessibleCompartmentRequest model =
                    new AccessibleCompartmentRequest(
                            this.authorizationRequest, this.compartmentIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessibleCompartmentRequest model) {
            if (model.wasPropertyExplicitlySet("authorizationRequest")) {
                this.authorizationRequest(model.getAuthorizationRequest());
            }
            if (model.wasPropertyExplicitlySet("compartmentIds")) {
                this.compartmentIds(model.getCompartmentIds());
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

    /** The authorization request. */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationRequest")
    private final AuthorizationRequest authorizationRequest;

    /**
     * The authorization request.
     *
     * @return the value
     */
    public AuthorizationRequest getAuthorizationRequest() {
        return authorizationRequest;
    }

    /** The list of compartment ids. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIds")
    private final java.util.List<String> compartmentIds;

    /**
     * The list of compartment ids.
     *
     * @return the value
     */
    public java.util.List<String> getCompartmentIds() {
        return compartmentIds;
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
        sb.append("AccessibleCompartmentRequest(");
        sb.append("super=").append(super.toString());
        sb.append("authorizationRequest=").append(String.valueOf(this.authorizationRequest));
        sb.append(", compartmentIds=").append(String.valueOf(this.compartmentIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessibleCompartmentRequest)) {
            return false;
        }

        AccessibleCompartmentRequest other = (AccessibleCompartmentRequest) o;
        return java.util.Objects.equals(this.authorizationRequest, other.authorizationRequest)
                && java.util.Objects.equals(this.compartmentIds, other.compartmentIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.authorizationRequest == null
                                ? 43
                                : this.authorizationRequest.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIds == null ? 43 : this.compartmentIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
