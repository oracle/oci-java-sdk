/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Additional details specific to insight type DataSource. <br>
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
        builder = InsightTypeLoggingQueryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "loggingQueryType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InsightTypeLoggingQueryDetails extends LoggingQueryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The key entities count used for data source query */
        @com.fasterxml.jackson.annotation.JsonProperty("keyEntitiesCount")
        private Integer keyEntitiesCount;

        /**
         * The key entities count used for data source query
         *
         * @param keyEntitiesCount the value to set
         * @return this builder
         */
        public Builder keyEntitiesCount(Integer keyEntitiesCount) {
            this.keyEntitiesCount = keyEntitiesCount;
            this.__explicitlySet__.add("keyEntitiesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InsightTypeLoggingQueryDetails build() {
            InsightTypeLoggingQueryDetails model =
                    new InsightTypeLoggingQueryDetails(this.keyEntitiesCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InsightTypeLoggingQueryDetails model) {
            if (model.wasPropertyExplicitlySet("keyEntitiesCount")) {
                this.keyEntitiesCount(model.getKeyEntitiesCount());
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
    public InsightTypeLoggingQueryDetails(Integer keyEntitiesCount) {
        super();
        this.keyEntitiesCount = keyEntitiesCount;
    }

    /** The key entities count used for data source query */
    @com.fasterxml.jackson.annotation.JsonProperty("keyEntitiesCount")
    private final Integer keyEntitiesCount;

    /**
     * The key entities count used for data source query
     *
     * @return the value
     */
    public Integer getKeyEntitiesCount() {
        return keyEntitiesCount;
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
        sb.append("InsightTypeLoggingQueryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", keyEntitiesCount=").append(String.valueOf(this.keyEntitiesCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InsightTypeLoggingQueryDetails)) {
            return false;
        }

        InsightTypeLoggingQueryDetails other = (InsightTypeLoggingQueryDetails) o;
        return java.util.Objects.equals(this.keyEntitiesCount, other.keyEntitiesCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.keyEntitiesCount == null ? 43 : this.keyEntitiesCount.hashCode());
        return result;
    }
}
