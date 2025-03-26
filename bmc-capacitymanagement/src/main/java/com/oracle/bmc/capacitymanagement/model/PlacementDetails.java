/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * Details like building, room and block where the resource was placed after provisioning in the datacenter.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PlacementDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PlacementDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "region",
        "availabilityDomain",
        "workloadType",
        "building",
        "room",
        "block"
    })
    public PlacementDetails(
            String region,
            String availabilityDomain,
            String workloadType,
            String building,
            String room,
            String block) {
        super();
        this.region = region;
        this.availabilityDomain = availabilityDomain;
        this.workloadType = workloadType;
        this.building = building;
        this.room = room;
        this.block = block;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the region for which the resources were provisioned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The name of the region for which the resources were provisioned.
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
         * The availability domain (AD) for which the resources were provisioned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain (AD) for which the resources were provisioned.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The type of workload to which these resources were provisioned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
        private String workloadType;

        /**
         * The type of workload to which these resources were provisioned.
         *
         * @param workloadType the value to set
         * @return this builder
         **/
        public Builder workloadType(String workloadType) {
            this.workloadType = workloadType;
            this.__explicitlySet__.add("workloadType");
            return this;
        }
        /**
         * The datacenter building where the resource was placed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("building")
        private String building;

        /**
         * The datacenter building where the resource was placed.
         *
         * @param building the value to set
         * @return this builder
         **/
        public Builder building(String building) {
            this.building = building;
            this.__explicitlySet__.add("building");
            return this;
        }
        /**
         * The name of the room in the dataacenter building where the resource was placed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("room")
        private String room;

        /**
         * The name of the room in the dataacenter building where the resource was placed.
         *
         * @param room the value to set
         * @return this builder
         **/
        public Builder room(String room) {
            this.room = room;
            this.__explicitlySet__.add("room");
            return this;
        }
        /**
         * The block in the datacenter room where the resource was placed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("block")
        private String block;

        /**
         * The block in the datacenter room where the resource was placed.
         *
         * @param block the value to set
         * @return this builder
         **/
        public Builder block(String block) {
            this.block = block;
            this.__explicitlySet__.add("block");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PlacementDetails build() {
            PlacementDetails model =
                    new PlacementDetails(
                            this.region,
                            this.availabilityDomain,
                            this.workloadType,
                            this.building,
                            this.room,
                            this.block);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PlacementDetails model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("workloadType")) {
                this.workloadType(model.getWorkloadType());
            }
            if (model.wasPropertyExplicitlySet("building")) {
                this.building(model.getBuilding());
            }
            if (model.wasPropertyExplicitlySet("room")) {
                this.room(model.getRoom());
            }
            if (model.wasPropertyExplicitlySet("block")) {
                this.block(model.getBlock());
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
     * The name of the region for which the resources were provisioned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The name of the region for which the resources were provisioned.
     *
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * The availability domain (AD) for which the resources were provisioned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain (AD) for which the resources were provisioned.
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The type of workload to which these resources were provisioned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
    private final String workloadType;

    /**
     * The type of workload to which these resources were provisioned.
     *
     * @return the value
     **/
    public String getWorkloadType() {
        return workloadType;
    }

    /**
     * The datacenter building where the resource was placed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("building")
    private final String building;

    /**
     * The datacenter building where the resource was placed.
     *
     * @return the value
     **/
    public String getBuilding() {
        return building;
    }

    /**
     * The name of the room in the dataacenter building where the resource was placed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("room")
    private final String room;

    /**
     * The name of the room in the dataacenter building where the resource was placed.
     *
     * @return the value
     **/
    public String getRoom() {
        return room;
    }

    /**
     * The block in the datacenter room where the resource was placed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("block")
    private final String block;

    /**
     * The block in the datacenter room where the resource was placed.
     *
     * @return the value
     **/
    public String getBlock() {
        return block;
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
        sb.append("PlacementDetails(");
        sb.append("super=").append(super.toString());
        sb.append("region=").append(String.valueOf(this.region));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", workloadType=").append(String.valueOf(this.workloadType));
        sb.append(", building=").append(String.valueOf(this.building));
        sb.append(", room=").append(String.valueOf(this.room));
        sb.append(", block=").append(String.valueOf(this.block));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlacementDetails)) {
            return false;
        }

        PlacementDetails other = (PlacementDetails) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.workloadType, other.workloadType)
                && java.util.Objects.equals(this.building, other.building)
                && java.util.Objects.equals(this.room, other.room)
                && java.util.Objects.equals(this.block, other.block)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.workloadType == null ? 43 : this.workloadType.hashCode());
        result = (result * PRIME) + (this.building == null ? 43 : this.building.hashCode());
        result = (result * PRIME) + (this.room == null ? 43 : this.room.hashCode());
        result = (result * PRIME) + (this.block == null ? 43 : this.block.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
