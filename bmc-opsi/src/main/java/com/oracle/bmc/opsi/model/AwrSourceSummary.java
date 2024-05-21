/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of an AwrSource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwrSourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrSourceSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "awrHubId",
        "name",
        "awrSourceDatabaseId",
        "snapshotsUploaded",
        "minSnapshotIdentifier",
        "maxSnapshotIdentifier",
        "timeFirstSnapshotGenerated",
        "timeLastSnapshotGenerated",
        "hoursSinceLastImport"
    })
    public AwrSourceSummary(
            String awrHubId,
            String name,
            String awrSourceDatabaseId,
            java.math.BigDecimal snapshotsUploaded,
            java.math.BigDecimal minSnapshotIdentifier,
            java.math.BigDecimal maxSnapshotIdentifier,
            java.util.Date timeFirstSnapshotGenerated,
            java.util.Date timeLastSnapshotGenerated,
            Double hoursSinceLastImport) {
        super();
        this.awrHubId = awrHubId;
        this.name = name;
        this.awrSourceDatabaseId = awrSourceDatabaseId;
        this.snapshotsUploaded = snapshotsUploaded;
        this.minSnapshotIdentifier = minSnapshotIdentifier;
        this.maxSnapshotIdentifier = maxSnapshotIdentifier;
        this.timeFirstSnapshotGenerated = timeFirstSnapshotGenerated;
        this.timeLastSnapshotGenerated = timeLastSnapshotGenerated;
        this.hoursSinceLastImport = hoursSinceLastImport;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * AWR Hub OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("awrHubId")
        private String awrHubId;

        /**
         * AWR Hub OCID
         * @param awrHubId the value to set
         * @return this builder
         **/
        public Builder awrHubId(String awrHubId) {
            this.awrHubId = awrHubId;
            this.__explicitlySet__.add("awrHubId");
            return this;
        }
        /**
         * Database name of the Source database for which AWR Data will be uploaded to AWR Hub.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Database name of the Source database for which AWR Data will be uploaded to AWR Hub.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
        private String awrSourceDatabaseId;

        /**
         * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
         * @param awrSourceDatabaseId the value to set
         * @return this builder
         **/
        public Builder awrSourceDatabaseId(String awrSourceDatabaseId) {
            this.awrSourceDatabaseId = awrSourceDatabaseId;
            this.__explicitlySet__.add("awrSourceDatabaseId");
            return this;
        }
        /**
         * Number of AWR snapshots uploaded from the Source database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotsUploaded")
        private java.math.BigDecimal snapshotsUploaded;

        /**
         * Number of AWR snapshots uploaded from the Source database.
         * @param snapshotsUploaded the value to set
         * @return this builder
         **/
        public Builder snapshotsUploaded(java.math.BigDecimal snapshotsUploaded) {
            this.snapshotsUploaded = snapshotsUploaded;
            this.__explicitlySet__.add("snapshotsUploaded");
            return this;
        }
        /**
         * The minimum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minSnapshotIdentifier")
        private java.math.BigDecimal minSnapshotIdentifier;

        /**
         * The minimum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
         * @param minSnapshotIdentifier the value to set
         * @return this builder
         **/
        public Builder minSnapshotIdentifier(java.math.BigDecimal minSnapshotIdentifier) {
            this.minSnapshotIdentifier = minSnapshotIdentifier;
            this.__explicitlySet__.add("minSnapshotIdentifier");
            return this;
        }
        /**
         * The maximum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxSnapshotIdentifier")
        private java.math.BigDecimal maxSnapshotIdentifier;

        /**
         * The maximum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
         * @param maxSnapshotIdentifier the value to set
         * @return this builder
         **/
        public Builder maxSnapshotIdentifier(java.math.BigDecimal maxSnapshotIdentifier) {
            this.maxSnapshotIdentifier = maxSnapshotIdentifier;
            this.__explicitlySet__.add("maxSnapshotIdentifier");
            return this;
        }
        /**
         * The time at which the earliest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotGenerated")
        private java.util.Date timeFirstSnapshotGenerated;

        /**
         * The time at which the earliest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
         * @param timeFirstSnapshotGenerated the value to set
         * @return this builder
         **/
        public Builder timeFirstSnapshotGenerated(java.util.Date timeFirstSnapshotGenerated) {
            this.timeFirstSnapshotGenerated = timeFirstSnapshotGenerated;
            this.__explicitlySet__.add("timeFirstSnapshotGenerated");
            return this;
        }
        /**
         * The time at which the latest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSnapshotGenerated")
        private java.util.Date timeLastSnapshotGenerated;

        /**
         * The time at which the latest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
         * @param timeLastSnapshotGenerated the value to set
         * @return this builder
         **/
        public Builder timeLastSnapshotGenerated(java.util.Date timeLastSnapshotGenerated) {
            this.timeLastSnapshotGenerated = timeLastSnapshotGenerated;
            this.__explicitlySet__.add("timeLastSnapshotGenerated");
            return this;
        }
        /**
         * Number of hours since last AWR snapshots import happened from the Source database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hoursSinceLastImport")
        private Double hoursSinceLastImport;

        /**
         * Number of hours since last AWR snapshots import happened from the Source database.
         * @param hoursSinceLastImport the value to set
         * @return this builder
         **/
        public Builder hoursSinceLastImport(Double hoursSinceLastImport) {
            this.hoursSinceLastImport = hoursSinceLastImport;
            this.__explicitlySet__.add("hoursSinceLastImport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrSourceSummary build() {
            AwrSourceSummary model =
                    new AwrSourceSummary(
                            this.awrHubId,
                            this.name,
                            this.awrSourceDatabaseId,
                            this.snapshotsUploaded,
                            this.minSnapshotIdentifier,
                            this.maxSnapshotIdentifier,
                            this.timeFirstSnapshotGenerated,
                            this.timeLastSnapshotGenerated,
                            this.hoursSinceLastImport);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrSourceSummary model) {
            if (model.wasPropertyExplicitlySet("awrHubId")) {
                this.awrHubId(model.getAwrHubId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("awrSourceDatabaseId")) {
                this.awrSourceDatabaseId(model.getAwrSourceDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("snapshotsUploaded")) {
                this.snapshotsUploaded(model.getSnapshotsUploaded());
            }
            if (model.wasPropertyExplicitlySet("minSnapshotIdentifier")) {
                this.minSnapshotIdentifier(model.getMinSnapshotIdentifier());
            }
            if (model.wasPropertyExplicitlySet("maxSnapshotIdentifier")) {
                this.maxSnapshotIdentifier(model.getMaxSnapshotIdentifier());
            }
            if (model.wasPropertyExplicitlySet("timeFirstSnapshotGenerated")) {
                this.timeFirstSnapshotGenerated(model.getTimeFirstSnapshotGenerated());
            }
            if (model.wasPropertyExplicitlySet("timeLastSnapshotGenerated")) {
                this.timeLastSnapshotGenerated(model.getTimeLastSnapshotGenerated());
            }
            if (model.wasPropertyExplicitlySet("hoursSinceLastImport")) {
                this.hoursSinceLastImport(model.getHoursSinceLastImport());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * AWR Hub OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrHubId")
    private final String awrHubId;

    /**
     * AWR Hub OCID
     * @return the value
     **/
    public String getAwrHubId() {
        return awrHubId;
    }

    /**
     * Database name of the Source database for which AWR Data will be uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Database name of the Source database for which AWR Data will be uploaded to AWR Hub.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
    private final String awrSourceDatabaseId;

    /**
     * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
     * @return the value
     **/
    public String getAwrSourceDatabaseId() {
        return awrSourceDatabaseId;
    }

    /**
     * Number of AWR snapshots uploaded from the Source database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotsUploaded")
    private final java.math.BigDecimal snapshotsUploaded;

    /**
     * Number of AWR snapshots uploaded from the Source database.
     * @return the value
     **/
    public java.math.BigDecimal getSnapshotsUploaded() {
        return snapshotsUploaded;
    }

    /**
     * The minimum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minSnapshotIdentifier")
    private final java.math.BigDecimal minSnapshotIdentifier;

    /**
     * The minimum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     * @return the value
     **/
    public java.math.BigDecimal getMinSnapshotIdentifier() {
        return minSnapshotIdentifier;
    }

    /**
     * The maximum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSnapshotIdentifier")
    private final java.math.BigDecimal maxSnapshotIdentifier;

    /**
     * The maximum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     * @return the value
     **/
    public java.math.BigDecimal getMaxSnapshotIdentifier() {
        return maxSnapshotIdentifier;
    }

    /**
     * The time at which the earliest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotGenerated")
    private final java.util.Date timeFirstSnapshotGenerated;

    /**
     * The time at which the earliest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeFirstSnapshotGenerated() {
        return timeFirstSnapshotGenerated;
    }

    /**
     * The time at which the latest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSnapshotGenerated")
    private final java.util.Date timeLastSnapshotGenerated;

    /**
     * The time at which the latest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeLastSnapshotGenerated() {
        return timeLastSnapshotGenerated;
    }

    /**
     * Number of hours since last AWR snapshots import happened from the Source database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hoursSinceLastImport")
    private final Double hoursSinceLastImport;

    /**
     * Number of hours since last AWR snapshots import happened from the Source database.
     * @return the value
     **/
    public Double getHoursSinceLastImport() {
        return hoursSinceLastImport;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AwrSourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("awrHubId=").append(String.valueOf(this.awrHubId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", awrSourceDatabaseId=").append(String.valueOf(this.awrSourceDatabaseId));
        sb.append(", snapshotsUploaded=").append(String.valueOf(this.snapshotsUploaded));
        sb.append(", minSnapshotIdentifier=").append(String.valueOf(this.minSnapshotIdentifier));
        sb.append(", maxSnapshotIdentifier=").append(String.valueOf(this.maxSnapshotIdentifier));
        sb.append(", timeFirstSnapshotGenerated=")
                .append(String.valueOf(this.timeFirstSnapshotGenerated));
        sb.append(", timeLastSnapshotGenerated=")
                .append(String.valueOf(this.timeLastSnapshotGenerated));
        sb.append(", hoursSinceLastImport=").append(String.valueOf(this.hoursSinceLastImport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrSourceSummary)) {
            return false;
        }

        AwrSourceSummary other = (AwrSourceSummary) o;
        return java.util.Objects.equals(this.awrHubId, other.awrHubId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.awrSourceDatabaseId, other.awrSourceDatabaseId)
                && java.util.Objects.equals(this.snapshotsUploaded, other.snapshotsUploaded)
                && java.util.Objects.equals(this.minSnapshotIdentifier, other.minSnapshotIdentifier)
                && java.util.Objects.equals(this.maxSnapshotIdentifier, other.maxSnapshotIdentifier)
                && java.util.Objects.equals(
                        this.timeFirstSnapshotGenerated, other.timeFirstSnapshotGenerated)
                && java.util.Objects.equals(
                        this.timeLastSnapshotGenerated, other.timeLastSnapshotGenerated)
                && java.util.Objects.equals(this.hoursSinceLastImport, other.hoursSinceLastImport)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.awrHubId == null ? 43 : this.awrHubId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.awrSourceDatabaseId == null
                                ? 43
                                : this.awrSourceDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotsUploaded == null ? 43 : this.snapshotsUploaded.hashCode());
        result =
                (result * PRIME)
                        + (this.minSnapshotIdentifier == null
                                ? 43
                                : this.minSnapshotIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.maxSnapshotIdentifier == null
                                ? 43
                                : this.maxSnapshotIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstSnapshotGenerated == null
                                ? 43
                                : this.timeFirstSnapshotGenerated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSnapshotGenerated == null
                                ? 43
                                : this.timeLastSnapshotGenerated.hashCode());
        result =
                (result * PRIME)
                        + (this.hoursSinceLastImport == null
                                ? 43
                                : this.hoursSinceLastImport.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
