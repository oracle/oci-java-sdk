/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Detailed information about the adhoc query. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AdhocQueryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdhocQueryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"query", "adhocQueryResources"})
    public AdhocQueryDetails(String query, java.util.List<AdhocQueryResource> adhocQueryResources) {
        super();
        this.query = query;
        this.adhocQueryResources = adhocQueryResources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The adhoc query expression that is run */
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The adhoc query expression that is run
         *
         * @param query the value to set
         * @return this builder
         */
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }
        /** Target information in which adhoc query will be run */
        @com.fasterxml.jackson.annotation.JsonProperty("adhocQueryResources")
        private java.util.List<AdhocQueryResource> adhocQueryResources;

        /**
         * Target information in which adhoc query will be run
         *
         * @param adhocQueryResources the value to set
         * @return this builder
         */
        public Builder adhocQueryResources(java.util.List<AdhocQueryResource> adhocQueryResources) {
            this.adhocQueryResources = adhocQueryResources;
            this.__explicitlySet__.add("adhocQueryResources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdhocQueryDetails build() {
            AdhocQueryDetails model = new AdhocQueryDetails(this.query, this.adhocQueryResources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdhocQueryDetails model) {
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("adhocQueryResources")) {
                this.adhocQueryResources(model.getAdhocQueryResources());
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

    /** The adhoc query expression that is run */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The adhoc query expression that is run
     *
     * @return the value
     */
    public String getQuery() {
        return query;
    }

    /** Target information in which adhoc query will be run */
    @com.fasterxml.jackson.annotation.JsonProperty("adhocQueryResources")
    private final java.util.List<AdhocQueryResource> adhocQueryResources;

    /**
     * Target information in which adhoc query will be run
     *
     * @return the value
     */
    public java.util.List<AdhocQueryResource> getAdhocQueryResources() {
        return adhocQueryResources;
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
        sb.append("AdhocQueryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("query=").append(String.valueOf(this.query));
        sb.append(", adhocQueryResources=").append(String.valueOf(this.adhocQueryResources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdhocQueryDetails)) {
            return false;
        }

        AdhocQueryDetails other = (AdhocQueryDetails) o;
        return java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.adhocQueryResources, other.adhocQueryResources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result =
                (result * PRIME)
                        + (this.adhocQueryResources == null
                                ? 43
                                : this.adhocQueryResources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
