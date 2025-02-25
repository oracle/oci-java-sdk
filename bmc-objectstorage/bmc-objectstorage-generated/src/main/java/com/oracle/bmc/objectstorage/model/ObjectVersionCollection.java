/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
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
    builder = ObjectVersionCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ObjectVersionCollection
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "prefixes"})
    public ObjectVersionCollection(
            java.util.List<ObjectVersionSummary> items, java.util.List<String> prefixes) {
        super();
        this.items = items;
        this.prefixes = prefixes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of object version summaries.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ObjectVersionSummary> items;

        /**
         * An array of object version summaries.
         *
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<ObjectVersionSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /**
         * Prefixes that are common to the results returned by the request if the request specified a delimiter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefixes")
        private java.util.List<String> prefixes;

        /**
         * Prefixes that are common to the results returned by the request if the request specified a delimiter.
         *
         * @param prefixes the value to set
         * @return this builder
         **/
        public Builder prefixes(java.util.List<String> prefixes) {
            this.prefixes = prefixes;
            this.__explicitlySet__.add("prefixes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectVersionCollection build() {
            ObjectVersionCollection model = new ObjectVersionCollection(this.items, this.prefixes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectVersionCollection model) {
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("prefixes")) {
                this.prefixes(model.getPrefixes());
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
     * An array of object version summaries.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ObjectVersionSummary> items;

    /**
     * An array of object version summaries.
     *
     * @return the value
     **/
    public java.util.List<ObjectVersionSummary> getItems() {
        return items;
    }

    /**
     * Prefixes that are common to the results returned by the request if the request specified a delimiter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefixes")
    private final java.util.List<String> prefixes;

    /**
     * Prefixes that are common to the results returned by the request if the request specified a delimiter.
     *
     * @return the value
     **/
    public java.util.List<String> getPrefixes() {
        return prefixes;
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
        sb.append("ObjectVersionCollection(");
        sb.append("super=").append(super.toString());
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", prefixes=").append(String.valueOf(this.prefixes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectVersionCollection)) {
            return false;
        }

        ObjectVersionCollection other = (ObjectVersionCollection) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.prefixes, other.prefixes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.prefixes == null ? 43 : this.prefixes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
