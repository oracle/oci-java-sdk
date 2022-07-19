/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the ticket item object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Resource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Resource {
    @Deprecated
    @java.beans.ConstructorProperties({"item", "region", "availabilityDomain"})
    public Resource(Item item, Region region, AvailabilityDomain availabilityDomain) {
        super();
        this.item = item;
        this.region = region;
        this.availabilityDomain = availabilityDomain;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("item")
        private Item item;

        public Builder item(Item item) {
            this.item = item;
            this.__explicitlySet__.add("item");
            return this;
        }
        /**
         * The list of available Oracle Cloud Infrastructure regions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private Region region;

        /**
         * The list of available Oracle Cloud Infrastructure regions.
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(Region region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The list of available Oracle Cloud Infrastructure availability domains.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private AvailabilityDomain availabilityDomain;

        /**
         * The list of available Oracle Cloud Infrastructure availability domains.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(AvailabilityDomain availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Resource build() {
            Resource __instance__ = new Resource(item, region, availabilityDomain);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Resource o) {
            Builder copiedBuilder =
                    item(o.getItem())
                            .region(o.getRegion())
                            .availabilityDomain(o.getAvailabilityDomain());

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

    @com.fasterxml.jackson.annotation.JsonProperty("item")
    private final Item item;

    public Item getItem() {
        return item;
    }

    /**
     * The list of available Oracle Cloud Infrastructure regions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final Region region;

    /**
     * The list of available Oracle Cloud Infrastructure regions.
     * @return the value
     **/
    public Region getRegion() {
        return region;
    }

    /**
     * The list of available Oracle Cloud Infrastructure availability domains.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final AvailabilityDomain availabilityDomain;

    /**
     * The list of available Oracle Cloud Infrastructure availability domains.
     * @return the value
     **/
    public AvailabilityDomain getAvailabilityDomain() {
        return availabilityDomain;
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
        sb.append("Resource(");
        sb.append("item=").append(String.valueOf(this.item));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Resource)) {
            return false;
        }

        Resource other = (Resource) o;
        return java.util.Objects.equals(this.item, other.item)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.item == null ? 43 : this.item.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
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
