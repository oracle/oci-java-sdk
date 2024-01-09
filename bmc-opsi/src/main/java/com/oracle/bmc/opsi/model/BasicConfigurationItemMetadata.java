/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Basic configuration item metadata. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BasicConfigurationItemMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configItemType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BasicConfigurationItemMetadata extends ConfigurationItemMetadata {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** User-friendly display name for the configuration item. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-friendly display name for the configuration item.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of configuration item . */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of configuration item .
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Data type of configuration item. Examples: STRING, BOOLEAN, NUMBER */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * Data type of configuration item. Examples: STRING, BOOLEAN, NUMBER
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitDetails")
        private ConfigurationItemUnitDetails unitDetails;

        public Builder unitDetails(ConfigurationItemUnitDetails unitDetails) {
            this.unitDetails = unitDetails;
            this.__explicitlySet__.add("unitDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueInputDetails")
        private ConfigurationItemAllowedValueDetails valueInputDetails;

        public Builder valueInputDetails(ConfigurationItemAllowedValueDetails valueInputDetails) {
            this.valueInputDetails = valueInputDetails;
            this.__explicitlySet__.add("valueInputDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BasicConfigurationItemMetadata build() {
            BasicConfigurationItemMetadata model =
                    new BasicConfigurationItemMetadata(
                            this.displayName,
                            this.description,
                            this.dataType,
                            this.unitDetails,
                            this.valueInputDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BasicConfigurationItemMetadata model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("unitDetails")) {
                this.unitDetails(model.getUnitDetails());
            }
            if (model.wasPropertyExplicitlySet("valueInputDetails")) {
                this.valueInputDetails(model.getValueInputDetails());
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
    public BasicConfigurationItemMetadata(
            String displayName,
            String description,
            String dataType,
            ConfigurationItemUnitDetails unitDetails,
            ConfigurationItemAllowedValueDetails valueInputDetails) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.dataType = dataType;
        this.unitDetails = unitDetails;
        this.valueInputDetails = valueInputDetails;
    }

    /** User-friendly display name for the configuration item. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly display name for the configuration item.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of configuration item . */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of configuration item .
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Data type of configuration item. Examples: STRING, BOOLEAN, NUMBER */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * Data type of configuration item. Examples: STRING, BOOLEAN, NUMBER
     *
     * @return the value
     */
    public String getDataType() {
        return dataType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("unitDetails")
    private final ConfigurationItemUnitDetails unitDetails;

    public ConfigurationItemUnitDetails getUnitDetails() {
        return unitDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("valueInputDetails")
    private final ConfigurationItemAllowedValueDetails valueInputDetails;

    public ConfigurationItemAllowedValueDetails getValueInputDetails() {
        return valueInputDetails;
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
        sb.append("BasicConfigurationItemMetadata(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", unitDetails=").append(String.valueOf(this.unitDetails));
        sb.append(", valueInputDetails=").append(String.valueOf(this.valueInputDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BasicConfigurationItemMetadata)) {
            return false;
        }

        BasicConfigurationItemMetadata other = (BasicConfigurationItemMetadata) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.unitDetails, other.unitDetails)
                && java.util.Objects.equals(this.valueInputDetails, other.valueInputDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.unitDetails == null ? 43 : this.unitDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.valueInputDetails == null ? 43 : this.valueInputDetails.hashCode());
        return result;
    }
}
