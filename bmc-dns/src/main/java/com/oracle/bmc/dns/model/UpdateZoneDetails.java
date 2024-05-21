/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * The body for updating a zone.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateZoneDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateZoneDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "freeformTags",
        "definedTags",
        "externalMasters",
        "externalDownstreams"
    })
    public UpdateZoneDetails(
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<ExternalMaster> externalMasters,
            java.util.List<ExternalDownstream> externalDownstreams) {
        super();
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.externalMasters = externalMasters;
        this.externalDownstreams = externalDownstreams;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         *
         * **Example:** {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         *
         * **Example:** {@code {"Department": "Finance"}}
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
         * <p>
         *
         * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         *
         * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * External master servers for the zone. {@code externalMasters} becomes a
         * required parameter when the {@code zoneType} value is {@code SECONDARY}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalMasters")
        private java.util.List<ExternalMaster> externalMasters;

        /**
         * External master servers for the zone. {@code externalMasters} becomes a
         * required parameter when the {@code zoneType} value is {@code SECONDARY}.
         *
         * @param externalMasters the value to set
         * @return this builder
         **/
        public Builder externalMasters(java.util.List<ExternalMaster> externalMasters) {
            this.externalMasters = externalMasters;
            this.__explicitlySet__.add("externalMasters");
            return this;
        }
        /**
         * External secondary servers for the zone.
         * This field is currently not supported when {@code zoneType} is {@code SECONDARY} or {@code scope} is {@code PRIVATE}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalDownstreams")
        private java.util.List<ExternalDownstream> externalDownstreams;

        /**
         * External secondary servers for the zone.
         * This field is currently not supported when {@code zoneType} is {@code SECONDARY} or {@code scope} is {@code PRIVATE}.
         *
         * @param externalDownstreams the value to set
         * @return this builder
         **/
        public Builder externalDownstreams(java.util.List<ExternalDownstream> externalDownstreams) {
            this.externalDownstreams = externalDownstreams;
            this.__explicitlySet__.add("externalDownstreams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateZoneDetails build() {
            UpdateZoneDetails model =
                    new UpdateZoneDetails(
                            this.freeformTags,
                            this.definedTags,
                            this.externalMasters,
                            this.externalDownstreams);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateZoneDetails model) {
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("externalMasters")) {
                this.externalMasters(model.getExternalMasters());
            }
            if (model.wasPropertyExplicitlySet("externalDownstreams")) {
                this.externalDownstreams(model.getExternalDownstreams());
            }
            return this;
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
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * External master servers for the zone. {@code externalMasters} becomes a
     * required parameter when the {@code zoneType} value is {@code SECONDARY}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalMasters")
    private final java.util.List<ExternalMaster> externalMasters;

    /**
     * External master servers for the zone. {@code externalMasters} becomes a
     * required parameter when the {@code zoneType} value is {@code SECONDARY}.
     *
     * @return the value
     **/
    public java.util.List<ExternalMaster> getExternalMasters() {
        return externalMasters;
    }

    /**
     * External secondary servers for the zone.
     * This field is currently not supported when {@code zoneType} is {@code SECONDARY} or {@code scope} is {@code PRIVATE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDownstreams")
    private final java.util.List<ExternalDownstream> externalDownstreams;

    /**
     * External secondary servers for the zone.
     * This field is currently not supported when {@code zoneType} is {@code SECONDARY} or {@code scope} is {@code PRIVATE}.
     *
     * @return the value
     **/
    public java.util.List<ExternalDownstream> getExternalDownstreams() {
        return externalDownstreams;
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
        sb.append("UpdateZoneDetails(");
        sb.append("super=").append(super.toString());
        sb.append("freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", externalMasters=").append(String.valueOf(this.externalMasters));
        sb.append(", externalDownstreams=").append(String.valueOf(this.externalDownstreams));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateZoneDetails)) {
            return false;
        }

        UpdateZoneDetails other = (UpdateZoneDetails) o;
        return java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.externalMasters, other.externalMasters)
                && java.util.Objects.equals(this.externalDownstreams, other.externalDownstreams)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.externalMasters == null ? 43 : this.externalMasters.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDownstreams == null
                                ? 43
                                : this.externalDownstreams.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
