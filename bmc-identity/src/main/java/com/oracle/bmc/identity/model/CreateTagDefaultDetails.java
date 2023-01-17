/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 *
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
    builder = CreateTagDefaultDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateTagDefaultDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "tagDefinitionId",
        "value",
        "isRequired",
        "locks"
    })
    public CreateTagDefaultDetails(
            String compartmentId,
            String tagDefinitionId,
            String value,
            Boolean isRequired,
            java.util.List<AddLockDetails> locks) {
        super();
        this.compartmentId = compartmentId;
        this.tagDefinitionId = tagDefinitionId;
        this.value = value;
        this.isRequired = isRequired;
        this.locks = locks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment. The tag default will be applied to all new resources created in this compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment. The tag default will be applied to all new resources created in this compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the tag definition. The tag default will always assign a default value for this tag definition.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionId")
        private String tagDefinitionId;

        /**
         * The OCID of the tag definition. The tag default will always assign a default value for this tag definition.
         *
         * @param tagDefinitionId the value to set
         * @return this builder
         **/
        public Builder tagDefinitionId(String tagDefinitionId) {
            this.tagDefinitionId = tagDefinitionId;
            this.__explicitlySet__.add("tagDefinitionId");
            return this;
        }
        /**
         * The default value for the tag definition. This will be applied to all new resources created in the compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The default value for the tag definition. This will be applied to all new resources created in the compartment.
         *
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * If you specify that a value is required, a value is set during resource creation (either by
         * the user creating the resource or another tag defualt). If no value is set, resource
         * creation is blocked.
         * <p>
         * If the {@code isRequired} flag is set to "true", the value is set during resource creation.
         * * If the {@code isRequired} flag is set to "false", the value you enter is set during resource creation.
         * <p>
         * Example: {@code false}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * If you specify that a value is required, a value is set during resource creation (either by
         * the user creating the resource or another tag defualt). If no value is set, resource
         * creation is blocked.
         * <p>
         * If the {@code isRequired} flag is set to "true", the value is set during resource creation.
         * * If the {@code isRequired} flag is set to "false", the value you enter is set during resource creation.
         * <p>
         * Example: {@code false}
         *
         * @param isRequired the value to set
         * @return this builder
         **/
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }
        /**
         * Locks associated with this resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<AddLockDetails> locks;

        /**
         * Locks associated with this resource.
         * @param locks the value to set
         * @return this builder
         **/
        public Builder locks(java.util.List<AddLockDetails> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTagDefaultDetails build() {
            CreateTagDefaultDetails model =
                    new CreateTagDefaultDetails(
                            this.compartmentId,
                            this.tagDefinitionId,
                            this.value,
                            this.isRequired,
                            this.locks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTagDefaultDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("tagDefinitionId")) {
                this.tagDefinitionId(model.getTagDefinitionId());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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
     * The OCID of the compartment. The tag default will be applied to all new resources created in this compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment. The tag default will be applied to all new resources created in this compartment.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the tag definition. The tag default will always assign a default value for this tag definition.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionId")
    private final String tagDefinitionId;

    /**
     * The OCID of the tag definition. The tag default will always assign a default value for this tag definition.
     *
     * @return the value
     **/
    public String getTagDefinitionId() {
        return tagDefinitionId;
    }

    /**
     * The default value for the tag definition. This will be applied to all new resources created in the compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The default value for the tag definition. This will be applied to all new resources created in the compartment.
     *
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * If you specify that a value is required, a value is set during resource creation (either by
     * the user creating the resource or another tag defualt). If no value is set, resource
     * creation is blocked.
     * <p>
     * If the {@code isRequired} flag is set to "true", the value is set during resource creation.
     * * If the {@code isRequired} flag is set to "false", the value you enter is set during resource creation.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * If you specify that a value is required, a value is set during resource creation (either by
     * the user creating the resource or another tag defualt). If no value is set, resource
     * creation is blocked.
     * <p>
     * If the {@code isRequired} flag is set to "true", the value is set during resource creation.
     * * If the {@code isRequired} flag is set to "false", the value you enter is set during resource creation.
     * <p>
     * Example: {@code false}
     *
     * @return the value
     **/
    public Boolean getIsRequired() {
        return isRequired;
    }

    /**
     * Locks associated with this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<AddLockDetails> locks;

    /**
     * Locks associated with this resource.
     * @return the value
     **/
    public java.util.List<AddLockDetails> getLocks() {
        return locks;
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
        sb.append("CreateTagDefaultDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", tagDefinitionId=").append(String.valueOf(this.tagDefinitionId));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTagDefaultDetails)) {
            return false;
        }

        CreateTagDefaultDetails other = (CreateTagDefaultDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.tagDefinitionId, other.tagDefinitionId)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.tagDefinitionId == null ? 43 : this.tagDefinitionId.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
