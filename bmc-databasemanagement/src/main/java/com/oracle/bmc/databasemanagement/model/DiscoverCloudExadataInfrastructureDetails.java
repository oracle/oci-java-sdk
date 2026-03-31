/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The connection details and the discovery options for the Exadata discovery.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DiscoverCloudExadataInfrastructureDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DiscoverCloudExadataInfrastructureDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "discoveryType",
        "vmClusterIds",
        "exadataInfrastructureId"
    })
    public DiscoverCloudExadataInfrastructureDetails(
            String compartmentId,
            DiscoveryType discoveryType,
            java.util.List<String> vmClusterIds,
            String exadataInfrastructureId) {
        super();
        this.compartmentId = compartmentId;
        this.discoveryType = discoveryType;
        this.vmClusterIds = vmClusterIds;
        this.exadataInfrastructureId = exadataInfrastructureId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The type of discovery.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryType")
        private DiscoveryType discoveryType;

        /**
         * The type of discovery.
         * @param discoveryType the value to set
         * @return this builder
         **/
        public Builder discoveryType(DiscoveryType discoveryType) {
            this.discoveryType = discoveryType;
            this.__explicitlySet__.add("discoveryType");
            return this;
        }
        /**
         * The list of VM Clusters in the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterIds")
        private java.util.List<String> vmClusterIds;

        /**
         * The list of VM Clusters in the Exadata infrastructure.
         * @param vmClusterIds the value to set
         * @return this builder
         **/
        public Builder vmClusterIds(java.util.List<String> vmClusterIds) {
            this.vmClusterIds = vmClusterIds;
            this.__explicitlySet__.add("vmClusterIds");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure. This is applicable for rediscovery only.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
        private String exadataInfrastructureId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure. This is applicable for rediscovery only.
         * @param exadataInfrastructureId the value to set
         * @return this builder
         **/
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            this.__explicitlySet__.add("exadataInfrastructureId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoverCloudExadataInfrastructureDetails build() {
            DiscoverCloudExadataInfrastructureDetails model =
                    new DiscoverCloudExadataInfrastructureDetails(
                            this.compartmentId,
                            this.discoveryType,
                            this.vmClusterIds,
                            this.exadataInfrastructureId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoverCloudExadataInfrastructureDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("discoveryType")) {
                this.discoveryType(model.getDiscoveryType());
            }
            if (model.wasPropertyExplicitlySet("vmClusterIds")) {
                this.vmClusterIds(model.getVmClusterIds());
            }
            if (model.wasPropertyExplicitlySet("exadataInfrastructureId")) {
                this.exadataInfrastructureId(model.getExadataInfrastructureId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The type of discovery.
     **/
    public enum DiscoveryType {
        New("NEW"),
        Override("OVERRIDE"),
        ;

        private final String value;
        private static java.util.Map<String, DiscoveryType> map;

        static {
            map = new java.util.HashMap<>();
            for (DiscoveryType v : DiscoveryType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DiscoveryType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DiscoveryType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DiscoveryType: " + key);
        }
    };
    /**
     * The type of discovery.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryType")
    private final DiscoveryType discoveryType;

    /**
     * The type of discovery.
     * @return the value
     **/
    public DiscoveryType getDiscoveryType() {
        return discoveryType;
    }

    /**
     * The list of VM Clusters in the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterIds")
    private final java.util.List<String> vmClusterIds;

    /**
     * The list of VM Clusters in the Exadata infrastructure.
     * @return the value
     **/
    public java.util.List<String> getVmClusterIds() {
        return vmClusterIds;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure. This is applicable for rediscovery only.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
    private final String exadataInfrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure. This is applicable for rediscovery only.
     * @return the value
     **/
    public String getExadataInfrastructureId() {
        return exadataInfrastructureId;
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
        sb.append("DiscoverCloudExadataInfrastructureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", discoveryType=").append(String.valueOf(this.discoveryType));
        sb.append(", vmClusterIds=").append(String.valueOf(this.vmClusterIds));
        sb.append(", exadataInfrastructureId=")
                .append(String.valueOf(this.exadataInfrastructureId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoverCloudExadataInfrastructureDetails)) {
            return false;
        }

        DiscoverCloudExadataInfrastructureDetails other =
                (DiscoverCloudExadataInfrastructureDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.discoveryType, other.discoveryType)
                && java.util.Objects.equals(this.vmClusterIds, other.vmClusterIds)
                && java.util.Objects.equals(
                        this.exadataInfrastructureId, other.exadataInfrastructureId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveryType == null ? 43 : this.discoveryType.hashCode());
        result = (result * PRIME) + (this.vmClusterIds == null ? 43 : this.vmClusterIds.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInfrastructureId == null
                                ? 43
                                : this.exadataInfrastructureId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
