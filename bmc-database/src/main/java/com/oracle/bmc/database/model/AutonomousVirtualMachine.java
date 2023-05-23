/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Autonomous Virtual Machine details. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutonomousVirtualMachine.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousVirtualMachine
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "vmName",
        "dbServerId",
        "dbServerDisplayName",
        "cpuCoreCount",
        "memorySizeInGBs",
        "dbNodeStorageSizeInGBs",
        "lifecycleState",
        "clientIpAddress",
        "compartmentId",
        "autonomousVmClusterId",
        "freeformTags",
        "definedTags",
        "cloudAutonomousVmClusterId"
    })
    public AutonomousVirtualMachine(
            String id,
            String vmName,
            String dbServerId,
            String dbServerDisplayName,
            Integer cpuCoreCount,
            Integer memorySizeInGBs,
            Integer dbNodeStorageSizeInGBs,
            LifecycleState lifecycleState,
            String clientIpAddress,
            String compartmentId,
            String autonomousVmClusterId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String cloudAutonomousVmClusterId) {
        super();
        this.id = id;
        this.vmName = vmName;
        this.dbServerId = dbServerId;
        this.dbServerDisplayName = dbServerDisplayName;
        this.cpuCoreCount = cpuCoreCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.lifecycleState = lifecycleState;
        this.clientIpAddress = clientIpAddress;
        this.compartmentId = compartmentId;
        this.autonomousVmClusterId = autonomousVmClusterId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Virtual Machine.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Virtual Machine.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the Autonomous Virtual Machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("vmName")
        private String vmName;

        /**
         * The name of the Autonomous Virtual Machine.
         *
         * @param vmName the value to set
         * @return this builder
         */
        public Builder vmName(String vmName) {
            this.vmName = vmName;
            this.__explicitlySet__.add("vmName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Db server associated with the Autonomous Virtual Machine.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbServerId")
        private String dbServerId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Db server associated with the Autonomous Virtual Machine.
         *
         * @param dbServerId the value to set
         * @return this builder
         */
        public Builder dbServerId(String dbServerId) {
            this.dbServerId = dbServerId;
            this.__explicitlySet__.add("dbServerId");
            return this;
        }
        /** The display name of the dbServer associated with the Autonomous Virtual Machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbServerDisplayName")
        private String dbServerDisplayName;

        /**
         * The display name of the dbServer associated with the Autonomous Virtual Machine.
         *
         * @param dbServerDisplayName the value to set
         * @return this builder
         */
        public Builder dbServerDisplayName(String dbServerDisplayName) {
            this.dbServerDisplayName = dbServerDisplayName;
            this.__explicitlySet__.add("dbServerDisplayName");
            return this;
        }
        /** The number of CPU cores enabled on the Autonomous Virtual Machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPU cores enabled on the Autonomous Virtual Machine.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         */
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /** The allocated memory in GBs on the Autonomous Virtual Machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The allocated memory in GBs on the Autonomous Virtual Machine.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         */
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /** The allocated local node storage in GBs on the Autonomous Virtual Machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
        private Integer dbNodeStorageSizeInGBs;

        /**
         * The allocated local node storage in GBs on the Autonomous Virtual Machine.
         *
         * @param dbNodeStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dbNodeStorageSizeInGBs(Integer dbNodeStorageSizeInGBs) {
            this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
            this.__explicitlySet__.add("dbNodeStorageSizeInGBs");
            return this;
        }
        /** The current state of the Autonomous Virtual Machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Autonomous Virtual Machine.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Client IP Address. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientIpAddress")
        private String clientIpAddress;

        /**
         * Client IP Address.
         *
         * @param clientIpAddress the value to set
         * @return this builder
         */
        public Builder clientIpAddress(String clientIpAddress) {
            this.clientIpAddress = clientIpAddress;
            this.__explicitlySet__.add("clientIpAddress");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous VM Cluster associated with the Autonomous Virtual Machine.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
        private String autonomousVmClusterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous VM Cluster associated with the Autonomous Virtual Machine.
         *
         * @param autonomousVmClusterId the value to set
         * @return this builder
         */
        public Builder autonomousVmClusterId(String autonomousVmClusterId) {
            this.autonomousVmClusterId = autonomousVmClusterId;
            this.__explicitlySet__.add("autonomousVmClusterId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Cloud Autonomous VM Cluster associated with the Autonomous Virtual Machine.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
        private String cloudAutonomousVmClusterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Cloud Autonomous VM Cluster associated with the Autonomous Virtual Machine.
         *
         * @param cloudAutonomousVmClusterId the value to set
         * @return this builder
         */
        public Builder cloudAutonomousVmClusterId(String cloudAutonomousVmClusterId) {
            this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
            this.__explicitlySet__.add("cloudAutonomousVmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousVirtualMachine build() {
            AutonomousVirtualMachine model =
                    new AutonomousVirtualMachine(
                            this.id,
                            this.vmName,
                            this.dbServerId,
                            this.dbServerDisplayName,
                            this.cpuCoreCount,
                            this.memorySizeInGBs,
                            this.dbNodeStorageSizeInGBs,
                            this.lifecycleState,
                            this.clientIpAddress,
                            this.compartmentId,
                            this.autonomousVmClusterId,
                            this.freeformTags,
                            this.definedTags,
                            this.cloudAutonomousVmClusterId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousVirtualMachine model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("vmName")) {
                this.vmName(model.getVmName());
            }
            if (model.wasPropertyExplicitlySet("dbServerId")) {
                this.dbServerId(model.getDbServerId());
            }
            if (model.wasPropertyExplicitlySet("dbServerDisplayName")) {
                this.dbServerDisplayName(model.getDbServerDisplayName());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dbNodeStorageSizeInGBs")) {
                this.dbNodeStorageSizeInGBs(model.getDbNodeStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("clientIpAddress")) {
                this.clientIpAddress(model.getClientIpAddress());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("autonomousVmClusterId")) {
                this.autonomousVmClusterId(model.getAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("cloudAutonomousVmClusterId")) {
                this.cloudAutonomousVmClusterId(model.getCloudAutonomousVmClusterId());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Virtual Machine.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Virtual Machine.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the Autonomous Virtual Machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("vmName")
    private final String vmName;

    /**
     * The name of the Autonomous Virtual Machine.
     *
     * @return the value
     */
    public String getVmName() {
        return vmName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db
     * server associated with the Autonomous Virtual Machine.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbServerId")
    private final String dbServerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db
     * server associated with the Autonomous Virtual Machine.
     *
     * @return the value
     */
    public String getDbServerId() {
        return dbServerId;
    }

    /** The display name of the dbServer associated with the Autonomous Virtual Machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbServerDisplayName")
    private final String dbServerDisplayName;

    /**
     * The display name of the dbServer associated with the Autonomous Virtual Machine.
     *
     * @return the value
     */
    public String getDbServerDisplayName() {
        return dbServerDisplayName;
    }

    /** The number of CPU cores enabled on the Autonomous Virtual Machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores enabled on the Autonomous Virtual Machine.
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /** The allocated memory in GBs on the Autonomous Virtual Machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The allocated memory in GBs on the Autonomous Virtual Machine.
     *
     * @return the value
     */
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /** The allocated local node storage in GBs on the Autonomous Virtual Machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    private final Integer dbNodeStorageSizeInGBs;

    /**
     * The allocated local node storage in GBs on the Autonomous Virtual Machine.
     *
     * @return the value
     */
    public Integer getDbNodeStorageSizeInGBs() {
        return dbNodeStorageSizeInGBs;
    }

    /** The current state of the Autonomous Virtual Machine. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the Autonomous Virtual Machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Autonomous Virtual Machine.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Client IP Address. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientIpAddress")
    private final String clientIpAddress;

    /**
     * Client IP Address.
     *
     * @return the value
     */
    public String getClientIpAddress() {
        return clientIpAddress;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Autonomous VM Cluster associated with the Autonomous Virtual Machine.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
    private final String autonomousVmClusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Autonomous VM Cluster associated with the Autonomous Virtual Machine.
     *
     * @return the value
     */
    public String getAutonomousVmClusterId() {
        return autonomousVmClusterId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Cloud Autonomous VM Cluster associated with the Autonomous Virtual Machine.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
    private final String cloudAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Cloud Autonomous VM Cluster associated with the Autonomous Virtual Machine.
     *
     * @return the value
     */
    public String getCloudAutonomousVmClusterId() {
        return cloudAutonomousVmClusterId;
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
        sb.append("AutonomousVirtualMachine(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", vmName=").append(String.valueOf(this.vmName));
        sb.append(", dbServerId=").append(String.valueOf(this.dbServerId));
        sb.append(", dbServerDisplayName=").append(String.valueOf(this.dbServerDisplayName));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", clientIpAddress=").append(String.valueOf(this.clientIpAddress));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", autonomousVmClusterId=").append(String.valueOf(this.autonomousVmClusterId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", cloudAutonomousVmClusterId=")
                .append(String.valueOf(this.cloudAutonomousVmClusterId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousVirtualMachine)) {
            return false;
        }

        AutonomousVirtualMachine other = (AutonomousVirtualMachine) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.vmName, other.vmName)
                && java.util.Objects.equals(this.dbServerId, other.dbServerId)
                && java.util.Objects.equals(this.dbServerDisplayName, other.dbServerDisplayName)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.clientIpAddress, other.clientIpAddress)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.autonomousVmClusterId, other.autonomousVmClusterId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.cloudAutonomousVmClusterId, other.cloudAutonomousVmClusterId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.vmName == null ? 43 : this.vmName.hashCode());
        result = (result * PRIME) + (this.dbServerId == null ? 43 : this.dbServerId.hashCode());
        result =
                (result * PRIME)
                        + (this.dbServerDisplayName == null
                                ? 43
                                : this.dbServerDisplayName.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dbNodeStorageSizeInGBs == null
                                ? 43
                                : this.dbNodeStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.clientIpAddress == null ? 43 : this.clientIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousVmClusterId == null
                                ? 43
                                : this.autonomousVmClusterId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutonomousVmClusterId == null
                                ? 43
                                : this.cloudAutonomousVmClusterId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
