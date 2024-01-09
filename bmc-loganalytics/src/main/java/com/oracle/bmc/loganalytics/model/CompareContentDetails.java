/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The two strings to compare. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CompareContentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CompareContentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"content1", "content2"})
    public CompareContentDetails(String content1, String content2) {
        super();
        this.content1 = content1;
        this.content2 = content2;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The first of two strings to compare. */
        @com.fasterxml.jackson.annotation.JsonProperty("content1")
        private String content1;

        /**
         * The first of two strings to compare.
         *
         * @param content1 the value to set
         * @return this builder
         */
        public Builder content1(String content1) {
            this.content1 = content1;
            this.__explicitlySet__.add("content1");
            return this;
        }
        /** The second of two strings to compare. */
        @com.fasterxml.jackson.annotation.JsonProperty("content2")
        private String content2;

        /**
         * The second of two strings to compare.
         *
         * @param content2 the value to set
         * @return this builder
         */
        public Builder content2(String content2) {
            this.content2 = content2;
            this.__explicitlySet__.add("content2");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompareContentDetails build() {
            CompareContentDetails model = new CompareContentDetails(this.content1, this.content2);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompareContentDetails model) {
            if (model.wasPropertyExplicitlySet("content1")) {
                this.content1(model.getContent1());
            }
            if (model.wasPropertyExplicitlySet("content2")) {
                this.content2(model.getContent2());
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

    /** The first of two strings to compare. */
    @com.fasterxml.jackson.annotation.JsonProperty("content1")
    private final String content1;

    /**
     * The first of two strings to compare.
     *
     * @return the value
     */
    public String getContent1() {
        return content1;
    }

    /** The second of two strings to compare. */
    @com.fasterxml.jackson.annotation.JsonProperty("content2")
    private final String content2;

    /**
     * The second of two strings to compare.
     *
     * @return the value
     */
    public String getContent2() {
        return content2;
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
        sb.append("CompareContentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("content1=").append(String.valueOf(this.content1));
        sb.append(", content2=").append(String.valueOf(this.content2));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompareContentDetails)) {
            return false;
        }

        CompareContentDetails other = (CompareContentDetails) o;
        return java.util.Objects.equals(this.content1, other.content1)
                && java.util.Objects.equals(this.content2, other.content2)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.content1 == null ? 43 : this.content1.hashCode());
        result = (result * PRIME) + (this.content2 == null ? 43 : this.content2.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
