/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for creating an Automatic DR configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAutomaticDrConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAutomaticDrConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "drProtectionGroupId",
        "members",
        "defaultSwitchoverDrPlanId",
        "defaultFailoverDrPlanId",
        "freeformTags",
        "definedTags"
    })
    public CreateAutomaticDrConfigurationDetails(
            String displayName,
            String drProtectionGroupId,
            java.util.List<CreateAutomaticDrConfigurationMemberDetails> members,
            String defaultSwitchoverDrPlanId,
            String defaultFailoverDrPlanId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.drProtectionGroupId = drProtectionGroupId;
        this.members = members;
        this.defaultSwitchoverDrPlanId = defaultSwitchoverDrPlanId;
        this.defaultFailoverDrPlanId = defaultFailoverDrPlanId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name of the Automatic DR configuration being created.
         *
         * <p>Example: {@code Automatic DR Configuration}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the Automatic DR configuration being created.
         *
         * <p>Example: {@code Automatic DR Configuration}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the DR protection group to which this Automatic DR configuration belongs.
         *
         * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("drProtectionGroupId")
        private String drProtectionGroupId;

        /**
         * The OCID of the DR protection group to which this Automatic DR configuration belongs.
         *
         * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
         *
         * @param drProtectionGroupId the value to set
         * @return this builder
         */
        public Builder drProtectionGroupId(String drProtectionGroupId) {
            this.drProtectionGroupId = drProtectionGroupId;
            this.__explicitlySet__.add("drProtectionGroupId");
            return this;
        }
        /** A list of members for Automatic DR configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("members")
        private java.util.List<CreateAutomaticDrConfigurationMemberDetails> members;

        /**
         * A list of members for Automatic DR configuration.
         *
         * @param members the value to set
         * @return this builder
         */
        public Builder members(
                java.util.List<CreateAutomaticDrConfigurationMemberDetails> members) {
            this.members = members;
            this.__explicitlySet__.add("members");
            return this;
        }
        /**
         * The unique id of a Switchover DR Plan.
         *
         * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultSwitchoverDrPlanId")
        private String defaultSwitchoverDrPlanId;

        /**
         * The unique id of a Switchover DR Plan.
         *
         * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
         *
         * @param defaultSwitchoverDrPlanId the value to set
         * @return this builder
         */
        public Builder defaultSwitchoverDrPlanId(String defaultSwitchoverDrPlanId) {
            this.defaultSwitchoverDrPlanId = defaultSwitchoverDrPlanId;
            this.__explicitlySet__.add("defaultSwitchoverDrPlanId");
            return this;
        }
        /**
         * The unique id of a Failover DR Plan.
         *
         * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultFailoverDrPlanId")
        private String defaultFailoverDrPlanId;

        /**
         * The unique id of a Failover DR Plan.
         *
         * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
         *
         * @param defaultFailoverDrPlanId the value to set
         * @return this builder
         */
        public Builder defaultFailoverDrPlanId(String defaultFailoverDrPlanId) {
            this.defaultFailoverDrPlanId = defaultFailoverDrPlanId;
            this.__explicitlySet__.add("defaultFailoverDrPlanId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only.
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only.
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
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

        public CreateAutomaticDrConfigurationDetails build() {
            CreateAutomaticDrConfigurationDetails model =
                    new CreateAutomaticDrConfigurationDetails(
                            this.displayName,
                            this.drProtectionGroupId,
                            this.members,
                            this.defaultSwitchoverDrPlanId,
                            this.defaultFailoverDrPlanId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutomaticDrConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("drProtectionGroupId")) {
                this.drProtectionGroupId(model.getDrProtectionGroupId());
            }
            if (model.wasPropertyExplicitlySet("members")) {
                this.members(model.getMembers());
            }
            if (model.wasPropertyExplicitlySet("defaultSwitchoverDrPlanId")) {
                this.defaultSwitchoverDrPlanId(model.getDefaultSwitchoverDrPlanId());
            }
            if (model.wasPropertyExplicitlySet("defaultFailoverDrPlanId")) {
                this.defaultFailoverDrPlanId(model.getDefaultFailoverDrPlanId());
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

    /**
     * The display name of the Automatic DR configuration being created.
     *
     * <p>Example: {@code Automatic DR Configuration}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the Automatic DR configuration being created.
     *
     * <p>Example: {@code Automatic DR Configuration}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the DR protection group to which this Automatic DR configuration belongs.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drProtectionGroupId")
    private final String drProtectionGroupId;

    /**
     * The OCID of the DR protection group to which this Automatic DR configuration belongs.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDrProtectionGroupId() {
        return drProtectionGroupId;
    }

    /** A list of members for Automatic DR configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("members")
    private final java.util.List<CreateAutomaticDrConfigurationMemberDetails> members;

    /**
     * A list of members for Automatic DR configuration.
     *
     * @return the value
     */
    public java.util.List<CreateAutomaticDrConfigurationMemberDetails> getMembers() {
        return members;
    }

    /**
     * The unique id of a Switchover DR Plan.
     *
     * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultSwitchoverDrPlanId")
    private final String defaultSwitchoverDrPlanId;

    /**
     * The unique id of a Switchover DR Plan.
     *
     * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDefaultSwitchoverDrPlanId() {
        return defaultSwitchoverDrPlanId;
    }

    /**
     * The unique id of a Failover DR Plan.
     *
     * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultFailoverDrPlanId")
    private final String defaultFailoverDrPlanId;

    /**
     * The unique id of a Failover DR Plan.
     *
     * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDefaultFailoverDrPlanId() {
        return defaultFailoverDrPlanId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only.
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only.
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
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
        sb.append("CreateAutomaticDrConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", drProtectionGroupId=").append(String.valueOf(this.drProtectionGroupId));
        sb.append(", members=").append(String.valueOf(this.members));
        sb.append(", defaultSwitchoverDrPlanId=")
                .append(String.valueOf(this.defaultSwitchoverDrPlanId));
        sb.append(", defaultFailoverDrPlanId=")
                .append(String.valueOf(this.defaultFailoverDrPlanId));
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
        if (!(o instanceof CreateAutomaticDrConfigurationDetails)) {
            return false;
        }

        CreateAutomaticDrConfigurationDetails other = (CreateAutomaticDrConfigurationDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.drProtectionGroupId, other.drProtectionGroupId)
                && java.util.Objects.equals(this.members, other.members)
                && java.util.Objects.equals(
                        this.defaultSwitchoverDrPlanId, other.defaultSwitchoverDrPlanId)
                && java.util.Objects.equals(
                        this.defaultFailoverDrPlanId, other.defaultFailoverDrPlanId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.drProtectionGroupId == null
                                ? 43
                                : this.drProtectionGroupId.hashCode());
        result = (result * PRIME) + (this.members == null ? 43 : this.members.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultSwitchoverDrPlanId == null
                                ? 43
                                : this.defaultSwitchoverDrPlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultFailoverDrPlanId == null
                                ? 43
                                : this.defaultFailoverDrPlanId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
