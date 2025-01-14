/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Purge action for scheduled task. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PurgeAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PurgeAction extends Action {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Purge query string. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryString")
        private String queryString;

        /**
         * Purge query string.
         *
         * @param queryString the value to set
         * @return this builder
         */
        public Builder queryString(String queryString) {
            this.queryString = queryString;
            this.__explicitlySet__.add("queryString");
            return this;
        }
        /** the type of the log data to be purged */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private StorageDataType dataType;

        /**
         * the type of the log data to be purged
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(StorageDataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /**
         * The duration of data to be retained, which is used to calculate the timeDataEnded when
         * the task fires. The value should be negative. Purge duration in ISO 8601 extended format
         * as described in https://en.wikipedia.org/wiki/ISO_8601#Durations. The largest supported
         * unit is D, e.g. -P365D (not -P1Y) or -P14D (not -P2W).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("purgeDuration")
        private String purgeDuration;

        /**
         * The duration of data to be retained, which is used to calculate the timeDataEnded when
         * the task fires. The value should be negative. Purge duration in ISO 8601 extended format
         * as described in https://en.wikipedia.org/wiki/ISO_8601#Durations. The largest supported
         * unit is D, e.g. -P365D (not -P1Y) or -P14D (not -P2W).
         *
         * @param purgeDuration the value to set
         * @return this builder
         */
        public Builder purgeDuration(String purgeDuration) {
            this.purgeDuration = purgeDuration;
            this.__explicitlySet__.add("purgeDuration");
            return this;
        }
        /** the compartment OCID under which the data will be purged */
        @com.fasterxml.jackson.annotation.JsonProperty("purgeCompartmentId")
        private String purgeCompartmentId;

        /**
         * the compartment OCID under which the data will be purged
         *
         * @param purgeCompartmentId the value to set
         * @return this builder
         */
        public Builder purgeCompartmentId(String purgeCompartmentId) {
            this.purgeCompartmentId = purgeCompartmentId;
            this.__explicitlySet__.add("purgeCompartmentId");
            return this;
        }
        /** if true, purge child compartments data */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        /**
         * if true, purge child compartments data
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PurgeAction build() {
            PurgeAction model =
                    new PurgeAction(
                            this.queryString,
                            this.dataType,
                            this.purgeDuration,
                            this.purgeCompartmentId,
                            this.compartmentIdInSubtree);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PurgeAction model) {
            if (model.wasPropertyExplicitlySet("queryString")) {
                this.queryString(model.getQueryString());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("purgeDuration")) {
                this.purgeDuration(model.getPurgeDuration());
            }
            if (model.wasPropertyExplicitlySet("purgeCompartmentId")) {
                this.purgeCompartmentId(model.getPurgeCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentIdInSubtree")) {
                this.compartmentIdInSubtree(model.getCompartmentIdInSubtree());
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
    public PurgeAction(
            String queryString,
            StorageDataType dataType,
            String purgeDuration,
            String purgeCompartmentId,
            Boolean compartmentIdInSubtree) {
        super();
        this.queryString = queryString;
        this.dataType = dataType;
        this.purgeDuration = purgeDuration;
        this.purgeCompartmentId = purgeCompartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
    }

    /** Purge query string. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryString")
    private final String queryString;

    /**
     * Purge query string.
     *
     * @return the value
     */
    public String getQueryString() {
        return queryString;
    }

    /** the type of the log data to be purged */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final StorageDataType dataType;

    /**
     * the type of the log data to be purged
     *
     * @return the value
     */
    public StorageDataType getDataType() {
        return dataType;
    }

    /**
     * The duration of data to be retained, which is used to calculate the timeDataEnded when the
     * task fires. The value should be negative. Purge duration in ISO 8601 extended format as
     * described in https://en.wikipedia.org/wiki/ISO_8601#Durations. The largest supported unit is
     * D, e.g. -P365D (not -P1Y) or -P14D (not -P2W).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("purgeDuration")
    private final String purgeDuration;

    /**
     * The duration of data to be retained, which is used to calculate the timeDataEnded when the
     * task fires. The value should be negative. Purge duration in ISO 8601 extended format as
     * described in https://en.wikipedia.org/wiki/ISO_8601#Durations. The largest supported unit is
     * D, e.g. -P365D (not -P1Y) or -P14D (not -P2W).
     *
     * @return the value
     */
    public String getPurgeDuration() {
        return purgeDuration;
    }

    /** the compartment OCID under which the data will be purged */
    @com.fasterxml.jackson.annotation.JsonProperty("purgeCompartmentId")
    private final String purgeCompartmentId;

    /**
     * the compartment OCID under which the data will be purged
     *
     * @return the value
     */
    public String getPurgeCompartmentId() {
        return purgeCompartmentId;
    }

    /** if true, purge child compartments data */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    private final Boolean compartmentIdInSubtree;

    /**
     * if true, purge child compartments data
     *
     * @return the value
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
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
        sb.append("PurgeAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", queryString=").append(String.valueOf(this.queryString));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", purgeDuration=").append(String.valueOf(this.purgeDuration));
        sb.append(", purgeCompartmentId=").append(String.valueOf(this.purgeCompartmentId));
        sb.append(", compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PurgeAction)) {
            return false;
        }

        PurgeAction other = (PurgeAction) o;
        return java.util.Objects.equals(this.queryString, other.queryString)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.purgeDuration, other.purgeDuration)
                && java.util.Objects.equals(this.purgeCompartmentId, other.purgeCompartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.queryString == null ? 43 : this.queryString.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result =
                (result * PRIME)
                        + (this.purgeDuration == null ? 43 : this.purgeDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.purgeCompartmentId == null
                                ? 43
                                : this.purgeCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        return result;
    }
}
