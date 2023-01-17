/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in term update operations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateTermDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateTermDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "parentTermKey",
        "owner",
        "workflowStatus",
        "customPropertyMembers"
    })
    public UpdateTermDetails(
            String displayName,
            String description,
            String parentTermKey,
            String owner,
            TermWorkflowStatus workflowStatus,
            java.util.List<CustomPropertySetUsage> customPropertyMembers) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.parentTermKey = parentTermKey;
        this.owner = owner;
        this.workflowStatus = workflowStatus;
        this.customPropertyMembers = customPropertyMembers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Detailed description of the term. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the term.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The parent key of the term. In the case of a root-level category only, the term would
         * have no parent and this should be left unset.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
        private String parentTermKey;

        /**
         * The parent key of the term. In the case of a root-level category only, the term would
         * have no parent and this should be left unset.
         *
         * @param parentTermKey the value to set
         * @return this builder
         */
        public Builder parentTermKey(String parentTermKey) {
            this.parentTermKey = parentTermKey;
            this.__explicitlySet__.add("parentTermKey");
            return this;
        }
        /** OCID of the user who is the owner of this business terminology. */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * OCID of the user who is the owner of this business terminology.
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /** Status of the approval process workflow for this business term in the glossary */
        @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
        private TermWorkflowStatus workflowStatus;

        /**
         * Status of the approval process workflow for this business term in the glossary
         *
         * @param workflowStatus the value to set
         * @return this builder
         */
        public Builder workflowStatus(TermWorkflowStatus workflowStatus) {
            this.workflowStatus = workflowStatus;
            this.__explicitlySet__.add("workflowStatus");
            return this;
        }
        /** The list of customized properties along with the values for this object */
        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertySetUsage> customPropertyMembers;

        /**
         * The list of customized properties along with the values for this object
         *
         * @param customPropertyMembers the value to set
         * @return this builder
         */
        public Builder customPropertyMembers(
                java.util.List<CustomPropertySetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTermDetails build() {
            UpdateTermDetails model =
                    new UpdateTermDetails(
                            this.displayName,
                            this.description,
                            this.parentTermKey,
                            this.owner,
                            this.workflowStatus,
                            this.customPropertyMembers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTermDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("parentTermKey")) {
                this.parentTermKey(model.getParentTermKey());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("workflowStatus")) {
                this.workflowStatus(model.getWorkflowStatus());
            }
            if (model.wasPropertyExplicitlySet("customPropertyMembers")) {
                this.customPropertyMembers(model.getCustomPropertyMembers());
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
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Detailed description of the term. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the term.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The parent key of the term. In the case of a root-level category only, the term would have no
     * parent and this should be left unset.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
    private final String parentTermKey;

    /**
     * The parent key of the term. In the case of a root-level category only, the term would have no
     * parent and this should be left unset.
     *
     * @return the value
     */
    public String getParentTermKey() {
        return parentTermKey;
    }

    /** OCID of the user who is the owner of this business terminology. */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * OCID of the user who is the owner of this business terminology.
     *
     * @return the value
     */
    public String getOwner() {
        return owner;
    }

    /** Status of the approval process workflow for this business term in the glossary */
    @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
    private final TermWorkflowStatus workflowStatus;

    /**
     * Status of the approval process workflow for this business term in the glossary
     *
     * @return the value
     */
    public TermWorkflowStatus getWorkflowStatus() {
        return workflowStatus;
    }

    /** The list of customized properties along with the values for this object */
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertySetUsage> customPropertyMembers;

    /**
     * The list of customized properties along with the values for this object
     *
     * @return the value
     */
    public java.util.List<CustomPropertySetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
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
        sb.append("UpdateTermDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", parentTermKey=").append(String.valueOf(this.parentTermKey));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", workflowStatus=").append(String.valueOf(this.workflowStatus));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTermDetails)) {
            return false;
        }

        UpdateTermDetails other = (UpdateTermDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.parentTermKey, other.parentTermKey)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.workflowStatus, other.workflowStatus)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermKey == null ? 43 : this.parentTermKey.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result =
                (result * PRIME)
                        + (this.workflowStatus == null ? 43 : this.workflowStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
