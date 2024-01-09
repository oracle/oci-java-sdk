/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OriginGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OriginGroup extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"origins"})
    public OriginGroup(java.util.List<OriginGroup_origins> origins) {
        super();
        this.origins = origins;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of objects containing origin references and additional properties. */
        @com.fasterxml.jackson.annotation.JsonProperty("origins")
        private java.util.List<OriginGroup_origins> origins;

        /**
         * The list of objects containing origin references and additional properties.
         *
         * @param origins the value to set
         * @return this builder
         */
        public Builder origins(java.util.List<OriginGroup_origins> origins) {
            this.origins = origins;
            this.__explicitlySet__.add("origins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OriginGroup build() {
            OriginGroup model = new OriginGroup(this.origins);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OriginGroup model) {
            if (model.wasPropertyExplicitlySet("origins")) {
                this.origins(model.getOrigins());
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

    /** The list of objects containing origin references and additional properties. */
    @com.fasterxml.jackson.annotation.JsonProperty("origins")
    private final java.util.List<OriginGroup_origins> origins;

    /**
     * The list of objects containing origin references and additional properties.
     *
     * @return the value
     */
    public java.util.List<OriginGroup_origins> getOrigins() {
        return origins;
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
        sb.append("OriginGroup(");
        sb.append("super=").append(super.toString());
        sb.append("origins=").append(String.valueOf(this.origins));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OriginGroup)) {
            return false;
        }

        OriginGroup other = (OriginGroup) o;
        return java.util.Objects.equals(this.origins, other.origins) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.origins == null ? 43 : this.origins.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
