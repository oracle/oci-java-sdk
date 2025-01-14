/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the synchronous result of a recall of archived data <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RecalledDataInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecalledDataInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"collectionName", "purpose"})
    public RecalledDataInfo(String collectionName, String purpose) {
        super();
        this.collectionName = collectionName;
        this.purpose = purpose;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the parent name of the list of overlapping recalls */
        @com.fasterxml.jackson.annotation.JsonProperty("collectionName")
        private String collectionName;

        /**
         * This is the parent name of the list of overlapping recalls
         *
         * @param collectionName the value to set
         * @return this builder
         */
        public Builder collectionName(String collectionName) {
            this.collectionName = collectionName;
            this.__explicitlySet__.add("collectionName");
            return this;
        }
        /** This is the recall name made for a specific purpose */
        @com.fasterxml.jackson.annotation.JsonProperty("purpose")
        private String purpose;

        /**
         * This is the recall name made for a specific purpose
         *
         * @param purpose the value to set
         * @return this builder
         */
        public Builder purpose(String purpose) {
            this.purpose = purpose;
            this.__explicitlySet__.add("purpose");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecalledDataInfo build() {
            RecalledDataInfo model = new RecalledDataInfo(this.collectionName, this.purpose);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecalledDataInfo model) {
            if (model.wasPropertyExplicitlySet("collectionName")) {
                this.collectionName(model.getCollectionName());
            }
            if (model.wasPropertyExplicitlySet("purpose")) {
                this.purpose(model.getPurpose());
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

    /** This is the parent name of the list of overlapping recalls */
    @com.fasterxml.jackson.annotation.JsonProperty("collectionName")
    private final String collectionName;

    /**
     * This is the parent name of the list of overlapping recalls
     *
     * @return the value
     */
    public String getCollectionName() {
        return collectionName;
    }

    /** This is the recall name made for a specific purpose */
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    private final String purpose;

    /**
     * This is the recall name made for a specific purpose
     *
     * @return the value
     */
    public String getPurpose() {
        return purpose;
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
        sb.append("RecalledDataInfo(");
        sb.append("super=").append(super.toString());
        sb.append("collectionName=").append(String.valueOf(this.collectionName));
        sb.append(", purpose=").append(String.valueOf(this.purpose));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecalledDataInfo)) {
            return false;
        }

        RecalledDataInfo other = (RecalledDataInfo) o;
        return java.util.Objects.equals(this.collectionName, other.collectionName)
                && java.util.Objects.equals(this.purpose, other.purpose)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.collectionName == null ? 43 : this.collectionName.hashCode());
        result = (result * PRIME) + (this.purpose == null ? 43 : this.purpose.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
