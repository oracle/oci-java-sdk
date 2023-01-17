/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in term relationship create operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateTermRelationshipDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateTermRelationshipDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "relatedTermKey"})
    public CreateTermRelationshipDetails(
            String displayName, String description, String relatedTermKey) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.relatedTermKey = relatedTermKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name. Is changeable. The combination of 'displayName' and 'parentTermKey'
         * must be unique. Avoid entering confidential information. This is the same as 'relationshipType' for 'termRelationship'.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Is changeable. The combination of 'displayName' and 'parentTermKey'
         * must be unique. Avoid entering confidential information. This is the same as 'relationshipType' for 'termRelationship'.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Detailed description of the term relationship usually defined at the time of creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the term relationship usually defined at the time of creation.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Unique id of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedTermKey")
        private String relatedTermKey;

        /**
         * Unique id of the related term.
         * @param relatedTermKey the value to set
         * @return this builder
         **/
        public Builder relatedTermKey(String relatedTermKey) {
            this.relatedTermKey = relatedTermKey;
            this.__explicitlySet__.add("relatedTermKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTermRelationshipDetails build() {
            CreateTermRelationshipDetails model =
                    new CreateTermRelationshipDetails(
                            this.displayName, this.description, this.relatedTermKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTermRelationshipDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("relatedTermKey")) {
                this.relatedTermKey(model.getRelatedTermKey());
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
     * A user-friendly display name. Is changeable. The combination of 'displayName' and 'parentTermKey'
     * must be unique. Avoid entering confidential information. This is the same as 'relationshipType' for 'termRelationship'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Is changeable. The combination of 'displayName' and 'parentTermKey'
     * must be unique. Avoid entering confidential information. This is the same as 'relationshipType' for 'termRelationship'.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detailed description of the term relationship usually defined at the time of creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the term relationship usually defined at the time of creation.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Unique id of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedTermKey")
    private final String relatedTermKey;

    /**
     * Unique id of the related term.
     * @return the value
     **/
    public String getRelatedTermKey() {
        return relatedTermKey;
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
        sb.append("CreateTermRelationshipDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", relatedTermKey=").append(String.valueOf(this.relatedTermKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTermRelationshipDetails)) {
            return false;
        }

        CreateTermRelationshipDetails other = (CreateTermRelationshipDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.relatedTermKey, other.relatedTermKey)
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
                        + (this.relatedTermKey == null ? 43 : this.relatedTermKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
