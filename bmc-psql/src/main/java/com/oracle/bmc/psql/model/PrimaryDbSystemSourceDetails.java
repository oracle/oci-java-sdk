/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Details of the primary database system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PrimaryDbSystemSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrimaryDbSystemSourceDetails extends SourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The [OCID] of the primary database system. */
        @com.fasterxml.jackson.annotation.JsonProperty("primaryDbSystemId")
        private String primaryDbSystemId;

        /**
         * The [OCID] of the primary database system.
         *
         * @param primaryDbSystemId the value to set
         * @return this builder
         */
        public Builder primaryDbSystemId(String primaryDbSystemId) {
            this.primaryDbSystemId = primaryDbSystemId;
            this.__explicitlySet__.add("primaryDbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrimaryDbSystemSourceDetails build() {
            PrimaryDbSystemSourceDetails model =
                    new PrimaryDbSystemSourceDetails(this.primaryDbSystemId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrimaryDbSystemSourceDetails model) {
            if (model.wasPropertyExplicitlySet("primaryDbSystemId")) {
                this.primaryDbSystemId(model.getPrimaryDbSystemId());
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
    public PrimaryDbSystemSourceDetails(String primaryDbSystemId) {
        super();
        this.primaryDbSystemId = primaryDbSystemId;
    }

    /** The [OCID] of the primary database system. */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryDbSystemId")
    private final String primaryDbSystemId;

    /**
     * The [OCID] of the primary database system.
     *
     * @return the value
     */
    public String getPrimaryDbSystemId() {
        return primaryDbSystemId;
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
        sb.append("PrimaryDbSystemSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", primaryDbSystemId=").append(String.valueOf(this.primaryDbSystemId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrimaryDbSystemSourceDetails)) {
            return false;
        }

        PrimaryDbSystemSourceDetails other = (PrimaryDbSystemSourceDetails) o;
        return java.util.Objects.equals(this.primaryDbSystemId, other.primaryDbSystemId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.primaryDbSystemId == null ? 43 : this.primaryDbSystemId.hashCode());
        return result;
    }
}
