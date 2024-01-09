/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details of the dependent object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DependentObjectSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DependentObjectSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "createdBy",
        "createdByName",
        "updatedBy",
        "updatedByName",
        "timeCreated",
        "timeUpdated",
        "aggregatorKey",
        "aggregator",
        "identifierPath",
        "infoFields",
        "registryVersion",
        "labels",
        "isFavorite",
        "countStatistics"
    })
    public DependentObjectSummary(
            String createdBy,
            String createdByName,
            String updatedBy,
            String updatedByName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String aggregatorKey,
            AggregatorSummary aggregator,
            String identifierPath,
            java.util.Map<String, String> infoFields,
            Integer registryVersion,
            java.util.List<String> labels,
            Boolean isFavorite,
            CountStatistic countStatistics) {
        super();
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.updatedBy = updatedBy;
        this.updatedByName = updatedByName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.aggregatorKey = aggregatorKey;
        this.aggregator = aggregator;
        this.identifierPath = identifierPath;
        this.infoFields = infoFields;
        this.registryVersion = registryVersion;
        this.labels = labels;
        this.isFavorite = isFavorite;
        this.countStatistics = countStatistics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The user that created the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The user that created the object.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /** The user that created the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
        private String createdByName;

        /**
         * The user that created the object.
         *
         * @param createdByName the value to set
         * @return this builder
         */
        public Builder createdByName(String createdByName) {
            this.createdByName = createdByName;
            this.__explicitlySet__.add("createdByName");
            return this;
        }
        /** The user that updated the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        /**
         * The user that updated the object.
         *
         * @param updatedBy the value to set
         * @return this builder
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }
        /** The user that updated the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
        private String updatedByName;

        /**
         * The user that updated the object.
         *
         * @param updatedByName the value to set
         * @return this builder
         */
        public Builder updatedByName(String updatedByName) {
            this.updatedByName = updatedByName;
            this.__explicitlySet__.add("updatedByName");
            return this;
        }
        /** The date and time that the object was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the object was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time that the object was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time that the object was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The owning object key for this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
        private String aggregatorKey;

        /**
         * The owning object key for this object.
         *
         * @param aggregatorKey the value to set
         * @return this builder
         */
        public Builder aggregatorKey(String aggregatorKey) {
            this.aggregatorKey = aggregatorKey;
            this.__explicitlySet__.add("aggregatorKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("aggregator")
        private AggregatorSummary aggregator;

        public Builder aggregator(AggregatorSummary aggregator) {
            this.aggregator = aggregator;
            this.__explicitlySet__.add("aggregator");
            return this;
        }
        /** The full path to identify this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("identifierPath")
        private String identifierPath;

        /**
         * The full path to identify this object.
         *
         * @param identifierPath the value to set
         * @return this builder
         */
        public Builder identifierPath(String identifierPath) {
            this.identifierPath = identifierPath;
            this.__explicitlySet__.add("identifierPath");
            return this;
        }
        /** Information property fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("infoFields")
        private java.util.Map<String, String> infoFields;

        /**
         * Information property fields.
         *
         * @param infoFields the value to set
         * @return this builder
         */
        public Builder infoFields(java.util.Map<String, String> infoFields) {
            this.infoFields = infoFields;
            this.__explicitlySet__.add("infoFields");
            return this;
        }
        /** The registry version of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("registryVersion")
        private Integer registryVersion;

        /**
         * The registry version of the object.
         *
         * @param registryVersion the value to set
         * @return this builder
         */
        public Builder registryVersion(Integer registryVersion) {
            this.registryVersion = registryVersion;
            this.__explicitlySet__.add("registryVersion");
            return this;
        }
        /**
         * Labels are keywords or tags that you can add to data assets, dataflows and so on. You can
         * define your own labels and use them to categorize content.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * Labels are keywords or tags that you can add to data assets, dataflows and so on. You can
         * define your own labels and use them to categorize content.
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }
        /** Specifies whether this object is a favorite or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
        private Boolean isFavorite;

        /**
         * Specifies whether this object is a favorite or not.
         *
         * @param isFavorite the value to set
         * @return this builder
         */
        public Builder isFavorite(Boolean isFavorite) {
            this.isFavorite = isFavorite;
            this.__explicitlySet__.add("isFavorite");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countStatistics")
        private CountStatistic countStatistics;

        public Builder countStatistics(CountStatistic countStatistics) {
            this.countStatistics = countStatistics;
            this.__explicitlySet__.add("countStatistics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DependentObjectSummary build() {
            DependentObjectSummary model =
                    new DependentObjectSummary(
                            this.createdBy,
                            this.createdByName,
                            this.updatedBy,
                            this.updatedByName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.aggregatorKey,
                            this.aggregator,
                            this.identifierPath,
                            this.infoFields,
                            this.registryVersion,
                            this.labels,
                            this.isFavorite,
                            this.countStatistics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DependentObjectSummary model) {
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("createdByName")) {
                this.createdByName(model.getCreatedByName());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("updatedByName")) {
                this.updatedByName(model.getUpdatedByName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("aggregatorKey")) {
                this.aggregatorKey(model.getAggregatorKey());
            }
            if (model.wasPropertyExplicitlySet("aggregator")) {
                this.aggregator(model.getAggregator());
            }
            if (model.wasPropertyExplicitlySet("identifierPath")) {
                this.identifierPath(model.getIdentifierPath());
            }
            if (model.wasPropertyExplicitlySet("infoFields")) {
                this.infoFields(model.getInfoFields());
            }
            if (model.wasPropertyExplicitlySet("registryVersion")) {
                this.registryVersion(model.getRegistryVersion());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
            }
            if (model.wasPropertyExplicitlySet("isFavorite")) {
                this.isFavorite(model.getIsFavorite());
            }
            if (model.wasPropertyExplicitlySet("countStatistics")) {
                this.countStatistics(model.getCountStatistics());
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

    /** The user that created the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The user that created the object.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /** The user that created the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    private final String createdByName;

    /**
     * The user that created the object.
     *
     * @return the value
     */
    public String getCreatedByName() {
        return createdByName;
    }

    /** The user that updated the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

    /**
     * The user that updated the object.
     *
     * @return the value
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /** The user that updated the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
    private final String updatedByName;

    /**
     * The user that updated the object.
     *
     * @return the value
     */
    public String getUpdatedByName() {
        return updatedByName;
    }

    /** The date and time that the object was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the object was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time that the object was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time that the object was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The owning object key for this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
    private final String aggregatorKey;

    /**
     * The owning object key for this object.
     *
     * @return the value
     */
    public String getAggregatorKey() {
        return aggregatorKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("aggregator")
    private final AggregatorSummary aggregator;

    public AggregatorSummary getAggregator() {
        return aggregator;
    }

    /** The full path to identify this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("identifierPath")
    private final String identifierPath;

    /**
     * The full path to identify this object.
     *
     * @return the value
     */
    public String getIdentifierPath() {
        return identifierPath;
    }

    /** Information property fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("infoFields")
    private final java.util.Map<String, String> infoFields;

    /**
     * Information property fields.
     *
     * @return the value
     */
    public java.util.Map<String, String> getInfoFields() {
        return infoFields;
    }

    /** The registry version of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("registryVersion")
    private final Integer registryVersion;

    /**
     * The registry version of the object.
     *
     * @return the value
     */
    public Integer getRegistryVersion() {
        return registryVersion;
    }

    /**
     * Labels are keywords or tags that you can add to data assets, dataflows and so on. You can
     * define your own labels and use them to categorize content.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * Labels are keywords or tags that you can add to data assets, dataflows and so on. You can
     * define your own labels and use them to categorize content.
     *
     * @return the value
     */
    public java.util.List<String> getLabels() {
        return labels;
    }

    /** Specifies whether this object is a favorite or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
    private final Boolean isFavorite;

    /**
     * Specifies whether this object is a favorite or not.
     *
     * @return the value
     */
    public Boolean getIsFavorite() {
        return isFavorite;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("countStatistics")
    private final CountStatistic countStatistics;

    public CountStatistic getCountStatistics() {
        return countStatistics;
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
        sb.append("DependentObjectSummary(");
        sb.append("super=").append(super.toString());
        sb.append("createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", updatedByName=").append(String.valueOf(this.updatedByName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", aggregatorKey=").append(String.valueOf(this.aggregatorKey));
        sb.append(", aggregator=").append(String.valueOf(this.aggregator));
        sb.append(", identifierPath=").append(String.valueOf(this.identifierPath));
        sb.append(", infoFields=").append(String.valueOf(this.infoFields));
        sb.append(", registryVersion=").append(String.valueOf(this.registryVersion));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", isFavorite=").append(String.valueOf(this.isFavorite));
        sb.append(", countStatistics=").append(String.valueOf(this.countStatistics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DependentObjectSummary)) {
            return false;
        }

        DependentObjectSummary other = (DependentObjectSummary) o;
        return java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.createdByName, other.createdByName)
                && java.util.Objects.equals(this.updatedBy, other.updatedBy)
                && java.util.Objects.equals(this.updatedByName, other.updatedByName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.aggregatorKey, other.aggregatorKey)
                && java.util.Objects.equals(this.aggregator, other.aggregator)
                && java.util.Objects.equals(this.identifierPath, other.identifierPath)
                && java.util.Objects.equals(this.infoFields, other.infoFields)
                && java.util.Objects.equals(this.registryVersion, other.registryVersion)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.isFavorite, other.isFavorite)
                && java.util.Objects.equals(this.countStatistics, other.countStatistics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.updatedByName == null ? 43 : this.updatedByName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregatorKey == null ? 43 : this.aggregatorKey.hashCode());
        result = (result * PRIME) + (this.aggregator == null ? 43 : this.aggregator.hashCode());
        result =
                (result * PRIME)
                        + (this.identifierPath == null ? 43 : this.identifierPath.hashCode());
        result = (result * PRIME) + (this.infoFields == null ? 43 : this.infoFields.hashCode());
        result =
                (result * PRIME)
                        + (this.registryVersion == null ? 43 : this.registryVersion.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result = (result * PRIME) + (this.isFavorite == null ? 43 : this.isFavorite.hashCode());
        result =
                (result * PRIME)
                        + (this.countStatistics == null ? 43 : this.countStatistics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
