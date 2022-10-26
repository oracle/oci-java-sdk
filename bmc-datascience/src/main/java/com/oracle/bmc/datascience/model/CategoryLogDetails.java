/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The log details for each category. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CategoryLogDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CategoryLogDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"access", "predict"})
    public CategoryLogDetails(LogDetails access, LogDetails predict) {
        super();
        this.access = access;
        this.predict = predict;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("access")
        private LogDetails access;

        public Builder access(LogDetails access) {
            this.access = access;
            this.__explicitlySet__.add("access");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("predict")
        private LogDetails predict;

        public Builder predict(LogDetails predict) {
            this.predict = predict;
            this.__explicitlySet__.add("predict");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CategoryLogDetails build() {
            CategoryLogDetails model = new CategoryLogDetails(this.access, this.predict);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CategoryLogDetails model) {
            if (model.wasPropertyExplicitlySet("access")) {
                this.access(model.getAccess());
            }
            if (model.wasPropertyExplicitlySet("predict")) {
                this.predict(model.getPredict());
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

    @com.fasterxml.jackson.annotation.JsonProperty("access")
    private final LogDetails access;

    public LogDetails getAccess() {
        return access;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("predict")
    private final LogDetails predict;

    public LogDetails getPredict() {
        return predict;
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
        sb.append("CategoryLogDetails(");
        sb.append("super=").append(super.toString());
        sb.append("access=").append(String.valueOf(this.access));
        sb.append(", predict=").append(String.valueOf(this.predict));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CategoryLogDetails)) {
            return false;
        }

        CategoryLogDetails other = (CategoryLogDetails) o;
        return java.util.Objects.equals(this.access, other.access)
                && java.util.Objects.equals(this.predict, other.predict)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.access == null ? 43 : this.access.hashCode());
        result = (result * PRIME) + (this.predict == null ? 43 : this.predict.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
