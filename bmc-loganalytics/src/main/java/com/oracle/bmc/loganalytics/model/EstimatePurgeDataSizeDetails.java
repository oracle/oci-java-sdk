/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the input used to estimate the size of data that might be purged <br>
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
        builder = EstimatePurgeDataSizeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EstimatePurgeDataSizeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "compartmentIdInSubtree",
        "timeDataEnded",
        "purgeQueryString",
        "dataType"
    })
    public EstimatePurgeDataSizeDetails(
            String compartmentId,
            Boolean compartmentIdInSubtree,
            java.util.Date timeDataEnded,
            String purgeQueryString,
            StorageDataType dataType) {
        super();
        this.compartmentId = compartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.timeDataEnded = timeDataEnded;
        this.purgeQueryString = purgeQueryString;
        this.dataType = dataType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the compartment OCID under which the data will be purged */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * This is the compartment OCID under which the data will be purged
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** If true, purge child compartments data */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        /**
         * If true, purge child compartments data
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }
        /** This is the time before which data will be purged */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        /**
         * This is the time before which data will be purged
         *
         * @param timeDataEnded the value to set
         * @return this builder
         */
        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }
        /** This is the solr data filter query, '*' means all */
        @com.fasterxml.jackson.annotation.JsonProperty("purgeQueryString")
        private String purgeQueryString;

        /**
         * This is the solr data filter query, '*' means all
         *
         * @param purgeQueryString the value to set
         * @return this builder
         */
        public Builder purgeQueryString(String purgeQueryString) {
            this.purgeQueryString = purgeQueryString;
            this.__explicitlySet__.add("purgeQueryString");
            return this;
        }
        /** This is the type of the log data to be purged */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private StorageDataType dataType;

        /**
         * This is the type of the log data to be purged
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(StorageDataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EstimatePurgeDataSizeDetails build() {
            EstimatePurgeDataSizeDetails model =
                    new EstimatePurgeDataSizeDetails(
                            this.compartmentId,
                            this.compartmentIdInSubtree,
                            this.timeDataEnded,
                            this.purgeQueryString,
                            this.dataType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EstimatePurgeDataSizeDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentIdInSubtree")) {
                this.compartmentIdInSubtree(model.getCompartmentIdInSubtree());
            }
            if (model.wasPropertyExplicitlySet("timeDataEnded")) {
                this.timeDataEnded(model.getTimeDataEnded());
            }
            if (model.wasPropertyExplicitlySet("purgeQueryString")) {
                this.purgeQueryString(model.getPurgeQueryString());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
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

    /** This is the compartment OCID under which the data will be purged */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * This is the compartment OCID under which the data will be purged
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** If true, purge child compartments data */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    private final Boolean compartmentIdInSubtree;

    /**
     * If true, purge child compartments data
     *
     * @return the value
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    /** This is the time before which data will be purged */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    private final java.util.Date timeDataEnded;

    /**
     * This is the time before which data will be purged
     *
     * @return the value
     */
    public java.util.Date getTimeDataEnded() {
        return timeDataEnded;
    }

    /** This is the solr data filter query, '*' means all */
    @com.fasterxml.jackson.annotation.JsonProperty("purgeQueryString")
    private final String purgeQueryString;

    /**
     * This is the solr data filter query, '*' means all
     *
     * @return the value
     */
    public String getPurgeQueryString() {
        return purgeQueryString;
    }

    /** This is the type of the log data to be purged */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final StorageDataType dataType;

    /**
     * This is the type of the log data to be purged
     *
     * @return the value
     */
    public StorageDataType getDataType() {
        return dataType;
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
        sb.append("EstimatePurgeDataSizeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(", timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(", purgeQueryString=").append(String.valueOf(this.purgeQueryString));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EstimatePurgeDataSizeDetails)) {
            return false;
        }

        EstimatePurgeDataSizeDetails other = (EstimatePurgeDataSizeDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.timeDataEnded, other.timeDataEnded)
                && java.util.Objects.equals(this.purgeQueryString, other.purgeQueryString)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataEnded == null ? 43 : this.timeDataEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.purgeQueryString == null ? 43 : this.purgeQueryString.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
