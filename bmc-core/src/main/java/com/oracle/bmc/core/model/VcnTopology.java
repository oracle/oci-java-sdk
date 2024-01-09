/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Defines the representation of a virtual network topology for a VCN. See [Network Visualizer
 * Documentation](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/network_visualizer.htm)
 * for more information, including conventions and pictures of symbols. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VcnTopology.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VcnTopology extends Topology {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("entities")
        private java.util.List<Object> entities;

        public Builder entities(java.util.List<Object> entities) {
            this.entities = entities;
            this.__explicitlySet__.add("entities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relationships")
        private java.util.List<TopologyEntityRelationship> relationships;

        public Builder relationships(java.util.List<TopologyEntityRelationship> relationships) {
            this.relationships = relationships;
            this.__explicitlySet__.add("relationships");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("limitedEntities")
        private java.util.List<String> limitedEntities;

        public Builder limitedEntities(java.util.List<String> limitedEntities) {
            this.limitedEntities = limitedEntities;
            this.__explicitlySet__.add("limitedEntities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VCN for which the topology is generated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VCN for which the topology is generated.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VcnTopology build() {
            VcnTopology model =
                    new VcnTopology(
                            this.entities,
                            this.relationships,
                            this.limitedEntities,
                            this.timeCreated,
                            this.vcnId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VcnTopology model) {
            if (model.wasPropertyExplicitlySet("entities")) {
                this.entities(model.getEntities());
            }
            if (model.wasPropertyExplicitlySet("relationships")) {
                this.relationships(model.getRelationships());
            }
            if (model.wasPropertyExplicitlySet("limitedEntities")) {
                this.limitedEntities(model.getLimitedEntities());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
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

    @Deprecated
    public VcnTopology(
            java.util.List<Object> entities,
            java.util.List<TopologyEntityRelationship> relationships,
            java.util.List<String> limitedEntities,
            java.util.Date timeCreated,
            String vcnId) {
        super(entities, relationships, limitedEntities, timeCreated);
        this.vcnId = vcnId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VCN for which the topology is generated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VCN for which the topology is generated.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
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
        sb.append("VcnTopology(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VcnTopology)) {
            return false;
        }

        VcnTopology other = (VcnTopology) o;
        return java.util.Objects.equals(this.vcnId, other.vcnId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        return result;
    }
}
