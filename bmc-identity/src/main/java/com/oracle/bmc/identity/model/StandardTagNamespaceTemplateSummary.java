/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * The template of the standard tag namespace. This object includes necessary details to create the provided standard tag namespace.
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
    builder = StandardTagNamespaceTemplateSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StandardTagNamespaceTemplateSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"description", "standardTagNamespaceName", "status"})
    public StandardTagNamespaceTemplateSummary(
            String description, String standardTagNamespaceName, String status) {
        super();
        this.description = description;
        this.standardTagNamespaceName = standardTagNamespaceName;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The default description of the tag namespace that users can use to create the tag namespace
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The default description of the tag namespace that users can use to create the tag namespace
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The reserved name of this standard tag namespace
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("standardTagNamespaceName")
        private String standardTagNamespaceName;

        /**
         * The reserved name of this standard tag namespace
         * @param standardTagNamespaceName the value to set
         * @return this builder
         **/
        public Builder standardTagNamespaceName(String standardTagNamespaceName) {
            this.standardTagNamespaceName = standardTagNamespaceName;
            this.__explicitlySet__.add("standardTagNamespaceName");
            return this;
        }
        /**
         * The status of the standard tag namespace
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The status of the standard tag namespace
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StandardTagNamespaceTemplateSummary build() {
            StandardTagNamespaceTemplateSummary model =
                    new StandardTagNamespaceTemplateSummary(
                            this.description, this.standardTagNamespaceName, this.status);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StandardTagNamespaceTemplateSummary model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("standardTagNamespaceName")) {
                this.standardTagNamespaceName(model.getStandardTagNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
     * The default description of the tag namespace that users can use to create the tag namespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The default description of the tag namespace that users can use to create the tag namespace
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The reserved name of this standard tag namespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("standardTagNamespaceName")
    private final String standardTagNamespaceName;

    /**
     * The reserved name of this standard tag namespace
     * @return the value
     **/
    public String getStandardTagNamespaceName() {
        return standardTagNamespaceName;
    }

    /**
     * The status of the standard tag namespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The status of the standard tag namespace
     * @return the value
     **/
    public String getStatus() {
        return status;
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
        sb.append("StandardTagNamespaceTemplateSummary(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", standardTagNamespaceName=")
                .append(String.valueOf(this.standardTagNamespaceName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StandardTagNamespaceTemplateSummary)) {
            return false;
        }

        StandardTagNamespaceTemplateSummary other = (StandardTagNamespaceTemplateSummary) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.standardTagNamespaceName, other.standardTagNamespaceName)
                && java.util.Objects.equals(this.status, other.status)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.standardTagNamespaceName == null
                                ? 43
                                : this.standardTagNamespaceName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
