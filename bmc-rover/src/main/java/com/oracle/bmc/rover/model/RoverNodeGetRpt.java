/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * The resource principal token response. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RoverNodeGetRpt.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RoverNodeGetRpt
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourcePrincipalToken", "servicePrincipalSessionToken"})
    public RoverNodeGetRpt(String resourcePrincipalToken, String servicePrincipalSessionToken) {
        super();
        this.resourcePrincipalToken = resourcePrincipalToken;
        this.servicePrincipalSessionToken = servicePrincipalSessionToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The resource principal token blob that contains claims about the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourcePrincipalToken")
        private String resourcePrincipalToken;

        /**
         * The resource principal token blob that contains claims about the resource.
         *
         * @param resourcePrincipalToken the value to set
         * @return this builder
         */
        public Builder resourcePrincipalToken(String resourcePrincipalToken) {
            this.resourcePrincipalToken = resourcePrincipalToken;
            this.__explicitlySet__.add("resourcePrincipalToken");
            return this;
        }
        /** The service principal session token */
        @com.fasterxml.jackson.annotation.JsonProperty("servicePrincipalSessionToken")
        private String servicePrincipalSessionToken;

        /**
         * The service principal session token
         *
         * @param servicePrincipalSessionToken the value to set
         * @return this builder
         */
        public Builder servicePrincipalSessionToken(String servicePrincipalSessionToken) {
            this.servicePrincipalSessionToken = servicePrincipalSessionToken;
            this.__explicitlySet__.add("servicePrincipalSessionToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoverNodeGetRpt build() {
            RoverNodeGetRpt model =
                    new RoverNodeGetRpt(
                            this.resourcePrincipalToken, this.servicePrincipalSessionToken);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoverNodeGetRpt model) {
            if (model.wasPropertyExplicitlySet("resourcePrincipalToken")) {
                this.resourcePrincipalToken(model.getResourcePrincipalToken());
            }
            if (model.wasPropertyExplicitlySet("servicePrincipalSessionToken")) {
                this.servicePrincipalSessionToken(model.getServicePrincipalSessionToken());
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

    /** The resource principal token blob that contains claims about the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourcePrincipalToken")
    private final String resourcePrincipalToken;

    /**
     * The resource principal token blob that contains claims about the resource.
     *
     * @return the value
     */
    public String getResourcePrincipalToken() {
        return resourcePrincipalToken;
    }

    /** The service principal session token */
    @com.fasterxml.jackson.annotation.JsonProperty("servicePrincipalSessionToken")
    private final String servicePrincipalSessionToken;

    /**
     * The service principal session token
     *
     * @return the value
     */
    public String getServicePrincipalSessionToken() {
        return servicePrincipalSessionToken;
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
        sb.append("RoverNodeGetRpt(");
        sb.append("super=").append(super.toString());
        sb.append("resourcePrincipalToken=").append(String.valueOf(this.resourcePrincipalToken));
        sb.append(", servicePrincipalSessionToken=")
                .append(String.valueOf(this.servicePrincipalSessionToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoverNodeGetRpt)) {
            return false;
        }

        RoverNodeGetRpt other = (RoverNodeGetRpt) o;
        return java.util.Objects.equals(this.resourcePrincipalToken, other.resourcePrincipalToken)
                && java.util.Objects.equals(
                        this.servicePrincipalSessionToken, other.servicePrincipalSessionToken)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourcePrincipalToken == null
                                ? 43
                                : this.resourcePrincipalToken.hashCode());
        result =
                (result * PRIME)
                        + (this.servicePrincipalSessionToken == null
                                ? 43
                                : this.servicePrincipalSessionToken.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
