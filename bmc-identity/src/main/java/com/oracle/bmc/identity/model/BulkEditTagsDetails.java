/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
    builder = BulkEditTagsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkEditTagsDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "resources", "bulkEditOperations"})
    public BulkEditTagsDetails(
            String compartmentId,
            java.util.List<BulkEditResource> resources,
            java.util.List<BulkEditOperationDetails> bulkEditOperations) {
        super();
        this.compartmentId = compartmentId;
        this.resources = resources;
        this.bulkEditOperations = bulkEditOperations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment where the bulk tag edit request is submitted.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the bulk tag edit request is submitted.
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
         * The resources to be updated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<BulkEditResource> resources;

        /**
         * The resources to be updated.
         *
         * @param resources the value to set
         * @return this builder
         **/
        public Builder resources(java.util.List<BulkEditResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /**
         * The operations associated with the request to bulk edit tags.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bulkEditOperations")
        private java.util.List<BulkEditOperationDetails> bulkEditOperations;

        /**
         * The operations associated with the request to bulk edit tags.
         *
         * @param bulkEditOperations the value to set
         * @return this builder
         **/
        public Builder bulkEditOperations(
                java.util.List<BulkEditOperationDetails> bulkEditOperations) {
            this.bulkEditOperations = bulkEditOperations;
            this.__explicitlySet__.add("bulkEditOperations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkEditTagsDetails build() {
            BulkEditTagsDetails __instance__ =
                    new BulkEditTagsDetails(compartmentId, resources, bulkEditOperations);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkEditTagsDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .resources(o.getResources())
                            .bulkEditOperations(o.getBulkEditOperations());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The OCID of the compartment where the bulk tag edit request is submitted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the bulk tag edit request is submitted.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The resources to be updated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<BulkEditResource> resources;

    /**
     * The resources to be updated.
     *
     * @return the value
     **/
    public java.util.List<BulkEditResource> getResources() {
        return resources;
    }

    /**
     * The operations associated with the request to bulk edit tags.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bulkEditOperations")
    private final java.util.List<BulkEditOperationDetails> bulkEditOperations;

    /**
     * The operations associated with the request to bulk edit tags.
     *
     * @return the value
     **/
    public java.util.List<BulkEditOperationDetails> getBulkEditOperations() {
        return bulkEditOperations;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BulkEditTagsDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", bulkEditOperations=").append(String.valueOf(this.bulkEditOperations));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkEditTagsDetails)) {
            return false;
        }

        BulkEditTagsDetails other = (BulkEditTagsDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.bulkEditOperations, other.bulkEditOperations)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkEditOperations == null
                                ? 43
                                : this.bulkEditOperations.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
