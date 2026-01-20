/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * A named credential metadata definition <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NamedCredentialMetadataDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NamedCredentialMetadataDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "displayName", "minimumAgentVersion", "properties"})
    public NamedCredentialMetadataDefinition(
            String type,
            String displayName,
            String minimumAgentVersion,
            java.util.List<NamedCredentialFieldDefinition> properties) {
        super();
        this.type = type;
        this.displayName = displayName;
        this.minimumAgentVersion = minimumAgentVersion;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of the Named Credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of the Named Credential.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Display name for this type of Named Credential */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for this type of Named Credential
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
         * This Named Credential type is supported on management agents at this version or above.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumAgentVersion")
        private String minimumAgentVersion;

        /**
         * This Named Credential type is supported on management agents at this version or above.
         *
         * @param minimumAgentVersion the value to set
         * @return this builder
         */
        public Builder minimumAgentVersion(String minimumAgentVersion) {
            this.minimumAgentVersion = minimumAgentVersion;
            this.__explicitlySet__.add("minimumAgentVersion");
            return this;
        }
        /** The property definitions for this named credential metadata */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<NamedCredentialFieldDefinition> properties;

        /**
         * The property definitions for this named credential metadata
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.List<NamedCredentialFieldDefinition> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NamedCredentialMetadataDefinition build() {
            NamedCredentialMetadataDefinition model =
                    new NamedCredentialMetadataDefinition(
                            this.type, this.displayName, this.minimumAgentVersion, this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NamedCredentialMetadataDefinition model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("minimumAgentVersion")) {
                this.minimumAgentVersion(model.getMinimumAgentVersion());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    /** The type of the Named Credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of the Named Credential.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Display name for this type of Named Credential */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for this type of Named Credential
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** This Named Credential type is supported on management agents at this version or above. */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumAgentVersion")
    private final String minimumAgentVersion;

    /**
     * This Named Credential type is supported on management agents at this version or above.
     *
     * @return the value
     */
    public String getMinimumAgentVersion() {
        return minimumAgentVersion;
    }

    /** The property definitions for this named credential metadata */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<NamedCredentialFieldDefinition> properties;

    /**
     * The property definitions for this named credential metadata
     *
     * @return the value
     */
    public java.util.List<NamedCredentialFieldDefinition> getProperties() {
        return properties;
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
        sb.append("NamedCredentialMetadataDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", minimumAgentVersion=").append(String.valueOf(this.minimumAgentVersion));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NamedCredentialMetadataDefinition)) {
            return false;
        }

        NamedCredentialMetadataDefinition other = (NamedCredentialMetadataDefinition) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.minimumAgentVersion, other.minimumAgentVersion)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumAgentVersion == null
                                ? 43
                                : this.minimumAgentVersion.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
