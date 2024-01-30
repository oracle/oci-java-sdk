/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to update a named credential. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateNamedCredentialDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateNamedCredentialDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"description", "scope", "content", "associatedResource"})
    public UpdateNamedCredentialDetails(
            String description,
            NamedCredentialScope scope,
            NamedCredentialContent content,
            String associatedResource) {
        super();
        this.description = description;
        this.scope = scope;
        this.content = content;
        this.associatedResource = associatedResource;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The information specified by the user about the named credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The information specified by the user about the named credential.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The scope of the named credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private NamedCredentialScope scope;

        /**
         * The scope of the named credential.
         *
         * @param scope the value to set
         * @return this builder
         */
        public Builder scope(NamedCredentialScope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private NamedCredentialContent content;

        public Builder content(NamedCredentialContent content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * resource that is associated to the named credential.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedResource")
        private String associatedResource;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * resource that is associated to the named credential.
         *
         * @param associatedResource the value to set
         * @return this builder
         */
        public Builder associatedResource(String associatedResource) {
            this.associatedResource = associatedResource;
            this.__explicitlySet__.add("associatedResource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateNamedCredentialDetails build() {
            UpdateNamedCredentialDetails model =
                    new UpdateNamedCredentialDetails(
                            this.description, this.scope, this.content, this.associatedResource);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNamedCredentialDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("associatedResource")) {
                this.associatedResource(model.getAssociatedResource());
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

    /** The information specified by the user about the named credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The information specified by the user about the named credential.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The scope of the named credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final NamedCredentialScope scope;

    /**
     * The scope of the named credential.
     *
     * @return the value
     */
    public NamedCredentialScope getScope() {
        return scope;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final NamedCredentialContent content;

    public NamedCredentialContent getContent() {
        return content;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * resource that is associated to the named credential.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedResource")
    private final String associatedResource;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * resource that is associated to the named credential.
     *
     * @return the value
     */
    public String getAssociatedResource() {
        return associatedResource;
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
        sb.append("UpdateNamedCredentialDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", associatedResource=").append(String.valueOf(this.associatedResource));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNamedCredentialDetails)) {
            return false;
        }

        UpdateNamedCredentialDetails other = (UpdateNamedCredentialDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.associatedResource, other.associatedResource)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedResource == null
                                ? 43
                                : this.associatedResource.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
