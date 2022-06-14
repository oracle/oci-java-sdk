/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * The root compartment that contains all of your organization's compartments and other
 * Oracle Cloud Infrastructure cloud resources. When you sign up for Oracle Cloud Infrastructure,
 * Oracle creates a tenancy for your company, which is a secure and isolated partition
 * where you can create, organize, and administer your cloud resources.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Tenancy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Tenancy {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "description",
        "homeRegionKey",
        "upiIdcsCompatibilityLayerEndpoint",
        "freeformTags",
        "definedTags"
    })
    public Tenancy(
            String id,
            String name,
            String description,
            String homeRegionKey,
            String upiIdcsCompatibilityLayerEndpoint,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.homeRegionKey = homeRegionKey;
        this.upiIdcsCompatibilityLayerEndpoint = upiIdcsCompatibilityLayerEndpoint;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the tenancy.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the tenancy.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The description of the tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the tenancy.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The region key for the tenancy's home region. For the full list of supported regions, see
         * [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
         * <p>
         * Example: {@code PHX}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("homeRegionKey")
        private String homeRegionKey;

        /**
         * The region key for the tenancy's home region. For the full list of supported regions, see
         * [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
         * <p>
         * Example: {@code PHX}
         *
         * @param homeRegionKey the value to set
         * @return this builder
         **/
        public Builder homeRegionKey(String homeRegionKey) {
            this.homeRegionKey = homeRegionKey;
            this.__explicitlySet__.add("homeRegionKey");
            return this;
        }
        /**
         * Url which refers to the UPI IDCS compatibility layer endpoint configured for this Tenant's home region.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("upiIdcsCompatibilityLayerEndpoint")
        private String upiIdcsCompatibilityLayerEndpoint;

        /**
         * Url which refers to the UPI IDCS compatibility layer endpoint configured for this Tenant's home region.
         * @param upiIdcsCompatibilityLayerEndpoint the value to set
         * @return this builder
         **/
        public Builder upiIdcsCompatibilityLayerEndpoint(String upiIdcsCompatibilityLayerEndpoint) {
            this.upiIdcsCompatibilityLayerEndpoint = upiIdcsCompatibilityLayerEndpoint;
            this.__explicitlySet__.add("upiIdcsCompatibilityLayerEndpoint");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Tenancy build() {
            Tenancy __instance__ =
                    new Tenancy(
                            id,
                            name,
                            description,
                            homeRegionKey,
                            upiIdcsCompatibilityLayerEndpoint,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Tenancy o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .homeRegionKey(o.getHomeRegionKey())
                            .upiIdcsCompatibilityLayerEndpoint(
                                    o.getUpiIdcsCompatibilityLayerEndpoint())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the tenancy.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the tenancy.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The description of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the tenancy.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The region key for the tenancy's home region. For the full list of supported regions, see
     * [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
     * <p>
     * Example: {@code PHX}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("homeRegionKey")
    private final String homeRegionKey;

    /**
     * The region key for the tenancy's home region. For the full list of supported regions, see
     * [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
     * <p>
     * Example: {@code PHX}
     *
     * @return the value
     **/
    public String getHomeRegionKey() {
        return homeRegionKey;
    }

    /**
     * Url which refers to the UPI IDCS compatibility layer endpoint configured for this Tenant's home region.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upiIdcsCompatibilityLayerEndpoint")
    private final String upiIdcsCompatibilityLayerEndpoint;

    /**
     * Url which refers to the UPI IDCS compatibility layer endpoint configured for this Tenant's home region.
     * @return the value
     **/
    public String getUpiIdcsCompatibilityLayerEndpoint() {
        return upiIdcsCompatibilityLayerEndpoint;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Tenancy(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", homeRegionKey=").append(String.valueOf(this.homeRegionKey));
        sb.append(", upiIdcsCompatibilityLayerEndpoint=")
                .append(String.valueOf(this.upiIdcsCompatibilityLayerEndpoint));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tenancy)) {
            return false;
        }

        Tenancy other = (Tenancy) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.homeRegionKey, other.homeRegionKey)
                && java.util.Objects.equals(
                        this.upiIdcsCompatibilityLayerEndpoint,
                        other.upiIdcsCompatibilityLayerEndpoint)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.homeRegionKey == null ? 43 : this.homeRegionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.upiIdcsCompatibilityLayerEndpoint == null
                                ? 43
                                : this.upiIdcsCompatibilityLayerEndpoint.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
