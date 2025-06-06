/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to create a new SDM masking policy difference. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateSdmMaskingPolicyDifferenceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSdmMaskingPolicyDifferenceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "differenceType",
        "maskingPolicyId",
        "compartmentId",
        "displayName",
        "freeformTags",
        "definedTags"
    })
    public CreateSdmMaskingPolicyDifferenceDetails(
            SdmMaskingPolicyDifference.DifferenceType differenceType,
            String maskingPolicyId,
            String compartmentId,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.differenceType = differenceType;
        this.maskingPolicyId = maskingPolicyId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the SDM masking policy difference. It defines the difference scope. NEW
         * identifies new sensitive columns in the sensitive data model that are not in the masking
         * policy. DELETED identifies columns that are present in the masking policy but have been
         * deleted from the sensitive data model. MODIFIED identifies columns that are present in
         * the sensitive data model as well as the masking policy but some of their attributes have
         * been modified. ALL covers all the above three scenarios and reports new, deleted and
         * modified columns.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("differenceType")
        private SdmMaskingPolicyDifference.DifferenceType differenceType;

        /**
         * The type of the SDM masking policy difference. It defines the difference scope. NEW
         * identifies new sensitive columns in the sensitive data model that are not in the masking
         * policy. DELETED identifies columns that are present in the masking policy but have been
         * deleted from the sensitive data model. MODIFIED identifies columns that are present in
         * the sensitive data model as well as the masking policy but some of their attributes have
         * been modified. ALL covers all the above three scenarios and reports new, deleted and
         * modified columns.
         *
         * @param differenceType the value to set
         * @return this builder
         */
        public Builder differenceType(SdmMaskingPolicyDifference.DifferenceType differenceType) {
            this.differenceType = differenceType;
            this.__explicitlySet__.add("differenceType");
            return this;
        }
        /**
         * The OCID of the masking policy. Note that if the masking policy is not associated with an
         * SDM, CreateSdmMaskingPolicyDifference operation won't be allowed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
        private String maskingPolicyId;

        /**
         * The OCID of the masking policy. Note that if the masking policy is not associated with an
         * SDM, CreateSdmMaskingPolicyDifference operation won't be allowed.
         *
         * @param maskingPolicyId the value to set
         * @return this builder
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            this.__explicitlySet__.add("maskingPolicyId");
            return this;
        }
        /**
         * The OCID of the compartment where the SDM masking policy difference resource should be
         * created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the SDM masking policy difference resource should be
         * created.
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
         * A user-friendly name for the SDM masking policy difference. Does not have to be unique,
         * and it is changeable. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the SDM masking policy difference. Does not have to be unique,
         * and it is changeable. Avoid entering confidential information.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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

        public CreateSdmMaskingPolicyDifferenceDetails build() {
            CreateSdmMaskingPolicyDifferenceDetails model =
                    new CreateSdmMaskingPolicyDifferenceDetails(
                            this.differenceType,
                            this.maskingPolicyId,
                            this.compartmentId,
                            this.displayName,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSdmMaskingPolicyDifferenceDetails model) {
            if (model.wasPropertyExplicitlySet("differenceType")) {
                this.differenceType(model.getDifferenceType());
            }
            if (model.wasPropertyExplicitlySet("maskingPolicyId")) {
                this.maskingPolicyId(model.getMaskingPolicyId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
     * The type of the SDM masking policy difference. It defines the difference scope. NEW
     * identifies new sensitive columns in the sensitive data model that are not in the masking
     * policy. DELETED identifies columns that are present in the masking policy but have been
     * deleted from the sensitive data model. MODIFIED identifies columns that are present in the
     * sensitive data model as well as the masking policy but some of their attributes have been
     * modified. ALL covers all the above three scenarios and reports new, deleted and modified
     * columns.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("differenceType")
    private final SdmMaskingPolicyDifference.DifferenceType differenceType;

    /**
     * The type of the SDM masking policy difference. It defines the difference scope. NEW
     * identifies new sensitive columns in the sensitive data model that are not in the masking
     * policy. DELETED identifies columns that are present in the masking policy but have been
     * deleted from the sensitive data model. MODIFIED identifies columns that are present in the
     * sensitive data model as well as the masking policy but some of their attributes have been
     * modified. ALL covers all the above three scenarios and reports new, deleted and modified
     * columns.
     *
     * @return the value
     */
    public SdmMaskingPolicyDifference.DifferenceType getDifferenceType() {
        return differenceType;
    }

    /**
     * The OCID of the masking policy. Note that if the masking policy is not associated with an
     * SDM, CreateSdmMaskingPolicyDifference operation won't be allowed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
    private final String maskingPolicyId;

    /**
     * The OCID of the masking policy. Note that if the masking policy is not associated with an
     * SDM, CreateSdmMaskingPolicyDifference operation won't be allowed.
     *
     * @return the value
     */
    public String getMaskingPolicyId() {
        return maskingPolicyId;
    }

    /**
     * The OCID of the compartment where the SDM masking policy difference resource should be
     * created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the SDM masking policy difference resource should be
     * created.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name for the SDM masking policy difference. Does not have to be unique, and
     * it is changeable. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the SDM masking policy difference. Does not have to be unique, and
     * it is changeable. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
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
        sb.append("CreateSdmMaskingPolicyDifferenceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("differenceType=").append(String.valueOf(this.differenceType));
        sb.append(", maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
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
        if (!(o instanceof CreateSdmMaskingPolicyDifferenceDetails)) {
            return false;
        }

        CreateSdmMaskingPolicyDifferenceDetails other = (CreateSdmMaskingPolicyDifferenceDetails) o;
        return java.util.Objects.equals(this.differenceType, other.differenceType)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
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
                        + (this.differenceType == null ? 43 : this.differenceType.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
