/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Information about the detaching the private endpoint resource from a catalog <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DetachCatalogPrivateEndpointDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DetachCatalogPrivateEndpointDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"catalogPrivateEndpointId"})
    public DetachCatalogPrivateEndpointDetails(String catalogPrivateEndpointId) {
        super();
        this.catalogPrivateEndpointId = catalogPrivateEndpointId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The identifier of the private endpoint to be detached from catalog resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogPrivateEndpointId")
        private String catalogPrivateEndpointId;

        /**
         * The identifier of the private endpoint to be detached from catalog resource.
         *
         * @param catalogPrivateEndpointId the value to set
         * @return this builder
         */
        public Builder catalogPrivateEndpointId(String catalogPrivateEndpointId) {
            this.catalogPrivateEndpointId = catalogPrivateEndpointId;
            this.__explicitlySet__.add("catalogPrivateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetachCatalogPrivateEndpointDetails build() {
            DetachCatalogPrivateEndpointDetails model =
                    new DetachCatalogPrivateEndpointDetails(this.catalogPrivateEndpointId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetachCatalogPrivateEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("catalogPrivateEndpointId")) {
                this.catalogPrivateEndpointId(model.getCatalogPrivateEndpointId());
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

    /** The identifier of the private endpoint to be detached from catalog resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogPrivateEndpointId")
    private final String catalogPrivateEndpointId;

    /**
     * The identifier of the private endpoint to be detached from catalog resource.
     *
     * @return the value
     */
    public String getCatalogPrivateEndpointId() {
        return catalogPrivateEndpointId;
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
        sb.append("DetachCatalogPrivateEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("catalogPrivateEndpointId=")
                .append(String.valueOf(this.catalogPrivateEndpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachCatalogPrivateEndpointDetails)) {
            return false;
        }

        DetachCatalogPrivateEndpointDetails other = (DetachCatalogPrivateEndpointDetails) o;
        return java.util.Objects.equals(
                        this.catalogPrivateEndpointId, other.catalogPrivateEndpointId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.catalogPrivateEndpointId == null
                                ? 43
                                : this.catalogPrivateEndpointId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
