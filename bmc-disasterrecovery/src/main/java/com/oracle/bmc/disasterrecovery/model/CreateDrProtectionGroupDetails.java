/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for creating a DR protection group. <br>
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
        builder = CreateDrProtectionGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDrProtectionGroupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "logLocation",
        "association",
        "members",
        "freeformTags",
        "definedTags"
    })
    public CreateDrProtectionGroupDetails(
            String compartmentId,
            String displayName,
            CreateObjectStorageLogLocationDetails logLocation,
            AssociateDrProtectionGroupDetails association,
            java.util.List<CreateDrProtectionGroupMemberDetails> members,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.logLocation = logLocation;
        this.association = association;
        this.members = members;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment in which to create the DR protection group.
         *
         * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment in which to create the DR protection group.
         *
         * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
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
         * The display name of the DR protection group.
         *
         * <p>Example: {@code EBS PHX Group}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the DR protection group.
         *
         * <p>Example: {@code EBS PHX Group}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
        private CreateObjectStorageLogLocationDetails logLocation;

        public Builder logLocation(CreateObjectStorageLogLocationDetails logLocation) {
            this.logLocation = logLocation;
            this.__explicitlySet__.add("logLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("association")
        private AssociateDrProtectionGroupDetails association;

        public Builder association(AssociateDrProtectionGroupDetails association) {
            this.association = association;
            this.__explicitlySet__.add("association");
            return this;
        }
        /** A list of DR protection group members. */
        @com.fasterxml.jackson.annotation.JsonProperty("members")
        private java.util.List<CreateDrProtectionGroupMemberDetails> members;

        /**
         * A list of DR protection group members.
         *
         * @param members the value to set
         * @return this builder
         */
        public Builder members(java.util.List<CreateDrProtectionGroupMemberDetails> members) {
            this.members = members;
            this.__explicitlySet__.add("members");
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

        public CreateDrProtectionGroupDetails build() {
            CreateDrProtectionGroupDetails model =
                    new CreateDrProtectionGroupDetails(
                            this.compartmentId,
                            this.displayName,
                            this.logLocation,
                            this.association,
                            this.members,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDrProtectionGroupDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("logLocation")) {
                this.logLocation(model.getLogLocation());
            }
            if (model.wasPropertyExplicitlySet("association")) {
                this.association(model.getAssociation());
            }
            if (model.wasPropertyExplicitlySet("members")) {
                this.members(model.getMembers());
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
     * The OCID of the compartment in which to create the DR protection group.
     *
     * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment in which to create the DR protection group.
     *
     * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The display name of the DR protection group.
     *
     * <p>Example: {@code EBS PHX Group}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the DR protection group.
     *
     * <p>Example: {@code EBS PHX Group}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
    private final CreateObjectStorageLogLocationDetails logLocation;

    public CreateObjectStorageLogLocationDetails getLogLocation() {
        return logLocation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("association")
    private final AssociateDrProtectionGroupDetails association;

    public AssociateDrProtectionGroupDetails getAssociation() {
        return association;
    }

    /** A list of DR protection group members. */
    @com.fasterxml.jackson.annotation.JsonProperty("members")
    private final java.util.List<CreateDrProtectionGroupMemberDetails> members;

    /**
     * A list of DR protection group members.
     *
     * @return the value
     */
    public java.util.List<CreateDrProtectionGroupMemberDetails> getMembers() {
        return members;
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
        sb.append("CreateDrProtectionGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", logLocation=").append(String.valueOf(this.logLocation));
        sb.append(", association=").append(String.valueOf(this.association));
        sb.append(", members=").append(String.valueOf(this.members));
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
        if (!(o instanceof CreateDrProtectionGroupDetails)) {
            return false;
        }

        CreateDrProtectionGroupDetails other = (CreateDrProtectionGroupDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.logLocation, other.logLocation)
                && java.util.Objects.equals(this.association, other.association)
                && java.util.Objects.equals(this.members, other.members)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.logLocation == null ? 43 : this.logLocation.hashCode());
        result = (result * PRIME) + (this.association == null ? 43 : this.association.hashCode());
        result = (result * PRIME) + (this.members == null ? 43 : this.members.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
