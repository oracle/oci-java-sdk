/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Catalog source template config. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CatalogSourceTemplateConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CatalogSourceTemplateConfig extends CatalogSourcePayload {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
        private String workingDirectory;

        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            this.__explicitlySet__.add("workingDirectory");
            return this;
        }
        /**
         * The Base64 encoded template. This payload will trigger CreateTemplate API, where the
         * parameter will be passed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("zipFileBase64Encoded")
        private String zipFileBase64Encoded;

        /**
         * The Base64 encoded template. This payload will trigger CreateTemplate API, where the
         * parameter will be passed.
         *
         * @param zipFileBase64Encoded the value to set
         * @return this builder
         */
        public Builder zipFileBase64Encoded(String zipFileBase64Encoded) {
            this.zipFileBase64Encoded = zipFileBase64Encoded;
            this.__explicitlySet__.add("zipFileBase64Encoded");
            return this;
        }
        /** Template Description */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Template Description
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Template Long Description */
        @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
        private String longDescription;

        /**
         * Template Long Description
         *
         * @param longDescription the value to set
         * @return this builder
         */
        public Builder longDescription(String longDescription) {
            this.longDescription = longDescription;
            this.__explicitlySet__.add("longDescription");
            return this;
        }
        /** Template Display Name */
        @com.fasterxml.jackson.annotation.JsonProperty("templateDisplayName")
        private String templateDisplayName;

        /**
         * Template Display Name
         *
         * @param templateDisplayName the value to set
         * @return this builder
         */
        public Builder templateDisplayName(String templateDisplayName) {
            this.templateDisplayName = templateDisplayName;
            this.__explicitlySet__.add("templateDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CatalogSourceTemplateConfig build() {
            CatalogSourceTemplateConfig model =
                    new CatalogSourceTemplateConfig(
                            this.workingDirectory,
                            this.zipFileBase64Encoded,
                            this.description,
                            this.longDescription,
                            this.templateDisplayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CatalogSourceTemplateConfig model) {
            if (model.wasPropertyExplicitlySet("workingDirectory")) {
                this.workingDirectory(model.getWorkingDirectory());
            }
            if (model.wasPropertyExplicitlySet("zipFileBase64Encoded")) {
                this.zipFileBase64Encoded(model.getZipFileBase64Encoded());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("longDescription")) {
                this.longDescription(model.getLongDescription());
            }
            if (model.wasPropertyExplicitlySet("templateDisplayName")) {
                this.templateDisplayName(model.getTemplateDisplayName());
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

    @Deprecated
    public CatalogSourceTemplateConfig(
            String workingDirectory,
            String zipFileBase64Encoded,
            String description,
            String longDescription,
            String templateDisplayName) {
        super(workingDirectory);
        this.zipFileBase64Encoded = zipFileBase64Encoded;
        this.description = description;
        this.longDescription = longDescription;
        this.templateDisplayName = templateDisplayName;
    }

    /**
     * The Base64 encoded template. This payload will trigger CreateTemplate API, where the
     * parameter will be passed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("zipFileBase64Encoded")
    private final String zipFileBase64Encoded;

    /**
     * The Base64 encoded template. This payload will trigger CreateTemplate API, where the
     * parameter will be passed.
     *
     * @return the value
     */
    public String getZipFileBase64Encoded() {
        return zipFileBase64Encoded;
    }

    /** Template Description */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Template Description
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Template Long Description */
    @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
    private final String longDescription;

    /**
     * Template Long Description
     *
     * @return the value
     */
    public String getLongDescription() {
        return longDescription;
    }

    /** Template Display Name */
    @com.fasterxml.jackson.annotation.JsonProperty("templateDisplayName")
    private final String templateDisplayName;

    /**
     * Template Display Name
     *
     * @return the value
     */
    public String getTemplateDisplayName() {
        return templateDisplayName;
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
        sb.append("CatalogSourceTemplateConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", zipFileBase64Encoded=").append(String.valueOf(this.zipFileBase64Encoded));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", longDescription=").append(String.valueOf(this.longDescription));
        sb.append(", templateDisplayName=").append(String.valueOf(this.templateDisplayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogSourceTemplateConfig)) {
            return false;
        }

        CatalogSourceTemplateConfig other = (CatalogSourceTemplateConfig) o;
        return java.util.Objects.equals(this.zipFileBase64Encoded, other.zipFileBase64Encoded)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.longDescription, other.longDescription)
                && java.util.Objects.equals(this.templateDisplayName, other.templateDisplayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.zipFileBase64Encoded == null
                                ? 43
                                : this.zipFileBase64Encoded.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.longDescription == null ? 43 : this.longDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.templateDisplayName == null
                                ? 43
                                : this.templateDisplayName.hashCode());
        return result;
    }
}
