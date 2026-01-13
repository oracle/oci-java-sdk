/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oce.model;

/**
 * Details of the identity stripe used for OceInstance <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190912")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IdentityStripeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdentityStripeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serviceName", "tenancy"})
    public IdentityStripeDetails(String serviceName, String tenancy) {
        super();
        this.serviceName = serviceName;
        this.tenancy = tenancy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the Identity Cloud Service instance in My Services to be used. Example: {@code
         * secondstripe}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Name of the Identity Cloud Service instance in My Services to be used. Example: {@code
         * secondstripe}
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /**
         * Value of the Identity Cloud Service tenancy. Example: {@code
         * idcs-8416ebdd0d674f84803f4193cce026e9}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancy")
        private String tenancy;

        /**
         * Value of the Identity Cloud Service tenancy. Example: {@code
         * idcs-8416ebdd0d674f84803f4193cce026e9}
         *
         * @param tenancy the value to set
         * @return this builder
         */
        public Builder tenancy(String tenancy) {
            this.tenancy = tenancy;
            this.__explicitlySet__.add("tenancy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityStripeDetails build() {
            IdentityStripeDetails model = new IdentityStripeDetails(this.serviceName, this.tenancy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityStripeDetails model) {
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("tenancy")) {
                this.tenancy(model.getTenancy());
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

    /**
     * Name of the Identity Cloud Service instance in My Services to be used. Example: {@code
     * secondstripe}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Name of the Identity Cloud Service instance in My Services to be used. Example: {@code
     * secondstripe}
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Value of the Identity Cloud Service tenancy. Example: {@code
     * idcs-8416ebdd0d674f84803f4193cce026e9}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancy")
    private final String tenancy;

    /**
     * Value of the Identity Cloud Service tenancy. Example: {@code
     * idcs-8416ebdd0d674f84803f4193cce026e9}
     *
     * @return the value
     */
    public String getTenancy() {
        return tenancy;
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
        sb.append("IdentityStripeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", tenancy=").append(String.valueOf(this.tenancy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityStripeDetails)) {
            return false;
        }

        IdentityStripeDetails other = (IdentityStripeDetails) o;
        return java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.tenancy, other.tenancy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.tenancy == null ? 43 : this.tenancy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
