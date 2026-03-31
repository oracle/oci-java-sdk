/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Represents a BYOL allocation for a specific region
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ByolRealmAllocationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ByolRealmAllocationSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "byolId",
        "region",
        "compartmentId",
        "allocatedUnits",
        "timeCreated",
        "timeUpdated"
    })
    public ByolRealmAllocationSummary(
            String byolId,
            String region,
            String compartmentId,
            Integer allocatedUnits,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.byolId = byolId;
        this.region = region;
        this.compartmentId = compartmentId;
        this.allocatedUnits = allocatedUnits;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL resource from which this BYOL Allocation is derived.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("byolId")
        private String byolId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL resource from which this BYOL Allocation is derived.
         *
         * @param byolId the value to set
         * @return this builder
         **/
        public Builder byolId(String byolId) {
            this.byolId = byolId;
            this.__explicitlySet__.add("byolId");
            return this;
        }
        /**
         * The region name for this allocation, in the format defined by
         * [Region Identifier](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
         * Example: {@code ap-sydney-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region name for this allocation, in the format defined by
         * [Region Identifier](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
         * Example: {@code ap-sydney-1}
         *
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the BYOL Allocation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the BYOL Allocation.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The quantity of licensed units that allocated to this region.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allocatedUnits")
        private Integer allocatedUnits;

        /**
         * The quantity of licensed units that allocated to this region.
         *
         * @param allocatedUnits the value to set
         * @return this builder
         **/
        public Builder allocatedUnits(Integer allocatedUnits) {
            this.allocatedUnits = allocatedUnits;
            this.__explicitlySet__.add("allocatedUnits");
            return this;
        }
        /**
         * The date and time the BYOL Allocation was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the BYOL Allocation was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the BYOL Allocation was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the BYOL Allocation was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ByolRealmAllocationSummary build() {
            ByolRealmAllocationSummary model =
                    new ByolRealmAllocationSummary(
                            this.byolId,
                            this.region,
                            this.compartmentId,
                            this.allocatedUnits,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ByolRealmAllocationSummary model) {
            if (model.wasPropertyExplicitlySet("byolId")) {
                this.byolId(model.getByolId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("allocatedUnits")) {
                this.allocatedUnits(model.getAllocatedUnits());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL resource from which this BYOL Allocation is derived.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("byolId")
    private final String byolId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL resource from which this BYOL Allocation is derived.
     *
     * @return the value
     **/
    public String getByolId() {
        return byolId;
    }

    /**
     * The region name for this allocation, in the format defined by
     * [Region Identifier](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
     * Example: {@code ap-sydney-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region name for this allocation, in the format defined by
     * [Region Identifier](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
     * Example: {@code ap-sydney-1}
     *
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the BYOL Allocation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the BYOL Allocation.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The quantity of licensed units that allocated to this region.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedUnits")
    private final Integer allocatedUnits;

    /**
     * The quantity of licensed units that allocated to this region.
     *
     * @return the value
     **/
    public Integer getAllocatedUnits() {
        return allocatedUnits;
    }

    /**
     * The date and time the BYOL Allocation was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the BYOL Allocation was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the BYOL Allocation was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the BYOL Allocation was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ByolRealmAllocationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("byolId=").append(String.valueOf(this.byolId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", allocatedUnits=").append(String.valueOf(this.allocatedUnits));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ByolRealmAllocationSummary)) {
            return false;
        }

        ByolRealmAllocationSummary other = (ByolRealmAllocationSummary) o;
        return java.util.Objects.equals(this.byolId, other.byolId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.allocatedUnits, other.allocatedUnits)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.byolId == null ? 43 : this.byolId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.allocatedUnits == null ? 43 : this.allocatedUnits.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
