/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for updating the file system snapshot policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateFilesystemSnapshotPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateFilesystemSnapshotPolicyDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "policyPrefix",
        "schedules",
        "freeformTags",
        "definedTags"
    })
    public UpdateFilesystemSnapshotPolicyDetails(
            String displayName,
            String policyPrefix,
            java.util.List<SnapshotSchedule> schedules,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.policyPrefix = policyPrefix;
        this.schedules = schedules;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code policy1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code policy1}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The prefix to apply to all snapshots created by this policy.
         * <p>
         * Example: {@code acme}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policyPrefix")
        private String policyPrefix;

        /**
         * The prefix to apply to all snapshots created by this policy.
         * <p>
         * Example: {@code acme}
         *
         * @param policyPrefix the value to set
         * @return this builder
         **/
        public Builder policyPrefix(String policyPrefix) {
            this.policyPrefix = policyPrefix;
            this.__explicitlySet__.add("policyPrefix");
            return this;
        }
        /**
         * The list of associated snapshot schedules. A maximum of 10 schedules can be associated with a policy.
         * <p>
         * If using the CLI, provide the schedule as a list of JSON strings, with the list wrapped in
         * quotation marks, i.e.
         * {@code
         *   --schedules '[{"timeZone":"UTC","period":"DAILY","hourOfDay":18},{"timeZone":"UTC","period":"HOURLY"}]'
         * }
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schedules")
        private java.util.List<SnapshotSchedule> schedules;

        /**
         * The list of associated snapshot schedules. A maximum of 10 schedules can be associated with a policy.
         * <p>
         * If using the CLI, provide the schedule as a list of JSON strings, with the list wrapped in
         * quotation marks, i.e.
         * {@code
         *   --schedules '[{"timeZone":"UTC","period":"DAILY","hourOfDay":18},{"timeZone":"UTC","period":"HOURLY"}]'
         * }
         *
         * @param schedules the value to set
         * @return this builder
         **/
        public Builder schedules(java.util.List<SnapshotSchedule> schedules) {
            this.schedules = schedules;
            this.__explicitlySet__.add("schedules");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair
         *  with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair
         *  with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateFilesystemSnapshotPolicyDetails build() {
            UpdateFilesystemSnapshotPolicyDetails model =
                    new UpdateFilesystemSnapshotPolicyDetails(
                            this.displayName,
                            this.policyPrefix,
                            this.schedules,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFilesystemSnapshotPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("policyPrefix")) {
                this.policyPrefix(model.getPolicyPrefix());
            }
            if (model.wasPropertyExplicitlySet("schedules")) {
                this.schedules(model.getSchedules());
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
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code policy1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code policy1}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The prefix to apply to all snapshots created by this policy.
     * <p>
     * Example: {@code acme}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyPrefix")
    private final String policyPrefix;

    /**
     * The prefix to apply to all snapshots created by this policy.
     * <p>
     * Example: {@code acme}
     *
     * @return the value
     **/
    public String getPolicyPrefix() {
        return policyPrefix;
    }

    /**
     * The list of associated snapshot schedules. A maximum of 10 schedules can be associated with a policy.
     * <p>
     * If using the CLI, provide the schedule as a list of JSON strings, with the list wrapped in
     * quotation marks, i.e.
     * {@code
     *   --schedules '[{"timeZone":"UTC","period":"DAILY","hourOfDay":18},{"timeZone":"UTC","period":"HOURLY"}]'
     * }
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schedules")
    private final java.util.List<SnapshotSchedule> schedules;

    /**
     * The list of associated snapshot schedules. A maximum of 10 schedules can be associated with a policy.
     * <p>
     * If using the CLI, provide the schedule as a list of JSON strings, with the list wrapped in
     * quotation marks, i.e.
     * {@code
     *   --schedules '[{"timeZone":"UTC","period":"DAILY","hourOfDay":18},{"timeZone":"UTC","period":"HOURLY"}]'
     * }
     *
     * @return the value
     **/
    public java.util.List<SnapshotSchedule> getSchedules() {
        return schedules;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair
     *  with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair
     *  with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateFilesystemSnapshotPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", policyPrefix=").append(String.valueOf(this.policyPrefix));
        sb.append(", schedules=").append(String.valueOf(this.schedules));
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
        if (!(o instanceof UpdateFilesystemSnapshotPolicyDetails)) {
            return false;
        }

        UpdateFilesystemSnapshotPolicyDetails other = (UpdateFilesystemSnapshotPolicyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.policyPrefix, other.policyPrefix)
                && java.util.Objects.equals(this.schedules, other.schedules)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.policyPrefix == null ? 43 : this.policyPrefix.hashCode());
        result = (result * PRIME) + (this.schedules == null ? 43 : this.schedules.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
