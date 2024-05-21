/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Description of a software source to be created on the management system
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSoftwareSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSoftwareSourceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "archType",
        "maintainerName",
        "maintainerEmail",
        "maintainerPhone",
        "checksumType",
        "parentId",
        "freeformTags",
        "definedTags"
    })
    public CreateSoftwareSourceDetails(
            String compartmentId,
            String displayName,
            String description,
            ArchTypes archType,
            String maintainerName,
            String maintainerEmail,
            String maintainerPhone,
            ChecksumTypes checksumType,
            String parentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.archType = archType;
        this.maintainerName = maintainerName;
        this.maintainerEmail = maintainerEmail;
        this.maintainerPhone = maintainerPhone;
        this.checksumType = checksumType;
        this.parentId = parentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID for the Compartment
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID for the Compartment
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * User friendly name for the software source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User friendly name for the software source
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Information specified by the user about the software source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Information specified by the user about the software source
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The architecture type supported by the Software Source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchTypes archType;

        /**
         * The architecture type supported by the Software Source
         * @param archType the value to set
         * @return this builder
         **/
        public Builder archType(ArchTypes archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }
        /**
         * Name of the person maintaining this software source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintainerName")
        private String maintainerName;

        /**
         * Name of the person maintaining this software source
         * @param maintainerName the value to set
         * @return this builder
         **/
        public Builder maintainerName(String maintainerName) {
            this.maintainerName = maintainerName;
            this.__explicitlySet__.add("maintainerName");
            return this;
        }
        /**
         * Email address of the person maintaining this software source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintainerEmail")
        private String maintainerEmail;

        /**
         * Email address of the person maintaining this software source
         * @param maintainerEmail the value to set
         * @return this builder
         **/
        public Builder maintainerEmail(String maintainerEmail) {
            this.maintainerEmail = maintainerEmail;
            this.__explicitlySet__.add("maintainerEmail");
            return this;
        }
        /**
         * Phone number of the person maintaining this software source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintainerPhone")
        private String maintainerPhone;

        /**
         * Phone number of the person maintaining this software source
         * @param maintainerPhone the value to set
         * @return this builder
         **/
        public Builder maintainerPhone(String maintainerPhone) {
            this.maintainerPhone = maintainerPhone;
            this.__explicitlySet__.add("maintainerPhone");
            return this;
        }
        /**
         * The yum repository checksum type used by this software source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
        private ChecksumTypes checksumType;

        /**
         * The yum repository checksum type used by this software source
         * @param checksumType the value to set
         * @return this builder
         **/
        public Builder checksumType(ChecksumTypes checksumType) {
            this.checksumType = checksumType;
            this.__explicitlySet__.add("checksumType");
            return this;
        }
        /**
         * OCID for the parent software source, if there is one
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        /**
         * OCID for the parent software source, if there is one
         * @param parentId the value to set
         * @return this builder
         **/
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public CreateSoftwareSourceDetails build() {
            CreateSoftwareSourceDetails model =
                    new CreateSoftwareSourceDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.archType,
                            this.maintainerName,
                            this.maintainerEmail,
                            this.maintainerPhone,
                            this.checksumType,
                            this.parentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSoftwareSourceDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("archType")) {
                this.archType(model.getArchType());
            }
            if (model.wasPropertyExplicitlySet("maintainerName")) {
                this.maintainerName(model.getMaintainerName());
            }
            if (model.wasPropertyExplicitlySet("maintainerEmail")) {
                this.maintainerEmail(model.getMaintainerEmail());
            }
            if (model.wasPropertyExplicitlySet("maintainerPhone")) {
                this.maintainerPhone(model.getMaintainerPhone());
            }
            if (model.wasPropertyExplicitlySet("checksumType")) {
                this.checksumType(model.getChecksumType());
            }
            if (model.wasPropertyExplicitlySet("parentId")) {
                this.parentId(model.getParentId());
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
     * OCID for the Compartment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID for the Compartment
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * User friendly name for the software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User friendly name for the software source
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Information specified by the user about the software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Information specified by the user about the software source
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The architecture type supported by the Software Source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchTypes archType;

    /**
     * The architecture type supported by the Software Source
     * @return the value
     **/
    public ArchTypes getArchType() {
        return archType;
    }

    /**
     * Name of the person maintaining this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintainerName")
    private final String maintainerName;

    /**
     * Name of the person maintaining this software source
     * @return the value
     **/
    public String getMaintainerName() {
        return maintainerName;
    }

    /**
     * Email address of the person maintaining this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintainerEmail")
    private final String maintainerEmail;

    /**
     * Email address of the person maintaining this software source
     * @return the value
     **/
    public String getMaintainerEmail() {
        return maintainerEmail;
    }

    /**
     * Phone number of the person maintaining this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintainerPhone")
    private final String maintainerPhone;

    /**
     * Phone number of the person maintaining this software source
     * @return the value
     **/
    public String getMaintainerPhone() {
        return maintainerPhone;
    }

    /**
     * The yum repository checksum type used by this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
    private final ChecksumTypes checksumType;

    /**
     * The yum repository checksum type used by this software source
     * @return the value
     **/
    public ChecksumTypes getChecksumType() {
        return checksumType;
    }

    /**
     * OCID for the parent software source, if there is one
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

    /**
     * OCID for the parent software source, if there is one
     * @return the value
     **/
    public String getParentId() {
        return parentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("CreateSoftwareSourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", maintainerName=").append(String.valueOf(this.maintainerName));
        sb.append(", maintainerEmail=").append(String.valueOf(this.maintainerEmail));
        sb.append(", maintainerPhone=").append(String.valueOf(this.maintainerPhone));
        sb.append(", checksumType=").append(String.valueOf(this.checksumType));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
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
        if (!(o instanceof CreateSoftwareSourceDetails)) {
            return false;
        }

        CreateSoftwareSourceDetails other = (CreateSoftwareSourceDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.maintainerName, other.maintainerName)
                && java.util.Objects.equals(this.maintainerEmail, other.maintainerEmail)
                && java.util.Objects.equals(this.maintainerPhone, other.maintainerPhone)
                && java.util.Objects.equals(this.checksumType, other.checksumType)
                && java.util.Objects.equals(this.parentId, other.parentId)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result =
                (result * PRIME)
                        + (this.maintainerName == null ? 43 : this.maintainerName.hashCode());
        result =
                (result * PRIME)
                        + (this.maintainerEmail == null ? 43 : this.maintainerEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.maintainerPhone == null ? 43 : this.maintainerPhone.hashCode());
        result = (result * PRIME) + (this.checksumType == null ? 43 : this.checksumType.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
