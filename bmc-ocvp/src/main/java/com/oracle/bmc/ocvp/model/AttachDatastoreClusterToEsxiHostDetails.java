/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Details for the datastore cluster attachment to ESXi hosts. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AttachDatastoreClusterToEsxiHostDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AttachDatastoreClusterToEsxiHostDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"esxiHostId"})
    public AttachDatastoreClusterToEsxiHostDetails(String esxiHostId) {
        super();
        this.esxiHostId = esxiHostId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host to attach the datastore cluster to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("esxiHostId")
        private String esxiHostId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host to attach the datastore cluster to.
         *
         * @param esxiHostId the value to set
         * @return this builder
         */
        public Builder esxiHostId(String esxiHostId) {
            this.esxiHostId = esxiHostId;
            this.__explicitlySet__.add("esxiHostId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachDatastoreClusterToEsxiHostDetails build() {
            AttachDatastoreClusterToEsxiHostDetails model =
                    new AttachDatastoreClusterToEsxiHostDetails(this.esxiHostId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachDatastoreClusterToEsxiHostDetails model) {
            if (model.wasPropertyExplicitlySet("esxiHostId")) {
                this.esxiHostId(model.getEsxiHostId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host to attach the datastore cluster to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("esxiHostId")
    private final String esxiHostId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host to attach the datastore cluster to.
     *
     * @return the value
     */
    public String getEsxiHostId() {
        return esxiHostId;
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
        sb.append("AttachDatastoreClusterToEsxiHostDetails(");
        sb.append("super=").append(super.toString());
        sb.append("esxiHostId=").append(String.valueOf(this.esxiHostId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachDatastoreClusterToEsxiHostDetails)) {
            return false;
        }

        AttachDatastoreClusterToEsxiHostDetails other = (AttachDatastoreClusterToEsxiHostDetails) o;
        return java.util.Objects.equals(this.esxiHostId, other.esxiHostId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.esxiHostId == null ? 43 : this.esxiHostId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
