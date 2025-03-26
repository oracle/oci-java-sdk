/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.model;

/**
 * The attributes to create a new JavaLicenseAcceptanceRecord.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateJavaLicenseAcceptanceRecordDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateJavaLicenseAcceptanceRecordDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "licenseType",
        "licenseAcceptanceStatus",
        "freeformTags",
        "definedTags"
    })
    public CreateJavaLicenseAcceptanceRecordDetails(
            String compartmentId,
            LicenseType licenseType,
            LicenseAcceptanceStatus licenseAcceptanceStatus,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.licenseType = licenseType;
        this.licenseAcceptanceStatus = licenseAcceptanceStatus;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The tenancy [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user accepting the license.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The tenancy [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user accepting the license.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * License type for the Java version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private LicenseType licenseType;

        /**
         * License type for the Java version.
         * @param licenseType the value to set
         * @return this builder
         **/
        public Builder licenseType(LicenseType licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
            return this;
        }
        /**
         * Status of license acceptance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseAcceptanceStatus")
        private LicenseAcceptanceStatus licenseAcceptanceStatus;

        /**
         * Status of license acceptance.
         * @param licenseAcceptanceStatus the value to set
         * @return this builder
         **/
        public Builder licenseAcceptanceStatus(LicenseAcceptanceStatus licenseAcceptanceStatus) {
            this.licenseAcceptanceStatus = licenseAcceptanceStatus;
            this.__explicitlySet__.add("licenseAcceptanceStatus");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.oracle.com/iaas/Content/Tagging/Concepts/understandingfreeformtags.htm).)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.oracle.com/iaas/Content/Tagging/Concepts/understandingfreeformtags.htm).)
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.oracle.com/iaas/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.oracle.com/iaas/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
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

        public CreateJavaLicenseAcceptanceRecordDetails build() {
            CreateJavaLicenseAcceptanceRecordDetails model =
                    new CreateJavaLicenseAcceptanceRecordDetails(
                            this.compartmentId,
                            this.licenseType,
                            this.licenseAcceptanceStatus,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJavaLicenseAcceptanceRecordDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("licenseType")) {
                this.licenseType(model.getLicenseType());
            }
            if (model.wasPropertyExplicitlySet("licenseAcceptanceStatus")) {
                this.licenseAcceptanceStatus(model.getLicenseAcceptanceStatus());
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
     * The tenancy [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user accepting the license.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The tenancy [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user accepting the license.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * License type for the Java version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    private final LicenseType licenseType;

    /**
     * License type for the Java version.
     * @return the value
     **/
    public LicenseType getLicenseType() {
        return licenseType;
    }

    /**
     * Status of license acceptance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseAcceptanceStatus")
    private final LicenseAcceptanceStatus licenseAcceptanceStatus;

    /**
     * Status of license acceptance.
     * @return the value
     **/
    public LicenseAcceptanceStatus getLicenseAcceptanceStatus() {
        return licenseAcceptanceStatus;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.oracle.com/iaas/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.oracle.com/iaas/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.oracle.com/iaas/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.oracle.com/iaas/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
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
        sb.append("CreateJavaLicenseAcceptanceRecordDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", licenseType=").append(String.valueOf(this.licenseType));
        sb.append(", licenseAcceptanceStatus=")
                .append(String.valueOf(this.licenseAcceptanceStatus));
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
        if (!(o instanceof CreateJavaLicenseAcceptanceRecordDetails)) {
            return false;
        }

        CreateJavaLicenseAcceptanceRecordDetails other =
                (CreateJavaLicenseAcceptanceRecordDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
                && java.util.Objects.equals(
                        this.licenseAcceptanceStatus, other.licenseAcceptanceStatus)
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
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result =
                (result * PRIME)
                        + (this.licenseAcceptanceStatus == null
                                ? 43
                                : this.licenseAcceptanceStatus.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
