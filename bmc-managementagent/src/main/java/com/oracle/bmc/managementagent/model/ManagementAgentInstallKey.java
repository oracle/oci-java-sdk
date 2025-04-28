/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * The details of the Agent install Key <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagementAgentInstallKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagementAgentInstallKey
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "key",
        "createdByPrincipalId",
        "compartmentId",
        "allowedKeyInstallCount",
        "currentKeyInstallCount",
        "lifecycleState",
        "lifecycleDetails",
        "timeExpires",
        "timeCreated",
        "timeUpdated",
        "isUnlimited"
    })
    public ManagementAgentInstallKey(
            String id,
            String displayName,
            String key,
            String createdByPrincipalId,
            String compartmentId,
            Integer allowedKeyInstallCount,
            Integer currentKeyInstallCount,
            LifecycleStates lifecycleState,
            String lifecycleDetails,
            java.util.Date timeExpires,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Boolean isUnlimited) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.key = key;
        this.createdByPrincipalId = createdByPrincipalId;
        this.compartmentId = compartmentId;
        this.allowedKeyInstallCount = allowedKeyInstallCount;
        this.currentKeyInstallCount = currentKeyInstallCount;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeExpires = timeExpires;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.isUnlimited = isUnlimited;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Agent install Key identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Agent install Key identifier
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Management Agent Install Key Name */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Management Agent Install Key Name
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Management Agent Install Key */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Management Agent Install Key
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** Principal id of user who created the Agent Install key */
        @com.fasterxml.jackson.annotation.JsonProperty("createdByPrincipalId")
        private String createdByPrincipalId;

        /**
         * Principal id of user who created the Agent Install key
         *
         * @param createdByPrincipalId the value to set
         * @return this builder
         */
        public Builder createdByPrincipalId(String createdByPrincipalId) {
            this.createdByPrincipalId = createdByPrincipalId;
            this.__explicitlySet__.add("createdByPrincipalId");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Total number of install for this keys */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedKeyInstallCount")
        private Integer allowedKeyInstallCount;

        /**
         * Total number of install for this keys
         *
         * @param allowedKeyInstallCount the value to set
         * @return this builder
         */
        public Builder allowedKeyInstallCount(Integer allowedKeyInstallCount) {
            this.allowedKeyInstallCount = allowedKeyInstallCount;
            this.__explicitlySet__.add("allowedKeyInstallCount");
            return this;
        }
        /** Total number of install for this keys */
        @com.fasterxml.jackson.annotation.JsonProperty("currentKeyInstallCount")
        private Integer currentKeyInstallCount;

        /**
         * Total number of install for this keys
         *
         * @param currentKeyInstallCount the value to set
         * @return this builder
         */
        public Builder currentKeyInstallCount(Integer currentKeyInstallCount) {
            this.currentKeyInstallCount = currentKeyInstallCount;
            this.__explicitlySet__.add("currentKeyInstallCount");
            return this;
        }
        /** Status of Key */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * Status of Key
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** date after which key would expire after creation */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * date after which key would expire after creation
         *
         * @param timeExpires the value to set
         * @return this builder
         */
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }
        /**
         * The time when Management Agent install Key was created. An RFC3339 formatted date time
         * string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when Management Agent install Key was created. An RFC3339 formatted date time
         * string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time when Management Agent install Key was updated. An RFC3339 formatted date time
         * string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when Management Agent install Key was updated. An RFC3339 formatted date time
         * string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * If set to true, the install key has no expiration date or usage limit. Defaults to false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
        private Boolean isUnlimited;

        /**
         * If set to true, the install key has no expiration date or usage limit. Defaults to false
         *
         * @param isUnlimited the value to set
         * @return this builder
         */
        public Builder isUnlimited(Boolean isUnlimited) {
            this.isUnlimited = isUnlimited;
            this.__explicitlySet__.add("isUnlimited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementAgentInstallKey build() {
            ManagementAgentInstallKey model =
                    new ManagementAgentInstallKey(
                            this.id,
                            this.displayName,
                            this.key,
                            this.createdByPrincipalId,
                            this.compartmentId,
                            this.allowedKeyInstallCount,
                            this.currentKeyInstallCount,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeExpires,
                            this.timeCreated,
                            this.timeUpdated,
                            this.isUnlimited);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementAgentInstallKey model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("createdByPrincipalId")) {
                this.createdByPrincipalId(model.getCreatedByPrincipalId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("allowedKeyInstallCount")) {
                this.allowedKeyInstallCount(model.getAllowedKeyInstallCount());
            }
            if (model.wasPropertyExplicitlySet("currentKeyInstallCount")) {
                this.currentKeyInstallCount(model.getCurrentKeyInstallCount());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("isUnlimited")) {
                this.isUnlimited(model.getIsUnlimited());
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

    /** Agent install Key identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Agent install Key identifier
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Management Agent Install Key Name */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Management Agent Install Key Name
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Management Agent Install Key */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Management Agent Install Key
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** Principal id of user who created the Agent Install key */
    @com.fasterxml.jackson.annotation.JsonProperty("createdByPrincipalId")
    private final String createdByPrincipalId;

    /**
     * Principal id of user who created the Agent Install key
     *
     * @return the value
     */
    public String getCreatedByPrincipalId() {
        return createdByPrincipalId;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Total number of install for this keys */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedKeyInstallCount")
    private final Integer allowedKeyInstallCount;

    /**
     * Total number of install for this keys
     *
     * @return the value
     */
    public Integer getAllowedKeyInstallCount() {
        return allowedKeyInstallCount;
    }

    /** Total number of install for this keys */
    @com.fasterxml.jackson.annotation.JsonProperty("currentKeyInstallCount")
    private final Integer currentKeyInstallCount;

    /**
     * Total number of install for this keys
     *
     * @return the value
     */
    public Integer getCurrentKeyInstallCount() {
        return currentKeyInstallCount;
    }

    /** Status of Key */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * Status of Key
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** date after which key would expire after creation */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * date after which key would expire after creation
     *
     * @return the value
     */
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    /**
     * The time when Management Agent install Key was created. An RFC3339 formatted date time string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when Management Agent install Key was created. An RFC3339 formatted date time string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time when Management Agent install Key was updated. An RFC3339 formatted date time string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when Management Agent install Key was updated. An RFC3339 formatted date time string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** If set to true, the install key has no expiration date or usage limit. Defaults to false */
    @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
    private final Boolean isUnlimited;

    /**
     * If set to true, the install key has no expiration date or usage limit. Defaults to false
     *
     * @return the value
     */
    public Boolean getIsUnlimited() {
        return isUnlimited;
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
        sb.append("ManagementAgentInstallKey(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", createdByPrincipalId=").append(String.valueOf(this.createdByPrincipalId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", allowedKeyInstallCount=").append(String.valueOf(this.allowedKeyInstallCount));
        sb.append(", currentKeyInstallCount=").append(String.valueOf(this.currentKeyInstallCount));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", isUnlimited=").append(String.valueOf(this.isUnlimited));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementAgentInstallKey)) {
            return false;
        }

        ManagementAgentInstallKey other = (ManagementAgentInstallKey) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.createdByPrincipalId, other.createdByPrincipalId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.allowedKeyInstallCount, other.allowedKeyInstallCount)
                && java.util.Objects.equals(
                        this.currentKeyInstallCount, other.currentKeyInstallCount)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.isUnlimited, other.isUnlimited)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.createdByPrincipalId == null
                                ? 43
                                : this.createdByPrincipalId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedKeyInstallCount == null
                                ? 43
                                : this.allowedKeyInstallCount.hashCode());
        result =
                (result * PRIME)
                        + (this.currentKeyInstallCount == null
                                ? 43
                                : this.currentKeyInstallCount.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.isUnlimited == null ? 43 : this.isUnlimited.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
