/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * A localized geographic area, such as Phoenix, AZ. Oracle Cloud Infrastructure is hosted in regions and Availability
 * Domains. A region is composed of several Availability Domains. An Availability Domain is one or more data centers
 * located within a region. For more information, see [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Get Started with Policies](https://docs.cloud.oracle.com/Content/Identity/policiesgs/get-started-with-policies.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Region.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Region {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "name"})
    public Region(String key, String name) {
        super();
        this.key = key;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key of the region. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm) for
         * the full list of supported 3-letter region codes.
         * <p>
         * Example: {@code PHX}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The key of the region. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm) for
         * the full list of supported 3-letter region codes.
         * <p>
         * Example: {@code PHX}
         *
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The name of the region. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
         * for the full list of supported region names.
         * <p>
         * Example: {@code us-phoenix-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the region. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
         * for the full list of supported region names.
         * <p>
         * Example: {@code us-phoenix-1}
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Region build() {
            Region __instance__ = new Region(key, name);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Region o) {
            Builder copiedBuilder = key(o.getKey()).name(o.getName());

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
     * The key of the region. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm) for
     * the full list of supported 3-letter region codes.
     * <p>
     * Example: {@code PHX}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key of the region. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm) for
     * the full list of supported 3-letter region codes.
     * <p>
     * Example: {@code PHX}
     *
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The name of the region. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported region names.
     * <p>
     * Example: {@code us-phoenix-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the region. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported region names.
     * <p>
     * Example: {@code us-phoenix-1}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Region(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Region)) {
            return false;
        }

        Region other = (Region) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
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
