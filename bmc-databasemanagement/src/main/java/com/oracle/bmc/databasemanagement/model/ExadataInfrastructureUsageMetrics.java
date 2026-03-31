/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The list of aggregated metrics for Exadata infrastructures in the fleet.
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
    builder = ExadataInfrastructureUsageMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExadataInfrastructureUsageMetrics
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "infrastructureId",
        "compartmentId",
        "deploymentType",
        "infrastructureName",
        "state",
        "numberOfDbSystems",
        "rackSize",
        "storageServerCount",
        "metrics"
    })
    public ExadataInfrastructureUsageMetrics(
            String infrastructureId,
            String compartmentId,
            ExadataInfrastructureDeploymentType deploymentType,
            String infrastructureName,
            ExadataInfrastructureLifecycleStateValues.State state,
            Integer numberOfDbSystems,
            RackSize rackSize,
            Integer storageServerCount,
            java.util.List<ExadataFleetMetricDefinition> metrics) {
        super();
        this.infrastructureId = infrastructureId;
        this.compartmentId = compartmentId;
        this.deploymentType = deploymentType;
        this.infrastructureName = infrastructureName;
        this.state = state;
        this.numberOfDbSystems = numberOfDbSystems;
        this.rackSize = rackSize;
        this.storageServerCount = storageServerCount;
        this.metrics = metrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureId")
        private String infrastructureId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
         * @param infrastructureId the value to set
         * @return this builder
         **/
        public Builder infrastructureId(String infrastructureId) {
            this.infrastructureId = infrastructureId;
            this.__explicitlySet__.add("infrastructureId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the Exadata infrastructure resides.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the Exadata infrastructure resides.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The Exadata infrastructure deployment type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private ExadataInfrastructureDeploymentType deploymentType;

        /**
         * The Exadata infrastructure deployment type.
         * @param deploymentType the value to set
         * @return this builder
         **/
        public Builder deploymentType(ExadataInfrastructureDeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /**
         * The display name of the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureName")
        private String infrastructureName;

        /**
         * The display name of the Exadata infrastructure.
         * @param infrastructureName the value to set
         * @return this builder
         **/
        public Builder infrastructureName(String infrastructureName) {
            this.infrastructureName = infrastructureName;
            this.__explicitlySet__.add("infrastructureName");
            return this;
        }
        /**
         * The lifecycle state of the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private ExadataInfrastructureLifecycleStateValues.State state;

        /**
         * The lifecycle state of the Exadata infrastructure.
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(ExadataInfrastructureLifecycleStateValues.State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * The number of Database Systems created on the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfDbSystems")
        private Integer numberOfDbSystems;

        /**
         * The number of Database Systems created on the Exadata infrastructure.
         * @param numberOfDbSystems the value to set
         * @return this builder
         **/
        public Builder numberOfDbSystems(Integer numberOfDbSystems) {
            this.numberOfDbSystems = numberOfDbSystems;
            this.__explicitlySet__.add("numberOfDbSystems");
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
         * The number of storage server for the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageServerCount")
        private Integer storageServerCount;

        /**
         * The number of storage server for the Exadata infrastructure.
         * @param storageServerCount the value to set
         * @return this builder
         **/
        public Builder storageServerCount(Integer storageServerCount) {
            this.storageServerCount = storageServerCount;
            this.__explicitlySet__.add("storageServerCount");
            return this;
        }
        /**
         * A list of the health metrics like CPU, Storage, and Memory.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<ExadataFleetMetricDefinition> metrics;

        /**
         * A list of the health metrics like CPU, Storage, and Memory.
         * @param metrics the value to set
         * @return this builder
         **/
        public Builder metrics(java.util.List<ExadataFleetMetricDefinition> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInfrastructureUsageMetrics build() {
            ExadataInfrastructureUsageMetrics model =
                    new ExadataInfrastructureUsageMetrics(
                            this.infrastructureId,
                            this.compartmentId,
                            this.deploymentType,
                            this.infrastructureName,
                            this.state,
                            this.numberOfDbSystems,
                            this.rackSize,
                            this.storageServerCount,
                            this.metrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInfrastructureUsageMetrics model) {
            if (model.wasPropertyExplicitlySet("infrastructureId")) {
                this.infrastructureId(model.getInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("infrastructureName")) {
                this.infrastructureName(model.getInfrastructureName());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("numberOfDbSystems")) {
                this.numberOfDbSystems(model.getNumberOfDbSystems());
            }
            if (model.wasPropertyExplicitlySet("rackSize")) {
                this.rackSize(model.getRackSize());
            }
            if (model.wasPropertyExplicitlySet("storageServerCount")) {
                this.storageServerCount(model.getStorageServerCount());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
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
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureId")
    private final String infrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     * @return the value
     **/
    public String getInfrastructureId() {
        return infrastructureId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the Exadata infrastructure resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the Exadata infrastructure resides.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The Exadata infrastructure deployment type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final ExadataInfrastructureDeploymentType deploymentType;

    /**
     * The Exadata infrastructure deployment type.
     * @return the value
     **/
    public ExadataInfrastructureDeploymentType getDeploymentType() {
        return deploymentType;
    }

    /**
     * The display name of the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureName")
    private final String infrastructureName;

    /**
     * The display name of the Exadata infrastructure.
     * @return the value
     **/
    public String getInfrastructureName() {
        return infrastructureName;
    }

    /**
     * The lifecycle state of the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final ExadataInfrastructureLifecycleStateValues.State state;

    /**
     * The lifecycle state of the Exadata infrastructure.
     * @return the value
     **/
    public ExadataInfrastructureLifecycleStateValues.State getState() {
        return state;
    }

    /**
     * The number of Database Systems created on the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfDbSystems")
    private final Integer numberOfDbSystems;

    /**
     * The number of Database Systems created on the Exadata infrastructure.
     * @return the value
     **/
    public Integer getNumberOfDbSystems() {
        return numberOfDbSystems;
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
     * The number of storage server for the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageServerCount")
    private final Integer storageServerCount;

    /**
     * The number of storage server for the Exadata infrastructure.
     * @return the value
     **/
    public Integer getStorageServerCount() {
        return storageServerCount;
    }

    /**
     * A list of the health metrics like CPU, Storage, and Memory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<ExadataFleetMetricDefinition> metrics;

    /**
     * A list of the health metrics like CPU, Storage, and Memory.
     * @return the value
     **/
    public java.util.List<ExadataFleetMetricDefinition> getMetrics() {
        return metrics;
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
        sb.append("ExadataInfrastructureUsageMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("infrastructureId=").append(String.valueOf(this.infrastructureId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", infrastructureName=").append(String.valueOf(this.infrastructureName));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", numberOfDbSystems=").append(String.valueOf(this.numberOfDbSystems));
        sb.append(", rackSize=").append(String.valueOf(this.rackSize));
        sb.append(", storageServerCount=").append(String.valueOf(this.storageServerCount));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInfrastructureUsageMetrics)) {
            return false;
        }

        ExadataInfrastructureUsageMetrics other = (ExadataInfrastructureUsageMetrics) o;
        return java.util.Objects.equals(this.infrastructureId, other.infrastructureId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.infrastructureName, other.infrastructureName)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.numberOfDbSystems, other.numberOfDbSystems)
                && java.util.Objects.equals(this.rackSize, other.rackSize)
                && java.util.Objects.equals(this.storageServerCount, other.storageServerCount)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.infrastructureId == null ? 43 : this.infrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureName == null
                                ? 43
                                : this.infrastructureName.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfDbSystems == null ? 43 : this.numberOfDbSystems.hashCode());
        result = (result * PRIME) + (this.rackSize == null ? 43 : this.rackSize.hashCode());
        result =
                (result * PRIME)
                        + (this.storageServerCount == null
                                ? 43
                                : this.storageServerCount.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
