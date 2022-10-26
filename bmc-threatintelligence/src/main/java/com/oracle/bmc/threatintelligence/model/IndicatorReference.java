/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.model;

/**
 * A reference to a threat indicator resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IndicatorReference.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class IndicatorReference extends EntityReference {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique OCID of the referenced threat indicator. */
        @com.fasterxml.jackson.annotation.JsonProperty("indicatorId")
        private String indicatorId;

        /**
         * The unique OCID of the referenced threat indicator.
         *
         * @param indicatorId the value to set
         * @return this builder
         */
        public Builder indicatorId(String indicatorId) {
            this.indicatorId = indicatorId;
            this.__explicitlySet__.add("indicatorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IndicatorReference build() {
            IndicatorReference model = new IndicatorReference(this.indicatorId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IndicatorReference model) {
            if (model.wasPropertyExplicitlySet("indicatorId")) {
                this.indicatorId(model.getIndicatorId());
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

    @Deprecated
    public IndicatorReference(String indicatorId) {
        super();
        this.indicatorId = indicatorId;
    }

    /** The unique OCID of the referenced threat indicator. */
    @com.fasterxml.jackson.annotation.JsonProperty("indicatorId")
    private final String indicatorId;

    /**
     * The unique OCID of the referenced threat indicator.
     *
     * @return the value
     */
    public String getIndicatorId() {
        return indicatorId;
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
        sb.append("IndicatorReference(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", indicatorId=").append(String.valueOf(this.indicatorId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IndicatorReference)) {
            return false;
        }

        IndicatorReference other = (IndicatorReference) o;
        return java.util.Objects.equals(this.indicatorId, other.indicatorId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.indicatorId == null ? 43 : this.indicatorId.hashCode());
        return result;
    }
}
