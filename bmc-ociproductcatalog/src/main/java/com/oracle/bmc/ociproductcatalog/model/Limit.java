/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ociproductcatalog.model;

/**
 * Limit that the use of a resource is controlled with <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Limit.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Limit extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"publicLimitName", "publicServiceName"})
    public Limit(String publicLimitName, String publicServiceName) {
        super();
        this.publicLimitName = publicLimitName;
        this.publicServiceName = publicServiceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** public name of the limit */
        @com.fasterxml.jackson.annotation.JsonProperty("publicLimitName")
        private String publicLimitName;

        /**
         * public name of the limit
         *
         * @param publicLimitName the value to set
         * @return this builder
         */
        public Builder publicLimitName(String publicLimitName) {
            this.publicLimitName = publicLimitName;
            this.__explicitlySet__.add("publicLimitName");
            return this;
        }
        /** public name of the limit service */
        @com.fasterxml.jackson.annotation.JsonProperty("publicServiceName")
        private String publicServiceName;

        /**
         * public name of the limit service
         *
         * @param publicServiceName the value to set
         * @return this builder
         */
        public Builder publicServiceName(String publicServiceName) {
            this.publicServiceName = publicServiceName;
            this.__explicitlySet__.add("publicServiceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Limit build() {
            Limit model = new Limit(this.publicLimitName, this.publicServiceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Limit model) {
            if (model.wasPropertyExplicitlySet("publicLimitName")) {
                this.publicLimitName(model.getPublicLimitName());
            }
            if (model.wasPropertyExplicitlySet("publicServiceName")) {
                this.publicServiceName(model.getPublicServiceName());
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

    /** public name of the limit */
    @com.fasterxml.jackson.annotation.JsonProperty("publicLimitName")
    private final String publicLimitName;

    /**
     * public name of the limit
     *
     * @return the value
     */
    public String getPublicLimitName() {
        return publicLimitName;
    }

    /** public name of the limit service */
    @com.fasterxml.jackson.annotation.JsonProperty("publicServiceName")
    private final String publicServiceName;

    /**
     * public name of the limit service
     *
     * @return the value
     */
    public String getPublicServiceName() {
        return publicServiceName;
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
        sb.append("Limit(");
        sb.append("super=").append(super.toString());
        sb.append("publicLimitName=").append(String.valueOf(this.publicLimitName));
        sb.append(", publicServiceName=").append(String.valueOf(this.publicServiceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Limit)) {
            return false;
        }

        Limit other = (Limit) o;
        return java.util.Objects.equals(this.publicLimitName, other.publicLimitName)
                && java.util.Objects.equals(this.publicServiceName, other.publicServiceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.publicLimitName == null ? 43 : this.publicLimitName.hashCode());
        result =
                (result * PRIME)
                        + (this.publicServiceName == null ? 43 : this.publicServiceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
