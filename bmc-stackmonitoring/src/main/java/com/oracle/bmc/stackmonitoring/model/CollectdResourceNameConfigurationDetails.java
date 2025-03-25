/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Resource name generation overriding configurations for collectd resource types. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CollectdResourceNameConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CollectdResourceNameConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"suffix", "includeProperties", "excludeProperties"})
    public CollectdResourceNameConfigurationDetails(
            String suffix,
            java.util.List<String> includeProperties,
            java.util.List<String> excludeProperties) {
        super();
        this.suffix = suffix;
        this.includeProperties = includeProperties;
        this.excludeProperties = excludeProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** String to be suffixed to the resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("suffix")
        private String suffix;

        /**
         * String to be suffixed to the resource name.
         *
         * @param suffix the value to set
         * @return this builder
         */
        public Builder suffix(String suffix) {
            this.suffix = suffix;
            this.__explicitlySet__.add("suffix");
            return this;
        }
        /** List of property names to be included. */
        @com.fasterxml.jackson.annotation.JsonProperty("includeProperties")
        private java.util.List<String> includeProperties;

        /**
         * List of property names to be included.
         *
         * @param includeProperties the value to set
         * @return this builder
         */
        public Builder includeProperties(java.util.List<String> includeProperties) {
            this.includeProperties = includeProperties;
            this.__explicitlySet__.add("includeProperties");
            return this;
        }
        /** List of property names to be excluded. */
        @com.fasterxml.jackson.annotation.JsonProperty("excludeProperties")
        private java.util.List<String> excludeProperties;

        /**
         * List of property names to be excluded.
         *
         * @param excludeProperties the value to set
         * @return this builder
         */
        public Builder excludeProperties(java.util.List<String> excludeProperties) {
            this.excludeProperties = excludeProperties;
            this.__explicitlySet__.add("excludeProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CollectdResourceNameConfigurationDetails build() {
            CollectdResourceNameConfigurationDetails model =
                    new CollectdResourceNameConfigurationDetails(
                            this.suffix, this.includeProperties, this.excludeProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CollectdResourceNameConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("suffix")) {
                this.suffix(model.getSuffix());
            }
            if (model.wasPropertyExplicitlySet("includeProperties")) {
                this.includeProperties(model.getIncludeProperties());
            }
            if (model.wasPropertyExplicitlySet("excludeProperties")) {
                this.excludeProperties(model.getExcludeProperties());
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

    /** String to be suffixed to the resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("suffix")
    private final String suffix;

    /**
     * String to be suffixed to the resource name.
     *
     * @return the value
     */
    public String getSuffix() {
        return suffix;
    }

    /** List of property names to be included. */
    @com.fasterxml.jackson.annotation.JsonProperty("includeProperties")
    private final java.util.List<String> includeProperties;

    /**
     * List of property names to be included.
     *
     * @return the value
     */
    public java.util.List<String> getIncludeProperties() {
        return includeProperties;
    }

    /** List of property names to be excluded. */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeProperties")
    private final java.util.List<String> excludeProperties;

    /**
     * List of property names to be excluded.
     *
     * @return the value
     */
    public java.util.List<String> getExcludeProperties() {
        return excludeProperties;
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
        sb.append("CollectdResourceNameConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("suffix=").append(String.valueOf(this.suffix));
        sb.append(", includeProperties=").append(String.valueOf(this.includeProperties));
        sb.append(", excludeProperties=").append(String.valueOf(this.excludeProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollectdResourceNameConfigurationDetails)) {
            return false;
        }

        CollectdResourceNameConfigurationDetails other =
                (CollectdResourceNameConfigurationDetails) o;
        return java.util.Objects.equals(this.suffix, other.suffix)
                && java.util.Objects.equals(this.includeProperties, other.includeProperties)
                && java.util.Objects.equals(this.excludeProperties, other.excludeProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.suffix == null ? 43 : this.suffix.hashCode());
        result =
                (result * PRIME)
                        + (this.includeProperties == null ? 43 : this.includeProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeProperties == null ? 43 : this.excludeProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
