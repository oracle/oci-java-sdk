/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.model;

/**
 * The attributes to create a new JavaDownloadToken.
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
    builder = CreateJavaDownloadTokenDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateJavaDownloadTokenDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "compartmentId",
        "isDefault",
        "timeExpires",
        "javaVersion",
        "licenseType",
        "freeformTags",
        "definedTags"
    })
    public CreateJavaDownloadTokenDetails(
            String displayName,
            String description,
            String compartmentId,
            Boolean isDefault,
            java.util.Date timeExpires,
            String javaVersion,
            java.util.List<LicenseType> licenseType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.isDefault = isDefault;
        this.timeExpires = timeExpires;
        this.javaVersion = javaVersion;
        this.licenseType = licenseType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * User provided display name of the JavaDownloadToken.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User provided display name of the JavaDownloadToken.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * User provided description of the JavaDownloadToken.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User provided description of the JavaDownloadToken.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenancy scoped to the JavaDownloadToken.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenancy scoped to the JavaDownloadToken.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The token default attribute.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * The token default attribute.
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /**
         * Expiry time of the token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * Expiry time of the token.
         * @param timeExpires the value to set
         * @return this builder
         **/
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }
        /**
         * The Java version associated with the token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("javaVersion")
        private String javaVersion;

        /**
         * The Java version associated with the token.
         * @param javaVersion the value to set
         * @return this builder
         **/
        public Builder javaVersion(String javaVersion) {
            this.javaVersion = javaVersion;
            this.__explicitlySet__.add("javaVersion");
            return this;
        }
        /**
         * The license type(s) associated with the JavaDownloadToken.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private java.util.List<LicenseType> licenseType;

        /**
         * The license type(s) associated with the JavaDownloadToken.
         * @param licenseType the value to set
         * @return this builder
         **/
        public Builder licenseType(java.util.List<LicenseType> licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
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

        public CreateJavaDownloadTokenDetails build() {
            CreateJavaDownloadTokenDetails model =
                    new CreateJavaDownloadTokenDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.isDefault,
                            this.timeExpires,
                            this.javaVersion,
                            this.licenseType,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJavaDownloadTokenDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
            }
            if (model.wasPropertyExplicitlySet("javaVersion")) {
                this.javaVersion(model.getJavaVersion());
            }
            if (model.wasPropertyExplicitlySet("licenseType")) {
                this.licenseType(model.getLicenseType());
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
     * User provided display name of the JavaDownloadToken.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User provided display name of the JavaDownloadToken.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * User provided description of the JavaDownloadToken.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User provided description of the JavaDownloadToken.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenancy scoped to the JavaDownloadToken.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenancy scoped to the JavaDownloadToken.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The token default attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * The token default attribute.
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Expiry time of the token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * Expiry time of the token.
     * @return the value
     **/
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    /**
     * The Java version associated with the token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("javaVersion")
    private final String javaVersion;

    /**
     * The Java version associated with the token.
     * @return the value
     **/
    public String getJavaVersion() {
        return javaVersion;
    }

    /**
     * The license type(s) associated with the JavaDownloadToken.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    private final java.util.List<LicenseType> licenseType;

    /**
     * The license type(s) associated with the JavaDownloadToken.
     * @return the value
     **/
    public java.util.List<LicenseType> getLicenseType() {
        return licenseType;
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
        sb.append("CreateJavaDownloadTokenDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", javaVersion=").append(String.valueOf(this.javaVersion));
        sb.append(", licenseType=").append(String.valueOf(this.licenseType));
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
        if (!(o instanceof CreateJavaDownloadTokenDetails)) {
            return false;
        }

        CreateJavaDownloadTokenDetails other = (CreateJavaDownloadTokenDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.javaVersion, other.javaVersion)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result = (result * PRIME) + (this.javaVersion == null ? 43 : this.javaVersion.hashCode());
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
