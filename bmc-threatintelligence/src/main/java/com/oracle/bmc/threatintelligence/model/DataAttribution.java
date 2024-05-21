/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.model;

/**
 * The confidence, source information, and visibility for a particular sighting or observation of some data associated with a threat indicator. This associated data can be the indicator's threat type, attribute, or relationship.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataAttribution.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataAttribution extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "confidence",
        "source",
        "visibility",
        "timeFirstSeen",
        "timeLastSeen"
    })
    public DataAttribution(
            Integer confidence,
            IndicatorSourceSummary source,
            DataVisibility visibility,
            java.util.Date timeFirstSeen,
            java.util.Date timeLastSeen) {
        super();
        this.confidence = confidence;
        this.source = source;
        this.visibility = visibility;
        this.timeFirstSeen = timeFirstSeen;
        this.timeLastSeen = timeLastSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An integer from 0 to 100 that provides a measure of our certainty in the maliciousness of data attributed to an indicator. For example, if the source of the data being attributed is the Tor Project, our confidence that the associated indicator is a tor exit node would be 100.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Integer confidence;

        /**
         * An integer from 0 to 100 that provides a measure of our certainty in the maliciousness of data attributed to an indicator. For example, if the source of the data being attributed is the Tor Project, our confidence that the associated indicator is a tor exit node would be 100.
         * @param confidence the value to set
         * @return this builder
         **/
        public Builder confidence(Integer confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private IndicatorSourceSummary source;

        public Builder source(IndicatorSourceSummary source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("visibility")
        private DataVisibility visibility;

        public Builder visibility(DataVisibility visibility) {
            this.visibility = visibility;
            this.__explicitlySet__.add("visibility");
            return this;
        }
        /**
         * The date and time the attribution data was first seen for this entity. If the data source does not provide this information, it is set to the last time it was seen. An RFC3339 formatted string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
        private java.util.Date timeFirstSeen;

        /**
         * The date and time the attribution data was first seen for this entity. If the data source does not provide this information, it is set to the last time it was seen. An RFC3339 formatted string.
         * @param timeFirstSeen the value to set
         * @return this builder
         **/
        public Builder timeFirstSeen(java.util.Date timeFirstSeen) {
            this.timeFirstSeen = timeFirstSeen;
            this.__explicitlySet__.add("timeFirstSeen");
            return this;
        }
        /**
         * The last date and time the attribution data was seen for this entity. An RFC3339 formatted string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
        private java.util.Date timeLastSeen;

        /**
         * The last date and time the attribution data was seen for this entity. An RFC3339 formatted string.
         * @param timeLastSeen the value to set
         * @return this builder
         **/
        public Builder timeLastSeen(java.util.Date timeLastSeen) {
            this.timeLastSeen = timeLastSeen;
            this.__explicitlySet__.add("timeLastSeen");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataAttribution build() {
            DataAttribution model =
                    new DataAttribution(
                            this.confidence,
                            this.source,
                            this.visibility,
                            this.timeFirstSeen,
                            this.timeLastSeen);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataAttribution model) {
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("visibility")) {
                this.visibility(model.getVisibility());
            }
            if (model.wasPropertyExplicitlySet("timeFirstSeen")) {
                this.timeFirstSeen(model.getTimeFirstSeen());
            }
            if (model.wasPropertyExplicitlySet("timeLastSeen")) {
                this.timeLastSeen(model.getTimeLastSeen());
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
     * An integer from 0 to 100 that provides a measure of our certainty in the maliciousness of data attributed to an indicator. For example, if the source of the data being attributed is the Tor Project, our confidence that the associated indicator is a tor exit node would be 100.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Integer confidence;

    /**
     * An integer from 0 to 100 that provides a measure of our certainty in the maliciousness of data attributed to an indicator. For example, if the source of the data being attributed is the Tor Project, our confidence that the associated indicator is a tor exit node would be 100.
     * @return the value
     **/
    public Integer getConfidence() {
        return confidence;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final IndicatorSourceSummary source;

    public IndicatorSourceSummary getSource() {
        return source;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("visibility")
    private final DataVisibility visibility;

    public DataVisibility getVisibility() {
        return visibility;
    }

    /**
     * The date and time the attribution data was first seen for this entity. If the data source does not provide this information, it is set to the last time it was seen. An RFC3339 formatted string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
    private final java.util.Date timeFirstSeen;

    /**
     * The date and time the attribution data was first seen for this entity. If the data source does not provide this information, it is set to the last time it was seen. An RFC3339 formatted string.
     * @return the value
     **/
    public java.util.Date getTimeFirstSeen() {
        return timeFirstSeen;
    }

    /**
     * The last date and time the attribution data was seen for this entity. An RFC3339 formatted string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
    private final java.util.Date timeLastSeen;

    /**
     * The last date and time the attribution data was seen for this entity. An RFC3339 formatted string.
     * @return the value
     **/
    public java.util.Date getTimeLastSeen() {
        return timeLastSeen;
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
        sb.append("DataAttribution(");
        sb.append("super=").append(super.toString());
        sb.append("confidence=").append(String.valueOf(this.confidence));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", visibility=").append(String.valueOf(this.visibility));
        sb.append(", timeFirstSeen=").append(String.valueOf(this.timeFirstSeen));
        sb.append(", timeLastSeen=").append(String.valueOf(this.timeLastSeen));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataAttribution)) {
            return false;
        }

        DataAttribution other = (DataAttribution) o;
        return java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.visibility, other.visibility)
                && java.util.Objects.equals(this.timeFirstSeen, other.timeFirstSeen)
                && java.util.Objects.equals(this.timeLastSeen, other.timeLastSeen)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.visibility == null ? 43 : this.visibility.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstSeen == null ? 43 : this.timeFirstSeen.hashCode());
        result = (result * PRIME) + (this.timeLastSeen == null ? 43 : this.timeLastSeen.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
