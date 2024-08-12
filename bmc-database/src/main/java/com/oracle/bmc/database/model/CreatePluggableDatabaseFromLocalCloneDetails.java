/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Specifies the creation type Local Clone.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreatePluggableDatabaseFromLocalCloneDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "creationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreatePluggableDatabaseFromLocalCloneDetails
        extends CreatePluggableDatabaseCreationTypeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the Source Pluggable Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourcePluggableDatabaseId")
        private String sourcePluggableDatabaseId;

        /**
         * The OCID of the Source Pluggable Database.
         * @param sourcePluggableDatabaseId the value to set
         * @return this builder
         **/
        public Builder sourcePluggableDatabaseId(String sourcePluggableDatabaseId) {
            this.sourcePluggableDatabaseId = sourcePluggableDatabaseId;
            this.__explicitlySet__.add("sourcePluggableDatabaseId");
            return this;
        }
        /**
         * True if Pluggable Database needs to be thin cloned and false if Pluggable Database needs to be thick cloned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isThinClone")
        private Boolean isThinClone;

        /**
         * True if Pluggable Database needs to be thin cloned and false if Pluggable Database needs to be thick cloned.
         * @param isThinClone the value to set
         * @return this builder
         **/
        public Builder isThinClone(Boolean isThinClone) {
            this.isThinClone = isThinClone;
            this.__explicitlySet__.add("isThinClone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePluggableDatabaseFromLocalCloneDetails build() {
            CreatePluggableDatabaseFromLocalCloneDetails model =
                    new CreatePluggableDatabaseFromLocalCloneDetails(
                            this.sourcePluggableDatabaseId, this.isThinClone);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePluggableDatabaseFromLocalCloneDetails model) {
            if (model.wasPropertyExplicitlySet("sourcePluggableDatabaseId")) {
                this.sourcePluggableDatabaseId(model.getSourcePluggableDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("isThinClone")) {
                this.isThinClone(model.getIsThinClone());
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

    @Deprecated
    public CreatePluggableDatabaseFromLocalCloneDetails(
            String sourcePluggableDatabaseId, Boolean isThinClone) {
        super();
        this.sourcePluggableDatabaseId = sourcePluggableDatabaseId;
        this.isThinClone = isThinClone;
    }

    /**
     * The OCID of the Source Pluggable Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePluggableDatabaseId")
    private final String sourcePluggableDatabaseId;

    /**
     * The OCID of the Source Pluggable Database.
     * @return the value
     **/
    public String getSourcePluggableDatabaseId() {
        return sourcePluggableDatabaseId;
    }

    /**
     * True if Pluggable Database needs to be thin cloned and false if Pluggable Database needs to be thick cloned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isThinClone")
    private final Boolean isThinClone;

    /**
     * True if Pluggable Database needs to be thin cloned and false if Pluggable Database needs to be thick cloned.
     * @return the value
     **/
    public Boolean getIsThinClone() {
        return isThinClone;
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
        sb.append("CreatePluggableDatabaseFromLocalCloneDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourcePluggableDatabaseId=")
                .append(String.valueOf(this.sourcePluggableDatabaseId));
        sb.append(", isThinClone=").append(String.valueOf(this.isThinClone));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePluggableDatabaseFromLocalCloneDetails)) {
            return false;
        }

        CreatePluggableDatabaseFromLocalCloneDetails other =
                (CreatePluggableDatabaseFromLocalCloneDetails) o;
        return java.util.Objects.equals(
                        this.sourcePluggableDatabaseId, other.sourcePluggableDatabaseId)
                && java.util.Objects.equals(this.isThinClone, other.isThinClone)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sourcePluggableDatabaseId == null
                                ? 43
                                : this.sourcePluggableDatabaseId.hashCode());
        result = (result * PRIME) + (this.isThinClone == null ? 43 : this.isThinClone.hashCode());
        return result;
    }
}
