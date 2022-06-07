/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * The information about new Management Agent install Key.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateManagementAgentInstallKeyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateManagementAgentInstallKeyDetails {
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
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedKeyInstallCount")
        private Integer allowedKeyInstallCount;

        public Builder allowedKeyInstallCount(Integer allowedKeyInstallCount) {
            this.allowedKeyInstallCount = allowedKeyInstallCount;
            this.__explicitlySet__.add("allowedKeyInstallCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
        private Boolean isUnlimited;

        public Builder isUnlimited(Boolean isUnlimited) {
            this.isUnlimited = isUnlimited;
            this.__explicitlySet__.add("isUnlimited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateManagementAgentInstallKeyDetails build() {
            CreateManagementAgentInstallKeyDetails __instance__ =
                    new CreateManagementAgentInstallKeyDetails(
                            displayName,
                            allowedKeyInstallCount,
                            timeExpires,
                            compartmentId,
                            isUnlimited);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateManagementAgentInstallKeyDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .allowedKeyInstallCount(o.getAllowedKeyInstallCount())
                            .timeExpires(o.getTimeExpires())
                            .compartmentId(o.getCompartmentId())
                            .isUnlimited(o.getIsUnlimited());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Management Agent install Key Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Total number of install for this keys
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedKeyInstallCount")
    private final Integer allowedKeyInstallCount;

    public Integer getAllowedKeyInstallCount() {
        return allowedKeyInstallCount;
    }

    /**
     * date after which key would expire after creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * If set to true, the install key has no expiration date or usage limit. Defaults to false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
    private final Boolean isUnlimited;

    public Boolean getIsUnlimited() {
        return isUnlimited;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateManagementAgentInstallKeyDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", allowedKeyInstallCount=").append(String.valueOf(this.allowedKeyInstallCount));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isUnlimited=").append(String.valueOf(this.isUnlimited));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
