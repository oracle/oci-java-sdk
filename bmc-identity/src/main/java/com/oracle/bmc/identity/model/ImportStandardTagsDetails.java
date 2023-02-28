/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImportStandardTagsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ImportStandardTagsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "standardTagNamespaceName"})
    public ImportStandardTagsDetails(String compartmentId, String standardTagNamespaceName) {
        super();
        this.compartmentId = compartmentId;
        this.standardTagNamespaceName = standardTagNamespaceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment where the bulk create request is submitted and where the tag
         * namespaces will be created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the bulk create request is submitted and where the tag
         * namespaces will be created.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The name of standard tag namespace that will be imported in bulk */
        @com.fasterxml.jackson.annotation.JsonProperty("standardTagNamespaceName")
        private String standardTagNamespaceName;

        /**
         * The name of standard tag namespace that will be imported in bulk
         *
         * @param standardTagNamespaceName the value to set
         * @return this builder
         */
        public Builder standardTagNamespaceName(String standardTagNamespaceName) {
            this.standardTagNamespaceName = standardTagNamespaceName;
            this.__explicitlySet__.add("standardTagNamespaceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportStandardTagsDetails build() {
            ImportStandardTagsDetails model =
                    new ImportStandardTagsDetails(
                            this.compartmentId, this.standardTagNamespaceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportStandardTagsDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("standardTagNamespaceName")) {
                this.standardTagNamespaceName(model.getStandardTagNamespaceName());
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

    /**
     * The OCID of the compartment where the bulk create request is submitted and where the tag
     * namespaces will be created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the bulk create request is submitted and where the tag
     * namespaces will be created.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The name of standard tag namespace that will be imported in bulk */
    @com.fasterxml.jackson.annotation.JsonProperty("standardTagNamespaceName")
    private final String standardTagNamespaceName;

    /**
     * The name of standard tag namespace that will be imported in bulk
     *
     * @return the value
     */
    public String getStandardTagNamespaceName() {
        return standardTagNamespaceName;
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
        sb.append("ImportStandardTagsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", standardTagNamespaceName=")
                .append(String.valueOf(this.standardTagNamespaceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportStandardTagsDetails)) {
            return false;
        }

        ImportStandardTagsDetails other = (ImportStandardTagsDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.standardTagNamespaceName, other.standardTagNamespaceName)
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
                        + (this.standardTagNamespaceName == null
                                ? 43
                                : this.standardTagNamespaceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
