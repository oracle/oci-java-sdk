/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Describes pagination support for an insight type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PaginationCapability.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PaginationCapability
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isSupported", "maxLimit", "defaultLimit"})
    public PaginationCapability(Boolean isSupported, Integer maxLimit, Integer defaultLimit) {
        super();
        this.isSupported = isSupported;
        this.maxLimit = maxLimit;
        this.defaultLimit = defaultLimit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates whether pagination is supported. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSupported")
        private Boolean isSupported;

        /**
         * Indicates whether pagination is supported.
         *
         * @param isSupported the value to set
         * @return this builder
         */
        public Builder isSupported(Boolean isSupported) {
            this.isSupported = isSupported;
            this.__explicitlySet__.add("isSupported");
            return this;
        }
        /** Maximum number of items per page. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxLimit")
        private Integer maxLimit;

        /**
         * Maximum number of items per page.
         *
         * @param maxLimit the value to set
         * @return this builder
         */
        public Builder maxLimit(Integer maxLimit) {
            this.maxLimit = maxLimit;
            this.__explicitlySet__.add("maxLimit");
            return this;
        }
        /** Default number of items per page. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultLimit")
        private Integer defaultLimit;

        /**
         * Default number of items per page.
         *
         * @param defaultLimit the value to set
         * @return this builder
         */
        public Builder defaultLimit(Integer defaultLimit) {
            this.defaultLimit = defaultLimit;
            this.__explicitlySet__.add("defaultLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PaginationCapability build() {
            PaginationCapability model =
                    new PaginationCapability(this.isSupported, this.maxLimit, this.defaultLimit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PaginationCapability model) {
            if (model.wasPropertyExplicitlySet("isSupported")) {
                this.isSupported(model.getIsSupported());
            }
            if (model.wasPropertyExplicitlySet("maxLimit")) {
                this.maxLimit(model.getMaxLimit());
            }
            if (model.wasPropertyExplicitlySet("defaultLimit")) {
                this.defaultLimit(model.getDefaultLimit());
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

    /** Indicates whether pagination is supported. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSupported")
    private final Boolean isSupported;

    /**
     * Indicates whether pagination is supported.
     *
     * @return the value
     */
    public Boolean getIsSupported() {
        return isSupported;
    }

    /** Maximum number of items per page. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxLimit")
    private final Integer maxLimit;

    /**
     * Maximum number of items per page.
     *
     * @return the value
     */
    public Integer getMaxLimit() {
        return maxLimit;
    }

    /** Default number of items per page. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultLimit")
    private final Integer defaultLimit;

    /**
     * Default number of items per page.
     *
     * @return the value
     */
    public Integer getDefaultLimit() {
        return defaultLimit;
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
        sb.append("PaginationCapability(");
        sb.append("super=").append(super.toString());
        sb.append("isSupported=").append(String.valueOf(this.isSupported));
        sb.append(", maxLimit=").append(String.valueOf(this.maxLimit));
        sb.append(", defaultLimit=").append(String.valueOf(this.defaultLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PaginationCapability)) {
            return false;
        }

        PaginationCapability other = (PaginationCapability) o;
        return java.util.Objects.equals(this.isSupported, other.isSupported)
                && java.util.Objects.equals(this.maxLimit, other.maxLimit)
                && java.util.Objects.equals(this.defaultLimit, other.defaultLimit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isSupported == null ? 43 : this.isSupported.hashCode());
        result = (result * PRIME) + (this.maxLimit == null ? 43 : this.maxLimit.hashCode());
        result = (result * PRIME) + (this.defaultLimit == null ? 43 : this.defaultLimit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
