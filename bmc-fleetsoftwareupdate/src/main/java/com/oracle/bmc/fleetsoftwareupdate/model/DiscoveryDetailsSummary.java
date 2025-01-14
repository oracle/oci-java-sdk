/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Summarized Discovery details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DiscoveryDetailsSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiscoveryDetailsSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "serviceType", "criteria"})
    public DiscoveryDetailsSummary(
            DiscoveryTypes type, DiscoveryServiceTypes serviceType, DiscoveryCriteria criteria) {
        super();
        this.type = type;
        this.serviceType = serviceType;
        this.criteria = criteria;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Exadata Fleet Update Discovery type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private DiscoveryTypes type;

        /**
         * Exadata Fleet Update Discovery type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(DiscoveryTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Exadata service type for the target resource members. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private DiscoveryServiceTypes serviceType;

        /**
         * Exadata service type for the target resource members.
         *
         * @param serviceType the value to set
         * @return this builder
         */
        public Builder serviceType(DiscoveryServiceTypes serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }
        /** Criteria used for Exadata Fleet Update Discovery. */
        @com.fasterxml.jackson.annotation.JsonProperty("criteria")
        private DiscoveryCriteria criteria;

        /**
         * Criteria used for Exadata Fleet Update Discovery.
         *
         * @param criteria the value to set
         * @return this builder
         */
        public Builder criteria(DiscoveryCriteria criteria) {
            this.criteria = criteria;
            this.__explicitlySet__.add("criteria");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveryDetailsSummary build() {
            DiscoveryDetailsSummary model =
                    new DiscoveryDetailsSummary(this.type, this.serviceType, this.criteria);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveryDetailsSummary model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("criteria")) {
                this.criteria(model.getCriteria());
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

    /** Exadata Fleet Update Discovery type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final DiscoveryTypes type;

    /**
     * Exadata Fleet Update Discovery type.
     *
     * @return the value
     */
    public DiscoveryTypes getType() {
        return type;
    }

    /** Exadata service type for the target resource members. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    private final DiscoveryServiceTypes serviceType;

    /**
     * Exadata service type for the target resource members.
     *
     * @return the value
     */
    public DiscoveryServiceTypes getServiceType() {
        return serviceType;
    }

    /** Criteria used for Exadata Fleet Update Discovery. */
    @com.fasterxml.jackson.annotation.JsonProperty("criteria")
    private final DiscoveryCriteria criteria;

    /**
     * Criteria used for Exadata Fleet Update Discovery.
     *
     * @return the value
     */
    public DiscoveryCriteria getCriteria() {
        return criteria;
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
        sb.append("DiscoveryDetailsSummary(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", serviceType=").append(String.valueOf(this.serviceType));
        sb.append(", criteria=").append(String.valueOf(this.criteria));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveryDetailsSummary)) {
            return false;
        }

        DiscoveryDetailsSummary other = (DiscoveryDetailsSummary) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.serviceType, other.serviceType)
                && java.util.Objects.equals(this.criteria, other.criteria)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.serviceType == null ? 43 : this.serviceType.hashCode());
        result = (result * PRIME) + (this.criteria == null ? 43 : this.criteria.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
