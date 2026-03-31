/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The number of Exadata infrastructures in the fleet, grouped by deployment type and rack-size.
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
    builder = ExadataInfrastructureFleetStatusByCategory.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExadataInfrastructureFleetStatusByCategory
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentType", "rackSize", "inventoryCount"})
    public ExadataInfrastructureFleetStatusByCategory(
            ExadataInfrastructureDeploymentType deploymentType,
            RackSize rackSize,
            Integer inventoryCount) {
        super();
        this.deploymentType = deploymentType;
        this.rackSize = rackSize;
        this.inventoryCount = inventoryCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The infrastructure deployment type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private ExadataInfrastructureDeploymentType deploymentType;

        /**
         * The infrastructure deployment type.
         * @param deploymentType the value to set
         * @return this builder
         **/
        public Builder deploymentType(ExadataInfrastructureDeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /**
         * The size of the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rackSize")
        private RackSize rackSize;

        /**
         * The size of the Exadata infrastructure.
         * @param rackSize the value to set
         * @return this builder
         **/
        public Builder rackSize(RackSize rackSize) {
            this.rackSize = rackSize;
            this.__explicitlySet__.add("rackSize");
            return this;
        }
        /**
         * The number of Exadata infrastructures in the fleet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inventoryCount")
        private Integer inventoryCount;

        /**
         * The number of Exadata infrastructures in the fleet.
         * @param inventoryCount the value to set
         * @return this builder
         **/
        public Builder inventoryCount(Integer inventoryCount) {
            this.inventoryCount = inventoryCount;
            this.__explicitlySet__.add("inventoryCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInfrastructureFleetStatusByCategory build() {
            ExadataInfrastructureFleetStatusByCategory model =
                    new ExadataInfrastructureFleetStatusByCategory(
                            this.deploymentType, this.rackSize, this.inventoryCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInfrastructureFleetStatusByCategory model) {
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("rackSize")) {
                this.rackSize(model.getRackSize());
            }
            if (model.wasPropertyExplicitlySet("inventoryCount")) {
                this.inventoryCount(model.getInventoryCount());
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
     * The infrastructure deployment type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final ExadataInfrastructureDeploymentType deploymentType;

    /**
     * The infrastructure deployment type.
     * @return the value
     **/
    public ExadataInfrastructureDeploymentType getDeploymentType() {
        return deploymentType;
    }

    /**
     * The size of the Exadata infrastructure.
     **/
    public enum RackSize {
        Full("FULL"),
        Half("HALF"),
        Quarter("QUARTER"),
        Eighth("EIGHTH"),
        Other("OTHER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RackSize.class);

        private final String value;
        private static java.util.Map<String, RackSize> map;

        static {
            map = new java.util.HashMap<>();
            for (RackSize v : RackSize.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RackSize(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RackSize create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RackSize', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The size of the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rackSize")
    private final RackSize rackSize;

    /**
     * The size of the Exadata infrastructure.
     * @return the value
     **/
    public RackSize getRackSize() {
        return rackSize;
    }

    /**
     * The number of Exadata infrastructures in the fleet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inventoryCount")
    private final Integer inventoryCount;

    /**
     * The number of Exadata infrastructures in the fleet.
     * @return the value
     **/
    public Integer getInventoryCount() {
        return inventoryCount;
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
        sb.append("ExadataInfrastructureFleetStatusByCategory(");
        sb.append("super=").append(super.toString());
        sb.append("deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", rackSize=").append(String.valueOf(this.rackSize));
        sb.append(", inventoryCount=").append(String.valueOf(this.inventoryCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInfrastructureFleetStatusByCategory)) {
            return false;
        }

        ExadataInfrastructureFleetStatusByCategory other =
                (ExadataInfrastructureFleetStatusByCategory) o;
        return java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.rackSize, other.rackSize)
                && java.util.Objects.equals(this.inventoryCount, other.inventoryCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.rackSize == null ? 43 : this.rackSize.hashCode());
        result =
                (result * PRIME)
                        + (this.inventoryCount == null ? 43 : this.inventoryCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
