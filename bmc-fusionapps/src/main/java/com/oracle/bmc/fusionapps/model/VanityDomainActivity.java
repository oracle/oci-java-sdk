/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Vanity Domain Activity resource
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VanityDomainActivity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VanityDomainActivity extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "vanityDomainId",
        "fusionEnvironmentId",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "timeEnabled",
        "timeDeactivated",
        "timeScheduled",
        "operationType"
    })
    public VanityDomainActivity(
            String id,
            String vanityDomainId,
            String fusionEnvironmentId,
            LifecycleState lifecycleState,
            LifecycleDetails lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeEnabled,
            java.util.Date timeDeactivated,
            java.util.Date timeScheduled,
            OperationType operationType) {
        super();
        this.id = id;
        this.vanityDomainId = vanityDomainId;
        this.fusionEnvironmentId = fusionEnvironmentId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeEnabled = timeEnabled;
        this.timeDeactivated = timeDeactivated;
        this.timeScheduled = timeScheduled;
        this.operationType = operationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier (OCID) of the VanityDomainActivity. Can't be changed after creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of the VanityDomainActivity. Can't be changed after creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Vanity domain ID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vanityDomainId")
        private String vanityDomainId;

        /**
         * Vanity domain ID
         * @param vanityDomainId the value to set
         * @return this builder
         **/
        public Builder vanityDomainId(String vanityDomainId) {
            this.vanityDomainId = vanityDomainId;
            this.__explicitlySet__.add("vanityDomainId");
            return this;
        }
        /**
         * The OCID of the Fusion environment that the VanityDomainActivity is created on
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
        private String fusionEnvironmentId;

        /**
         * The OCID of the Fusion environment that the VanityDomainActivity is created on
         * @param fusionEnvironmentId the value to set
         * @return this builder
         **/
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            this.__explicitlySet__.add("fusionEnvironmentId");
            return this;
        }
        /**
         * The current lifecycleState of the VanityDomainActivity
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycleState of the VanityDomainActivity
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The current lifecycleDetails of the VanityDomainActivity
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        /**
         * The current lifecycleDetails of the VanityDomainActivity
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The time the VanityDomainactivity was created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the VanityDomainactivity was created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the VanityDomainactivity was updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the VanityDomainactivity was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The time the VanityDomainactivity is scheduled to enable. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
        private java.util.Date timeEnabled;

        /**
         * The time the VanityDomainactivity is scheduled to enable. An RFC3339 formatted datetime string
         * @param timeEnabled the value to set
         * @return this builder
         **/
        public Builder timeEnabled(java.util.Date timeEnabled) {
            this.timeEnabled = timeEnabled;
            this.__explicitlySet__.add("timeEnabled");
            return this;
        }
        /**
         * The time the VanityDomainactivity is scheduled to deactivate. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDeactivated")
        private java.util.Date timeDeactivated;

        /**
         * The time the VanityDomainactivity is scheduled to deactivate. An RFC3339 formatted datetime string
         * @param timeDeactivated the value to set
         * @return this builder
         **/
        public Builder timeDeactivated(java.util.Date timeDeactivated) {
            this.timeDeactivated = timeDeactivated;
            this.__explicitlySet__.add("timeDeactivated");
            return this;
        }
        /**
         * Activity start time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * Activity start time
         * @param timeScheduled the value to set
         * @return this builder
         **/
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /**
         * The type of operation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * The type of operation
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(OperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VanityDomainActivity build() {
            VanityDomainActivity model =
                    new VanityDomainActivity(
                            this.id,
                            this.vanityDomainId,
                            this.fusionEnvironmentId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeEnabled,
                            this.timeDeactivated,
                            this.timeScheduled,
                            this.operationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VanityDomainActivity model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("vanityDomainId")) {
                this.vanityDomainId(model.getVanityDomainId());
            }
            if (model.wasPropertyExplicitlySet("fusionEnvironmentId")) {
                this.fusionEnvironmentId(model.getFusionEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeEnabled")) {
                this.timeEnabled(model.getTimeEnabled());
            }
            if (model.wasPropertyExplicitlySet("timeDeactivated")) {
                this.timeDeactivated(model.getTimeDeactivated());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
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
     * The unique identifier (OCID) of the VanityDomainActivity. Can't be changed after creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of the VanityDomainActivity. Can't be changed after creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Vanity domain ID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vanityDomainId")
    private final String vanityDomainId;

    /**
     * Vanity domain ID
     * @return the value
     **/
    public String getVanityDomainId() {
        return vanityDomainId;
    }

    /**
     * The OCID of the Fusion environment that the VanityDomainActivity is created on
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
    private final String fusionEnvironmentId;

    /**
     * The OCID of the Fusion environment that the VanityDomainActivity is created on
     * @return the value
     **/
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }

    /**
     * The current lifecycleState of the VanityDomainActivity
     **/
    public enum LifecycleState {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceled("CANCELED"),
        NeedsAttention("NEEDS_ATTENTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The current lifecycleState of the VanityDomainActivity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycleState of the VanityDomainActivity
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The current lifecycleDetails of the VanityDomainActivity
     **/
    public enum LifecycleDetails {
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleDetails.class);

        private final String value;
        private static java.util.Map<String, LifecycleDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleDetails v : LifecycleDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current lifecycleDetails of the VanityDomainActivity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetails lifecycleDetails;

    /**
     * The current lifecycleDetails of the VanityDomainActivity
     * @return the value
     **/
    public LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The time the VanityDomainactivity was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the VanityDomainactivity was created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the VanityDomainactivity was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the VanityDomainactivity was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The time the VanityDomainactivity is scheduled to enable. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
    private final java.util.Date timeEnabled;

    /**
     * The time the VanityDomainactivity is scheduled to enable. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeEnabled() {
        return timeEnabled;
    }

    /**
     * The time the VanityDomainactivity is scheduled to deactivate. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeactivated")
    private final java.util.Date timeDeactivated;

    /**
     * The time the VanityDomainactivity is scheduled to deactivate. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeDeactivated() {
        return timeDeactivated;
    }

    /**
     * Activity start time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * Activity start time
     * @return the value
     **/
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * The type of operation
     **/
    public enum OperationType {
        EnableVanityDomain("ENABLE_VANITY_DOMAIN"),
        DeleteVanityDomain("DELETE_VANITY_DOMAIN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationType.class);

        private final String value;
        private static java.util.Map<String, OperationType> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationType v : OperationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of operation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * The type of operation
     * @return the value
     **/
    public OperationType getOperationType() {
        return operationType;
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
        sb.append("VanityDomainActivity(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", vanityDomainId=").append(String.valueOf(this.vanityDomainId));
        sb.append(", fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeEnabled=").append(String.valueOf(this.timeEnabled));
        sb.append(", timeDeactivated=").append(String.valueOf(this.timeDeactivated));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VanityDomainActivity)) {
            return false;
        }

        VanityDomainActivity other = (VanityDomainActivity) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.vanityDomainId, other.vanityDomainId)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeEnabled, other.timeEnabled)
                && java.util.Objects.equals(this.timeDeactivated, other.timeDeactivated)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.vanityDomainId == null ? 43 : this.vanityDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentId == null
                                ? 43
                                : this.fusionEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeEnabled == null ? 43 : this.timeEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDeactivated == null ? 43 : this.timeDeactivated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
