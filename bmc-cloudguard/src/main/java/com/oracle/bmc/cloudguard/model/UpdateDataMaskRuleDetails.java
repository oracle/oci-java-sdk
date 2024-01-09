/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information to be updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateDataMaskRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDataMaskRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "iamGroupId",
        "targetSelected",
        "dataMaskCategories",
        "dataMaskRuleStatus",
        "freeformTags",
        "definedTags"
    })
    public UpdateDataMaskRuleDetails(
            String displayName,
            String compartmentId,
            String iamGroupId,
            TargetSelected targetSelected,
            java.util.List<DataMaskCategory> dataMaskCategories,
            DataMaskRuleStatus dataMaskRuleStatus,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.iamGroupId = iamGroupId;
        this.targetSelected = targetSelected;
        this.dataMaskCategories = dataMaskCategories;
        this.dataMaskRuleStatus = dataMaskRuleStatus;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Data mask rule Name.
         *
         * <p>Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Data mask rule Name.
         *
         * <p>Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment Identifier where the resource is created */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier where the resource is created
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** IAM Group id associated with the data mask rule */
        @com.fasterxml.jackson.annotation.JsonProperty("iamGroupId")
        private String iamGroupId;

        /**
         * IAM Group id associated with the data mask rule
         *
         * @param iamGroupId the value to set
         * @return this builder
         */
        public Builder iamGroupId(String iamGroupId) {
            this.iamGroupId = iamGroupId;
            this.__explicitlySet__.add("iamGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetSelected")
        private TargetSelected targetSelected;

        public Builder targetSelected(TargetSelected targetSelected) {
            this.targetSelected = targetSelected;
            this.__explicitlySet__.add("targetSelected");
            return this;
        }
        /** Data Mask Categories */
        @com.fasterxml.jackson.annotation.JsonProperty("dataMaskCategories")
        private java.util.List<DataMaskCategory> dataMaskCategories;

        /**
         * Data Mask Categories
         *
         * @param dataMaskCategories the value to set
         * @return this builder
         */
        public Builder dataMaskCategories(java.util.List<DataMaskCategory> dataMaskCategories) {
            this.dataMaskCategories = dataMaskCategories;
            this.__explicitlySet__.add("dataMaskCategories");
            return this;
        }
        /** The status of the dataMaskRule. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataMaskRuleStatus")
        private DataMaskRuleStatus dataMaskRuleStatus;

        /**
         * The status of the dataMaskRule.
         *
         * @param dataMaskRuleStatus the value to set
         * @return this builder
         */
        public Builder dataMaskRuleStatus(DataMaskRuleStatus dataMaskRuleStatus) {
            this.dataMaskRuleStatus = dataMaskRuleStatus;
            this.__explicitlySet__.add("dataMaskRuleStatus");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public UpdateDataMaskRuleDetails build() {
            UpdateDataMaskRuleDetails model =
                    new UpdateDataMaskRuleDetails(
                            this.displayName,
                            this.compartmentId,
                            this.iamGroupId,
                            this.targetSelected,
                            this.dataMaskCategories,
                            this.dataMaskRuleStatus,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDataMaskRuleDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("iamGroupId")) {
                this.iamGroupId(model.getIamGroupId());
            }
            if (model.wasPropertyExplicitlySet("targetSelected")) {
                this.targetSelected(model.getTargetSelected());
            }
            if (model.wasPropertyExplicitlySet("dataMaskCategories")) {
                this.dataMaskCategories(model.getDataMaskCategories());
            }
            if (model.wasPropertyExplicitlySet("dataMaskRuleStatus")) {
                this.dataMaskRuleStatus(model.getDataMaskRuleStatus());
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
     * Data mask rule Name.
     *
     * <p>Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Data mask rule Name.
     *
     * <p>Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment Identifier where the resource is created */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier where the resource is created
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** IAM Group id associated with the data mask rule */
    @com.fasterxml.jackson.annotation.JsonProperty("iamGroupId")
    private final String iamGroupId;

    /**
     * IAM Group id associated with the data mask rule
     *
     * @return the value
     */
    public String getIamGroupId() {
        return iamGroupId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetSelected")
    private final TargetSelected targetSelected;

    public TargetSelected getTargetSelected() {
        return targetSelected;
    }

    /** Data Mask Categories */
    @com.fasterxml.jackson.annotation.JsonProperty("dataMaskCategories")
    private final java.util.List<DataMaskCategory> dataMaskCategories;

    /**
     * Data Mask Categories
     *
     * @return the value
     */
    public java.util.List<DataMaskCategory> getDataMaskCategories() {
        return dataMaskCategories;
    }

    /** The status of the dataMaskRule. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataMaskRuleStatus")
    private final DataMaskRuleStatus dataMaskRuleStatus;

    /**
     * The status of the dataMaskRule.
     *
     * @return the value
     */
    public DataMaskRuleStatus getDataMaskRuleStatus() {
        return dataMaskRuleStatus;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("UpdateDataMaskRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", iamGroupId=").append(String.valueOf(this.iamGroupId));
        sb.append(", targetSelected=").append(String.valueOf(this.targetSelected));
        sb.append(", dataMaskCategories=").append(String.valueOf(this.dataMaskCategories));
        sb.append(", dataMaskRuleStatus=").append(String.valueOf(this.dataMaskRuleStatus));
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
        if (!(o instanceof UpdateDataMaskRuleDetails)) {
            return false;
        }

        UpdateDataMaskRuleDetails other = (UpdateDataMaskRuleDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.iamGroupId, other.iamGroupId)
                && java.util.Objects.equals(this.targetSelected, other.targetSelected)
                && java.util.Objects.equals(this.dataMaskCategories, other.dataMaskCategories)
                && java.util.Objects.equals(this.dataMaskRuleStatus, other.dataMaskRuleStatus)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.iamGroupId == null ? 43 : this.iamGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetSelected == null ? 43 : this.targetSelected.hashCode());
        result =
                (result * PRIME)
                        + (this.dataMaskCategories == null
                                ? 43
                                : this.dataMaskCategories.hashCode());
        result =
                (result * PRIME)
                        + (this.dataMaskRuleStatus == null
                                ? 43
                                : this.dataMaskRuleStatus.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
