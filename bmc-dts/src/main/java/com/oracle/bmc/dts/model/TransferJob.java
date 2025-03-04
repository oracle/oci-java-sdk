/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TransferJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TransferJob extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "uploadBucketName",
        "displayName",
        "label",
        "creationTime",
        "deviceType",
        "lifecycleState",
        "attachedTransferApplianceLabels",
        "attachedTransferPackageLabels",
        "attachedTransferDeviceLabels",
        "freeformTags",
        "definedTags"
    })
    public TransferJob(
            String id,
            String compartmentId,
            String uploadBucketName,
            String displayName,
            String label,
            java.util.Date creationTime,
            DeviceType deviceType,
            LifecycleState lifecycleState,
            java.util.List<String> attachedTransferApplianceLabels,
            java.util.List<String> attachedTransferPackageLabels,
            java.util.List<String> attachedTransferDeviceLabels,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.uploadBucketName = uploadBucketName;
        this.displayName = displayName;
        this.label = label;
        this.creationTime = creationTime;
        this.deviceType = deviceType;
        this.lifecycleState = lifecycleState;
        this.attachedTransferApplianceLabels = attachedTransferApplianceLabels;
        this.attachedTransferPackageLabels = attachedTransferPackageLabels;
        this.attachedTransferDeviceLabels = attachedTransferDeviceLabels;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uploadBucketName")
        private String uploadBucketName;

        public Builder uploadBucketName(String uploadBucketName) {
            this.uploadBucketName = uploadBucketName;
            this.__explicitlySet__.add("uploadBucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
        private java.util.Date creationTime;

        public Builder creationTime(java.util.Date creationTime) {
            this.creationTime = creationTime;
            this.__explicitlySet__.add("creationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deviceType")
        private DeviceType deviceType;

        public Builder deviceType(DeviceType deviceType) {
            this.deviceType = deviceType;
            this.__explicitlySet__.add("deviceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Transfer Appliance labels associated with this transfer Job */
        @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferApplianceLabels")
        private java.util.List<String> attachedTransferApplianceLabels;

        /**
         * Transfer Appliance labels associated with this transfer Job
         *
         * @param attachedTransferApplianceLabels the value to set
         * @return this builder
         */
        public Builder attachedTransferApplianceLabels(
                java.util.List<String> attachedTransferApplianceLabels) {
            this.attachedTransferApplianceLabels = attachedTransferApplianceLabels;
            this.__explicitlySet__.add("attachedTransferApplianceLabels");
            return this;
        }
        /** Transfer Package labels associated with this transfer Job */
        @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferPackageLabels")
        private java.util.List<String> attachedTransferPackageLabels;

        /**
         * Transfer Package labels associated with this transfer Job
         *
         * @param attachedTransferPackageLabels the value to set
         * @return this builder
         */
        public Builder attachedTransferPackageLabels(
                java.util.List<String> attachedTransferPackageLabels) {
            this.attachedTransferPackageLabels = attachedTransferPackageLabels;
            this.__explicitlySet__.add("attachedTransferPackageLabels");
            return this;
        }
        /** Transfer Device labels associated with this transfer Job */
        @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferDeviceLabels")
        private java.util.List<String> attachedTransferDeviceLabels;

        /**
         * Transfer Device labels associated with this transfer Job
         *
         * @param attachedTransferDeviceLabels the value to set
         * @return this builder
         */
        public Builder attachedTransferDeviceLabels(
                java.util.List<String> attachedTransferDeviceLabels) {
            this.attachedTransferDeviceLabels = attachedTransferDeviceLabels;
            this.__explicitlySet__.add("attachedTransferDeviceLabels");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TransferJob build() {
            TransferJob model =
                    new TransferJob(
                            this.id,
                            this.compartmentId,
                            this.uploadBucketName,
                            this.displayName,
                            this.label,
                            this.creationTime,
                            this.deviceType,
                            this.lifecycleState,
                            this.attachedTransferApplianceLabels,
                            this.attachedTransferPackageLabels,
                            this.attachedTransferDeviceLabels,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TransferJob model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("uploadBucketName")) {
                this.uploadBucketName(model.getUploadBucketName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("creationTime")) {
                this.creationTime(model.getCreationTime());
            }
            if (model.wasPropertyExplicitlySet("deviceType")) {
                this.deviceType(model.getDeviceType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("attachedTransferApplianceLabels")) {
                this.attachedTransferApplianceLabels(model.getAttachedTransferApplianceLabels());
            }
            if (model.wasPropertyExplicitlySet("attachedTransferPackageLabels")) {
                this.attachedTransferPackageLabels(model.getAttachedTransferPackageLabels());
            }
            if (model.wasPropertyExplicitlySet("attachedTransferDeviceLabels")) {
                this.attachedTransferDeviceLabels(model.getAttachedTransferDeviceLabels());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("uploadBucketName")
    private final String uploadBucketName;

    public String getUploadBucketName() {
        return uploadBucketName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    public String getLabel() {
        return label;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    private final java.util.Date creationTime;

    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /** */
    public enum DeviceType implements com.oracle.bmc.http.internal.BmcEnum {
        Disk("DISK"),
        Appliance("APPLIANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DeviceType.class);

        private final String value;
        private static java.util.Map<String, DeviceType> map;

        static {
            map = new java.util.HashMap<>();
            for (DeviceType v : DeviceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DeviceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeviceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DeviceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("deviceType")
    private final DeviceType deviceType;

    public DeviceType getDeviceType() {
        return deviceType;
    }

    /** */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Initiated("INITIATED"),
        Preparing("PREPARING"),
        Active("ACTIVE"),
        Deleted("DELETED"),
        Closed("CLOSED"),

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

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Transfer Appliance labels associated with this transfer Job */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferApplianceLabels")
    private final java.util.List<String> attachedTransferApplianceLabels;

    /**
     * Transfer Appliance labels associated with this transfer Job
     *
     * @return the value
     */
    public java.util.List<String> getAttachedTransferApplianceLabels() {
        return attachedTransferApplianceLabels;
    }

    /** Transfer Package labels associated with this transfer Job */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferPackageLabels")
    private final java.util.List<String> attachedTransferPackageLabels;

    /**
     * Transfer Package labels associated with this transfer Job
     *
     * @return the value
     */
    public java.util.List<String> getAttachedTransferPackageLabels() {
        return attachedTransferPackageLabels;
    }

    /** Transfer Device labels associated with this transfer Job */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferDeviceLabels")
    private final java.util.List<String> attachedTransferDeviceLabels;

    /**
     * Transfer Device labels associated with this transfer Job
     *
     * @return the value
     */
    public java.util.List<String> getAttachedTransferDeviceLabels() {
        return attachedTransferDeviceLabels;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("TransferJob(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", uploadBucketName=").append(String.valueOf(this.uploadBucketName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", creationTime=").append(String.valueOf(this.creationTime));
        sb.append(", deviceType=").append(String.valueOf(this.deviceType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", attachedTransferApplianceLabels=")
                .append(String.valueOf(this.attachedTransferApplianceLabels));
        sb.append(", attachedTransferPackageLabels=")
                .append(String.valueOf(this.attachedTransferPackageLabels));
        sb.append(", attachedTransferDeviceLabels=")
                .append(String.valueOf(this.attachedTransferDeviceLabels));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TransferJob)) {
            return false;
        }

        TransferJob other = (TransferJob) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.uploadBucketName, other.uploadBucketName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.creationTime, other.creationTime)
                && java.util.Objects.equals(this.deviceType, other.deviceType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.attachedTransferApplianceLabels, other.attachedTransferApplianceLabels)
                && java.util.Objects.equals(
                        this.attachedTransferPackageLabels, other.attachedTransferPackageLabels)
                && java.util.Objects.equals(
                        this.attachedTransferDeviceLabels, other.attachedTransferDeviceLabels)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.uploadBucketName == null ? 43 : this.uploadBucketName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.creationTime == null ? 43 : this.creationTime.hashCode());
        result = (result * PRIME) + (this.deviceType == null ? 43 : this.deviceType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.attachedTransferApplianceLabels == null
                                ? 43
                                : this.attachedTransferApplianceLabels.hashCode());
        result =
                (result * PRIME)
                        + (this.attachedTransferPackageLabels == null
                                ? 43
                                : this.attachedTransferPackageLabels.hashCode());
        result =
                (result * PRIME)
                        + (this.attachedTransferDeviceLabels == null
                                ? 43
                                : this.attachedTransferDeviceLabels.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
