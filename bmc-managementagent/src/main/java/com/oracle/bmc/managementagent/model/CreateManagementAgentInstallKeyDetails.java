/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * The information about new Management Agent install Key. <br>
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
        builder = CreateManagementAgentInstallKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateManagementAgentInstallKeyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "allowedKeyInstallCount",
        "timeExpires",
        "compartmentId",
        "isUnlimited"
    })
    public CreateManagementAgentInstallKeyDetails(
            String displayName,
            Integer allowedKeyInstallCount,
            java.util.Date timeExpires,
            String compartmentId,
            Boolean isUnlimited) {
        super();
        this.displayName = displayName;
        this.allowedKeyInstallCount = allowedKeyInstallCount;
        this.timeExpires = timeExpires;
        this.compartmentId = compartmentId;
        this.isUnlimited = isUnlimited;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Management Agent install Key Name */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Management Agent install Key Name
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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

        public CreateManagementAgentInstallKeyDetails build() {
            CreateManagementAgentInstallKeyDetails model =
                    new CreateManagementAgentInstallKeyDetails(
                            this.displayName,
                            this.allowedKeyInstallCount,
                            this.timeExpires,
                            this.compartmentId,
                            this.isUnlimited);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateManagementAgentInstallKeyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("allowedKeyInstallCount")) {
                this.allowedKeyInstallCount(model.getAllowedKeyInstallCount());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    /** Management Agent install Key Name */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Management Agent install Key Name
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
        sb.append("CreateManagementAgentInstallKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", allowedKeyInstallCount=").append(String.valueOf(this.allowedKeyInstallCount));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isUnlimited=").append(String.valueOf(this.isUnlimited));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateManagementAgentInstallKeyDetails)) {
            return false;
        }

        CreateManagementAgentInstallKeyDetails other = (CreateManagementAgentInstallKeyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.allowedKeyInstallCount, other.allowedKeyInstallCount)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isUnlimited, other.isUnlimited)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedKeyInstallCount == null
                                ? 43
                                : this.allowedKeyInstallCount.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.isUnlimited == null ? 43 : this.isUnlimited.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
