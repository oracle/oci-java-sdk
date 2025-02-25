/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Unallocated resource details of the AVM
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousVmClusterResourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousVmClusterResourceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "unAllocatedAdbStorageInTBs"})
    public AutonomousVmClusterResourceDetails(String id, Double unAllocatedAdbStorageInTBs) {
        super();
        this.id = id;
        this.unAllocatedAdbStorageInTBs = unAllocatedAdbStorageInTBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Total unallocated autonomous data storage in the AVM in TBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unAllocatedAdbStorageInTBs")
        private Double unAllocatedAdbStorageInTBs;

        /**
         * Total unallocated autonomous data storage in the AVM in TBs.
         * @param unAllocatedAdbStorageInTBs the value to set
         * @return this builder
         **/
        public Builder unAllocatedAdbStorageInTBs(Double unAllocatedAdbStorageInTBs) {
            this.unAllocatedAdbStorageInTBs = unAllocatedAdbStorageInTBs;
            this.__explicitlySet__.add("unAllocatedAdbStorageInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousVmClusterResourceDetails build() {
            AutonomousVmClusterResourceDetails model =
                    new AutonomousVmClusterResourceDetails(
                            this.id, this.unAllocatedAdbStorageInTBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousVmClusterResourceDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("unAllocatedAdbStorageInTBs")) {
                this.unAllocatedAdbStorageInTBs(model.getUnAllocatedAdbStorageInTBs());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Total unallocated autonomous data storage in the AVM in TBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unAllocatedAdbStorageInTBs")
    private final Double unAllocatedAdbStorageInTBs;

    /**
     * Total unallocated autonomous data storage in the AVM in TBs.
     * @return the value
     **/
    public Double getUnAllocatedAdbStorageInTBs() {
        return unAllocatedAdbStorageInTBs;
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
        sb.append("AutonomousVmClusterResourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", unAllocatedAdbStorageInTBs=")
                .append(String.valueOf(this.unAllocatedAdbStorageInTBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousVmClusterResourceDetails)) {
            return false;
        }

        AutonomousVmClusterResourceDetails other = (AutonomousVmClusterResourceDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.unAllocatedAdbStorageInTBs, other.unAllocatedAdbStorageInTBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.unAllocatedAdbStorageInTBs == null
                                ? 43
                                : this.unAllocatedAdbStorageInTBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
