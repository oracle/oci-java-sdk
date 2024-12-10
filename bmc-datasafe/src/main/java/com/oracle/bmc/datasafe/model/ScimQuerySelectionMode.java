/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Indicates that the selection is a scimQuery.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScimQuerySelectionMode.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "selectionMode"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScimQuerySelectionMode extends SelectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The scimQuery query parameter accepts filter expressions that use the syntax described in Section 3.2.2.2
         * of the System for Cross-Domain Identity Management (SCIM) specification, which is available
         * at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM filtering expressions,
         * text, date, and time values must be enclosed in quotation marks, with date and time values using ISO-8601 format.
         * (Numeric and boolean values should not be quoted.)
         * <p>
         **Example:** query=(dbUserName eq "PAY_APP")
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scimQuery")
        private String scimQuery;

        /**
         * The scimQuery query parameter accepts filter expressions that use the syntax described in Section 3.2.2.2
         * of the System for Cross-Domain Identity Management (SCIM) specification, which is available
         * at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM filtering expressions,
         * text, date, and time values must be enclosed in quotation marks, with date and time values using ISO-8601 format.
         * (Numeric and boolean values should not be quoted.)
         * <p>
         **Example:** query=(dbUserName eq "PAY_APP")
         *
         * @param scimQuery the value to set
         * @return this builder
         **/
        public Builder scimQuery(String scimQuery) {
            this.scimQuery = scimQuery;
            this.__explicitlySet__.add("scimQuery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScimQuerySelectionMode build() {
            ScimQuerySelectionMode model = new ScimQuerySelectionMode(this.scimQuery);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScimQuerySelectionMode model) {
            if (model.wasPropertyExplicitlySet("scimQuery")) {
                this.scimQuery(model.getScimQuery());
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
    public ScimQuerySelectionMode(String scimQuery) {
        super();
        this.scimQuery = scimQuery;
    }

    /**
     * The scimQuery query parameter accepts filter expressions that use the syntax described in Section 3.2.2.2
     * of the System for Cross-Domain Identity Management (SCIM) specification, which is available
     * at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM filtering expressions,
     * text, date, and time values must be enclosed in quotation marks, with date and time values using ISO-8601 format.
     * (Numeric and boolean values should not be quoted.)
     * <p>
     **Example:** query=(dbUserName eq "PAY_APP")
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scimQuery")
    private final String scimQuery;

    /**
     * The scimQuery query parameter accepts filter expressions that use the syntax described in Section 3.2.2.2
     * of the System for Cross-Domain Identity Management (SCIM) specification, which is available
     * at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM filtering expressions,
     * text, date, and time values must be enclosed in quotation marks, with date and time values using ISO-8601 format.
     * (Numeric and boolean values should not be quoted.)
     * <p>
     **Example:** query=(dbUserName eq "PAY_APP")
     *
     * @return the value
     **/
    public String getScimQuery() {
        return scimQuery;
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
        sb.append("ScimQuerySelectionMode(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", scimQuery=").append(String.valueOf(this.scimQuery));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScimQuerySelectionMode)) {
            return false;
        }

        ScimQuerySelectionMode other = (ScimQuerySelectionMode) o;
        return java.util.Objects.equals(this.scimQuery, other.scimQuery) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.scimQuery == null ? 43 : this.scimQuery.hashCode());
        return result;
    }
}
